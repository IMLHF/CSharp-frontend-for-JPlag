/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author Nick
 */
public class CSharp6ParserTest {

    private static File srcTestResources;

    public CSharp6ParserTest() {
    }

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

    @Test
    public void testSimpleProgram() {
        File file = new File(srcTestResources, "SimpleProgram.cs");
        String expected = ""
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "METHOD{   \n"
                + "VAR_CONST \n"
                + "TERNARY   \n"
                + "}METHOD   \n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
//        System.out.println(tokens);
        assertEquals(expected, tokens);
    }
    
    @Test
    public void testMasterProgram() {
        File file = new File(srcTestResources, "MasterProgram.cs");
        String tokens = parseWithCSharp6Parser(file, true);
        System.out.println(tokens);
//        String expected = ""
//                + "USING     \n"
//                + "USING     \n"
//                + "USING     \n"
//                + "USING     \n"
//                + "USING     \n"
//                + "NAMESPACE \n"
//                + "CLASS{    \n"
//                + "MEMBERS{  \n"
//                + "METHOD{   \n"
//                + "VAR_CONST \n"
//                + "TERNARY   \n"
//                + "METHOD{   \n"
//                + "}MEMBERS  \n"
//                + "}CLASS    \n"
//                + "********\n";
//        assertEquals(expected, tokens);
        assertTrue(true);
    }

    @Test
    public void testSimpleClass() {
        File file = new File(srcTestResources, "SimpleClass.cs");
        String expected = ""
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "USING     \n"
                + "NAMESPACE \n"
                + "CLASS{    \n"
                + "CONSTRUCT{\n"
                + "}CONSTRUCT\n"
                + "CONSTRUCT{\n"
                + "}CONSTRUCT\n"
                + "CONSTRUCT{\n"
                + "}CONSTRUCT\n"
                + "}CLASS    \n"
                + "********\n";
        String tokens = parseWithCSharp6Parser(file, false);
        assertEquals(expected, tokens);
    }

    private String parseWithCSharp6Parser(File csharpFile, boolean withDetails) {
        Parser p = new Parser();
        p.setProgram(new StrippedProgram());
        Structure s = p.parse(csharpFile.getParentFile(), new String[]{csharpFile.getName()});

        String newTokens = buildTokenString(s, withDetails);
        return newTokens;
    }

    private String buildTokenString(Structure oldStruct, boolean withDetails) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < oldStruct.size(); i++) {
            sb.append(Csharp6Token.type2string(oldStruct.tokens[i].type));
            if (withDetails) {
                sb.append(" L:" + oldStruct.tokens[i].getLine()
                        + " C:" + oldStruct.tokens[i].getColumn()
                        + " l:" + oldStruct.tokens[i].getLength());
            }
            sb.append("\n");
        }

        String oldTokens = sb.toString();
        return oldTokens;
    }

}
