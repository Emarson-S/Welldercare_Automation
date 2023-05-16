package org.runner;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

import org.base.AppointmentsPojo;
import org.base.BaseClass;
import org.base.Configurations;
import org.base.MastersPojo;
import org.base.MongoDBCollections;
import org.base.ProfileUpdatePojo;
import org.base.UserCreationPojo;
import org.base.VeteranOnboardingPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleClass extends BaseClass {

	@Test (enabled=true)
	private void tc2() throws IOException {		

	}
	
	
	
	@Test(enabled=false)
	private void caremanagerProfileUpdate() throws Exception {		
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		ProfileUpdatePojo l4 =new ProfileUpdatePojo();
		Actions a=new Actions(driver);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		toFillTextbox(l1.getEnterUsername(), "ilhan.demari@fullangle.org");
		toFillTextbox(l1.getEnterPassword(), "Emarson5020@");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		scrollDown(l4.getClickProfile());
		toThreadSleep(2000);
		toClickButton(l4.getClickProfile());
		toThreadSleep(2000);
		toFillTextbox(l4.getEnterTitle(), "Mrs");
		pressEnterKey();
		toThreadSleep(1000);
		toSelectAndFill(l4.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 2));
		toSelectAndFill(l4.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 2));
		toFillTextbox(l4.getEnterGendar(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 2));
		toThreadSleep(1000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterDoB(),"01-02-1990");
		toSelectAndFill(l4.getEnterAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 2));
		toSelectAndFill(l4.getEnterAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 2));
		toFillTextbox(l4.getEnterCpCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 2));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterCpState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 2));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterCpCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 2));
		toThreadSleep(1000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterPinCode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 2));
		toFillTextbox(l4.getEnterCpTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 2));
		toThreadSleep(1000);
		pressEnterKey();
		scrollDown(l4.getClickCpSubmitBtn());
		toThreadSleep(1000);
		toFillTextbox(l4.getEnterCpGovtIDType(), "Aadhar card");
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterGovtIDNum(), "786545364534");
		toSelectAndFill(l4.getEnterAlterContNum(), "7685945657");
		toFillTextbox(l4.getEnterCpDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 2));
		toThreadSleep(1000);
		pressEnterKey();
		toClickButton(l4.getClickCpSubmitBtn());
		toThreadSleep(4000);
		closeBrowser();

	}
		
	
	@Test(enabled=false)
	private void channelPartnerProfileUpdate() throws Exception{
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		ProfileUpdatePojo l4 =new ProfileUpdatePojo();
		Actions a=new Actions(driver);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		toFillTextbox(l1.getEnterUsername(), "aryo.ollis@fullangle.org");
		toFillTextbox(l1.getEnterPassword(), "Emarson5020@");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		scrollDown(l4.getClickProfile());
		toThreadSleep(2000);
		toClickButton(l4.getClickProfile());
		toThreadSleep(2000);
		toFillTextbox(l4.getEnterTitle(), "Mrs");
		pressEnterKey();
		toThreadSleep(1000);
		toSelectAndFill(l4.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 1));
		toSelectAndFill(l4.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 1));
		toFillTextbox(l4.getEnterGendar(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 1));
		toThreadSleep(1000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterDoB(),"01-02-1990");
		toSelectAndFill(l4.getEnterAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 1));
		toSelectAndFill(l4.getEnterAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 1));
		toFillTextbox(l4.getEnterCpCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 1));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterCpState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 1));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterCpCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 1));
		toThreadSleep(1000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterPinCode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 1));
		toFillTextbox(l4.getEnterCpTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 1));
		toThreadSleep(1000);
		pressEnterKey();
		scrollDown(l4.getClickCpSubmitBtn());
		toThreadSleep(1000);
		toFillTextbox(l4.getEnterCpGovtIDType(), "Aadhar card");
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterGovtIDNum(), "786545364534");
		toSelectAndFill(l4.getEnterAlterContNum(), "7685945657");
		toFillTextbox(l4.getEnterCpDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 1));
		toThreadSleep(1000);
		pressEnterKey();
		toClickButton(l4.getClickCpSubmitBtn());
		toThreadSleep(3000);
		closeBrowser();
	}
	
	
	@Test(enabled=false)
    private void caretakerProfileUpdate() throws Exception{
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		ProfileUpdatePojo l4 =new ProfileUpdatePojo();
		Actions a=new Actions(driver);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		toFillTextbox(l1.getEnterUsername(), "jahkari.yovanny@fullangle.org");
		toFillTextbox(l1.getEnterPassword(), "Emarson5020@");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		scrollDown(l4.getClickProfile());
		toThreadSleep(2000);
		toClickButton(l4.getClickProfile());
		toThreadSleep(2000);
		toFillTextbox(l4.getEnterTitle(), "Mrs");
		pressEnterKey();
		toThreadSleep(1000);
		toSelectAndFill(l4.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 4));
		toSelectAndFill(l4.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 4));
		toFillTextbox(l4.getEnterGendar(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 4));
		toThreadSleep(1000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterDoB(),"01-02-1990");
		toSelectAndFill(l4.getEnterAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 4));
		toSelectAndFill(l4.getEnterAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 4));
		toFillTextbox(l4.getEnterCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 4));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 4));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 4));
		toThreadSleep(1000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterPinCode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 4));
		toFillTextbox(l4.getEnterTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 4));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterGovtIDType(), "Aadhar card");
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterGovtIDNum(), "786545364534");
		toFillTextbox(l4.getEnterDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 4));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterSpecialty(), toReadDataFromExcel("Files", "Login&Usercreation", 28, 4));
		toThreadSleep(1000);
		pressEnterKey();
		scrollDown(l4.getClickProfileSubmit());
		toThreadSleep(1000);		
		toClickButton(l1.getClickSat());
		toClickButton(l1.getClickSun());
		toClickButton(l4.getClickEndTime());
		toFillTextbox(l1.getEnterHrTime(), "10");
		toFillTextbox(l1.getEnterMMTime(), "30");
		toClickButton(l1.getClickAMbutton());
		scrollDown(l4.getClickProfileSubmit());
		toThreadSleep(1000);
		toClickButton(l4.getClickProfileSubmit());	
		toThreadSleep(4000);
		closeBrowser();			

	}
	
	
	@Test(enabled = false)
	private void DoctorProfileUpdate() throws IOException, InterruptedException, AWTException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		ProfileUpdatePojo l4 =new ProfileUpdatePojo();
		Actions a=new Actions(driver);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		toFillTextbox(l1.getEnterUsername(), "tyrese.motty@fullangle.org");
		toFillTextbox(l1.getEnterPassword(), "Emarson5020@");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		scrollDown(l4.getClickProfile());
		toThreadSleep(2000);
		toClickButton(l4.getClickProfile());
		toThreadSleep(2000);
		toFillTextbox(l4.getEnterTitle(), "Mrs");
		pressEnterKey();
		toThreadSleep(1000);
		toSelectAndFill(l4.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 6));
		toSelectAndFill(l4.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 6));
		toFillTextbox(l4.getEnterGendar(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 6));
		toThreadSleep(1000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterDoB(),"01-02-1990");
		toSelectAndFill(l4.getEnterAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 6));
		toSelectAndFill(l4.getEnterAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 6));
		toFillTextbox(l4.getEnterCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 6));
		toThreadSleep(2000);
		pressEnterKey();
		toFillTextbox(l4.getEnterState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 6));
		toThreadSleep(2000);
		pressEnterKey();
		toFillTextbox(l4.getEnterCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 6));
		toThreadSleep(2000);
		pressEnterKey();
		toSelectAndFill(l4.getEnterPinCode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 6));
		toFillTextbox(l4.getEnterTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 6));
		toThreadSleep(2000);
		pressEnterKey();
		toFillTextbox(l4.getEnterGovtIDType(), "Aadhar card");
		toThreadSleep(2000);
		pressEnterKey();
		toFillTextbox(l4.getEnterGovtIDNum(), "786545364534");
		toFillTextbox(l4.getEnterDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 6));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l4.getEnterSpecialty(), toReadDataFromExcel("Files", "Login&Usercreation", 28, 6));
		toThreadSleep(1000);
		pressEnterKey();
		scrollDown(l1.getEnterDrAboutYourself());
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterClinicName(), toReadDataFromExcel("Files", "Login&Usercreation", 32, 6));
		toSelectAndFill(l1.getEnterClinicEmail(), toReadDataFromExcel("Files", "Login&Usercreation", 34, 6));
		toSelectAndFill(l1.getEnterClinicContactNo(), toReadDataFromExcel("Files", "Login&Usercreation", 33, 6));
		toSelectAndFill(l1.getEnterClinicAddress(), toReadDataFromExcel("Files", "Login&Usercreation", 35, 6));
		toClickButton(l1.getClickSat());
		toClickButton(l1.getClickSun());
		toClickButton(l4.getClickEndTime());
		toFillTextbox(l1.getEnterHrTime(), "10");
		toFillTextbox(l1.getEnterMMTime(), "30");
		toClickButton(l1.getClickAMbutton());
		scrollDown(l4.getClickProfileSubmit());
		toThreadSleep(1000);
		toClickButton(l4.getClickProfileSubmit());	
		toThreadSleep(4000);
		closeBrowser();
	}

	@Test(enabled = false)
	private void requestAppointmentAccept() throws InterruptedException, IOException, AWTException {

		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), "emarson.s@mavens-i.com");
		toFillTextbox(l1.getEnterPassword(), "Welldercare@3");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestFilterBtn());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		scrollDown(l3.getClickAcceptRequestAppt());
		toThreadSleep(1000);
		String date = readDate();
		a.doubleClick(l3.getEnterRescheduleDate()).perform();
		selectAllText();
	    toFillTextbox(l3.getEnterRescheduleDate(), date);
		toClickButton(l3.getClickTimePicker());
		String hr = readHour();
		String mm = readMin();
		int m = Integer.parseInt(mm);
		String aa = readAm();
		toThreadSleep(1000);
		WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-default text-center']"));
		String out = text.getText();
		if (aa == out) {
			toFillTextbox(l3.getEnterhour(), hr);
			toFillTextbox(l3.getEnterMin(), (m + 5) + "");
		} else if (aa != out) {
			toFillTextbox(l3.getEnterhour(), hr);
			toFillTextbox(l3.getEnterMin(), (m + 5) + "");
			toThreadSleep(1000);
			WebElement bb = driver.findElement(By.xpath("//button[text()='AM ']"));
			a.moveToElement(bb).click();
		}

		toClickButton(l3.getClickAcceptRequestAppt());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		toThreadSleep(3000);
		toClickButton(l3.getClickUpcomingAppointment());
		closeBrowser();
	}

	@Test(enabled = false)
	private void Masters() throws IOException, InterruptedException {
		
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5=new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(1000);
		scrollDown(l5.getClickInsuranceCompanies());
		toThreadSleep(1000);
		toClickButton(l5.getClickInsuranceCompanies());
		toThreadSleep(2000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getEnterInsuranceCode(), "DPL");
		toFillTextbox(l5.getEnterInsuranceCompanyName(), "DHFL Pramerica Life Insurance Co. Ltd.");
		toClickButton(l5.getClickSaveBtn());

		
	}

	@Test(enabled = false)
	private void requestAppointmentByVeteran() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), "jeeva@mavens-i.com");
		toFillTextbox(l1.getEnterPassword(), "Welldercare@3");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestAppointmentBtn());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterRequestDoctorName(), "Emarson S");
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
	private void createAppointment() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), "emarson.s@mavens-i.com");
		toFillTextbox(l1.getEnterPassword(), "Welldercare@3");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickCalendar());
		toThreadSleep(2000);
		toClickButton(l3.getClickcreateAppointmenBtn());
		toThreadSleep(2000);
		toFillTextbox(l3.getEnterVeteranName(), "Jeeva Balin");
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
		int m = Integer.parseInt(mm);
		String aa = readAm();
		toThreadSleep(1000);
		WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-default text-center']"));
		String out = text.getText();
		if (aa == out) {
			toFillTextbox(l3.getEnterhour(), hr);
			toFillTextbox(l3.getEnterMin(), (m + 5) + "");
			toFillTextbox(l3.getEnterAppointmentDuration(), "1 Hour");
			pressEnterKey();
			toThreadSleep(1000);
		} else if (aa != out) {
			toFillTextbox(l3.getEnterhour(), hr);
			toFillTextbox(l3.getEnterMin(), (m + 5) + "");
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
		toFillTextbox(l3.getEnterMedicineName(), "Amplodipined&nbsp;450&nbsp;mg");
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
		Response response = RestAssured.get("http://65.108.222.73:8080/recent-user-activation-link/"
				+ toReadDataFromExcel("Files", "Enquiry", 4, 1) + "");
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
