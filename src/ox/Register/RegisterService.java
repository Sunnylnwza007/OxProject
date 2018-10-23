/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox.Register;

import ox.Register.RegisterDAO;

/**
 *
 * @author dell
 */
public class RegisterService {
    
    
    boolean checkUser(String user){
        return RegisterDAO.checkUser(user);
    }
    
    boolean checkLengthPassword(String pass){
        int count = pass.length();
        if (count<8 || count>16){
            return false;
        }else{
            return true;
        }
    }
    
    boolean checkLengthUser(String user){
        int count = user.length();
        if (count<5 || count>16){
            return false;
        }else{
            return true;
        }
    }
    
    boolean checkPassword(String pass,String pass2){
        if (pass.equals(pass2)){
            return true;
        }else{
            return false;
        }
    }
    
    void insertUser(String user,String pass,String pass2){

        RegisterDAO.insertUser(user, pass, pass2);
        
    }
}
