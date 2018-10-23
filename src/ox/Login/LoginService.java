/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox.Login;

import ox.Login.LoginDAO;

/**
 *
 * @author RUNGSIMAN KAEWSOPAK
 */
public class LoginService {

    
    static public boolean checkUserLogin(String user,String pass){
       
        return LoginDAO.checkUserLogin(user, pass);
        
    }
}
