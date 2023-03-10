package org.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.bson.Document;
import org.openqa.selenium.support.PageFactory;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBCollections extends BaseClass {
	
	public MongoDBCollections() {
		PageFactory.initElements(driver, this);
	}
	
	
	
// read particular collections	
	
	public static String connectMongoDB(String DB_URL, String Database,String Tablename, String key,String putValue, String getValue) throws IOException { 
	    FileReader reader=new FileReader("C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\Application properties Dev");
        Properties props=new Properties();
        props.load(reader);
        FindIterable<Document> resutls = null;
		MongoClient mongoClient = MongoClients.create(props.getProperty(DB_URL));
		MongoDatabase db=mongoClient.getDatabase(props.getProperty(Database));
		MongoCollection<Document> collection=db.getCollection(Tablename);
		FindIterable<Document> results=collection.find(new Document(key,putValue));
		for(Document document: results) {
			String output1=document.getString(getValue);
			return output1;
		}
		return null;
					         	
	      }
	
// Table names
	
	
	
	public static String TBL_VERIFICATION_TOKEN="tbl_verification_token";
	
	public static String TBL_PASSWORD_RESET_TOKEN="tbl_password_reset_token";
	
	public static String TBL_ONE_TIME_PASSWORD="tbl_one_time_password";
	
	
	

}
