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
public class Knights3Test {
    
    public Knights3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Knights3.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Knights3.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveProblem method, of class Knights3.
     */
    @Test
    public void testSolveProblem() {
        System.out.println("solveProblem");
        int input = 0;
        int[][] expResult = null;
        int[][] result = Knights3.solveProblem(input);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Knights3.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Knights3.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
