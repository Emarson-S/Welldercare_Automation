package org.runner;

import org.base.AppointmentsPojo;
import org.base.BaseClass;
import org.base.Configurations;
import org.base.UserCreationPojo;
import org.base.VeteranOnboardingPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateAppointment extends BaseClass {
	
	
	@Test(enabled = false, priority = 1, description = "Create Appointments_TS_01")
	private void createAppointmentNavigation() throws Throwable {
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
		try {
			toClickButton(l3.getClickCalendar());
			toThreadSleep(2000);
			toClickButton(l3.getClickcreateAppointmenBtn());
			toThreadSleep(2000);
			System.out.println(l3.getCreateAppointmentTitle().getText());
			toCreateNewCell("Files", "TestResults", 1, 9, "Pass");
//			toFillTextbox(l3.getEnterVeteranName(), toReadDataFromExcel("Files", "Enquiry", 2, 3));
//			toThreadSleep(1000);
//			pressEnterKey();
//			toFillTextbox(l3.getEnterAppointmentType(), "OPD");
//			toThreadSleep(1000);
//			pressEnterKey();
//			toFillTextbox(l3.getEnterAppointmentMode(), "Online");
//			toThreadSleep(1000);
//			pressEnterKey();
//			String date = readDate();
//			toFillTextbox(l3.getEnterAppointmentDate(), date);
//			toClickButton(l3.getClickTimePicker());
//			String hr = readHour();
//			String mm = readMin();
//			int m = Integer.parseInt(mm);
//			String aa = readAm();
//			toThreadSleep(1000);
//			WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-default text-center']"));
//			String out = text.getText();
//			if (aa == out) {
//				toFillTextbox(l3.getEnterhour(), hr);
//				toFillTextbox(l3.getEnterMin(), (m + 5) + "");
//				toFillTextbox(l3.getEnterAppointmentDuration(), "1 Hour");
//				toThreadSleep(1000);
//				pressEnterKey();
//			} else if (aa != out) {
//				toFillTextbox(l3.getEnterhour(), hr);
//				toFillTextbox(l3.getEnterMin(), (m + 5) + "");
//				toThreadSleep(1000);
//				WebElement bb = driver.findElement(By.xpath("//button[text()='AM ']"));
//				a.moveToElement(bb).click();
//				toClickButton(l3.getClickTimePicker());
//				toThreadSleep(1000);
//				toFillTextbox(l3.getEnterAppointmentDuration(), "1 Hour");
//				toThreadSleep(1000);
//				pressEnterKey();
//			}
//			toClickButton(l3.getClickBookAppointment());
//			toThreadSleep(3000);
	
		}
		catch (Exception e) {
			takePicture("Create Appointments_TS_01");
			toCreateNewCell("Files", "TestResults", 1, 9, "Fail");
		}
			closeBrowser();			
	}
	
	@Test(enabled = true, priority = 1, description = "Create Appointments_TS_01")
	private void CheckVateranNameField() throws Throwable {
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
		try {
			toClickButton(l3.getClickCalendar());
			toThreadSleep(2000);
			toClickButton(l3.getClickcreateAppointmenBtn());
			toThreadSleep(2000);
			toFillTextbox(l3.getEnterVeteranName(), toReadDataFromExcel("Files", "Enquiry", 2, 3));
			toThreadSleep(1000);
			pressEnterKey();
			boolean test1= l3.getClickBookAppointment().isEnabled();
			toFillTextbox(l3.getEnterAppointmentType(), "OPD");
			toThreadSleep(1000);
			pressEnterKey();
			boolean test2= l3.getClickBookAppointment().isEnabled();
			toFillTextbox(l3.getEnterAppointmentMode(), "Online");
			toThreadSleep(1000);
			pressEnterKey();
			boolean test3= l3.getClickBookAppointment().isEnabled();
			String date = readDate();
			toFillTextbox(l3.getEnterAppointmentDate(), date);
			boolean test4= l3.getClickBookAppointment().isEnabled();
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
				toThreadSleep(1000);
				pressEnterKey();
			} else if (aa != out) {
				toFillTextbox(l3.getEnterhour(), hr);
				toFillTextbox(l3.getEnterMin(), (m + 5) + "");
				toThreadSleep(1000);
				WebElement bb = driver.findElement(By.xpath("//button[text()='AM ']"));
				a.moveToElement(bb).click();
				toClickButton(l3.getClickTimePicker());
				toThreadSleep(1000);			
			}
			boolean test5= l3.getClickBookAppointment().isEnabled();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
