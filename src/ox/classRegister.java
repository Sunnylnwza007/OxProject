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
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author dell
 */
public class classRegister {
    MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds243212.mlab.com:43212/ox-project"); 
    MongoClient client = new MongoClient(uri);
    MongoDatabase db = client.getDatabase(uri.getDatabase());
    BasicDBObject insert  = new BasicDBObject();
    
    boolean checkUser(String user){
        int count = 0;
        MongoCollection<Document> col = db.getCollection("user");
        Document findU = new Document("username",user);
        MongoCursor<Document> cursor = col.find(findU).iterator();
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                count++;
            }
        } finally {  
        }
        if (count==0){
            return true;
        }else {
            return false;
        }
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
        MongoCollection<Document> songs = db.getCollection("user");
        List<Document> seedData = new ArrayList<Document>();
        seedData.add(new Document("username", user).append("password", pass)
        .append("win","0").append("lose", "0").append("draw","0").append("ranking","??"));
        songs.insertMany(seedData);
    }
}
