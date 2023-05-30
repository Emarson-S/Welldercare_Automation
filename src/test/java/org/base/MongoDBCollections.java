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
	    FileReader reader=new FileReader("D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\Application properties Dev");
        Properties props=new Properties();
        props.load(reader);
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
	
	
	public static String connMongoDB(String DB_URL, String Database,String Tablename, String key,String putValue1, String getValue1,String getValue2, String putValue2,String putValue3, String getValue3) throws IOException { 
	    FileReader reader=new FileReader("D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\Application properties Dev");
        Properties props=new Properties();
        props.load(reader);
		MongoClient mongoClient = MongoClients.create(props.getProperty(DB_URL));
		MongoDatabase db=mongoClient.getDatabase(props.getProperty(Database));
		MongoCollection<Document> collection=db.getCollection(Tablename);
		FindIterable<Document> results=collection.find(new Document(key,putValue1));
		for(Document document: results) {
			System.out.println("-->"+document);
			String output1=document.getString(getValue1);
			String output2=document.getString(getValue2);
			if(output1.equalsIgnoreCase(putValue2) && output2.equalsIgnoreCase(putValue3) ) {
				String	output3=document.getString(getValue3);
				System.err.println("-->op1-->"+output3);
				return output3;
			}
			
		}
		return null;
					         	
	      }
	
// Table names
	
	
	
	public static String TBL_VERIFICATION_TOKEN="tbl_verification_token";
	
	public static String TBL_PASSWORD_RESET_TOKEN="tbl_password_reset_token";
	
	public static String TBL_ONE_TIME_PASSWORD="tbl_one_time_password";
	
	public static String TBL_USER="tbl_user";
	
	public static String TBL_USER_AUTH="tbl_user_auth";
	
	public static String TBL_ENQUIRY="tbl_enquiry";
	
	public static String TBL_VETERAN_ONBOARD_DATA="tbl_veteran_onboard_data";
	
	public static String TBL_DOCTOR_VETERAN_MAPPING="tbl_doctor_veteran_mapping";
	
	public static String TBL_APPOINTMENT="tbl_appointment";

}
