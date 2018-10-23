/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox.Register;
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
public class RegisterDAO {
     static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds243212.mlab.com:43212/ox-project"); 
     static MongoClient client = new MongoClient(uri);
     static MongoDatabase db = client.getDatabase(uri.getDatabase());
     static String status = " ";
    
    static void insertUser(String user,String pass,String pass2){
        MongoCollection<Document> collection = db.getCollection("user");
        List<Document> seedData = new ArrayList<Document>();
        seedData.add(new Document("username", user).append("password", pass)
        .append("win","0").append("lose", "0").append("draw","0").append("ranking","??"));
        collection.insertMany(seedData);
    }
    
    static boolean checkUser(String user){
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
}
