/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell
 */
public class classRegisterTest {
    
    public classRegisterTest() {
    }
    
    @Before
    public void setUp() {
      
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCheckUser() {
        classRegister re = new classRegister();
        boolean test = re.checkUser("suns0001");
        assertEquals(false, test);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckUser2() {
        classRegister re = new classRegister();
        boolean test = re.checkUser("eieilnwza");
        assertEquals(true, test);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckLengthPassword() {
        classRegister re = new classRegister();
        boolean test = re.checkLengthPassword("123456");
        assertEquals(false, test);
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckLengthPassword2() {
        classRegister re = new classRegister();
        boolean test = re.checkLengthPassword("12345678901234567");
        assertEquals(false, test);
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckLengthPassword3() {
        classRegister re = new classRegister();
        boolean test = re.checkLengthPassword("12345678");
        assertEquals(true, test);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckLengthUser() {
        classRegister re = new classRegister();
        boolean test = re.checkLengthUser("1234");
        assertEquals(false, test);
        //fail("The test case is a prototype.");
    }
    
    @Test
     public void testCheckLengthUser2() {
        classRegister re = new classRegister();
        boolean test = re.checkLengthUser("12345678901234567");
        assertEquals(false, test);
        //fail("The test case is a prototype.");
    }
     
    @Test
    public void testCheckLengthUser3() {
        classRegister re = new classRegister();
        boolean test = re.checkLengthUser("12345");
        assertEquals(true, test);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckPassword() {
        classRegister re = new classRegister();
        boolean test = re.checkPassword("12345","123456789");
        assertEquals(false, test);
        //fail("The test case is a prototype.");
    }
     @Test
    public void testCheckPassword1() {
        classRegister re = new classRegister();
        boolean test = re.checkPassword("123456789","123456789");
        assertEquals(true, test);
        //fail("The test case is a prototype.");
    }

    
}
