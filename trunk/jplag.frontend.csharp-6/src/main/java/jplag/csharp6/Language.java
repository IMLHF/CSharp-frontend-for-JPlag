package jplag.csharp6;

import java.io.File;
import jplag.ProgramI;
import jplag.Structure;

public class Language implements jplag.Language {
    
    private final Parser parser;

    public Language(ProgramI program) {
        this.parser = new jplag.csharp6.Parser();
        this.parser.setProgram(program);
    }

    @Override
    public String[] suffixes() {
        String[] res = {".cs"};
        return res;
    }

    @Override
    public int errorsCount() {
        return this.parser.errorsCount();
    }
    
    @Override
    public String name() {
        return "Csharp6 Parser";
    }

    @Override
    public String getShortName() {
        return "csharp6";
    }

    @Override
    public int min_token_match() {
        return 9;
    }

    @Override
    public Structure parse(File dir, String[] files) {
        return this.parser.parse(dir, files);
    }

    @Override
    public boolean errors() {
        return this.parser.getErrors();
    }

    @Override
    public boolean supportsColumns() {
        return true;
    }

    @Override
    public boolean isPreformated() {
        return true;
    }

    @Override
    public boolean usesIndex() {
        return false;
    }

    @Override
    public int noOfTokens() {
        return Csharp6Token.numberOfTokens();
    }

    @Override
    public String type2string(int type) {
        return Csharp6Token.type2string(type);
    }
    
}
