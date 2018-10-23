/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox.Lobby;


import ox.Lobby.LobbyDAO;

/**
 *
 * @author KIATS
 */
public class LobbyService {
    
    static String loadLobbyStatus(String roomNo){
        return LobbyDAO.loadLobbyStatus(roomNo);     
    }

    static void enterRoom(String roomNo, String num, String status){
        LobbyDAO.enterRoom(roomNo, num, status);    
    } 
    
    static void exitRoom(String roomNo, String num, String status){
       LobbyDAO.exitRoom(roomNo, num, status);  
    }
    
}
