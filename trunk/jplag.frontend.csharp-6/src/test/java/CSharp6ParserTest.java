
import java.io.File;
import jplag.StrippedProgram;
import jplag.Structure;
import jplag.csharp6.Csharp6Token;
import jplag.csharp6.Parser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CSharp6ParserTest {

    private static File srcTestResources;
    private final boolean debug = true;

    public CSharp6ParserTest() {
    }

    // <editor-fold defaultstate="collapsed" desc="unit test setUp/tearDown">
    @BeforeClass
    public static void setUpClass() {
        srcTestResources = new File(System.getProperty("user.dir"), "src/test/resources");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // </editor-fold>
    @Ignore
    @Test
    public void testTemplate() {
        File file = new File(srcTestResources, "fileName.cs");
        String expected = "";
        String tokens = parseWithCSharp6Parser(file, true);
        assertEquals(expected, tokens);
    }

    // real unit tests begin here
    @Test
    public void testNamespace() {
        File file = new File(srcTestResources, "Namespace.cs");
        String expected = ""
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testUsingDirective() {
        File file = new File(srcTestResources, "UsingDirective.cs");
        String expected = ""
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VAR_CONST \n"
                + "VAR_CONST \n"
                + "VAR_CONST \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testClass() {
        File file = new File(srcTestResources, "Class.cs");
        String expected = ""
                + "CLASS{    \n"
                + "CONSTRUCT{\n"
                + "}CONSTRUCT\n"
                + "CLASS{    \n"
                + "}CLASS    \n"
                + "CLASS{    \n"
                + "}CLASS    \n"
                + "}CLASS    \n"
                + "CLASS{    \n"
                + "CLASS{    \n"
                + "CLASS{    \n"
                + "CONSTRUCT{\n"
                + "}CONSTRUCT\n"
                + "}CLASS    \n"
                + "}CLASS    \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testMethod() {
        File file = new File(srcTestResources, "Method.cs");
        String expected = ""
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "}METHOD   \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "}METHOD   \n"
                + "METHOD{   \n"
                + "RETURN    \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testVariables() {
        File file = new File(srcTestResources, "Variables.cs");
        String expected = ""
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VAR_CONST \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "ASSIGNMENT\n"
                + "VAR_CONST \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "ASSIGNMENT\n"
                + "TERNARY   \n"
                + "ASSIGNMENT\n"
                + "ASSIGNMENT\n"
                + "ASSIGNMENT\n"
                + "ASSIGNMENT\n"
                + "}METHOD   \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "VAR_CONST \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "ASSIGNMENT\n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testLoops() {
        File file = new File(srcTestResources, "Loops.cs");
        String expected = ""
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "ARRAY_INI{\n"
                + "}ARRAY_INI\n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "DO_WHILE{ \n"
                + "}DO_WHILE \n"
                + "ASSIGNMENT\n"
                + "WHILE{    \n"
                + "}WHILE    \n"
                + "FOR{      \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "}FOR      \n"
                + "FOREACH{  \n"
                + "}FOREACH  \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testSwitches() {
        File file = new File(srcTestResources, "Switches.cs");
        String expected = ""
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "METHOD{   \n"
                + "SWITCH{   \n"
                + "CASE      \n"
                + "CASE      \n"
                + "CASE      \n"
                + "RETURN    \n"
                + "CASE      \n"
                + "CASE      \n"
                + "RETURN    \n"
                + "CASE      \n"
                + "CASE      \n"
                + "RETURN    \n"
                + "CASE      \n"
                + "RETURN    \n"
                + "}SWITCH   \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testTryCatchFinally() {
        File file = new File(srcTestResources, "TryCatchFinally.cs");
        String expected = ""
                + "USING     \n"
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "VOID      \n"
                + "METHOD{   \n"
                + "TRY{      \n"
                + "}TRY      \n"
                + "CATCH{    \n"
                + "THROW     \n"
                + "}CATCH    \n"
                + "CATCH{    \n"
                + "}CATCH    \n"
                + "FINALLY{  \n"
                + "}FINALLY  \n"
                + "USING_RES \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "TRY{      \n"
                + "}TRY      \n"
                + "FINALLY{  \n"
                + "}FINALLY  \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testIfElse() {
        File file = new File(srcTestResources, "IfElse.cs");
        String expected = ""
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "METHOD{   \n"
                + "IF{       \n"
                + "IF{       \n"
                + "}IF       \n"
                + "ELSE{     \n"
                + "IF{       \n"
                + "}IF       \n"
                + "ELSE{     \n"
                + "IF{       \n"
                + "}IF       \n"
                + "}ELSE     \n"
                + "}ELSE     \n"
                + "}IF       \n"
                + "ELSE{     \n"
                + "IF{       \n"
                + "}IF       \n"
                + "IF{       \n"
                + "}IF       \n"
                + "}ELSE     \n"
                + "RETURN    \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testJumpStatements() {
        File file = new File(srcTestResources, "JumpStatements.cs");
        String expected = ""
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "METHOD{   \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "FOR{      \n"
                + "VAR_CONST \n"
                + "ASSIGNMENT\n"
                + "IF{       \n"
                + "THROW     \n"
                + "}IF       \n"
                + "IF{       \n"
                + "BREAK     \n"
                + "}IF       \n"
                + "IF{       \n"
                + "CONTINUE  \n"
                + "}IF       \n"
                + "ASSIGNMENT\n"
                + "}FOR      \n"
                + "RETURN    \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Test
    public void testInterface() {
        File file = new File(srcTestResources, "Interface.cs");
        String expected = ""
                + "NAMESPACE \n"
                + "INTERFACE{\n"
                + "}INTERFACE\n"
                + "INTERFACE{\n"
                + "}INTERFACE\n"
                + "INTERFACE{\n"
                + "}INTERFACE\n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    @Ignore // grammar needs to be corrected before this works
    @Test
    public void testArrays() {
        File file = new File(srcTestResources, "Arrays.cs");
        String expected = "";
        String tokens = parseWithCSharp6Parser(file, true);
        assertEquals(expected, tokens);
    }

    @Test
    public void testEnums() {
        File file = new File(srcTestResources, "Enums.cs");
        String expected = ""
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "ENUM{     \n"
                + "}ENUM     \n"
                + "ENUM{     \n"
                + "}ENUM     \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    // <editor-fold defaultstate="collapsed" desc="private helper functions">
    private String parseWithCSharp6Parser(File csharpFile, boolean withDetails) {
        Parser p = new Parser();
        p.setProgram(new StrippedProgram());
        Structure s = p.parse(csharpFile.getParentFile(), new String[]{csharpFile.getName()});

        String newTokens = buildTokenString(s, withDetails);
        if (debug) {
            System.out.print(newTokens);
        }
        return newTokens;
    }

    private String buildTokenString(Structure oldStruct, boolean withDetails) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < oldStruct.size(); i++) {
            sb.append(Csharp6Token.type2string(oldStruct.tokens[i].type));
            if (withDetails) {
                sb.append(" L:").append(oldStruct.tokens[i].getLine());
                sb.append(" C:").append(oldStruct.tokens[i].getColumn());
                sb.append(" l:").append(oldStruct.tokens[i].getLength());
            }
            sb.append("\n");
        }
        String oldTokens = sb.toString();
        return oldTokens;
    }
    // </editor-fold>

}
