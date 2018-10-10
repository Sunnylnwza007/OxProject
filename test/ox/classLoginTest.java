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
 * @author RUNGSIMAN KAEWSOPAK
 */
public class classLoginTest {
    
    public classLoginTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUserLogin method, of class classLogin.
     */
    @Test
    public void testCheckUserLogin() {
       classLogin re = new classLogin();
        boolean test = re.checkUserLogin("suns0001","12345678");
        assertEquals(true, test);
    }
    
    @Test
    public void testCheckUserLogin2() {
       classLogin re = new classLogin();
        boolean test = re.checkUserLogin("suns0001","123456789");
        assertEquals(false, test);
    }
    
    @Test
    public void testCheckUserLogin3() {
       classLogin re = new classLogin();
        boolean test = re.checkUserLogin("suns","12345678");
        assertEquals(false, test);
    }
    
    @Test
    public void testCheckUserLogin4() {
       classLogin re = new classLogin();
        boolean test = re.checkUserLogin("suns0","12345aaaaaa");
        assertEquals(false, test);
    }
    
    @Test
    public void testCheckUserLogin5() {
       classLogin re = new classLogin();
        boolean test = re.checkUserLogin(" "," ");
        assertEquals(false, test);
    }
    
    
}
