package jplag.csharp6;

public interface Csharp6TokenConstants extends jplag.TokenConstants {
    
    final static int FILE_END = 0;
    final static int SEPARATOR_TOKEN = 1;
    
    final static int NAMESPACE_DECLARATION =            2;  // J_PACKAGE        // UNIT TESTED  // GRAMMAR VERIFIED --> annotations/attributes may affect this
    final static int USING_DIRECTIVE =                  3;  // J_IMPORT         // UNIT TESTED  // GRAMMAR VERIFIED
    
    final static int CLASS_DEFINITION_BEGIN =           4;  // J_CLASS_BEGIN    // UNIT TESTED  // GRAMMAR VERIFIED --> this only matches a subset of class-declaration defined here https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/language-specification/classes#class-declarations
    final static int CLASS_DEFINITION_END =             5;  // J_CLASS_END      // ""           // ""
    final static int METHOD_DECLARATION_BEGIN =         6;  // J_METHOD_BEGIN   // UNIT TESTED  // GRAMMAR VERIFIED --> this only matches a subset of class-declaration defined here https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/language-specification/classes#methods
    final static int METHOD_DECLARATION_END =           7;  // J_METHOD_END     // ""           // ""
    final static int VAR_DECLARATOR = 8;                    // J_VARDEF         // UNIT TESTED  // GRAMMAR VERFIED 
                                                            // J_SYNC_BEGIN
                                                            // J_SYNC_END
    final static int DO_WHILE_BEGIN =                   9;  // J_DO_BEGIN       // UNIT TESTED  // GRAMMAR VERFIED 
    final static int DO_WHILE_END =                     10; // J_DO_END         // ""           // ""  
    final static int WHILE_BEGIN =                      11; // J_WHILE_BEGIN    // UNIT TESTED  // GRAMMAR VERFIED 
    final static int WHILE_END =                        12; // J_WHILE_END      // ""           // ""  
    final static int FOR_BEGIN =                        13; // J_FOR_BEGIN      // UNIT TESTED  // GRAMMAR VERFIED 
    final static int FOR_END =                          14; // J_FOR_END        // ""           // ""  
    final static int FOREACH_BEGIN =                    36; // ***added***      // UNIT TESTED  // GRAMMAR VERFIED 
    final static int FOREACH_END =                      37; // ***added***      // ""           // ""  
    
    final static int SWITCH_BEGIN =                     15; // J_SWITCH_BEGIN   // UNIT TESTED  // GRAMMAR VERFIED 
    final static int SWITCH_END =                       16; // J_SWITCH_END     // ""           // ""
    final static int CASE =                             17; // J_CASE           // UNIT TESTED  // GRAMMAR VERFIED 
    
    final static int TRY_BEGIN =                        18; // J_TRY_BEGIN      // UNIT TESTED  // GRAMMAR VERFIED - tied to the try_block instead of the try_statement
    final static int TRY_END =                          19; // ***added***      // ""           // ""
    final static int CATCH_BEGIN =                      20; // J_CATCH_BEGIN    // UNIT TESTED  // GRAMMAR VERFIED 
    final static int CATCH_END =                        21; // J_CATCH_END      // ""           // ""
    final static int FINALLY_BEGIN =                    22; // J_FINALLY        // UNIT TESTED  // GRAMMAR VERFIED 
    final static int FINALLY_END =                      23; // ***added***      // ""           // ""
    
    final static int IF_BEGIN =                         24; // J_IF_BEGIN       // UNIT TESTED  // GRAMMAR VERFIED  - tied to the if_block instead of the if_statement
    final static int IF_END =                           25; // J_IF_END         // ""           // ""
    final static int ELSE_BEGIN =                       26; // J_ELSE           // UNIT TESTED  // GRAMMAR VERFIED 
    final static int ELSE_END =                         27; // ***added***      // ""           // ""
    final static int TERNARY_EXPRESSION =               28; // J_COND           // UNIT TESTED  // GRAMMAR VERFIED --> reduced to a subset because of differences with official grammar (was matching strings as ternary statements)

    final static int BREAK =                            29; // J_BREAK          // UNIT TESTED  // GRAMMAR VERFIED 
    final static int CONTINUE =                         30; // J_CONTINUE       // UNIT TESTED  // GRAMMAR VERFIED 
    final static int RETURN =                           31; // J_RETURN         // UNIT TESTED  // GRAMMAR VERFIED 
    final static int THROW =                            32; // J_THROW          // UNIT TESTED  // GRAMMAR VERFIED 
    
                                                            // J_IN_CLASS_BEGIN
                                                            // J_IN_CLASS_END
                                                            // J_APPLY
                                                            // J_NEWCLASS
                                                            // J_NEWARRAY
    
    final static int ASSIGNMENT =                       39; // J_ASSIGN         // UNIT TESTED  // GRAMMAR VERFIED
    
    final static int INTERFACE_BEGIN =                  40; // J_INTERFACE_BEGIN
    final static int INTERFACE_END =                    41; // J_INTERFACE_END
   
    final static int CONSTRUCTOR_DECLARATION_BEGIN =    42; // J_CONSTR_BEGIN
    final static int CONSTRUCTOR_DECLARATION_END =      43; // J_CONSTR_END
    final static int CLASS_MEMBER_DECLARATIONS_BEGIN =  44; // J_INIT_BEGIN
    final static int CLASS_MEMBER_DECLARATIONS_END =    45; // J_INIT_END
    
    final static int VOID =                             38; // J_VOID
    
    final static int ARRAY_INITIALIZER_BEGIN =          47; // J_ARRAY_INIT_BEGIN
    final static int ARRAY_INITIALIZER_END =            48; // J_ARRAY_INIT_END
    
    final static int ENUM_DEFINITION_BEGIN =            33; // J_ENUM_BEGIN
    final static int ENUM_DEFINITION_END =              34; // J_ENUM_END
    final static int ENUM_BODY =                        35; // J_ENUM_CLASS_BEGIN ???
    
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

    final static int USING_STATEMENT =                  46; // J_TRY_WITH_RESOURCE  // UNIT TESTED  // GRAMMAR VERFIED
    
// NOTES...
//    final static int OBJECT_CREATION_EXPRESSION_BEGIN = 33;     // J_IN_CLASS_BEGIN/END? Are these right?
//    final static int OBJECT_CREATION_EXPRESSION_END = 34;       // J_IN_CLASS_BEGIN/END? Are these right?
//    final static int OBJECT_OR_COLLECTION_INITIALIZER = 37;     // J_NEWCLASS? probably wrong...
//    final static int ARRAY_INITIALIZER = 38;                    // J_NEWARRAY? probably wrong...
//    final static int J_APPLY = 36; // J_APPLY
//    struct
    
    final static int NUM_DIFF_TOKENS = 49;
}