/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

/**
 *
 * @author dell
 */
public class unitTestRegis {
    classRegister re = new classRegister();
    
    void check(){
        System.out.println("มีในระบบ: "+re.checkUser("suns0001"));
         System.out.println("ไม่มีในระบบ: "+re.checkUser(""));
        
        
    }
}
