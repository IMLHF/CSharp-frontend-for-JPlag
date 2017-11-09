package jplag.csharp6;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import jplag.Structure;
import jplag.csharp6.grammar.CSharpLexer;
import jplag.csharp6.grammar.CSharpParser;
import jplag.csharp6.grammar.CSharpParser.Compilation_unitContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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
//        BufferedInputStream fis;
        BOMInputStream b;

//        ANTLRInputStream input;
        CharStream input;
        try {
//            fis = new BufferedInputStream(new FileInputStream(new File(dir, file)));
            currentFile = file;
//            input = new ANTLRInputStream(fis);
            
            b = new BOMInputStream(new FileInputStream(new File(dir, file)));
//            input = new ANTLRInputStream(b);
            input = CharStreams.fromStream(b);

            // create a lexer that feeds off of input CharStream
            System.out.println("Creating Lexer");
            CSharpLexer lexer = new CSharpLexer(input);

            // create a buffer of tokens pulled from the lexer
            System.out.println("Creating TokenStream");
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            System.out.println("Creating Parser");
            CSharpParser parser = new CSharpParser(tokens);
            
            System.out.println("Creating CompilationUnit");
            Compilation_unitContext cuc = parser.compilation_unit();

            System.out.println("Creating ParseTreeWalker");
            ParseTreeWalker ptw = new ParseTreeWalker();
            for (int i = 0; i < cuc.getChildCount(); i++) {
                ParseTree pt = cuc.getChild(i);
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
