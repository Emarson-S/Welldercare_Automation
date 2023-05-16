package org.runner;

import java.awt.AWTException;

import java.io.IOException;

import org.base.AppointmentsPojo;
import org.base.BaseClass;
import org.base.Configurations;

import org.base.ProfileUpdatePojo;
import org.base.UserCreationPojo;
import org.base.VeteranOnboardingPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RunnerClass extends BaseClass {

	// <-- Channel partner -->

	@Test(enabled = false, priority = 1)
	private void usercreationCP() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Login&Usercreation", 8, 1, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l1.getClickUsersMenu());
		toThreadSleep(3000);
		toClickButton(l1.getClickCreateUser());
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 1));
		toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 1));
		toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUserEmail(), text);
		toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 9, 1));
		toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Login&Usercreation", 10, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l1.getClickSaveBtn());
		toThreadSleep(2000);
		Configurations.readVerificationToken(text, "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), text);
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toFillTextbox(l1.getUploadCPprofilePicture(), toReadDataFromExcel("Files", "Login&Usercreation", 12, 1));
		toFillTextbox(l1.getEnterCPTitle(), toReadDataFromExcel("Files", "Login&Usercreation", 13, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPGovtIdType(), toReadDataFromExcel("Files", "Login&Usercreation", 17, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPGovtIdNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 18, 1));
		toFillTextbox(l1.getEnterCPUploadProof(), toReadDataFromExcel("Files", "Login&Usercreation", 19, 1));
		toFillTextbox(l1.getEnterCPAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 1));
		toFillTextbox(l1.getEnterCPAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 1));
		toFillTextbox(l1.getEnterCPDOB(), "06-06-2001");
		toFillTextbox(l1.getEnterCPAlternateContect(), toReadDataFromExcel("Files", "Login&Usercreation", 15, 1));
		toFillTextbox(l1.getEnterCPCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 1));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterCPState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 1));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterCPCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 1));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterCPpincode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 1));
		toFillTextbox(l1.getEnterCPTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 1));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterCPAboutYourself(), toReadDataFromExcel("Files", "Login&Usercreation", 27, 1));
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		toThreadSleep(3000);
		String output = Configurations.readOtpFromTable(text);
		for (int i = 0, j = 1; i < output.length(); i++, j++) {
			char ch = output.charAt(i);
			String otp = Character.toString(ch);
			toFillTextbox(driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[" + j + "]")), otp);
		}
		toClickButton(l1.getClickValidateBtn());
		toThreadSleep(1000);
		WebElement output1 = driver.findElement(By.xpath("//h4[@class='text-white fw-500']"));
		System.out.println(output1.getText());
		toThreadSleep(5000);
		closeBrowser();
	}

	// <-- Care manager -->

	@Test(enabled = false, priority = 2)
	private void usercreationCM() throws Throwable {

		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Login&Usercreation", 8, 2, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l1.getClickUsersMenu());
		toThreadSleep(3000);
		toClickButton(l1.getClickCreateUser());
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 2));
		toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 2));
		toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUserEmail(), text);
		toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 9, 2));
		toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Login&Usercreation", 10, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l1.getClickSaveBtn());
		toThreadSleep(2000);
		Configurations.readVerificationToken(text, "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), text);
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toFillTextbox(l1.getUploadCPprofilePicture(), toReadDataFromExcel("Files", "Login&Usercreation", 12, 2));
		toFillTextbox(l1.getEnterCPTitle(), toReadDataFromExcel("Files", "Login&Usercreation", 13, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPGovtIdType(), toReadDataFromExcel("Files", "Login&Usercreation", 17, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPGovtIdNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 18, 2));
		toFillTextbox(l1.getEnterCPUploadProof(), toReadDataFromExcel("Files", "Login&Usercreation", 19, 2));
		toFillTextbox(l1.getEnterCPAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 2));
		toFillTextbox(l1.getEnterCPAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 2));
		toFillTextbox(l1.getEnterCPDOB(), "06-06-1996");
		toFillTextbox(l1.getEnterCPAlternateContect(), toReadDataFromExcel("Files", "Login&Usercreation", 15, 2));
		toFillTextbox(l1.getEnterCPCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPpincode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 2));
		toFillTextbox(l1.getEnterCPTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 2));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCPAboutYourself(), toReadDataFromExcel("Files", "Login&Usercreation", 27, 2));
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		toThreadSleep(2000);
		String s = Configurations.readOtpFromTable(text);
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			char ch = s.charAt(i);
			String otp = Character.toString(ch);
			toFillTextbox(driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[" + j + "]")), otp);
		}
		toClickButton(l1.getClickValidateBtn());
		toThreadSleep(3000);
		WebElement output = driver.findElement(By.xpath("//h4[@class='page-title']"));
		System.out.println(output.getText());
		toThreadSleep(5000);
		closeBrowser();
	}

	// <-- Doctor 1 -->

	@Test(enabled = false, priority = 3)
	private void usercreationDr1() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Login&Usercreation", 8, 3, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l1.getClickUsersMenu());
		toThreadSleep(3000);
		toClickButton(l1.getClickCreateUser());
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 3));
		toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 3));
		toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUserEmail(), text);
		toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 9, 3));
		toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Login&Usercreation", 10, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l1.getClickSaveBtn());
		toThreadSleep(1000);
		Configurations.readVerificationToken(text, "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), text);
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toFillTextbox(l1.getUploadDrProfilePicture(), toReadDataFromExcel("Files", "Login&Usercreation", 12, 3));
		toFillTextbox(l1.getEnterDrTitle(), toReadDataFromExcel("Files", "Login&Usercreation", 13, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdType(), toReadDataFromExcel("Files", "Login&Usercreation", 17, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 18, 3));
		toFillTextbox(l1.getEnterDrUploadProof(), toReadDataFromExcel("Files", "Login&Usercreation", 19, 3));
		toFillTextbox(l1.getEnterDrAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 3));
		toFillTextbox(l1.getEnterDrAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 3));
		toFillTextbox(l1.getEnterDrDOB(), "06-06-1998");
		toFillTextbox(l1.getEnterDrAlternateContect(), toReadDataFromExcel("Files", "Login&Usercreation", 15, 3));
		toFillTextbox(l1.getEnterDrCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrpincode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 3));
		toFillTextbox(l1.getEnterDrTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 3));
		pressEnterKey();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrSpecialty(), toReadDataFromExcel("Files", "Login&Usercreation", 28, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrAboutYourself(), toReadDataFromExcel("Files", "Login&Usercreation", 27, 3));
		toFillTextbox(l1.getEnterDrRegistrationYear(), toReadDataFromExcel("Files", "Login&Usercreation", 29, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrRegistrationNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 30, 3));
		toClickButton(l1.getClickStateRegType());
		toClickButton(l1.getClickRegBoard());
		toFillTextbox(l1.getUploadDrRegistrationCopy(), toReadDataFromExcel("Files", "Login&Usercreation", 31, 3));
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Next']")).click();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterClinicName(), toReadDataFromExcel("Files", "Login&Usercreation", 32, 3));
		toFillTextbox(l1.getEnterClinicContactNo(), toReadDataFromExcel("Files", "Login&Usercreation", 33, 3));
		toFillTextbox(l1.getEnterClinicEmail(), toReadDataFromExcel("Files", "Login&Usercreation", 34, 3));
		toFillTextbox(l1.getEnterClinicAddress(), toReadDataFromExcel("Files", "Login&Usercreation", 35, 3));
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Next']")).click();
		toThreadSleep(1000);
		toClickButton(l1.getClickMon());
		toClickButton(l1.getClickTue());
		toClickButton(l1.getClickWed());
		toClickButton(l1.getClickThu());
		toClickButton(l1.getClickStartTime());
		toFillTextbox(l1.getEnterHrTime(), "08");
		toFillTextbox(l1.getEnterMMTime(), "00");
		toClickButton(l1.getClickEndTime());
		toFillTextbox(l1.getEnterHrTime(), "10");
		toFillTextbox(l1.getEnterMMTime(), "00");
		toClickButton(l1.getClickAMbutton());
		toClickButton(l1.getClickFri());
		driver.findElement(By.xpath("//button[text()=' Save & Next']")).click();
		toThreadSleep(1000);
		toClickButton(l1.getClickDrFormSubmit());
		toThreadSleep(3000);
		String s = Configurations.readOtpFromTable(text);
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			char ch = s.charAt(i);
			String otp = Character.toString(ch);
			toFillTextbox(driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[" + j + "]")), otp);
		}
		toClickButton(l1.getClickValidateBtn());
		toThreadSleep(5000);
		closeBrowser();

	}

