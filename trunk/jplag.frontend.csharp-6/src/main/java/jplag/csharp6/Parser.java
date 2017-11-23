package jplag.csharp6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jplag.Structure;
import jplag.csharp6.grammar.CSharpLexer;
import jplag.csharp6.grammar.CSharpParser;
import jplag.csharp6.grammar.CSharpParser.Compilation_unitContext;
import jplag.csharp6.grammar.CSharpPreprocessorParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.input.BOMInputStream;

public class Parser extends jplag.Parser implements Csharp6TokenConstants {

    private Structure struct = new Structure();
    private String currentFile;

    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("Only one or more files as parameter allowed.");
            System.exit(-1);
        }
        Parser parser = new Parser();
        parser.setProgram(new jplag.StrippedProgram());
        jplag.Structure struct = parser.parse(null, args);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
            int lineNr = 1;
            int token = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (token < struct.size()) {
                    boolean first = true;
                    while (struct.tokens[token] != null
                            && struct.tokens[token].getLine() == lineNr) {
                        if (!first) {
                            System.out.println();
                        }
                        Csharp6Token tok = (Csharp6Token) struct.tokens[token];
                        System.out.print(Csharp6Token.type2string(tok.type) + " ("
                                + tok.getLine() + ","
                                + tok.getColumn() + ","
                                + tok.getLength() + ")\t");
                        first = false;
                        token++;
                    }
                    if (first) {
                        System.out.print("                \t");
                    }
                }
                System.out.println(line);
                lineNr++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public Structure parse(File dir, String[] files) {
        struct = new Structure();
        errors = 0;
        for (int i = 0; i < files.length; i++) {
            getProgram().print(null, "Parsing file " + files[i] + "\n");
            if (!parseFile(dir, files[i])) {
                errors++;
            }
            System.gc();
            struct.addToken(new Csharp6Token(FILE_END, files[i], -1, -1, -1));
        }
        this.parseEnd();
        return struct;
    }

    private boolean parseFile(File dir, String file) {
        BOMInputStream bomInputStream;
        CharStream input;
        try {
            currentFile = file;

            bomInputStream = new BOMInputStream(new FileInputStream(new File(dir, file)));
            input = CharStreams.fromStream(bomInputStream);

            List<Token> codeTokens = new ArrayList<Token>();
            List<Token> commentTokens = new ArrayList<Token>();

            // create a lexer that feeds off of input CharStream
            CSharpLexer preprocessorLexer = new CSharpLexer(input);
            List<? extends Token> tokens = preprocessorLexer.getAllTokens();

            ArrayList<Token> directiveTokens = new ArrayList<Token>();
            ListTokenSource directiveTokenSource = new ListTokenSource(directiveTokens);

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);

            // create a parser that feeds off the tokens buffer
            CSharpPreprocessorParser preprocessorParser = new CSharpPreprocessorParser(directiveTokenStream);

            int index = 0;
            boolean compiliedTokens = true;
            while (index < tokens.size()) {
                Token token = tokens.get(index);
                if (token.getType() == CSharpLexer.SHARP) {
                    directiveTokens.clear();
                    int directiveTokenIndex = index + 1;
                    // Collect all preprocessor directive tokens.
                    while (directiveTokenIndex < tokens.size()
                            && tokens.get(directiveTokenIndex).getType() != CSharpLexer.EOF
                            && tokens.get(directiveTokenIndex).getType() != CSharpLexer.DIRECTIVE_NEW_LINE
                            && tokens.get(directiveTokenIndex).getType() != CSharpLexer.SHARP) {
                        if (tokens.get(directiveTokenIndex).getChannel() == CSharpLexer.COMMENTS_CHANNEL) {
                            commentTokens.add(tokens.get(directiveTokenIndex));
                        } else if (tokens.get(directiveTokenIndex).getChannel() != Lexer.HIDDEN) {
                            directiveTokens.add(tokens.get(directiveTokenIndex));
                        }
                        directiveTokenIndex++;
                    }

                    directiveTokenSource = new ListTokenSource(directiveTokens);
                    directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
                    preprocessorParser.setInputStream(directiveTokenStream);
                    preprocessorParser.reset();
                    // Parse condition in preprocessor directive (based on CSharpPreprocessorParser.g4 grammar).
                    CSharpPreprocessorParser.Preprocessor_directiveContext directive = preprocessorParser.preprocessor_directive();
                    // if true than next code is valid and not ignored.
                    compiliedTokens = directive.value;
                    index = directiveTokenIndex - 1;
                } else if (token.getChannel() == CSharpLexer.COMMENTS_CHANNEL) {
                    commentTokens.add(token); // Colect comment tokens (if required).
                } else if (token.getChannel() != Lexer.HIDDEN && token.getType() != CSharpLexer.DIRECTIVE_NEW_LINE && compiliedTokens) {
                    codeTokens.add(token); // Collect code tokens.
                }
                index++;
            }

            // At second stage tokens parsed in usual way.
            ListTokenSource codeTokenSource = new ListTokenSource(codeTokens);
            CommonTokenStream codeTokenStream = new CommonTokenStream(codeTokenSource);
            CSharpParser parser = new CSharpParser(codeTokenStream);
            // Parse syntax tree (CSharpParser.g4)
            Compilation_unitContext compilationUnit = parser.compilation_unit();

            ParseTreeWalker ptw = new ParseTreeWalker();
            for (int i = 0; i < compilationUnit.getChildCount(); i++) {
                ParseTree pt = compilationUnit.getChild(i);
                ptw.walk(new JplagCsharp6Listener(this), pt);
            }

        } catch (IOException e) {
            getProgram().addError("Parsing Error in '" + file + "':\n" + e.getMessage() + "\n");
            return false;
        }
        return true;
    }

    void add(int type, Token token) {
        struct.addToken(
                new Csharp6Token(
                        type,
                        currentFile == null ? "null" : currentFile,
                        token.getLine(),
                        token.getCharPositionInLine() + 1,
                        token.getText().length())
        );
    }
}
