/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thaycacac
 */
public class KnightsTest {
    
    public KnightsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayBoard method, of class Knights.
     */
    @Test
    public void testDisplayBoard() {
        System.out.println("displayBoard");
        int[][] matrix = null;
        int n = 0;
        Knights.displayBoard(matrix, n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearBoard method, of class Knights.
     */
    @Test
    public void testClearBoard() {
        System.out.println("clearBoard");
        int[][] board = null;
        int n = 0;
        Knights.clearBoard(board, n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInput method, of class Knights.
     */
    @Test
    public void testCheckInput() {
        System.out.println("checkInput");
        String input = "";
        int expResult = 0;
        int result = Knights.checkInput(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveKnightTour method, of class Knights.
     */
    @Test
    public void testSolveKnightTour() {
        System.out.println("solveKnightTour");
        int[][] board = null;
        String input = "";
        int[][] expResult = null;
        int[][] result = Knights.solveKnightTour(board, input);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Knights.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] arg = null;
        Knights.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
