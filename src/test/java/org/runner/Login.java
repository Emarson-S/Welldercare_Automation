package org.runner;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.base.Configurations;
import org.base.UserCreationPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	
	
	@Test(enabled=true,priority=1,description ="Login_TS_01")
	private void loginSuccess() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 1, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 1, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(3000);
			System.out.println(l1.getPageTitle().getText());
			toCreateNewCell("Files", "TestResults", 1, 1, "Pass");
		}
		catch (Exception e) {
			takePicture("Login_TS_01");
			toCreateNewCell("Files", "TestResults", 1, 1, "Fail");
		}
			closeBrowser();			
	}
	
	
	@Test(enabled=true,priority=2, description ="Login_TS_02")
	private void loginValidations() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 2, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 2, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 3, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 3, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 4, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 4, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), "");
			toFillTextbox(l1.getEnterPassword(), "");
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadValidationMessage().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), "");
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 6, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadValidationMessage().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), "");
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 7, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadValidationMessage().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 8, 1));
			toFillTextbox(l1.getEnterPassword(), "");
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadValidationMessage().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 9, 1));
			toFillTextbox(l1.getEnterPassword(), "");
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadValidationMessage().getText());
			toCreateNewCell("Files", "TestResults", 2, 1, "Pass");
		}
		catch (Exception e) {
			takePicture("Login_TS_02");
			toCreateNewCell("Files", "TestResults", 2, 1, "Fail");
			
		}
			closeBrowser();			
	}
	
	@Test(enabled=true,priority=3,description ="Login_TS_03")
	private void mailValidation() throws IOException, InterruptedException {
		
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 10, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 10, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 11, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 11, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 12, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 12, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 13, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 13, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toCreateNewCell("Files", "TestResults", 3, 1, "Pass");
		}
		catch (Exception e) {
			takePicture("Login_TS_03");
			toCreateNewCell("Files", "TestResults", 3, 1, "Fail");
			
		}
			closeBrowser();	
	}
	
	
	@Test(enabled=true,priority=4, description ="Login_TS_04")
	private void userInactive() throws IOException, InterruptedException {
		
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 1, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 1, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(3000);
			toClickButton(l1.getClickUsersMenu());
			toThreadSleep(3000);
			toClickButton(l1.getClickEditBtn());
			toThreadSleep(2000);
			toSelectIndex(l1.getSelectUserStatus(), 1);
			toThreadSleep(1000);
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(2000);
			WebElement table=driver.findElement(By.xpath("//table[@class='table mt-3 with-border']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			WebElement row=rows.get(1);
			List<WebElement> data= row.findElements(By.tagName("td"));
			String email=data.get(3).getText();
			toCreateNewCell("Files", "Validations", 15, 1, email);
			toCreateNewCell("Files", "TestResults", 4, 1, "Pass");
		}
		catch (Exception e) {
			takePicture("Login_TS_04");
			toCreateNewCell("Files", "TestResults", 4, 1, "Fail");
			
		}
			closeBrowser();
			
	}
	
	@Test(enabled=true,priority=5, description ="Login_TS_05")
	private void inactiveUserLogin() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 15, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 15, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toCreateNewCell("Files", "TestResults", 5, 1, "Pass");
		}
		catch (Exception e) {
			takePicture("Login_TS_05");
			toCreateNewCell("Files", "TestResults", 5, 1, "Fail");
			
		}
			closeBrowser();
	}
	
	
	@Test(enabled=true,priority=6,description ="Login_TS_06")
	private void forgotPassword() throws InterruptedException, IOException {			
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toClickButton(l1.getClickForgotPassword());
		toThreadSleep(2000);
			toFillTextbox(l1.getEnterEmailAddress(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 3));
			toClickButton(l1.getClickSubmit());
			toThreadSleep(3000);
			System.out.println(driver.findElement(By.tagName("h5")).getText());
			toCreateNewCell("Files", "TestResults", 6, 1, "Pass");
		}
		catch (Exception e) {
			takePicture("Login_TS_06");
			toCreateNewCell("Files", "TestResults", 6, 1, "Fail");
		}
			closeBrowser();
	}
	
	
	@Test(enabled=true, priority=7,description ="Login_TS_07")
	private void forgotPasswordValidations() throws InterruptedException, IOException {			
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		toClickButton(l1.getClickForgotPassword());
		toThreadSleep(2000);
			toFillTextbox(l1.getEnterEmailAddress(), toReadDataFromExcel("Files", "Validations", 17, 1));
			toClickButton(l1.getClickSubmit());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toRefresh();
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterEmailAddress(), "");
			toClickButton(l1.getClickSubmit());
			toThreadSleep(2000);
			System.out.println(l1.getReadValidationMessage().getText());
			toCreateNewCell("Files", "TestResults", 7, 1, "Pass");
		}
		catch (Exception e) {
			takePicture("Login_TS_07");
			toCreateNewCell("Files", "TestResults", 7, 1, "Fail");		
		}
			closeBrowser();
	}
	
	
	

}
