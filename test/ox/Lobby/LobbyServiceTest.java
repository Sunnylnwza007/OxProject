/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox.Lobby;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell
 */
public class LobbyServiceTest {
    
    public LobbyServiceTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Lobby.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removePlayer method, of class Lobby.
     */
   
    @Test
    public void testcheckStaus2() {
        System.out.println("checkStatus2");
        Lobby lob = new Lobby();
        boolean test = lob.checkStatus("0");
        assertEquals(true, test);
//        Success("status >= 0")
    }
    
    @Test
    public void testcheckStaus3() {
        System.out.println("checkStatus3");
        Lobby lob = new Lobby();
        boolean test = lob.checkStatus("1");
        assertEquals(true, test);
//        Success("status >= 0")
    }
    
    @Test
     public void testcheckStaus4() {
        System.out.println("checkStatus4");
        Lobby lob = new Lobby();
        boolean test = lob.checkStatus("2");
        assertEquals(false, test);
//        fail("status > 1")
    }
    
}