//  <-- Doctor 2 -->	

	@Test(enabled = false, priority = 4)
	private void usercreationDr2() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Login&Usercreation", 8, 6, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l1.getClickUsersMenu());
		toThreadSleep(3000);
		toClickButton(l1.getClickCreateUser());
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 6));
		toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 6));
		toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUserEmail(), text);
		toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 9, 6));
		toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Login&Usercreation", 10, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l1.getClickSaveBtn());
		toThreadSleep(3000);
		Configurations.readVerificationToken(text, "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 6));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 6));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), text);
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 6));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toFillTextbox(l1.getUploadDrProfilePicture(), toReadDataFromExcel("Files", "Login&Usercreation", 12, 6));
		toFillTextbox(l1.getEnterDrTitle(), toReadDataFromExcel("Files", "Login&Usercreation", 13, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdType(), toReadDataFromExcel("Files", "Login&Usercreation", 17, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 18, 6));
		toFillTextbox(l1.getEnterDrUploadProof(), toReadDataFromExcel("Files", "Login&Usercreation", 19, 6));
		toFillTextbox(l1.getEnterDrAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 6));
		toFillTextbox(l1.getEnterDrAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 6));
		toFillTextbox(l1.getEnterDrDOB(), "06-06-1999");
		toFillTextbox(l1.getEnterDrAlternateContect(), toReadDataFromExcel("Files", "Login&Usercreation", 15, 6));
		toFillTextbox(l1.getEnterDrCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrpincode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 6));
		toFillTextbox(l1.getEnterDrTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 6));
		pressEnterKey();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrSpecialty(), toReadDataFromExcel("Files", "Login&Usercreation", 28, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrAboutYourself(), toReadDataFromExcel("Files", "Login&Usercreation", 27, 6));
		toFillTextbox(l1.getEnterDrRegistrationYear(), toReadDataFromExcel("Files", "Login&Usercreation", 29, 6));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrRegistrationNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 30, 6));
		toClickButton(l1.getClickStateRegType());
		toClickButton(l1.getClickRegBoard());
		toFillTextbox(l1.getUploadDrRegistrationCopy(), toReadDataFromExcel("Files", "Login&Usercreation", 31, 6));
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Next']")).click();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterClinicName(), toReadDataFromExcel("Files", "Login&Usercreation", 32, 6));
		toFillTextbox(l1.getEnterClinicContactNo(), toReadDataFromExcel("Files", "Login&Usercreation", 33, 6));
		toFillTextbox(l1.getEnterClinicEmail(), toReadDataFromExcel("Files", "Login&Usercreation", 34, 6));
		toFillTextbox(l1.getEnterClinicAddress(), toReadDataFromExcel("Files", "Login&Usercreation", 35, 6));
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Next']")).click();
		toThreadSleep(1000);
		toClickButton(l1.getClickMon());
		toClickButton(l1.getClickTue());
		toClickButton(l1.getClickWed());
		toClickButton(l1.getClickThu());
		toClickButton(l1.getClickStartTime());
		toFillTextbox(l1.getEnterHrTime(), "08");
		toFillTextbox(l1.getEnterMMTime(), "00");
		toClickButton(l1.getClickEndTime());
		toFillTextbox(l1.getEnterHrTime(), "10");
		toFillTextbox(l1.getEnterMMTime(), "00");
		toClickButton(l1.getClickAMbutton());
		toClickButton(l1.getClickFri());
		driver.findElement(By.xpath("//button[text()=' Save & Next']")).click();
		toThreadSleep(1000);
		toClickButton(l1.getClickDrFormSubmit());
		toThreadSleep(3000);
		String s = Configurations.readOtpFromTable(text);
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			char ch = s.charAt(i);
			String otp = Character.toString(ch);
			toFillTextbox(driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[" + j + "]")), otp);
		}
		toClickButton(l1.getClickValidateBtn());
		toThreadSleep(4000);
		closeBrowser();
	}

	// <-- Pharmacist -->

	@Test(enabled = false, priority = 5)
	private void usercreationPH() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Login&Usercreation", 8, 5, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l1.getClickUsersMenu());
		toThreadSleep(3000);
		toClickButton(l1.getClickCreateUser());
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 5));
		toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 5));
		toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 5));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUserEmail(), text);
		toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 9, 5));
		toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Login&Usercreation", 10, 5));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l1.getClickSaveBtn());
		toThreadSleep(3000);
		Configurations.readVerificationToken(text, "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 5));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 5));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), text);
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 5));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toFillTextbox(l1.getUploadDrProfilePicture(), toReadDataFromExcel("Files", "Login&Usercreation", 12, 5));
		toFillTextbox(l1.getEnterDrTitle(), toReadDataFromExcel("Files", "Login&Usercreation", 13, 5));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdType(), toReadDataFromExcel("Files", "Login&Usercreation", 17, 5));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 18, 5));
		toFillTextbox(l1.getEnterDrUploadProof(), toReadDataFromExcel("Files", "Login&Usercreation", 19, 5));
		toFillTextbox(l1.getEnterDrAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 5));
		toFillTextbox(l1.getEnterDrAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 5));
		toFillTextbox(l1.getEnterDrDOB(), "06-06-1919");
		toFillTextbox(l1.getEnterDrCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 5));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterDrState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 5));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterDrCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 5));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterDrpincode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 5));
		toFillTextbox(l1.getEnterDrTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 5));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterCTDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 5));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrAboutYourself(), toReadDataFromExcel("Files", "Login&Usercreation", 27, 5));
		toFillTextbox(l1.getEnterDrRegistrationYear(), toReadDataFromExcel("Files", "Login&Usercreation", 29, 5));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrRegistrationNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 30, 5));
		toClickButton(l1.getClickStateRegType());
		toClickButton(l1.getClickRegBoard());
		toFillTextbox(l1.getUploadDrRegistrationCopy(), toReadDataFromExcel("Files", "Login&Usercreation", 31, 5));
		toFillTextbox(l1.getEnterPharmacyName(), toReadDataFromExcel("Files", "Login&Usercreation", 37, 5));
		toFillTextbox(l1.getEnterPharmacyContactNo(), toReadDataFromExcel("Files", "Login&Usercreation", 38, 5));
		toFillTextbox(l1.getEnterPharmacyEmail(), toReadDataFromExcel("Files", "Login&Usercreation", 39, 5));
		toFillTextbox(l1.getEnterPharmacyRegNo(), toReadDataFromExcel("Files", "Login&Usercreation", 40, 5));
		toFillTextbox(l1.getEnterPharmacyGSTno(), toReadDataFromExcel("Files", "Login&Usercreation", 41, 5));
		toFillTextbox(l1.getEnterPharmacyPanNo(), toReadDataFromExcel("Files", "Login&Usercreation", 42, 5));
		toFillTextbox(l1.getEnterPharmacyAddress(), toReadDataFromExcel("Files", "Login&Usercreation", 43, 5));
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		toThreadSleep(3000);
		String s = Configurations.readOtpFromTable(text);
		for (int i = 0, j = 1; i < s.length(); i++, j++) {
			char ch = s.charAt(i);
			String otp = Character.toString(ch);
			toFillTextbox(driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[" + j + "]")), otp);
		}
		toClickButton(l1.getClickValidateBtn());
		toThreadSleep(5000);
		WebElement output = driver.findElement(By.xpath("//h4[@class='text-white fw-500']"));
		System.out.println(output.getText());
		closeBrowser();

	}

	// <-- Caretaker -->

	@Test(enabled = false, priority = 6)
	private void usercreationCT() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Login&Usercreation", 8, 4, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l1.getClickUsersMenu());
		toThreadSleep(3000);
		toClickButton(l1.getClickCreateUser());
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 4));
		toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Login&Usercreation", 6, 4));
		toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Login&Usercreation", 7, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUserEmail(), text);
		toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 9, 4));
		toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Login&Usercreation", 10, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l1.getClickSaveBtn());
		toThreadSleep(3000);
		Configurations.readVerificationToken(text, "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 4));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 4));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), text);
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 4));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toFillTextbox(l1.getUploadDrProfilePicture(), toReadDataFromExcel("Files", "Login&Usercreation", 12, 4));
		toFillTextbox(l1.getEnterDrTitle(), toReadDataFromExcel("Files", "Login&Usercreation", 13, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdType(), toReadDataFromExcel("Files", "Login&Usercreation", 17, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrGovtIdNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 18, 4));
		toFillTextbox(l1.getEnterDrUploadProof(), toReadDataFromExcel("Files", "Login&Usercreation", 19, 4));
		toFillTextbox(l1.getEnterDrAddress1(), toReadDataFromExcel("Files", "Login&Usercreation", 20, 4));
		toFillTextbox(l1.getEnterDrAddress2(), toReadDataFromExcel("Files", "Login&Usercreation", 21, 4));
		toFillTextbox(l1.getEnterDrDOB(), "06-06-1920");
		toFillTextbox(l1.getEnterDrAlternateContect(), toReadDataFromExcel("Files", "Login&Usercreation", 15, 4));
		toFillTextbox(l1.getEnterDrCountry(), toReadDataFromExcel("Files", "Login&Usercreation", 22, 4));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterDrState(), toReadDataFromExcel("Files", "Login&Usercreation", 23, 4));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterDrCity(), toReadDataFromExcel("Files", "Login&Usercreation", 24, 4));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterDrpincode(), toReadDataFromExcel("Files", "Login&Usercreation", 25, 4));
		toFillTextbox(l1.getEnterDrTerritory(), toReadDataFromExcel("Files", "Login&Usercreation", 26, 4));
		pressEnterKey();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterCTDegree(), toReadDataFromExcel("Files", "Login&Usercreation", 16, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCTSpecialty(), toReadDataFromExcel("Files", "Login&Usercreation", 28, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterCTSpecialSkills(), toReadDataFromExcel("Files", "Login&Usercreation", 36, 4));
		pressEnterKey();
		toFillTextbox(l1.getEnterDrAboutYourself(), toReadDataFromExcel("Files", "Login&Usercreation", 27, 4));
		toFillTextbox(l1.getEnterDrRegistrationYear(), toReadDataFromExcel("Files", "Login&Usercreation", 29, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterDrRegistrationNumber(), toReadDataFromExcel("Files", "Login&Usercreation", 30, 4));
		toClickButton(l1.getClickStateRegType());
		toClickButton(l1.getClickRegBoard());
		toFillTextbox(l1.getUploadDrRegistrationCopy(), toReadDataFromExcel("Files", "Login&Usercreation", 31, 4));
		toThreadSleep(1000);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterClinicName(), toReadDataFromExcel("Files", "Login&Usercreation", 32, 3));
		toFillTextbox(l1.getEnterClinicContactNo(), toReadDataFromExcel("Files", "Login&Usercreation", 33, 3));
		toFillTextbox(l1.getEnterClinicEmail(), toReadDataFromExcel("Files", "Login&Usercreation", 34, 3));
		toFillTextbox(l1.getEnterClinicAddress(), toReadDataFromExcel("Files", "Login&Usercreation", 35, 3));
		toThreadSleep(1000);
		scrollDown(l1.getClickCTStartTime());
		toClickButton(l1.getClickMon());
		toClickButton(l1.getClickTue());
		toClickButton(l1.getClickWed());
		toClickButton(l1.getClickThu());
		toClickButton(l1.getClickCTStartTime());
		toFillTextbox(l1.getEnterHrTime(), "08");
		toFillTextbox(l1.getEnterMMTime(), "00");
		toThreadSleep(1000);
		toClickButton(l1.getClickCTEndTime());
		toFillTextbox(l1.getEnterHrTime(), "10");
		toFillTextbox(l1.getEnterMMTime(), "00");
		toClickButton(l1.getClickAMbutton());
		toClickButton(l1.getClickFri());
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		toThreadSleep(3000);
		String s = Configurations.readOtpFromTable(text);
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

// < --- Change Password ---- >

	@Test(enabled = false, priority = 7)
	private void changePassword() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l1.getClickProfileMenu());
		toThreadSleep(2000);
		toClickButton(l1.getClickChangePassword());
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterOdlPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toFillTextbox(l1.getEnterNewPassword(), "Emarson50@");
		toFillTextbox(l1.getEnterchangeConfirmPassword(), "Emarson50@");
		toClickButton(l1.getClickSaveChangePassword());
		toCreateNewCell("Files", "Login&Usercreation", 11, 3, "Emarson50@");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		closeBrowser();
	}

