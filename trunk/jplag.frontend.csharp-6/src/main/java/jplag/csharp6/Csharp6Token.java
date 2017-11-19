package jplag.csharp6;

public class Csharp6Token extends jplag.Token implements Csharp6TokenConstants {

    private int line, column, length;

    public Csharp6Token(int type, String file, int line, int column, int length) {
        super(type, file, line, column, length);
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    public static String type2string(int type) {
        switch (type) {
            case Csharp6TokenConstants.FILE_END:            // FILE_END
                return "********";
            case Csharp6TokenConstants.SEPARATOR_TOKEN:     // SEPARATOR_TOKEN 
                return "METHOD_SEPARATOR";                  //
            case NAMESPACE_DECLARATION:                     // J_PACKAGE
                return "NAMESPACE ";                        //
            case USING_DIRECTIVE:                           // J_IMPORT
                return "USING     ";                        //
            case CLASS_DEFINITION_BEGIN:                    // J_CLASS_BEGIN
                return "CLASS{    ";                        //
            case CLASS_DEFINITION_END:                      // J_CLASS_END
                return "}CLASS    ";                        //
            case METHOD_DECLARATION_BEGIN:                  // J_METHOD_BEGIN
                return "METHOD{   ";                        //
            case METHOD_DECLARATION_END:                    // J_METHOD_END
                return "}METHOD   ";                        //
            case VAR_DECLARATOR:                            // J_VARDEF
                return "VAR_CONST ";                        //
            // J_SYNC_BEGIN
            // J_SYNC_END
            case DO_WHILE_BEGIN:                            // J_DO_BEGIN
                return "DO_WHILE{ ";                        //
            case DO_WHILE_END:                              // J_DO_END
                return "}DO_WHILE ";                        //
            case WHILE_BEGIN:                               // J_WHILE_BEGIN
                return "WHILE{    ";                        //
            case WHILE_END:                                 // J_WHILE_END
                return "}WHILE    ";                        //
            case FOR_BEGIN:                                 // J_FOR_BEGIN
                return "FOR{      ";                        //
            case FOR_END:                                   // J_FOR_END
                return "}FOR      ";                        //
            case FOREACH_BEGIN:                             // ***added***
                return "FOREACH{  ";                        //
            case FOREACH_END:                               // ***added***
                return "}FOREACH  ";                        //
            case SWITCH_BEGIN:                              // J_SWITCH_BEGIN
                return "SWITCH{   ";                        //
            case SWITCH_END:                                // J_SWITCH_END
                return "}SWITCH   ";                        //
            case CASE:                                      // J_CASE
                return "CASE      ";                        //
            case TRY_BEGIN:                                 // J_TRY_BEGIN
                return "TRY{      ";                        //
            case TRY_END:                                   // ***added***
                return "}TRY      ";                        //
            case CATCH_BEGIN:                               // J_CATCH_BEGIN
                return "CATCH{    ";                        //
            case CATCH_END:                                 // J_CATCH_END
                return "}CATCH    ";                        //
            case FINALLY_BEGIN:                             // J_FINALLY
                return "FINALLY{  ";                        //
            case FINALLY_END:                               // ***addded***
                return "}FINALLY  ";                        //
            case IF_BEGIN:                                  // J_IF_BEGIN
                return "IF{       ";                        //
            case IF_END:                                    // J_IF_END
                return "}IF       ";                        //
            case ELSE_BEGIN:                                // J_ELSE
                return "ELSE{     ";                        //
            case ELSE_END:                                  // ***added***
                return "}ELSE     ";                        //
            case TERNARY_EXPRESSION:                        // J_COND
                return "TERNARY   ";                        //
            case BREAK:                                     // J_BREAK
                return "BREAK     ";                        //
            case CONTINUE:                                  // J_CONTINUE
                return "CONTINUE  ";                        //
            case RETURN:                                    // J_RETURN
                return "RETURN    ";                        //
            case THROW:                                     // J_THROW
                return "THROW     ";                        //
            // J_IN_CLASS_BEGIN
            // J_IN_CLASS_END
            // J_APPLY
            // J_NEWCLASS
            // J_NEWARRAY   
            case ASSIGNMENT:                                // J_ASSIGN
                return "ASSIGNMENT";
            case INTERFACE_BEGIN:                           // J_INTERFACE_BEGIN
                return "INTERFACE{";                        //
            case INTERFACE_END:                             // J_INTERFACE_END
                return "}INTERFACE";                        //
            case CONSTRUCTOR_DECLARATION_BEGIN:             // J_CONSTR_BEGIN
                return "CONSTRUCT{";                        //
            case CONSTRUCTOR_DECLARATION_END:               // J_CONSTR_END
                return "}CONSTRUCT";                        //
            case CLASS_MEMBER_DECLARATIONS_BEGIN:           // J_INIT_BEGIN ???
                return "MEMBERS{  ";                        //
            case CLASS_MEMBER_DECLARATIONS_END:             // J_INIT_END ???
                return "}MEMBERS  ";                        //
            case VOID:                                      // J_VOID
                return "VOID      ";                        //
            case ARRAY_INITIALIZER_BEGIN:                   // J_ARRAY_INIT_BEGIN
                return "ARRAY_INI{";                        //
            case ARRAY_INITIALIZER_END:                     // J_ARRAY_INIT_END
                return "}ARRAY_INI";                        //
            case ENUM_DEFINITION_BEGIN:                     // J_ENUM_BEGIN
                return "ENUM{     ";                        //
            case ENUM_DEFINITION_END:                       // J_ENUM_END
                return "}ENUM     ";                        //
            // J_ENUM_CLASS_BEGIN - no c# equivalent
            // J_GENERIC
            // J_ASSERT
            // J_ANNO
            // J_ANNO_MARKER
            // J_ANNO_M_BEGIN
            // J_ANNO_M_END
            // J_ANNO_T_BEGIN
            // J_ANNO_T_END
            // J_ANNO_C_BEGIN
            // J_ANNO_C_END
            case USING_STATEMENT:                           // J_TRY_WITH_RESOURCE
                return "USING_RES ";                        //
            
            default:
                System.err.println("*UNKNOWN: " + type);
                return "*UNKNOWN" + type;
        }
    }

    public static int numberOfTokens() {
        return NUM_DIFF_TOKENS;
    }
}
