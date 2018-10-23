/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox.Lobby;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
/**
 *
 * @author dell
 */
public class LobbyDAO {
     static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds243212.mlab.com:43212/ox-project"); 
     static MongoClient client = new MongoClient(uri);
     static MongoDatabase db = client.getDatabase(uri.getDatabase());
     static String status = " ";
     
     static String loadLobbyStatus(String roomNo){
         MongoCollection<Document> room = db.getCollection(roomNo);
        MongoCursor<Document> cursor = room.find().iterator();
          try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                
                status = doc.getString("status");
                return status;
       
            }
        } finally {}
          return status;
    }
    static void enterRoom(String roomNo, String num, String status){
        MongoCollection<Document> songs = db.getCollection(roomNo);
        
        Document updateQuery = new Document("roomID", num);
        songs.updateOne(updateQuery, new Document("$set", new Document("status",Integer.toString(Integer.parseInt(status)+1))));
    } 
    
    static void exitRoom(String roomNo, String num, String status){
       MongoCollection<Document> songs = db.getCollection(roomNo);
        
        Document updateQuery = new Document("roomID", num);
        songs.updateOne(updateQuery, new Document("$set", new Document("status",Integer.toString(Integer.parseInt(status)-1)))); 
    }
}
