package org.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Configurations extends BaseClass {
	
	public static String host="Application properties Dev";
	
	public Configurations() {
		
		PageFactory.initElements(driver, this);
	}
	
//  <--- Launch URL from Application properties --->		

	public static void readUrl(String url) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		driver.get(props.getProperty(url));
	}

//  <--- Take response from verification token url --->		

	public static void readtoken(String ActiveToken, String email, String SetPassword) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		Response response = RestAssured.get(props.getProperty(ActiveToken) + email + "");
		String token = response.asString();
		driver.get(props.getProperty(SetPassword) + token + "");
	}

//  <--- Take otp from otp url --->		

	public static String readOtp(String Otp, String email) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		Response respon = RestAssured.get(Otp + email + "");
		String s = respon.asString();
		return s;
	}
	
	
//	<--- Take token from verification token table --->		
	
	public static void readVerificationToken(String email, String SetPassword) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		String token=MongoDBCollections.connectMongoDB("DB_URL", "Database", MongoDBCollections.TBL_VERIFICATION_TOKEN, "user.emailId", email, "token");
		System.out.println(token);
		driver.get(props.getProperty(SetPassword) + token + "");
	}
	
	
//	<--- Take token from reset password token table --->	
	
	public static void readPasswordToken(String email, String ResetPassword) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		String token=MongoDBCollections.connectMongoDB("DB_URL", "Database", MongoDBCollections.TBL_PASSWORD_RESET_TOKEN, "user.emailId", email, "token");
		System.out.println(token);
		driver.get(props.getProperty(ResetPassword) + token + "");
	}
	
	
//	<--- Take otp from otp table --->
	
	public static String readOtpFromTable(String email) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		String otp=MongoDBCollections.connectMongoDB("DB_URL", "Database", MongoDBCollections.TBL_ONE_TIME_PASSWORD, "emailId", email, "otp");
		System.out.println(otp);
		return otp;
	}

}
