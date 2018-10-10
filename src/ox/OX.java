/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

import com.mongodb.BasicDBObject;
import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jutamas_Soiraya
 */
public class OX {

    MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds243212.mlab.com:43212/ox-project"); 
    MongoClient client = new MongoClient(uri);
    MongoDatabase db = client.getDatabase(uri.getDatabase());
    BasicDBObject insert  = new BasicDBObject();
    String user;
    
    
    /**
     * @param args the command line arguments
     */
    public boolean insertUser(String user,String pass,String pass2){
        if ((pass).equals(pass2) && (
            !user.equals("") && !pass.equals(""))){
            insert.put("username", user);
            insert.put("password", pass);
            MongoCollection<Document> songs = db.getCollection("user");
            List<Document> seedData = new ArrayList<Document>();
            seedData.add(new Document("username", user).append("password", pass));
            songs.insertMany(seedData);
            return true;
        }else{
            return false; 
        }
        
    }
    
    public boolean checkUser(String user,String password){
        int count = 0;
        MongoCollection<Document> songs = db.getCollection("user");
        Document findU = new Document("username",user).append("password", password);
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