// < --- Forgot Password --->	

	@Test(enabled = false, priority = 8)
	private void forgotPassword() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toClickButton(l1.getClickForgotPassword());
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterEmailAddress(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toClickButton(l1.getClickSubmit());
		toThreadSleep(3000);
		Configurations.readPasswordToken(toReadDataFromExcel("Files", "Login&Usercreation", 8, 3), "ResetPassword");
		// Configurations.readtoken("PasswordToken", toReadDataFromExcel("Files",
		// "Login&Usercreation", 8, 3), "ResetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), "Welldercare@3");
		toFillTextbox(l1.getEnterConfirmPassword(), "Welldercare@3");
		toClickButton(l1.getClickCreatePassword());
		toCreateNewCell("Files", "Login&Usercreation", 11, 3, "Welldercare@3");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		closeBrowser();

	}

//	<--- Enquiry page --->

	@Test(enabled = false, priority = 9)
	private void enquirypage() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()='Click to Enquire']")).click();
		toFillTextbox(l2.getEnterVTFirstName(), toReadDataFromExcel("Files", "Enquiry", 1, 1));
		toFillTextbox(l2.getEnterVTLastName(), toReadDataFromExcel("Files", "Enquiry", 2, 1));
		toFillTextbox(l2.getEnterVTGender(), toReadDataFromExcel("Files", "Enquiry", 3, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterVTEmailAdress(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l2.getEnterVTContactNo(), toReadDataFromExcel("Files", "Enquiry", 5, 1));
		toFillTextbox(l2.getEnterVTAddress1(), toReadDataFromExcel("Files", "Enquiry", 6, 1));
		toFillTextbox(l2.getEnterVTAddress2(), toReadDataFromExcel("Files", "Enquiry", 7, 1));
		toFillTextbox(l2.getEnterVTCountry(), toReadDataFromExcel("Files", "Enquiry", 8, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterVTState(), toReadDataFromExcel("Files", "Enquiry", 9, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterVTCity(), toReadDataFromExcel("Files", "Enquiry", 10, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterVTPincode(), toReadDataFromExcel("Files", "Enquiry", 11, 1));
		toFillTextbox(l2.getEnterVTTerritory(), toReadDataFromExcel("Files", "Enquiry", 12, 1));
		pressEnterKey();
		toThreadSleep(1000);
		scrollDown(l2.getEnterCGFirstName());
		toFillTextbox(l2.getEnterCGFirstName(), toReadDataFromExcel("Files", "Enquiry", 13, 1));
		toFillTextbox(l2.getEnterCGLastName(), toReadDataFromExcel("Files", "Enquiry", 14, 1));
		toFillTextbox(l2.getEnterCGGender(), toReadDataFromExcel("Files", "Enquiry", 15, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterCGEmailAdress(), toReadDataFromExcel("Files", "Enquiry", 16, 1));
		toFillTextbox(l2.getEnterCGAddress(), toReadDataFromExcel("Files", "Enquiry", 17, 1));
		toFillTextbox(l2.getEnterCGContactNo(), toReadDataFromExcel("Files", "Enquiry", 18, 1));
		toFillTextbox(l2.getEnterCGRelationship(), toReadDataFromExcel("Files", "Enquiry", 19, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterNotes(), toReadDataFromExcel("Files", "Enquiry", 20, 1));
		scrollDown(l2.getEnterNotes());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l2.getClickEnquiriesMenu());
		toThreadSleep(3000);
		toClickButton(l2.getClickNewEnquiry());
		toThreadSleep(1000);
		toClickButton(l2.getClickNewAssignPartner());
		toThreadSleep(1000);
		toSelectIndex(l2.getSelectChannelPartner(), 1);
		toThreadSleep(1000);
		toClickButton(l2.getClickAssignChannelPartner());
		toThreadSleep(4000);
		closeBrowser();

	}

// <--- Veteran Onboarding --->	

	@Test(enabled = false, priority = 10)
	private void veteranOnboarding() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		UserCreationPojo l1 = new UserCreationPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l2.getClickEnquiriesMenu());
		toThreadSleep(3000);
		toClickButton(l2.getClickNewEnquiry());
		toThreadSleep(1000);
		toClickButton(l2.getClickOnboardBtn());
		toThreadSleep(2000);
		toFillTextbox(l2.getUploadVTProfilePicture(), toReadDataFromExcel("Files", "Enquiry", 22, 1));
		toFillTextbox(l2.getEnterVTTitle(), toReadDataFromExcel("Files", "Enquiry", 23, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterVTDOB(), "02/05/1980");
		toFillTextbox(l2.getEnterVTAlternateNumber(), toReadDataFromExcel("Files", "Enquiry", 25, 1));
		toFillTextbox(l2.getEnterVTGovtIdType(), toReadDataFromExcel("Files", "Enquiry", 26, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterVTGovtIdNumber(), toReadDataFromExcel("Files", "Enquiry", 27, 1));
		// toFillTextbox(l2.getUploadVTIdProof(), toReadDataFromExcel("Files",
		// "Enquiry", 28, 1));
		scrollDown(l2.getEnterVTDOB());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//div[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterHight(), toReadDataFromExcel("Files", "Enquiry", 29, 1));
		toFillTextbox(l2.getEnterWeight(), toReadDataFromExcel("Files", "Enquiry", 30, 1));
		toFillTextbox(l2.getSelectBloodGroup(), toReadDataFromExcel("Files", "Enquiry", 31, 1));
		pressEnterKey();
		toThreadSleep(1000);
		driver.findElement(By.xpath("(//label[text()='Moderate'])[1]")).click();
		toFillTextbox(l2.getEnterSmokeDuration(), "2013");
		toFillTextbox(l2.getEnterSmokingPerDay(), "2");
		driver.findElement(By.xpath("(//label[text()='Moderate'])[2]")).click();
		toFillTextbox(l2.getEnterDrinkingDuration(), "2016");
		toFillTextbox(l2.getEnterDrinkingPerWeek(), "4");
		scrollDown(l2.getEnterDrinkingPerWeek());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//div[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterCelsius(), toReadDataFromExcel("Files", "Enquiry", 32, 1));
		toFillTextbox(l2.getEnterBloodGlucose(), toReadDataFromExcel("Files", "Enquiry", 33, 1));
		toFillTextbox(l2.getEnterMealTime(), toReadDataFromExcel("Files", "Enquiry", 34, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterSystolic(), toReadDataFromExcel("Files", "Enquiry", 35, 1));
		toFillTextbox(l2.getEnterDiastolic(), toReadDataFromExcel("Files", "Enquiry", 36, 1));
		toFillTextbox(l2.getEnterOxygenLevel(), toReadDataFromExcel("Files", "Enquiry", 37, 1));
		toFillTextbox(l2.getEnterHeartRate(), toReadDataFromExcel("Files", "Enquiry", 38, 1));
		toFillTextbox(l2.getEnterRespiratoryRate(), toReadDataFromExcel("Files", "Enquiry", 39, 1));
		scrollDown(l2.getEnterRespiratoryRate());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//div[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toClickButton(l2.getClickAddComorbidities());
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterComorbidities(), toReadDataFromExcel("Files", "Enquiry", 40, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterFromYear(), toReadDataFromExcel("Files", "Enquiry", 41, 1));
		toFillTextbox(l2.getEnterToYear(), toReadDataFromExcel("Files", "Enquiry", 42, 1));
		toFillTextbox(l2.getEnterComorbiditiesHistory(), toReadDataFromExcel("Files", "Enquiry", 43, 1));
		toClickButton(l2.getSaveComorbidities());
		toThreadSleep(1000);
		toClickButton(l2.getClickAllergiesNo());
		toClickButton(l2.getClickFallsNo());
		toClickButton(l2.getClickHospitalizationYes());
		toFillTextbox(l2.getEnterWhenHospitalization(), toReadDataFromExcel("Files", "Enquiry", 44, 1));
		toFillTextbox(l2.getEnterWhereHospitalization(), toReadDataFromExcel("Files", "Enquiry", 45, 1));
		toFillTextbox(l2.getUploadHospitalizationPDF(), toReadDataFromExcel("Files", "Enquiry", 46, 1));
		toFillTextbox(l2.getEnterHospitalizationHistory(), toReadDataFromExcel("Files", "Enquiry", 47, 1));
		scrollDown(l2.getClickHeartdiseaseYes());
		toThreadSleep(1000);
		toClickButton(l2.getClickHeartdiseaseYes());
		toFillTextbox(l2.getEnterWhenHeartdisease(), toReadDataFromExcel("Files", "Enquiry", 48, 1));
		toFillTextbox(l2.getEnterWhereHeartdisease(), toReadDataFromExcel("Files", "Enquiry", 49, 1));
		toFillTextbox(l2.getEnterHeartdiseaseHistory(), toReadDataFromExcel("Files", "Enquiry", 50, 1));
		toClickButton(l2.getClickkidneydiseaseYes());
		toFillTextbox(l2.getEnterWhenkidneydisease(), toReadDataFromExcel("Files", "Enquiry", 51, 1));
		toFillTextbox(l2.getEnterWherekidneydisease(), toReadDataFromExcel("Files", "Enquiry", 52, 1));
		toFillTextbox(l2.getEnterkidneydiseaseHistory(), toReadDataFromExcel("Files", "Enquiry", 53, 1));
		scrollDown(l2.getClickCancerHistoryNo());
		toThreadSleep(1000);
		toClickButton(l2.getClickCancerHistoryNo());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//div[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toClickButton(l2.getClickAddPrescription());
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterPrescribedDoctorName(), toReadDataFromExcel("Files", "Enquiry", 57, 1));
		toFillTextbox(l2.getEnterMedicineName(), toReadDataFromExcel("Files", "Enquiry", 58, 1));
		toFillTextbox(l2.getEnterDosage(), toReadDataFromExcel("Files", "Enquiry", 59, 1));
		toFillTextbox(l2.getSelectGram(), "Gram");
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l2.getClickMorning());
		toClickButton(l2.getClickAfternoon());
		toClickButton(l2.getClickEvening());
		toClickButton(l2.getClickNight());
		toFillTextbox(l2.getEnterFromYearMedicine(), "02/2018");
		toClickButton(l2.getClickBeforeFood());
		toClickButton(l2.getClickSaveMedicines());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//div[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toClickButton(l2.getClickAddHealthInsurance());
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterInsuranceName(), toReadDataFromExcel("Files", "Enquiry", 61, 1));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterPolicyNumber(), toReadDataFromExcel("Files", "Enquiry", 62, 1));
		toFillTextbox(l2.getEnterSumAssured(), toReadDataFromExcel("Files", "Enquiry", 63, 1));
		toFillTextbox(l2.getEnterInsuranceEmail(), toReadDataFromExcel("Files", "Enquiry", 64, 1));
		toFillTextbox(l2.getEnterInsuranceCopy(), toReadDataFromExcel("Files", "Enquiry", 65, 1));
		toFillTextbox(l2.getEnterInsuranceExpiryDate(), "01-01-2040");
		toFillTextbox(l2.getEnterInsurancePhoneNo(), toReadDataFromExcel("Files", "Enquiry", 67, 1));
		toFillTextbox(l2.getEnterInsuranceAddress(), toReadDataFromExcel("Files", "Enquiry", 68, 1));
		toClickButton(l2.getClickSaveInsurance());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//div[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		toClickButton(l2.getClickAddFamilymember());
		toThreadSleep(1000);
		toFillTextbox(l2.getUploadCGProfilePicture(), toReadDataFromExcel("Files", "Enquiry", 22, 3));
		toFillTextbox(l2.getEnterCGTitle(), toReadDataFromExcel("Files", "Enquiry", 23, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterCGGovtIdType(), toReadDataFromExcel("Files", "Enquiry", 24, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterCGGovtIdnumber(), toReadDataFromExcel("Files", "Enquiry", 25, 3));
		toFillTextbox(l2.getUploadCGProofId(), toReadDataFromExcel("Files", "Enquiry", 26, 3));
		toFillTextbox(l2.getEnterCGDOB(), "02/04/1998");
		toFillTextbox(l2.getEnterPoliceStationNo(), toReadDataFromExcel("Files", "Enquiry", 28, 3));
		toFillTextbox(l2.getEnterStationPincode(), toReadDataFromExcel("Files", "Enquiry", 29, 3));
		toFillTextbox(l2.getEnterCGAlternateContactNo(), toReadDataFromExcel("Files", "Enquiry", 30, 3));
		toClickButton(l2.getClickSaveFamilyMember());
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//div[text()=' Save & Next ']")).click();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
		toThreadSleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		toThreadSleep(4000);
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']")).click();
		toThreadSleep(2000);
		driver.findElement(By.xpath("//a[text()=' Sign out']")).click();
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 2));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l2.getClickEnquiriesMenu());
		toThreadSleep(2000);
		toClickButton(l2.getClickNewEnquiry());
		toThreadSleep(1000);
		toClickButton(l2.getClickAssignDoctorBtn1());
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterDoctorName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 3));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l2.getClickAssignDoctorBtn2());
		toThreadSleep(4000);
		closeBrowser();
	}

