/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox.Login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell
 */
public class LoginServiceTest {
    
    public LoginServiceTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUserLogin method, of class LoginService.
     */
    @Test
    public void testCheckUserLogin() {
       LoginService re = new LoginService();
        boolean test = re.checkUserLogin("suns0001","12345678");
        assertEquals(true, test);
    }
    
    @Test
    public void testCheckUserLogin2() {
       LoginService re = new LoginService();
        boolean test = re.checkUserLogin("suns0001","123456789");
        assertEquals(false, test);
    }
    
    @Test
    public void testCheckUserLogin3() {
       LoginService re = new LoginService();
        boolean test = re.checkUserLogin("suns","12345678");
        assertEquals(false, test);
    }
    
    @Test
    public void testCheckUserLogin4() {
       LoginService re = new LoginService();
        boolean test = re.checkUserLogin("suns0","12345aaaaaa");
        assertEquals(false, test);
    }
    
    @Test
    public void testCheckUserLogin5() {
       LoginService re = new LoginService();
        boolean test = re.checkUserLogin(" "," ");
        assertEquals(false, test);
    }
    
}
