import java.io.File;
import jplag.StrippedProgram;
import jplag.csharp6.Parser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Csharp6PreprocessorTest {
    private static File srcTestResources;

    public Csharp6PreprocessorTest() {
        srcTestResources = new File(System.getProperty("user.dir"), "src/test/resources/preprocessor");
    }

    @BeforeClass
    public static void setUpClass() {
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
    public void hello() {
        jplag.csharp6.Parser p = new Parser();
        p.setProgram(new StrippedProgram());
        p.parse(srcTestResources, new String[]{"App.g.cs"});
    }
}