// < --- Doctor Approval --->	

	@Test(enabled = false, priority = 11)
	private void doctorApproval() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		UserCreationPojo l1 = new UserCreationPojo();
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

//   < --  Veteran active  -->	

	@Test(enabled = false, priority = 12)
	private void veteranActive() throws InterruptedException, IOException {
		openChrome();
		maxWindow();
		UserCreationPojo l1 = new UserCreationPojo();
		Configurations.readVerificationToken(toReadDataFromExcel("Files", "Enquiry", 4, 1), "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		String s = Configurations.readOtpFromTable(toReadDataFromExcel("Files", "Enquiry", 4, 1));
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

//   <---- Family member active -->

	@Test(enabled = false, priority = 13)
	private void familymemberActive() throws InterruptedException, IOException {
		openChrome();
		maxWindow();
		UserCreationPojo l1 = new UserCreationPojo();
		Configurations.readVerificationToken(toReadDataFromExcel("Files", "Enquiry", 16, 1), "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toFillTextbox(l1.getEnterConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 16, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 2));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		String s = Configurations.readOtpFromTable(toReadDataFromExcel("Files", "Enquiry", 16, 1));
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

//  <--- Assign Caretaker -->

	@Test(enabled = false, priority = 14)
	private void caretakerAssign() throws Throwable {
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
		toClickButton(l2.getClickAssignCaretakerBtn());
		toThreadSleep(1000);
		toFillTextbox(l2.getEnterAssignCaretakerName(), toReadDataFromExcel("Files", "Login&Usercreation", 5, 4));
		pressEnterKey();
		toThreadSleep(1000);
		toClickButton(l2.getClickAssignCaretaker());
		toThreadSleep(3000);
		closeBrowser();
	}

//  < Assign Doctor -->	

	@Test(enabled = false, priority = 15)
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
		toThreadSleep(3000);
		closeBrowser();
	}

	// Live request complete

	@Test(enabled = false, priority = 16)
	private void liveRequest() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		VeteranOnboardingPojo l2 = new VeteranOnboardingPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 4));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickEmergencyBtn());
		toThreadSleep(2000);
		toClickButton(l3.getClickOKbtn());
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
		scrollDown(l3.getClickAttendBtn());
		toThreadSleep(1000);
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
		toFillTextbox(l3.getEnterMedicineName(), "Acemax&nbsp;10&nbsp;mg");
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
		toClickButton(l3.getClickOKbtn());
		toThreadSleep(4000);
		closeBrowser();

	}

	// Live request cancelled

	@Test(enabled = false, priority = 17)
	private void liveRequestCancelled() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 4));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickEmergencyBtn());
		toThreadSleep(2000);
		toClickButton(l3.getClickOKbtn());
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
		scrollDown(l3.getClickAttendBtn());
		toThreadSleep(1000);
		toClickButton(l3.getClickFalseAlarmBtn());
		toThreadSleep(3000);
		closeBrowser();

	}

