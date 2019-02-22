
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Thaycacac
 */
public class WhiteBox {
    public WhiteBox() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test case 1 - Statement
     * Expected result: A C D E G
    */
    
    @Test
    public void testcase1() {
        System.out.println("Test case 1 - Statement");
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(3);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    /**
     * Test case 2 - Statement
     * Expected result: A C D F G
    */
    
    @Test
    public void testcase2() {
        System.out.println("Test case 2 - Statement");
        int[][] expResult = 
                {{1, 10, 5, 16, 25},
                {4, 17, 2, 11, 6},
                {9, 20, 13, 24, 15},
                {18, 3, 22, 7, 12},
                {21, 8, 19, 14, 23}};
        int[][] result = Knights2.solveProblem(5);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    /**
     * Test case 3 - Statement
     * Expected result: ABG
    */
    
    @Test
    public void testcase3() {
        System.out.println("Test case 2 - Statement");
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(0);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    
        /**
     * Test case 1 - Statement
     * Expected result: A C D E G
    */
    
    @Test
    public void testcase4() {
        System.out.println("Test case 4 - Decision");
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(3);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    /**
     * Test case 2 - Statement
     * Expected result: A C D F G
    */
    
    @Test
    public void testcase5() {
        System.out.println("Test case 5 - Decision");
        int[][] expResult = 
                {{1, 10, 5, 16, 25},
                {4, 17, 2, 11, 6},
                {9, 20, 13, 24, 15},
                {18, 3, 22, 7, 12},
                {21, 8, 19, 14, 23}};
        int[][] result = Knights2.solveProblem(5);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    /**
     * Test case 3 - Statement
     * Expected result: ABG
    */
    
    @Test
    public void testcase6() {
        System.out.println("Test case 6 - Decision");
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(0);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
        /**
     * Test case 1 - Statement
     * Expected result: A C D E G
    */
    
    @Test
    public void testcase7() {
        System.out.println("Test case 7 - Path coverage");
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(3);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    /**
     * Test case 2 - Statement
     * Expected result: A C D F G
    */
    
    @Test
    public void testcase8() {
        System.out.println("Test case 8 - Path coverage");
        int[][] expResult = 
                {{1, 10, 5, 16, 25},
                {4, 17, 2, 11, 6},
                {9, 20, 13, 24, 15},
                {18, 3, 22, 7, 12},
                {21, 8, 19, 14, 23}};
        int[][] result = Knights2.solveProblem(5);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    /**
     * Test case 3 - Statement
     * Expected result: ABG
    */
    
    @Test
    public void testcase9() {
        System.out.println("Test case 9 - Path coverage");
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(0);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    
}
