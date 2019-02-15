import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thaycacac
 */
public class BlackBox {

    static final int MAX = 10;

    public BlackBox() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Black Box Test
     * Test case 1 - Specification derived
     * Input: "3"
     * Expected result: [[1,0,0],[0,0,0],[0,0,0]]
     */
    @Test
    public void testcase1() {
        System.out.println("Test case 1 - Specification derived test");
        int[][] board = new int[MAX][MAX];
        String n = "3";
        int[][] expResult = {{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Black Box Test 
     * Test case 2 - Equivalence partitioning test 
     * Partition 1: Input is not number
     * Input: "a"
     * Expected result: null
     */
    @Test
    public void testcase2() {
        System.out.println("Test case 2 - Equivalence partitioning test");
        System.out.println("Partition 1: Input is not number");
        int[][] board = new int[MAX][MAX];
        String n = "a";
        int[][] expResult = null;
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
    
    /**
     * Black Box Test
     * Test case 3 - Equivalence partitioning test
     * Partition 2: Input is greater than 8 
     * Input: "15"
     * Expected result: null
     *
     */
    @Test
    public void testcase3() {
        System.out.println("Test case 3 - Equivalence partitioning test");
        System.out.println("Partition 2: Input is greater than 8");
        int[][] board = new int[MAX][MAX];
        String n = "15";
        int[][] expResult = null;
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Black Box Test
     * Test case 4 - Equivalence partitioning test
     * Partition 3: Input is less than 1
     * Input: "-2" Expected
     * result: null
     *
     */
    @Test
    public void testcase4() {
        System.out.println("Test case 4 - Equivalence partitioning test");
        System.out.println("Partition 3: Input is less than 1");
        int[][] board = new int[MAX][MAX];
        String n = "-2";
        int[][] expResult = null;
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Black Box Test
     * Test case 5 - Equivalence partitioning test 
     * Partition 4: Input is greater than 0 and less or equal than 8
     * Input: "5"
     * Expected result: {{1, 10, 5, 16, 25}, {4, 17, 2, 11, 6}, {9, 20, 13, 24, 15}, {18, 3, 22, 7, 12}, {21, 8, 19, 14, 23}}
     *
     */
    @Test
    public void testcase5() {
        System.out.println("Test case 5 - Equivalence partitioning test");
        System.out.println("Partition 4: Input is greater than 0 and less or equal than 10");
        int[][] board = new int[MAX][MAX];
        String n = "5";
        int[][] expResult
                = {{1, 10, 5, 16, 25},
                {4, 17, 2, 11, 6},
                {9, 20, 13, 24, 15},
                {18, 3, 22, 7, 12},
                {21, 8, 19, 14, 23}};
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Black Box Test
     * Test case 6 - Boundary value analysis test
     * Boundary value: 0 1 8 9
     * Test Boundary value 1: 0
     * Input: "0"
     * Expected result: null
     *
     */
    @Test
    public void testcase6() {
        System.out.println("Test case 6 - Boundary value analysis test");
        System.out.println("Test Boundary value 1: 0");
        int[][] board = new int[MAX][MAX];
        String n = "0";
        int[][] expResult = null;
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Black Box Test
     * Test case 7 - Boundary value analysis test
     * Boundary value: 0 1 8 9
     * Test Boundary value 2: 1
     * Input: "1"
     * Expected result: null
     *
     */
    @Test
    public void testcase7() {
        System.out.println("Test case 7 - Boundary value analysis test");
        System.out.println("Test Boundary value 2: 1");
        int[][] board = new int[MAX][MAX];
        String n = "1";
        int[][] expResult = {{1}};
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Black Box Test
     * Test case 8 - Boundary value analysis test
     * Boundary value: 0 1 8 9
     * Test Boundary value 3: 8
     * Input: "8"
     * Expected result: 
     * {{1, 24, 9, 62, 39, 26, 45, 60},
     * {10, 63, 2, 25, 44, 61, 38, 27},
     * {23, 8, 11, 40, 21, 42, 59, 46},
     * {64, 3, 22, 43, 58, 47, 28, 37},
     * {7, 12, 5, 20, 41, 36, 57, 48},
     * {4, 17, 14, 31, 50, 29, 54, 35},
     * {13, 6, 19, 16, 33, 52, 49, 56},
     * {18, 15, 32, 51, 30, 55, 34, 53}}
     */
    @Test
    public void testcase8_SolveKnightTour() {
        System.out.println("Test case 8 - Boundary value analysis test");
        System.out.println("Test Boundary value 3: 8");
        int[][] board = new int[MAX][MAX];
        String n = "8";
        int[][] expResult
                = {{1, 24, 9, 62, 39, 26, 45, 60},
                {10, 63, 2, 25, 44, 61, 38, 27},
                {23, 8, 11, 40, 21, 42, 59, 46},
                {64, 3, 22, 43, 58, 47, 28, 37},
                {7, 12, 5, 20, 41, 36, 57, 48},
                {4, 17, 14, 31, 50, 29, 54, 35},
                {13, 6, 19, 16, 33, 52, 49, 56},
                {18, 15, 32, 51, 30, 55, 34, 53}};
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }

    /**
     * Black Box Test
     * Test case 9 - Boundary value analysis test
     * Boundary value: 0 1 8 9
     * Test Boundary value 4: 9
     * Input: "9" Expected result: null
     *
     */
    @Test
    public void testcase9_SolveKnightTour() {
        System.out.println("Test case 9 - Boundary value analysis test");
        System.out.println("Test Boundary value 4: 9");
        int[][] board = new int[MAX][MAX];
        String n = "9";
        int[][] expResult = null;
        int[][] result = Knights.solveKnightTour(board, n);
        assertArrayEquals(expResult, result);
        System.out.println("----------------------------------------");
    }
}