// < --- Upcoming Appointments complete-- >	

	@Test(enabled = false, priority = 18)
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
		toFillTextbox(l3.getEnterVeteranName(), toReadDataFromExcel("Files", "Enquiry", 2, 3));
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
		toFillTextbox(l3.getEnterMedicineName(), "Acemax&nbsp;10&nbsp;mg");
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
		toClickButton(l3.getClickOKbtn());
		toThreadSleep(4000);
		closeBrowser();

	}

	// Appointment request by Caregiver

	@Test(enabled = false, priority = 19)
	private void requestAppointmentByCaregiver() throws InterruptedException, IOException, AWTException {

		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 16, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestAppointmentBtn());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterRequestDoctorName(), toReadDataFromExcel("Files", "Enquiry", 1, 3));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l3.getEnterRequestAppointmentType(), "OPD");
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l3.getEnterRequestAppointmentMode(), "Online");
		toThreadSleep(1000);
		pressEnterKey();
		String s = readDay();
		String mm = readMonth();
		String yyyy = readYear();
		int n = Integer.parseInt(s);
		if (n == 30 || n == 31 || n == 29 || n == 28) {
			n = n - 26;
			int m = Integer.parseInt(mm);
			if (m == 12) {
				mm = (m - 11) + "";
				int y = Integer.parseInt(yyyy);
				yyyy = (y + 1) + "";
			} else {
				mm = (m + 1) + "";
			}
		} else {
			n = n + 1;
		}
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
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(3000);
		closeBrowser();
	}

	// Appointment request by Veteran

	@Test(enabled = false, priority = 20)
	private void requestAppointmentByVeteran() throws Throwable {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestAppointmentBtn());
		toThreadSleep(1000);
		toFillTextbox(l3.getEnterRequestDoctorName(), toReadDataFromExcel("Files", "Enquiry", 1, 3));
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l3.getEnterRequestAppointmentType(), "OPD");
		toThreadSleep(1000);
		pressEnterKey();
		toFillTextbox(l3.getEnterRequestAppointmentMode(), "Online");
		toThreadSleep(1000);
		pressEnterKey();
		String s = readDay();
		String mm = readMonth();
		String yyyy = readYear();
		int n = Integer.parseInt(s);
		if (n == 30 || n == 31 || n == 29 || n == 28) {
			n = n - 27;
			int m = Integer.parseInt(mm);
			if (m == 12) {
				mm = (m - 11) + "";
				int y = Integer.parseInt(yyyy);
				yyyy = (y + 1) + "";
			} else {
				mm = (m + 1) + "";
			}
		} else {
			n = n + 2;
		}
		String dd = n + "";
		toFillTextbox(l3.getEnterRequestAppointmentDate(), dd + "-" + mm + "-" + yyyy);
		toThreadSleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='00:00']")).click();
		toFillTextbox(l3.getEnterhour(), "10");
		toFillTextbox(l3.getEnterMin(), "00");
		toFillTextbox(l3.getEnterRequestAppointmentDuration(), "1 Hour");
		toThreadSleep(1000);
		pressEnterKey();
		toClickButton(l3.getClickSubmitRequestAppointment());
		toThreadSleep(3000);
		toClickButton(l3.getClickUpcomingAppointment());
		closeBrowser();
	}

	// <--- Request Appointment Accept by Doctor--->

	@Test(enabled = false)
	private void requestAppointmentAccept() throws InterruptedException, IOException, AWTException {

		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		Actions a = new Actions(driver);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
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
		toThreadSleep(3000);
		closeBrowser();
	}

	// <---- Upcoming Appointment Cancelled by Doctor ---->

	@Test(enabled = false, priority = 22)
	private void upcomingAppointmentCancelByDoctor() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		toClickButton(l3.getClickCancelAppointment());
		toThreadSleep(2000);
		toFillTextbox(l3.getEnterCancelApptReason(), "Not Available");
		toClickButton(l3.getClickCancel());
		toThreadSleep(2000);
		toClickButton(l3.getClickOKbtn());
		toThreadSleep(3000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		closeBrowser();
	}

	// <---- Request Appointment cancel by Doctor --->

	@Test(enabled = false, priority = 23)
	private void requestAppointmentCancelByDoctor() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 3));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestFilterBtn());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		scrollDown(l3.getClickRejectRequestAppt());
		toThreadSleep(1000);
		toClickButton(l3.getClickRejectRequestAppt());
		toThreadSleep(2000);
		toFillTextbox(l3.getEnterCancelApptReason(), "Not Available");
		toClickButton(l3.getClickCancel());
		toThreadSleep(2000);
		toClickButton(l3.getClickOKbtn());
		toThreadSleep(3000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		closeBrowser();
	}

	// <---- Request Appointment cancel by Veteran --->

	@Test(enabled = false, priority = 24)
	private void requestAppointmentCancelByVeteran() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 4, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestFilterBtn());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		toClickButton(l3.getClickCancelAppointment());
		toThreadSleep(2000);
		toFillTextbox(l3.getEnterCancelApptReason(), "Not Available");
		toClickButton(l3.getClickCancel());
		toThreadSleep(2000);
		toClickButton(l3.getClickOKbtn());
		toThreadSleep(3000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		closeBrowser();
	}

	// <---- Request Appointment cancel by Caregiver --->

	@Test(enabled = false)
	private void requestAppointmentCancelByCaregiver() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		AppointmentsPojo l3 = new AppointmentsPojo();
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Enquiry", 16, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(3000);
		toClickButton(l3.getClickAppointments());
		toThreadSleep(2000);
		toClickButton(l3.getClickRequestFilterBtn());
		toThreadSleep(2000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		toClickButton(l3.getClickCancelAppointment());
		toThreadSleep(2000);
		toFillTextbox(l3.getEnterCancelApptReason(), "Not Available");
		toClickButton(l3.getClickCancel());
		toThreadSleep(2000);
		toClickButton(l3.getClickOKbtn());
		toThreadSleep(3000);
		toClickButton(l3.getClickUpcomingAppointment());
		toThreadSleep(2000);
		closeBrowser();
	}

// <-----  	Care manager Update Profile  ---->	

	@Test(enabled = false)
	private void caremanagerProfileUpdate() throws Exception {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		ProfileUpdatePojo l4 = new ProfileUpdatePojo();
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
		toSelectAndFill(l4.getEnterDoB(), "01-02-1990");
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

	// <---- Channel Partner Profile Update ---->

	@Test(enabled = false)
	private void channelPartnerProfileUpdate() throws Exception {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		ProfileUpdatePojo l4 = new ProfileUpdatePojo();
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
		toSelectAndFill(l4.getEnterDoB(), "01-02-1990");
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
	
	

// <---- Doctor Profile Update ---->		

	@Test(enabled = false)
	private void DoctorProfileUpdate() throws IOException, InterruptedException, AWTException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		ProfileUpdatePojo l4 = new ProfileUpdatePojo();
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
		toSelectAndFill(l4.getEnterDoB(), "01-02-1990");
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
	
	
// <------ Caretaker profile update ----->	
	
	
	@Test(enabled=false)
    private void caretakerProfileUpdate() throws Exception{
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		toThreadSleep(2000);
		UserCreationPojo l1 = new UserCreationPojo();
		ProfileUpdatePojo l4 =new ProfileUpdatePojo();
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

}
