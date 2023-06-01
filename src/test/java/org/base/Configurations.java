package org.base;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Configurations extends BaseClass {

	public static String host = "Application properties Dev";

	public Configurations() {

		PageFactory.initElements(driver, this);
	}

//  <--- Launch URL from Application properties --->		

	public static void readUrl(String url) throws IOException {
		FileReader reader = new FileReader(
				"D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\" + host);
		Properties props = new Properties();
		props.load(reader);
		driver.get(props.getProperty(url));
	}

//  <--- Take response from verification token url --->		

	public static void readtoken(String ActiveToken, String email, String SetPassword) throws IOException {
		FileReader reader = new FileReader(
				"D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\" + host);
		Properties props = new Properties();
		props.load(reader);
		Response response = RestAssured.get(props.getProperty(ActiveToken) + email + "");
		String token = response.asString();
		driver.get(props.getProperty(SetPassword) + token + "");
	}

//  <--- Take otp from otp url --->		

	public static String readOtp(String Otp, String email) throws IOException {
		FileReader reader = new FileReader(
				"D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\" + host);
		Properties props = new Properties();
		props.load(reader);
		Response respon = RestAssured.get(Otp + email + "");
		String s = respon.asString();
		return s;
	}

//	<--- Take token from verification token table --->		

	public static void readVerificationToken(String email, String SetPassword) throws IOException {
		FileReader reader = new FileReader(
				"D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\" + host);
		Properties props = new Properties();
		props.load(reader);
		String token = MongoDBCollections.connectMongoDB("DB_URL", "Database",
				MongoDBCollections.TBL_VERIFICATION_TOKEN, "user.emailId", email, "token");
		System.out.println(token);
		driver.get(props.getProperty(SetPassword) + token + "");
	}

//	<--- Take token from reset password token table --->	

	public static void readPasswordToken(String email, String ResetPassword) throws IOException {
		FileReader reader = new FileReader(
				"D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\" + host);
		Properties props = new Properties();
		props.load(reader);
		String token = MongoDBCollections.connectMongoDB("DB_URL", "Database",
				MongoDBCollections.TBL_PASSWORD_RESET_TOKEN, "user.emailId", email, "token");
		System.out.println(token);
		driver.get(props.getProperty(ResetPassword) + token + "");
	}

//	<--- Take otp from otp table --->

	public static String readOtpFromTable(String email) throws IOException {
		FileReader reader = new FileReader(
				"D:\\Project\\Welldercare_Automation\\src\\test\\java\\org\\runner\\" + host);
		Properties props = new Properties();
		props.load(reader);
		String otp = MongoDBCollections.connectMongoDB("DB_URL", "Database", MongoDBCollections.TBL_ONE_TIME_PASSWORD,
				"emailId", email, "otp");
		System.out.println(otp);
		return otp;
	}

	// < ---- Enter patch number ---->

	public static int patchNumber() throws IOException {
		String a = toReadDataFromExcel("Files", "Enquiry", 3, 3);
		int b = Integer.parseInt(a) + 1;
		toCreateNewCell("Files", "Enquiry", 3, 3, String.valueOf(b));
		return b;
	}

	// <---- Enter medicine expiry date ----->

	public static String plusMonth(int monthCount) {
		LocalDate date = LocalDate.now();
		LocalDate month = date.plusMonths(monthCount);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = month.format(dateTimeFormatter);
		return formattedDate;

	}

// Enter Address	

	public static List<String> enterAddress(String Country, String State, String City, String Pincode,
			String Territory) {
		List<String> l = new ArrayList<String>();
		l.add(Country);
		l.add(State);
		l.add(City);
		l.add(Pincode);
		l.add(Territory);
		return l;
	}

// Enter contact numbers	

	public static List<String> enterContactNo(long PhoneNumber, long AlterContact, long PanNumber, int i) {
		long v1 = PhoneNumber + i;
		long v2 = AlterContact + i;
		long v3 = PanNumber + i;
		String s1 = String.valueOf(v1);
		String s2 = String.valueOf(v2);
		String s3 = String.valueOf(v3);
		List<String> l = new ArrayList<String>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		return l;
	}

// Enter image url

	public static List<String> enterImage(String ImageUrl, String ProfileImage, String IdProof, String RegScanCopy,
			String MedicalReport, String InsuranceCopy) {
		List<String> l = new ArrayList<String>();
		String image1 = ImageUrl + ProfileImage;
		String image2 = ImageUrl + IdProof;
		String image3 = ImageUrl + RegScanCopy;
		String image4 = ImageUrl + MedicalReport;
		String image5 = ImageUrl + InsuranceCopy;
		l.add(image1);
		l.add(image2);
		l.add(image3);
		l.add(image4);
		l.add(image5);
		return l;

	}

	@Test
	private void addExcelDetails() throws IOException {

		// Change Address

		List<String> l1 = Configurations.enterAddress("India", "Tamilnadu", "Ramanathapuram", "656453", "C.k.mangalam");
		for (int i = 8, k = 0; i < 13 && k < 5; i++, k++) {
			toCreateNewCell("Files", "Enquiry", i, 1, l1.get(k));
		}
		for (int j = 1; j < 7; j++) {
			for (int i = 22, k = 0; i < 27 && k < 5; i++, k++) {
				toCreateNewCell("Files", "Login&Usercreation", i, j, l1.get(k));
			}
		}

		// Change phone numbers & Id numbers

		for (int i = 0, j = -1; i < 7 || j < 7; i++, j++) {
			List<String> l2 = Configurations.enterContactNo(8976564180l, 78745323178l, 876593543138l, i);
			if (j >= 1) {
				toCreateNewCell("Files", "Login&Usercreation", 15, j, l2.get(1));
				toCreateNewCell("Files", "Login&Usercreation", 18, j, l2.get(2));
			}
			if (i == 0) {
				toCreateNewCell("Files", "Enquiry", 5, 1, l2.get(0));

			} else if (i == 1) {
				toCreateNewCell("Files", "Enquiry", 18, 1, l2.get(0));

			} else if (i > 1) {
				toCreateNewCell("Files", "Login&Usercreation", 9, j, l2.get(0));
			}
		}

		// Change images

//		List<String> l3=Configurations.enterImage("D:\\Project\\Welldercare_Automation\\Lib\\Images\\", "image15.jpg", "image14.jpg","image8.jpg","image9.jpg","image5.jpg");
//		for (int i = 1; i < 7; i++) {
//			toCreateNewCell("Files", "Login&Usercreation", 12, i,l3.get(0));
//			toCreateNewCell("Files", "Login&Usercreation", 19, i,l3.get(1));
//		}
//		for (int i = 3; i <7 ; i++) {
//			toCreateNewCell("Files", "Login&Usercreation", 31, i,l3.get(2));
//		}
//		toCreateNewCell("Files", "Enquiry", 22, 1, l3.get(0));
//		toCreateNewCell("Files", "Enquiry", 22, 3, l3.get(0));
//		toCreateNewCell("Files", "Enquiry", 28, 1, l3.get(1));
//		toCreateNewCell("Files", "Enquiry", 26, 3, l3.get(1));
//		toCreateNewCell("Files", "Enquiry", 46, 1, l3.get(3));
//		toCreateNewCell("Files", "Enquiry", 65, 1, l3.get(4));

	}

}
