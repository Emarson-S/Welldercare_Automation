package org.runner;

import java.io.IOException;
import java.util.List;

import org.base.AppointmentsPojo;
import org.base.BaseClass;
import org.base.Configurations;
import org.base.UserCreationPojo;
import org.base.VeteranOnboardingPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleClass extends BaseClass {
	
	
	

	@Test(enabled = false)
	private void requestAppointments() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 4));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestAppointmentBtn());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterRequestDoctorName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterRequestAppointmentType(), "OPD");
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterRequestAppointmentMode(), "Online");
		pressEnterKey();
		toThreadSleep(1000);
		String s = readDay();
		String mm = readMonth();
		String yyyy = readYear();
		int n = Integer.parseInt(s) + 1;
		String dd = n + "";
		toFillTextbox(l3.getEnterRequestAppointmentDate(), dd + "-" + mm + "-" + yyyy);
		toThreadSleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='00:00']")).click();
		toFillTextbox(l3.getEnterhour(), "10");
		toFillTextbox(l3.getEnterMin(), "00");
		toFillTextbox(l3.getEnterRequestAppointmentDuration(), "1 Hour");
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l3.getClickSubmitRequestAppointment());
		toThreadSleep(3000);
        closeBrowser();
	}
	
	

	
	@Test(enabled = false)
	private void liveRequest() throws Throwable {
		openEdge();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 4));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickEmergencyBtn());
		toThreadSleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		toThreadSleep(3000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickLiveRequestMenu());
		toThreadSleep(2000);
		toClickButton(l3.getClickNewLiveRequest());
		toThreadSleep(2000);
		toClickButton(l3.getViewLiveRequest());
		toThreadSleep(2000);
		toClickButton(l3.getClickAttendBtn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(3000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		toClickButton(l3.getClickStartBtn());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterDoctorNotes(), "Follow the below Medicines and Instructions");
		scrollDown(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		toClickButton(l3.getClickAddMedicines());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterMedicineName(), "Amoxicillin&nbsp;10mg");
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l2.getClickMorning());
		toClickButton(l2.getClickAfternoon());
		toClickButton(l3.getClickAfterFood());
		toFillTextbox(l3.getEnterNoOfDays(), "5");
		toFillTextbox(l3.getEnterInstructins(), "Your suger level increased, avoid sweets");
		toFillTextbox(l3.getEnterLabTest(), "Ct scan");
		pressEnterKey();
		toThreadSleep(1000);
		scrollDown(l3.getClickUpdateAppointment());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		toThreadSleep(4000);
		closeBrowser();				

	}

	@Test(enabled = false)
	private void createAppointment() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickCalendar());
		toThreadSleep(2000);
		toClickButton(l3.getClickcreateAppointmenBtn());
		toThreadSleep(2000);
		toFillTextbox(l3.getEnterVeteranName(), "Pinarayi Vijayan");
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterAppointmentType(), "OPD");
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterAppointmentMode(), "Online");
		pressEnterKey();
		toThreadSleep(1000);
		String date = readDate();
		toFillTextbox(l3.getEnterAppointmentDate(), date);
		toClickButton(l3.getClickTimePicker());
		String hr = readHour();
		String mm = readMin();
		String aa = readAm();
		toThreadSleep(1000);
		WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-default text-center']"));
		String out = text.getText();
		if (aa == out) {
			toFillTextbox(l3.getEnterhour(), hr);
			toFillTextbox(l3.getEnterMin(), mm);
			toFillTextbox(l3.getEnterAppointmentDuration(), "1 Hour");
			pressEnterKey();
			toThreadSleep(1000);
		} else if (aa != out) {
			toFillTextbox(l3.getEnterhour(), hr);
			toFillTextbox(l3.getEnterMin(), mm);
			toThreadSleep(1000);
			WebElement bb = driver.findElement(By.xpath("//button[text()='AM ']"));
			a.moveToElement(bb).click();
			toClickButton(l3.getClickTimePicker());
			toThreadSleep(1000);
			toFillTextbox(l3.getEnterAppointmentDuration(), "1 Hour");
			pressEnterKey();
			toThreadSleep(1000);
		}
		toClickButton(l3.getClickBookAppointment());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		toClickButton(l3.getClickStartBtn());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterDoctorNotes(), "Follow the below Medicines and Instructions");
		scrollDown(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		toClickButton(l3.getClickAddMedicines());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterMedicineName(), "Amoxicillin&nbsp;10mg");
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l2.getClickMorning());
		toClickButton(l2.getClickAfternoon());
		toClickButton(l3.getClickAfterFood());
		toFillTextbox(l3.getEnterNoOfDays(), "5");
		toFillTextbox(l3.getEnterInstructins(), "Your suger level increased, avoid sweets");
		toFillTextbox(l3.getEnterLabTest(), "Ct scan");
		pressEnterKey();
		scrollDown(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		toClickButton(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		toThreadSleep(4000);
		closeBrowser();

	}

	@Test(enabled = false)
	private void completeAppointments() throws Throwable {

		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		toClickButton(l3.getClickStartBtn());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterDoctorNotes(), "Follow the below Medicines and Instructions");
		scrollDown(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		toClickButton(l3.getClickAddMedicines());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterMedicineName(), "Amoxicillin&nbsp;10mg");
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l2.getClickMorning());
		toClickButton(l2.getClickAfternoon());
		toClickButton(l3.getClickAfterFood());
		toFillTextbox(l3.getEnterNoOfDays(), "5");
		toFillTextbox(l3.getEnterInstructins(), "Your suger level increased, avoid sweets");
		toFillTextbox(l3.getEnterLabTest(), "Ct scan");
		pressEnterKey();
		scrollDown(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		toClickButton(l3.getClickUpdateAppointment());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		toThreadSleep(4000);
		closeBrowser();
	}

	@Test(enabled = false)
	private void doctorApproval() throws Throwable {
		openChrome();
		maxWindow();
		launchUrl(toReadDataFromExcel("Files", "Login&Usercreation", 1, 1));
		toThreadSleep(2000);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		UserCreationPojo l1 = new UserCreationPojo();
		Actions a = new Actions(driver);
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l2.getClickEnquiriesMenu());
		toThreadSleep(1000);
		toClickButton(l2.getClickNewEnquiry());
		toThreadSleep(1000);
		toClickButton(l2.getClickVerifyAndApprove());
		toThreadSleep(2000);
		scrollDown(l2.getEnterMedicalScore());
		toThreadSleep(2000);
		toFillTextbox(l2.getEnterMedicalScore(), "5");
		toClickButton(l2.getEnterMedicalScore());
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterRiskScore(), "8");
		toClickButton(l2.getEnterRiskScore());
		toThreadSleep(1000);
		toClickButton(l2.getClickSubmitMedicalScore());
		toThreadSleep(3000);
		closeBrowser();

	}

	@Test(enabled = false, priority = 10)
	private void assignDoctor() throws Throwable {
		openChrome();
		maxWindow();
		launchUrl(toReadDataFromExcel("Files", "Login&Usercreation", 1, 1));
		toThreadSleep(2000);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		UserCreationPojo l1 = new UserCreationPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 2));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l2.getClickVeteransMenu());
		toThreadSleep(1000);
		toClickButton(l2.getClickNewVeteran());
		toThreadSleep(1000);
		toClickButton(l2.getClickAssignDoctorBtn());
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterAssignDoctorName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l2.getClickAssignDoctor());
	}

	@Test(enabled = false)
	private void veteranActive() throws InterruptedException, IOException {
		openChrome();
		maxWindow();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		UserCreationPojo l1 = new UserCreationPojo();
		Response response = RestAssured.get("http://65.108.222.73:8080/recent-user-activation-link/"+ toReadDataFromExcel("Files", "Enquiry", 4, 1) + "");
		String token = response.asString();
		System.out.println(token);
		toThreadSleep(2000);
		launchUrl("http://65.108.222.73/#/en/createPassword?token=" + token + "");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		Response respon = RestAssured
				.get("http://65.108.222.73:8080/recent-user-otp/" + toReadDataFromExcel("Files", "Enquiry", 4, 1) + "");
		String s = respon.asString();
		System.out.println(s);
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			char ch = s.charAt(i);
			String otp = Character.toString(ch);
			toFillTextbox(driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[" + j + "]")), otp);
		}
		toThreadSleep(1000);
		toClickButton(l1.getClickValidateBtn());
		toThreadSleep(5000);
		closeBrowser();

	}
	

	@Test(enabled = false)
	private void familymemberActive() throws InterruptedException, IOException {
		openChrome();
		maxWindow();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		UserCreationPojo l1 = new UserCreationPojo();
		Response response = RestAssured.get("http://65.108.222.73:8080/recent-user-activation-link/"
				+ toReadDataFromExcel("Files", "Enquiry", 16, 1) + "");
		String token = response.asString();
		System.out.println(token);
		toThreadSleep(2000);
		launchUrl("http://65.108.222.73/#/en/createPassword?token=" + token + "");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 16, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		Response respon = RestAssured.get(
				"http://65.108.222.73:8080/recent-user-otp/" + toReadDataFromExcel("Files", "Enquiry", 16, 1) + "");
		String s = respon.asString();
		System.out.println(s);
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			char ch = s.charAt(i);
			String otp = Character.toString(ch);
			toFillTextbox(driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[" + j + "]")), otp);
		}
		toThreadSleep(1000);
		toClickButton(l1.getClickValidateBtn());
		toThreadSleep(5000);
		closeBrowser();

	}

}
