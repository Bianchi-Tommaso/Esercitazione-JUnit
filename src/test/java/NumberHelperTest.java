/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven() 
    {
      NumberHelper instance = new NumberHelper(2);
      
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);

    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
     @Test
    public void testIsOdd() 
    {
        NumberHelper instance = new NumberHelper(1);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }
    /*
    @Test
    public void testIsOdd() 
    {
       
        NumberHelper instance = new NumberHelper(1);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
*/
    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() 
    {
     
        int n = 5;
        NumberHelper instance = new NumberHelper(8);
        int expResult = 13;
        int result = instance.sum(n);
        assertEquals(expResult, result);
       
    }

    /*
    @Test
    public void testSum() 
    {
     
        int n = 5;
        NumberHelper instance = new NumberHelper(8);
        int expResult = -3;
        int result = instance.sum(n);
        assertEquals(expResult, result);
       
    }
    */
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime() 
    {
        
        NumberHelper instance = new NumberHelper(13);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        
    }
    /*
    @Test
    public void testIsPrime() 
    {
        
        NumberHelper instance = new NumberHelper(12);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);     
    }
*/
    /**
     * Test of isDisisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDisisibleBy() 
    {
   
        int n = 3;
        NumberHelper instance = new NumberHelper(12);
        boolean expResult = true;
        boolean result = instance.isDisisibleBy(n);
        assertEquals(expResult, result);
       
    }
    /*
    @Test
    public void testIsDisisibleBy() 
    {
   
        int n = 13;
        NumberHelper instance = new NumberHelper(12);
        boolean expResult = false;
        boolean result = instance.isDisisibleBy(n);
        assertEquals(expResult, result);
       
    }
    */
}
