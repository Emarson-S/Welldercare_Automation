package org.runner;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.base.Configurations;
import org.base.UserCreationPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserCreation extends BaseClass {
	
	@Test(enabled=false,priority=1,description ="UserCreation_TS_01")
	private void validUserCreation() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Validations", 1, 7, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		try {
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(3000);
			toClickButton(l1.getClickUsersMenu());
			toThreadSleep(3000);
			toClickButton(l1.getClickCreateUser());
			toThreadSleep(1000);
			toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Validations", 1, 4));
			toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Validations", 1, 5));
			toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Validations", 1, 6));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 1, 7));
			toFillTextbox(l1.getSelectCountryCode(), toReadDataFromExcel("Files", "Validations", 1, 8));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Validations", 1, 9));
			toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Validations", 1, 10));
			toThreadSleep(1000);
			pressEnterKey();
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(3000);
			WebElement table=driver.findElement(By.xpath("//table[@class='table mt-3 with-border']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			WebElement row=rows.get(1);
			List<WebElement> data= row.findElements(By.tagName("td"));
			String email=data.get(3).getText();
			String Status=data.get(7).getText();
			if(email.equals(text) && Status.equals("Inactive")) {
			toCreateNewCell("Files", "TestResults", 1, 3, "Pass");
			}else {
				toCreateNewCell("Files", "TestResults", 1, 3, "Fail");
			}
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_01");
			toCreateNewCell("Files", "TestResults", 1, 3, "Fail");
		}
			closeBrowser();		
	}
	
	@Test(enabled=false,priority=2,description ="UserCreation_TS_02")
	private void userFirstNameValidations() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Validations", 2, 7, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		try {
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 1, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 1, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(3000);
			toClickButton(l1.getClickUsersMenu());
			toThreadSleep(3000);
			toThreadSleep(3000);
			toClickButton(l1.getClickCreateUser());
			toThreadSleep(1000);
			toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Validations", 2, 5));
			toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Validations", 2, 6));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterUserEmail(), text);
			toFillTextbox(l1.getSelectCountryCode(), toReadDataFromExcel("Files", "Validations", 2, 8));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Validations", 2, 9));
			toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Validations", 2, 10));
			toThreadSleep(1000);
			pressEnterKey();
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(3000);
			System.out.println(l1.getReadUserCreaErrorMessage().getText());
			toFillTextbox(l1.getEnterFirstName(), "  ");
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(3000);
			toFillTextbox(l1.getEnterFirstName(), "EmarsonEmarson #4587&^EmarsonEmarson");
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(3000);
			WebElement table=driver.findElement(By.xpath("//table[@class='table mt-3 with-border']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			WebElement row=rows.get(1);
			List<WebElement> data= row.findElements(By.tagName("td"));
			String Fname=data.get(1).getText();
			if(Fname.equalsIgnoreCase("EmarsonEmarson #4587&^EmarsonEmarson")) {
				toCreateNewCell("Files", "TestResults", 2, 3, "Fail");
			}else {
				toCreateNewCell("Files", "TestResults", 2, 3, "Pass");
			}
			
		}
	catch (Exception e) {
		takePicture("UserCreation_TS_02");
		toCreateNewCell("Files", "TestResults", 2, 3, "Fail");
	}
		closeBrowser();	

		
	}
	
	@Test(enabled=false,priority=3,description ="UserCreation_TS_03")
	private void userLastNameValidations() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("DummyEmail");
		WebElement mailBox = driver.findElement(By.id("email"));
		String text = mailBox.getText();
		toCreateNewCell("Files", "Validations", 3, 7, text);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		switchToWindow(1);
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(2000);
		try {
			toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Validations", 1, 1));
			toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Validations", 1, 2));
			toClickButton(l1.getClickSignIn());
			toThreadSleep(3000);
			toClickButton(l1.getClickUsersMenu());
			toThreadSleep(3000);
			toThreadSleep(3000);
			toClickButton(l1.getClickCreateUser());
			toThreadSleep(1000);
			toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Validations", 3, 4));
			toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Validations", 3, 6));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterUserEmail(), text);
			toFillTextbox(l1.getSelectCountryCode(), toReadDataFromExcel("Files", "Validations", 3, 8));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Validations", 3, 9));
			toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Validations", 3, 10));
			toThreadSleep(1000);
			pressEnterKey();
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(3000);
			System.out.println(l1.getReadUserCreaErrorMessage().getText());
			toFillTextbox(l1.getEnterLastName(), "  ");
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(3000);
			System.out.println(l1.getReadUserCreaErrorMessage().getText());
			toFillTextbox(l1.getEnterLastName(), "Emarson768237#$$%^&*Emar so n");
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(3000);
			WebElement table=driver.findElement(By.xpath("//table[@class='table mt-3 with-border']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			WebElement row=rows.get(1);
			List<WebElement> data= row.findElements(By.tagName("td"));
			String Lname=data.get(2).getText();
			if(Lname.equalsIgnoreCase("Emarson768237#$$%^&*Emar so n")) {
				toCreateNewCell("Files", "TestResults", 3, 3, "Fail");
			}else {
				toCreateNewCell("Files", "TestResults", 3, 3, "Pass");
			}
		}
	catch (Exception e) {
		takePicture("UserCreation_TS_03");
		toCreateNewCell("Files", "TestResults", 3, 3, "Fail");
	}
		closeBrowser();	

		
	}
	
	@Test(enabled=false,priority=4,description ="UserCreation_TS_04")
	private void userEmailValidations() throws IOException {
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
			toThreadSleep(3000);
			toClickButton(l1.getClickCreateUser());
			toThreadSleep(1000);
			toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Validations", 4, 4));
			toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Validations", 4, 4));
			toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Validations", 4, 6));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getSelectCountryCode(), toReadDataFromExcel("Files", "Validations", 4, 8));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Validations", 4, 9));
			toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Validations", 4, 10));
			toThreadSleep(1000);
			pressEnterKey();
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(3000);
			System.out.println(l1.getReadUserCreaErrorMessage().getText());
			toFillTextbox(l1.getEnterUserEmail(), "  ");
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(2000);
			System.out.println(l1.getReadUserCreaErrorMessage().getText());
			toFillTextbox(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 10, 1));
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(2000);
			System.out.println(l1.getReadEmailErrorMessage().getText());
			toSelectAndFill(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 11, 1));
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(2000);
			System.out.println(l1.getReadEmailErrorMessage().getText());
			toSelectAndFill(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 12, 1));
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(2000);
			System.out.println(l1.getReadEmailErrorMessage().getText());
			toSelectAndFill(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 13, 1));
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(2000);
			System.out.println(l1.getReadEmailErrorMessage().getText());
			toSelectAndFill(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 1, 7));
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(2000);
			System.out.println(l1.getReadNotify().getText());
			toCreateNewCell("Files", "TestResults", 4, 3, "Pass");
		}
	catch (Exception e) {
		takePicture("UserCreation_TS_04");
		toCreateNewCell("Files", "TestResults", 4, 3, "Fail");
	}
		closeBrowser();	

		
	}
	
	
	@Test(enabled=false,priority=5,description ="UserCreation_TS_05")
	private void userPhoneNumValidations() throws IOException {
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
			toThreadSleep(3000);
			toClickButton(l1.getClickCreateUser());
			toThreadSleep(1000);
			toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Validations", 5, 4));
			toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Validations", 5, 4));
			toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Validations", 5, 6));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 5, 7));
			toFillTextbox(l1.getSelectCountryCode(), toReadDataFromExcel("Files", "Validations", 5, 8));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Validations", 4, 10));
			toThreadSleep(1000);
			pressEnterKey();
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(3000);
			System.out.println(l1.getReadUserCreaErrorMessage().getText());
			toSelectAndFill(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Validations", 5, 9));
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(2000);
			toSelectAndFill(l1.getEnterPhoneNumber(), "  ");
			toClickButton(l1.getClickSaveBtn());	
			toThreadSleep(2000);
			System.out.println(l1.getReadNumberErrorMessage().getText());
			toCreateNewCell("Files", "TestResults", 5, 3, "Pass");
		}
	catch (Exception e) {
		takePicture("UserCreation_TS_05");
		toCreateNewCell("Files", "TestResults", 5, 3, "Fail");
	}
		closeBrowser();		
	}
	
	
	
	@Test(enabled=false,priority=6,description ="UserCreation_TS_06")
	private void userFormCloseBtnValidation() throws IOException {
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
			toThreadSleep(3000);
			toClickButton(l1.getClickCreateUser());
			toThreadSleep(1000);
			toFillTextbox(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Validations", 6, 4));
			toFillTextbox(l1.getEnterLastName(), toReadDataFromExcel("Files", "Validations", 6, 5));
			toFillTextbox(l1.getSelectGender(), toReadDataFromExcel("Files", "Validations", 6, 6));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterUserEmail(), toReadDataFromExcel("Files", "Validations", 6, 7));
			toFillTextbox(l1.getSelectCountryCode(), toReadDataFromExcel("Files", "Validations", 6, 8));
			toThreadSleep(1000);
			pressEnterKey();
			toFillTextbox(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Validations", 6, 9));
			toFillTextbox(l1.getSelectUserRole(), toReadDataFromExcel("Files", "Validations", 6, 10));
			toThreadSleep(1000);
			pressEnterKey();
			toClickButton(l1.getClickCancelBtn());
			toThreadSleep(3000);
			WebElement table=driver.findElement(By.xpath("//table[@class='table mt-3 with-border']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			WebElement row=rows.get(1);
			List<WebElement> data= row.findElements(By.tagName("td"));
			String email=data.get(3).getText();
			if(email.equals(toReadDataFromExcel("Files", "Validations", 6, 7))) {
				toCreateNewCell("Files", "TestResults", 6, 3, "Fail");
			}else {
				toCreateNewCell("Files", "TestResults", 6, 3, "Pass");
			}
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_06");
			toCreateNewCell("Files", "TestResults", 6, 3, "Fail");
		}
			closeBrowser();		
		}
	
	
	@Test(enabled=false,priority=7,description ="UserCreation_TS_07")
	private void userFormValidation() throws IOException {
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
			toThreadSleep(3000);
			toClickButton(l1.getClickCreateUser());
			toThreadSleep(1000);
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(1000);
			toClickButton(l1.getClickCancelBtn());
			toThreadSleep(3000);
			WebElement table=driver.findElement(By.xpath("//table[@class='table mt-3 with-border']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			WebElement row=rows.get(1);
			List<WebElement> data= row.findElements(By.tagName("td"));
			String email=data.get(3).getText();
			if(email.equals("")) {
				toCreateNewCell("Files", "TestResults", 7, 3, "Fail");
			}else {
				toCreateNewCell("Files", "TestResults", 7, 3, "Pass");
			}
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_07");
			toCreateNewCell("Files", "TestResults", 7, 3, "Fail");
		}
			closeBrowser();		
		}
	
	@Test(enabled=false,priority=8,description ="UserCreation_TS_08")
	private void userFormUpdate() throws IOException {
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
			toSelectAndFill(l1.getEnterFirstName(), toReadDataFromExcel("Files", "Validations", 7, 4));
			toSelectAndFill(l1.getEnterLastName(), toReadDataFromExcel("Files", "Validations", 7, 5));
			toSelectAndFill(l1.getEnterPhoneNumber(), toReadDataFromExcel("Files", "Validations", 7, 9));
			toThreadSleep(1000);
			toClickButton(l1.getClickSaveBtn());
			toThreadSleep(2000);
			WebElement table=driver.findElement(By.xpath("//table[@class='table mt-3 with-border']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			WebElement row=rows.get(1);
			List<WebElement> data= row.findElements(By.tagName("td"));
			String Fname=data.get(1).getText();
			String Lname=data.get(2).getText();
			String PHnum=data.get(4).getText();
			if(Fname.equals(toReadDataFromExcel("Files", "Validations", 7, 4)) && Lname.equals(toReadDataFromExcel("Files", "Validations", 7, 5)) && PHnum.equals(toReadDataFromExcel("Files", "Validations", 7, 9))) {
				toCreateNewCell("Files", "TestResults", 8, 3, "Pass");
			}else {
				toCreateNewCell("Files", "TestResults", 8, 3, "Fail");
			}
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_08");
			toCreateNewCell("Files", "TestResults", 8, 3, "Fail");
			
		}
			closeBrowser();		
		}
	
	
	@Test(enabled=false,priority=9,description ="UserCreation_TS_09")
	private void checkUserFormUneditableFields() throws IOException {
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
			boolean emailField=l1.getEnterUserEmail().isEnabled();
			boolean RoleField=l1.getSelectUserRole().isEnabled();
			if(emailField==false && RoleField==false) {
				toCreateNewCell("Files", "TestResults", 9, 3, "Pass");						
			}else {
				toCreateNewCell("Files", "TestResults", 9, 3, "Fail");
			}
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_09");
			toCreateNewCell("Files", "TestResults", 9, 3, "Fail");
			
		}
			closeBrowser();		
		}
	
	
	@Test(enabled=false,priority=10,description ="UserCreation_TS_10")
	private void createInvalidPassword() throws IOException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		readtoken("ActiveToken",toReadDataFromExcel("Files", "Validations", 1, 7), "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), "     ");
		toFillTextbox(l1.getEnterConfirmPassword(), "       ");
		boolean test1 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test1);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "E");
		toSelectAndFill(l1.getEnterConfirmPassword(), "E");
		boolean test2 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test2);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "m");
		toSelectAndFill(l1.getEnterConfirmPassword(), "m");
		boolean test3 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test3);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "5");
		toSelectAndFill(l1.getEnterConfirmPassword(), "5");
		boolean test4 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test4);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "@");
		toSelectAndFill(l1.getEnterConfirmPassword(), "@");
		boolean test5 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test5);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "Em");
		toSelectAndFill(l1.getEnterConfirmPassword(), "Em");
		boolean test6 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test6);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "E5");
		toSelectAndFill(l1.getEnterConfirmPassword(), "E5");
		boolean test7 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test7);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "Emarson5020");
		toSelectAndFill(l1.getEnterConfirmPassword(), "Emarson5020");
		boolean test8 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test8);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "marson5020");
		toSelectAndFill(l1.getEnterConfirmPassword(), "marson5020");
		boolean test9 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test9);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "marson5020@");
		toSelectAndFill(l1.getEnterConfirmPassword(), "marson5020@");
		boolean test10 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test10);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "Emarson@");
		toSelectAndFill(l1.getEnterConfirmPassword(), "Emarson@");
		boolean test11 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test11);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "5020@");
		toSelectAndFill(l1.getEnterConfirmPassword(), "5020@");
		boolean test12 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test12);
		toThreadSleep(1000);
		toSelectAndFill(l1.getEnterNewPassword(), "Anu@123");
		toSelectAndFill(l1.getEnterConfirmPassword(), "Anu@123");
		boolean test13 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test13);
		
		if(test1==false && test2==false && test3==false && test4==false && test5==false && test6==false && 
				test7==false && test8==false && test9==false && test10==false && test11==false && test12==false && test13==false) {
			toCreateNewCell("Files", "TestResults", 10, 3, "Pass");
		}
		else {
			toCreateNewCell("Files", "TestResults", 10, 3, "Fail");
		}
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_10");
			toCreateNewCell("Files", "TestResults", 10, 3, "Fail");
			
		}
			closeBrowser();		
		}

	
	
	@Test(enabled=false,priority=11,description ="UserCreation_TS_11")
	private void checkPassword() throws IOException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		readtoken("ActiveToken",toReadDataFromExcel("Files", "Validations", 1, 7), "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), "Anu@123456");
		toFillTextbox(l1.getEnterConfirmPassword(), "Anu@123");
		boolean test1 =l1.getClickCreatePassword().isEnabled();
		System.out.println(test1);
		if(test1==false) {
			toCreateNewCell("Files", "TestResults", 11, 3, "Pass");
		}else {
				toCreateNewCell("Files", "TestResults", 11, 3, "Fail");
			}}
		catch (Exception e) {
			takePicture("UserCreation_TS_11");
			toCreateNewCell("Files", "TestResults", 11, 3, "Fail");
			
		}
			closeBrowser();		
		}
		
	
	@Test(enabled=false,priority=12,description ="UserCreation_TS_12")
	private void passwordSuccess() throws IOException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		readtoken("ActiveToken",toReadDataFromExcel("Files", "Validations", 1, 7), "SetPassword");
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterNewPassword(), "Emarson5020@");
		toFillTextbox(l1.getEnterConfirmPassword(), "Emarson5020@");
		toClickButton(l1.getClickCreatePassword());
		toThreadSleep(3000);
		System.out.println(l1.getLoginpageTitle().getText());
		toCreateNewCell("Files", "TestResults", 12, 3, "Pass");
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_12");
			toCreateNewCell("Files", "TestResults", 12, 3, "Fail");
			
		}
			closeBrowser();		
		}
		
	
	@Test(enabled=false,priority=13,description ="UserCreation_TS_13")
	private void verificationLinkExpiry() throws IOException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		readtoken("ActiveToken",toReadDataFromExcel("Files", "Validations", 1, 7), "SetPassword");	
		toThreadSleep(3000);
		System.out.println(l1.getExpirypageTitle().getText());
		toCreateNewCell("Files", "TestResults", 13, 3, "Pass");
		}
		catch (Exception e) {
			takePicture("UserCreation_TS_13");
			toCreateNewCell("Files", "TestResults", 13, 3, "Fail");
			
		}
			closeBrowser();		
		}
		
}