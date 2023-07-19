package org.runner;

import java.io.IOException;

import org.base.BaseClass;
import org.base.Configurations;
import org.base.UserCreationPojo;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChangePassword extends BaseClass {
	
	@Test(enabled = false, priority = 1, description ="Change Password_TS_01")
	private void changePasswordNavigation() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		try {
			toClickButton(l1.getClickProfileMenu());
			toThreadSleep(2000);
			toClickButton(l1.getClickChangePassword());
			toThreadSleep(2000);
			String pageTitle=l1.getPageTitle().getText();
			if(pageTitle.equals("Change Password")) {
				toCreateNewCell("Files", "TestResults", 1, 7, "Pass");
			}else {
				toCreateNewCell("Files", "TestResults", 1, 7, "Fail");
			}
		}
		catch (Exception e) {
			takePicture("Change Password_TS_01");
			toCreateNewCell("Files", "TestResults", 1, 1, "Fail");
		}
			closeBrowser();			
	}
	
	
	@Test(enabled = false, priority = 2, description ="Change Password_TS_02")
	private void changePasswordValidations() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		try {
			toClickButton(l1.getClickProfileMenu());
			toThreadSleep(2000);
			toClickButton(l1.getClickChangePassword());
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterOdlPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
			toFillTextbox(l1.getEnterNewPassword(), "             ");
			toFillTextbox(l1.getEnterchangeConfirmPassword(), "             ");
			boolean test1=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "EMARSONS");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "EMARSONS");
			boolean test2=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "emarsons");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "emarsons");
			boolean test3=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "Emarsons");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "Emarsons");
			boolean test4=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "50207563434");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "50207563434");
			boolean test5=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "@#$%^&*%$#@@##$$");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "@#$%^&*%$#@@##$$");
			boolean test6=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "Emarson5020");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "Emarson5020");
			boolean test7=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "Emarson@");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "Emarson@");
			boolean test8=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "502065434@");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "502065434@");
			boolean test9=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "marson5020");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "marson5020");
			boolean test10=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "EMARSON5020@");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "EMARSON5020@");
			boolean test11=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "emarson@$#$%");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "emarson@$#$%");
			boolean test12=l1.getClickSaveChangePassword().isEnabled();
			toThreadSleep(1000);
			toSelectAndFill(l1.getEnterNewPassword(), "Anu@123");
			toSelectAndFill(l1.getEnterchangeConfirmPassword(), "Anu@123");
			boolean test13=l1.getClickSaveChangePassword().isEnabled();
			if(test1==false && test2==false && test3==false && test4==false && test5==false && test6==false && 
					test7==false && test8==false && test9==false && test10==false && test11==false && test12==false && test13==false) {
				toCreateNewCell("Files", "TestResults", 2, 7, "Pass");
			}
			else {
				toCreateNewCell("Files", "TestResults", 2, 7, "Fail");
			}
		}
		catch (Exception e) {
			takePicture("Change Password_TS_02");
			toCreateNewCell("Files", "TestResults", 2, 7, "Fail");
		}
			closeBrowser();			
	}
	
	
	@Test(enabled = false, priority = 3, description ="Change Password_TS_03")
	private void checkOldPassword() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		try {
			toClickButton(l1.getClickProfileMenu());
			toThreadSleep(2000);
			toClickButton(l1.getClickChangePassword());
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterOdlPassword(), "Weruyrfcd@344");
			toFillTextbox(l1.getEnterNewPassword(), "Welldercare@2");
			toFillTextbox(l1.getEnterchangeConfirmPassword(), "Welldercare@2");
		    toClickButton(l1.getClickSaveChangePassword());
		    toThreadSleep(2000);
		    toSelectAndFill(l1.getEnterOdlPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		    toSelectAndFill(l1.getEnterNewPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		    toSelectAndFill(l1.getEnterchangeConfirmPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		    boolean test1=l1.getClickSaveChangePassword().isEnabled();
		    toThreadSleep(2000);
		    toSelectAndFill(l1.getEnterOdlPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		    toSelectAndFill(l1.getEnterNewPassword(), "Welldercare@2");
		    toSelectAndFill(l1.getEnterchangeConfirmPassword(), "Welldercare@1");
		    toThreadSleep(1000);
		    boolean test2=l1.getClickSaveChangePassword().isEnabled();
		    if(test1==false && test2==false) {
		    	toCreateNewCell("Files", "TestResults", 3, 7, "Pass");
		    }else {
		    	toCreateNewCell("Files", "TestResults", 3, 7, "Fail");
		    }
		    
		}
		catch (Exception e) {
			takePicture("Change Password_TS_03");
			toCreateNewCell("Files", "TestResults", 3, 7, "Fail");
		}
			closeBrowser();			
	}
	
	
	@Test(enabled = false, priority = 4, description ="Change Password_TS_04")
	private void changePasswordSuccess() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		try {
			toClickButton(l1.getClickProfileMenu());
			toThreadSleep(2000);
			toClickButton(l1.getClickChangePassword());
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterOdlPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
			toFillTextbox(l1.getEnterNewPassword(), "Welldercare@2");
			toFillTextbox(l1.getEnterchangeConfirmPassword(), "Welldercare@2");
			toClickButton(l1.getClickSaveChangePassword());
			toThreadSleep(2000);
			System.out.println(l1.getLoginpageTitle().getText());		
			toCreateNewCell("Files", "Login&Usercreation", 11, 1, "Welldercare@2");
		    toCreateNewCell("Files", "TestResults", 4, 7, "Pass");
		    }
		catch (Exception e) {
			takePicture("Change Password_TS_04");
			toCreateNewCell("Files", "TestResults", 4, 7, "Fail");
		}
			closeBrowser();			
	}
	
	@Test(enabled = false, priority = 5, description ="Change Password_TS_05")
	private void loginWithOldPassword() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), "Emarson5020@");
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		System.out.println(l1.getReadNotify().getText());
		    toCreateNewCell("Files", "TestResults", 5, 7, "Pass");
		    }
		catch (Exception e) {
			takePicture("Change Password_TS_04");
			toCreateNewCell("Files", "TestResults", 5, 7, "Fail");
		}
			closeBrowser();			
	}
	
	
	
	@Test(enabled = false, priority = 6, description ="Change Password_TS_06")
	private void loginWithNewPassword() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		try {
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		System.out.println(l1.getPageTitle().getText());
		    toCreateNewCell("Files", "TestResults", 6, 7, "Pass");
		    }
		catch (Exception e) {
			takePicture("Change Password_TS_06");
			toCreateNewCell("Files", "TestResults", 6, 7, "Fail");
		}
			closeBrowser();			
	}
	

	
	@Test(enabled = true, priority = 7, description ="Change Password_TS_07")
	private void passwordHistory() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		toThreadSleep(1000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 8, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		try {
			toClickButton(l1.getClickProfileMenu());
			toThreadSleep(2000);
			toClickButton(l1.getClickChangePassword());
			toThreadSleep(2000);
			toFillTextbox(l1.getEnterOdlPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 11, 1));
			toFillTextbox(l1.getEnterNewPassword(), "Emarson5020@");
			toFillTextbox(l1.getEnterchangeConfirmPassword(), "Emarson5020@");
		    toClickButton(l1.getClickSaveChangePassword());
		    toThreadSleep(2000);
		    System.out.println(l1.getPageTitle().getText());
		    toCreateNewCell("Files", "TestResults", 7, 7, "Pass");
		    }
		catch (Exception e) {
			takePicture("Change Password_TS_07");
			toCreateNewCell("Files", "TestResults", 7, 7, "Fail");
		}
			closeBrowser();			
	}
	
}
