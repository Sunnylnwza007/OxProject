/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author RUNGSIMAN KAEWSOPAK
 */
public class classLogin {
    
    MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds243212.mlab.com:43212/ox-project"); 
    MongoClient client = new MongoClient(uri);
    MongoDatabase db = client.getDatabase(uri.getDatabase());
    BasicDBObject insert  = new BasicDBObject();
    String user;
 
    
    public boolean checkUserLogin(String user,String pass){
        int count = 0;
        MongoCollection<Document> songs = db.getCollection("user");
        Document findU = new Document("username",user).append("password", pass);
        MongoCursor<Document> cursor = songs.find(findU).iterator();
          try {
            while (cursor.hasNext()) {
               Document doc = cursor.next();
               count++;
            }
        } finally {  
        }
        if (count>0){
            return true;
        }else{
            return false;
        }
    }
}
