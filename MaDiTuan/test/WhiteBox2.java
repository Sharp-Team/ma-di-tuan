
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Thaycacac
 */
public class WhiteBox2 {

    public WhiteBox2() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test case 1 - Statement Expected result:
     */
    @Test
    public void testcase1() {
        System.out.println("Test case 1");
        int[][] expResult = {{1}};
        int[][] result = Knights3.solveProblem(1);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Test case 2 Expected result:
     */
    @Test
    public void testcase2() {
        System.out.println("Test case 2 - Statement");
        int[][] expResult = null;
        int[][] result = Knights3.solveProblem(2);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Test case 3 - Statement Expected result:
     */
    @Test
    public void testcase3() {
        System.out.println("Test case 3");
        int[][] expResult = null;
        int[][] result = Knights3.solveProblem(3);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
}
