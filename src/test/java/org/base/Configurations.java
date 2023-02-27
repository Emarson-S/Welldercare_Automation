package org.base;

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

//  <--- Launch token response URL from Application properties --->		

	public static void readtoken(String ActiveToken, String email, String SetPassword) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		Response response = RestAssured.get(props.getProperty(ActiveToken) + email + "");
		String token = response.asString();
		driver.get(props.getProperty(SetPassword) + token + "");
	}

//  <--- Launch OTP response URL from Application properties --->

	public static String readOtp(String Otp, String email) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\src\\test\\java\\org\\runner\\"+host);
		Properties props = new Properties();
		props.load(reader);
		Response respon = RestAssured.get(Otp + email + "");
		String s = respon.asString();
		return s;
	}

}
