package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCreationPojo extends BaseClass {
	
	public UserCreationPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
//	<--- Login page --->
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='username']"),
		@FindBy(xpath="//input[@placeholder='Enter email address']")}) 
	private WebElement enterUsername;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='password']"),
		@FindBy(xpath="//input[@placeholder='Enter password']")}) 
	private WebElement enterPassword;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Sign in']")}) 
	private WebElement clickSignIn;
	

	
//	<--- Forgot password page --->
	
	@FindAll({
		@FindBy(xpath="//a[text()='Forgot password?']"),
		@FindBy(xpath="//a[@href='#/en/forgot-password']")}) 
	private WebElement clickForgotPassword;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emailId']"),
		@FindBy(xpath="//input[@placeholder='Enter email address']")}) 
	private WebElement enterEmailAddress;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Submit']")}) 
	private WebElement clickSubmit;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='newPassword']"),
		@FindBy(xpath="//input[@placeholder='Enter your password']")}) 
	private WebElement enterNewPassword;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='confPassword']"),
		@FindBy(xpath="//input[@placeholder='Enter confirm password']")}) 
	private WebElement enterConfirmPassword;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Create Password']"),
		@FindBy(xpath="//button[@type='submit']")}) 
	private WebElement clickCreatePassword;
	


//	<--- User creation page --->
	
	@FindAll({
		@FindBy(xpath="//span[text()='Users ']"),
		@FindBy(xpath="//a[@href='#/en/home/user']")}) 
	private WebElement clickUsersMenu;
	
	@FindAll({
		@FindBy(xpath="//button[@title='New']"),
		@FindBy(xpath="//button[@class='btn btn-success me-3 ng-star-inserted']")}) 
	private WebElement clickCreateUser;
		
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='firstName']"),
		@FindBy(xpath="//input[@placeholder='First Name']")}) 
	private WebElement enterFirstName;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='lastName']"),
		@FindBy(xpath="//input[@placeholder='Last Name']")}) 
	private WebElement enterLastName;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
	private WebElement selectGender;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='email']"),
		@FindBy(xpath="//input[@placeholder='Email']")}) 
	private WebElement enterUserEmail;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='phoneNo']"),
		@FindBy(xpath="//input[@placeholder='Phone No']")}) 
	private WebElement enterPhoneNumber;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")}) 
	private WebElement selectUserRole;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Save']")}) 
	private WebElement clickSaveBtn;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Validate']")}) 
	private WebElement clickValidateBtn;
	

//  < ---- Change password page ---->
	
	
	@FindAll({
		@FindBy(xpath="//li[@class='dropdown user user-menu']")}) 
	private WebElement clickProfileMenu;
	
	
	@FindAll({
		@FindBy(xpath="//a[text()=' Change Password']")}) 
	private WebElement clickChangePassword;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='oldPassword']"),
		@FindBy(xpath="//input[@placeholder='Enter old password']")}) 
	private WebElement enterOdlPassword;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='newPassword']"),
		@FindBy(xpath="//input[@placeholder='Enter new password']")}) 
	private WebElement enterchangeNewPassword;
	
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='confirmPassword']"),
		@FindBy(xpath="//input[@placeholder='Enter confirm password']")}) 
	private WebElement enterchangeConfirmPassword;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Save']")}) 
	private WebElement clickSaveChangePassword;
	
	
	
	
	
	//	<--- Channel Partner & Care manager onboard form --->
	

	public WebElement getClickProfileMenu() {
		return clickProfileMenu;
	}

	public WebElement getClickChangePassword() {
		return clickChangePassword;
	}

	public WebElement getEnterOdlPassword() {
		return enterOdlPassword;
	}

	public WebElement getEnterchangeNewPassword() {
		return enterchangeNewPassword;
	}

	public WebElement getEnterchangeConfirmPassword() {
		return enterchangeConfirmPassword;
	}

	public WebElement getClickSaveChangePassword() {
		return clickSaveChangePassword;
	}



	@FindAll({
		@FindBy(xpath="//input[@id='file-upload']"),
		@FindBy(xpath="(//input[@type='file'])[1]")}) 
	private WebElement uploadCPprofilePicture;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
		@FindBy(xpath="(//input[@type='text'])[1]")}) 
	private WebElement enterCPTitle;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='dateOfBirth']"),
		@FindBy(xpath="//input[@placeholder='Pick your date of birth']")}) 
	private WebElement enterCPDOB;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emergencyContactNo']"),
		@FindBy(id="emergencyContactNo")}) 
	private WebElement enterCPAlternateContect;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]"),
		@FindBy(xpath="(//input[@type='text'])[10]")}) 
	private WebElement enterCPDegree;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]"),
		@FindBy(xpath="(//input[@type='text'])[11]")}) 
	private WebElement enterCPGovtIdType;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='govtId']"),
		@FindBy(xpath="//input[@placeholder='Enter Govt.Id Number']")}) 
	private WebElement enterCPGovtIdNumber;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='govtProof']"),
		@FindBy(xpath="(//input[@type='file'])[2]")}) 
	private WebElement enterCPUploadProof;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='address1']"),
		@FindBy(xpath="//input[@placeholder='Enter your mailing address...']")}) 
	private WebElement enterCPAddress1;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='address2']"),
		@FindBy(xpath="//input[@placeholder='Enter your mailing address...']")}) 
	private WebElement enterCPAddress2;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[5]"),
		@FindBy(xpath="//input[@autocomplete='a55d532151e6']")}) 
	private WebElement enterCPCountry;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[6]"),
		@FindBy(xpath="//input[@autocomplete='afbeb71c248a']")}) 
	private WebElement enterCPState;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[7]"),
		@FindBy(xpath="//input[@autocomplete='ade66aa82b19']")}) 
	private WebElement enterCPCity;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[8]"),
		@FindBy(xpath="//input[@autocomplete='ab86fc7c778b']")}) 
	private WebElement enterCPTerritory;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pinCode']"),
		@FindBy(xpath="//input[@placeholder='Enter Pin code']")}) 
	private WebElement enterCPpincode;
	
	@FindAll({
		@FindBy(xpath="//textarea[@formcontrolname='aboutYourShelf']"),
		@FindBy(xpath="//textarea[@placeholder='Enter about yourself']")}) 
	private WebElement enterCPAboutYourself;
	
	
//	<--- Doctor onboard form --->
	
	@FindAll({
		@FindBy(xpath="//input[@id='file-upload']"),
		@FindBy(xpath="(//input[@type='file'])[1]")}) 
	private WebElement uploadDrProfilePicture;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
		@FindBy(xpath="(//input[@type='text'])[1]")}) 
	private WebElement enterDrTitle;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='dateOfBirth']"),
		@FindBy(xpath="//input[@placeholder='Pick your date of birth']")}) 
	private WebElement enterDrDOB;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emergencyContactNo']"),
		@FindBy(id="emergencyContactNo")}) 
	private WebElement enterDrAlternateContect;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]"),
		@FindBy(xpath="(//input[@type='text'])[10]")}) 
	private WebElement enterDrGovtIdType;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='govtId']"),
		@FindBy(xpath="//input[@placeholder='Enter govt.id no']")}) 
	private WebElement enterDrGovtIdNumber;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='govtProof']"),
		@FindBy(xpath="(//input[@type='file'])[2]")}) 
	private WebElement enterDrUploadProof;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='address1']"),
		@FindBy(xpath="(//input[@placeholder='Enter address'])[1]")}) 
	private WebElement enterDrAddress1;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='address2']"),
		@FindBy(xpath="(//input[@placeholder='Enter address'])[1]")}) 
	private WebElement enterDrAddress2;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]"),
		@FindBy(xpath="(//input[@type='text'])[14]")}) 
	private WebElement enterDrCountry;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[5]"),
		@FindBy(xpath="(//input[@type='text'])[15]")}) 
	private WebElement enterDrState;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[6]"),
		@FindBy(xpath="(//input[@type='text'])[16]")}) 
	private WebElement enterDrCity;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
		@FindBy(xpath="(//input[@type='text'])[1]")}) 
	private WebElement enterDrDegree;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]"),
		@FindBy(xpath="(//input[@type='text'])[2]")}) 
	private WebElement enterDrSpecialty;
	

	@FindAll({
		@FindBy(xpath="//textarea[@formcontrolname='aboutYourShelf']"),
		@FindBy(xpath="//textarea[@placeholder='Enter about yourself']")}) 
	private WebElement enterDrAboutYourself;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='registrationYear']"),
		@FindBy(xpath="//input[@placeholder='Registration Year']")}) 
	private WebElement enterDrRegistrationYear;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='registrationNumber']"),
		@FindBy(xpath="//input[@placeholder='Registration Number']")}) 
	private WebElement enterDrRegistrationNumber;
	
	@FindAll({
		@FindBy(xpath="//label[text()='State']")}) 
	private WebElement clickStateRegType;
	
	@FindAll({
		@FindBy(xpath="//label[text()='Medical Council Of India']")}) 
	private WebElement clickRegBoard;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='copyOfRegistration']"),
		@FindBy(xpath="(//input[@type='file'])[1]")}) 
	private WebElement uploadDrRegistrationCopy;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='clinicName']"),
		@FindBy(xpath="//input[@placeholder='Clinic Name']")}) 
	private WebElement enterClinicName;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='contactNo']"),
		@FindBy(xpath="//input[@placeholder='Contact Number']")}) 
	private WebElement enterClinicContactNo;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emailId']"),
		@FindBy(xpath="//input[@placeholder='Email address']")}) 
	private WebElement enterClinicEmail;
	
	@FindAll({
		@FindBy(xpath="//textarea[@formcontrolname='address']"),
		@FindBy(xpath="//textarea[@placeholder='Enter your clinic address']")}) 
	private WebElement enterClinicAddress;
	
	
	@FindAll({
		@FindBy(xpath="//label[@for='mon']")}) 
	private WebElement clickMon;
	
	@FindAll({
		@FindBy(xpath="//label[@for='tue']")}) 
	private WebElement clickTue;
	
	@FindAll({
		@FindBy(xpath="//label[@for='wed']")}) 
	private WebElement clickWed;
	
	@FindAll({
		@FindBy(xpath="//label[@for='thu']")}) 
	private WebElement clickThu;
	

	@FindAll({
		@FindBy(xpath="//label[@for='fri']")}) 
	private WebElement clickFri;
	
	@FindAll({
		@FindBy(xpath="(//input[@placement='bottom'])[1]")}) 
	private WebElement clickStartTime;
	
	@FindAll({
		@FindBy(xpath="(//input[@placement='bottom'])[2]")}) 
	private WebElement clickEndTime;
	
	@FindAll({
		@FindBy(xpath="//input[@placeholder='HH']")}) 
	private WebElement enterHrTime;
	
	@FindAll({
		@FindBy(xpath="//input[@placeholder='MM']")}) 
	private WebElement enterMMTime;
	
	@FindAll({
		@FindBy(xpath="//button[text()='AM ']")}) 
	private WebElement clickAMbutton;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Submit']")}) 
	private WebElement clickDrFormSubmit;
	
//	<--- Caretaker onboard form --->
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[8]"),
		@FindBy(xpath="(//input[@type='text'])[19]")}) 
	private WebElement enterCTDegree;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[9]"),
		@FindBy(xpath="(//input[@type='text'])[20]")}) 
	private WebElement enterCTSpecialty;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[10]"),
		@FindBy(xpath="(//input[@type='text'])[21]")}) 
	private WebElement enterCTSpecialSkills;
	
	@FindAll({
		@FindBy(xpath="//input[@placement='bottom']")}) 
	private WebElement clickCTStartTime;
	
	@FindAll({
		@FindBy(xpath="(//input[@placeholder='00:00'])[2]")})
	private WebElement clickCTEndTime;
	
//	<--- Pharmacist onboard form --->
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyName']"),
		@FindBy(xpath="//input[@placeholder='Enter Pharmacy name']")}) 
	private WebElement enterPharmacyName;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='contactNo']"),
		@FindBy(xpath="//input[@placeholder='Enter Contact Number']")}) 
	private WebElement enterPharmacyContactNo;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emailId']"),
		@FindBy(xpath="//input[@placeholder='Enter email address']")}) 
	private WebElement enterPharmacyEmail;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyRegisterNo']"),
		@FindBy(xpath="//input[@id='pharmacyRegisterNo']")}) 
	private WebElement enterPharmacyRegNo;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyGST']"),
		@FindBy(xpath="//input[@placeholder='Enter pharmacy GST no ']")}) 
	private WebElement enterPharmacyGSTno;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyPAN']"),
		@FindBy(xpath="//input[@formcontrolname='pharmacyPAN']")}) 
	private WebElement enterPharmacyPanNo;
	
	@FindAll({
		@FindBy(xpath="//textarea[@formcontrolname='address']"),
		@FindBy(xpath="//textarea[@placeholder='Enter pharmacy address']")}) 
	private WebElement enterPharmacyAddress;
	
	
	public WebElement getEnterPharmacyName() {
		return enterPharmacyName;
	}

	public WebElement getEnterPharmacyContactNo() {
		return enterPharmacyContactNo;
	}

	public WebElement getEnterPharmacyEmail() {
		return enterPharmacyEmail;
	}

	public WebElement getEnterPharmacyRegNo() {
		return enterPharmacyRegNo;
	}

	public WebElement getEnterPharmacyGSTno() {
		return enterPharmacyGSTno;
	}

	public WebElement getEnterPharmacyPanNo() {
		return enterPharmacyPanNo;
	}

	public WebElement getEnterPharmacyAddress() {
		return enterPharmacyAddress;
	}

	public WebElement getClickCTStartTime() {
		return clickCTStartTime;
	}

	public WebElement getClickCTEndTime() {
		return clickCTEndTime;
	}

	public WebElement getEnterCTDegree() {
		return enterCTDegree;
	}

	public WebElement getEnterCTSpecialty() {
		return enterCTSpecialty;
	}

	public WebElement getEnterCTSpecialSkills() {
		return enterCTSpecialSkills;
	}

	public WebElement getClickDrFormSubmit() {
		return clickDrFormSubmit;
	}

	public WebElement getClickAMbutton() {
		return clickAMbutton;
	}

	public WebElement getEnterClinicName() {
		return enterClinicName;
	}

	public WebElement getEnterClinicContactNo() {
		return enterClinicContactNo;
	}

	public WebElement getEnterClinicEmail() {
		return enterClinicEmail;
	}

	public WebElement getEnterClinicAddress() {
		return enterClinicAddress;
	}

	public WebElement getClickMon() {
		return clickMon;
	}

	public WebElement getClickTue() {
		return clickTue;
	}

	public WebElement getClickWed() {
		return clickWed;
	}

	public WebElement getClickThu() {
		return clickThu;
	}

	public WebElement getClickFri() {
		return clickFri;
	}

	public WebElement getClickStartTime() {
		return clickStartTime;
	}

	public WebElement getClickEndTime() {
		return clickEndTime;
	}

	public WebElement getEnterHrTime() {
		return enterHrTime;
	}

	public WebElement getEnterMMTime() {
		return enterMMTime;
	}

	public WebElement getEnterDrSpecialty() {
		return enterDrSpecialty;
	}
	
	public WebElement getUploadDrRegistrationCopy() {
		return uploadDrRegistrationCopy;
	}

	public WebElement getEnterDrDegree() {
		return enterDrDegree;
	}

	public WebElement getEnterDrAboutYourself() {
		return enterDrAboutYourself;
	}

	public WebElement getEnterDrRegistrationYear() {
		return enterDrRegistrationYear;
	}

	public WebElement getEnterDrRegistrationNumber() {
		return enterDrRegistrationNumber;
	}

	public WebElement getClickStateRegType() {
		return clickStateRegType;
	}

	public WebElement getClickRegBoard() {
		return clickRegBoard;
	}

	public WebElement getUploadDrProfilePicture() {
		return uploadDrProfilePicture;
	}

	public WebElement getEnterDrTitle() {
		return enterDrTitle;
	}

	public WebElement getEnterDrDOB() {
		return enterDrDOB;
	}

	public WebElement getEnterDrAlternateContect() {
		return enterDrAlternateContect;
	}

	public WebElement getEnterDrGovtIdType() {
		return enterDrGovtIdType;
	}

	public WebElement getEnterDrGovtIdNumber() {
		return enterDrGovtIdNumber;
	}

	public WebElement getEnterDrUploadProof() {
		return enterDrUploadProof;
	}

	public WebElement getEnterDrAddress1() {
		return enterDrAddress1;
	}

	public WebElement getEnterDrAddress2() {
		return enterDrAddress2;
	}

	public WebElement getEnterDrCountry() {
		return enterDrCountry;
	}

	public WebElement getEnterDrState() {
		return enterDrState;
	}

	public WebElement getEnterDrCity() {
		return enterDrCity;
	}

	public WebElement getEnterDrTerritory() {
		return enterDrTerritory;
	}

	public WebElement getEnterDrpincode() {
		return enterDrpincode;
	}



	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[7]"),
		@FindBy(xpath="(//input[@type='text'])[18]")}) 
	private WebElement enterDrTerritory;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pinCode']"),
		@FindBy(xpath="//input[@placeholder='Enter Pin code']")}) 
	private WebElement enterDrpincode;
	

	public WebElement getClickValidateBtn() {
		return clickValidateBtn;
	}
	
	public WebElement getUploadCPprofilePicture() {
		return uploadCPprofilePicture;
	}

	public WebElement getEnterCPTitle() {
		return enterCPTitle;
	}

	public WebElement getEnterCPDOB() {
		return enterCPDOB;
	}

	public WebElement getEnterCPAlternateContect() {
		return enterCPAlternateContect;
	}

	public WebElement getEnterCPDegree() {
		return enterCPDegree;
	}

	public WebElement getEnterCPGovtIdType() {
		return enterCPGovtIdType;
	}

	public WebElement getEnterCPGovtIdNumber() {
		return enterCPGovtIdNumber;
	}

	public WebElement getEnterCPUploadProof() {
		return enterCPUploadProof;
	}

	public WebElement getEnterCPAddress1() {
		return enterCPAddress1;
	}

	public WebElement getEnterCPAddress2() {
		return enterCPAddress2;
	}

	public WebElement getEnterCPCountry() {
		return enterCPCountry;
	}

	public WebElement getEnterCPState() {
		return enterCPState;
	}

	public WebElement getEnterCPCity() {
		return enterCPCity;
	}

	public WebElement getEnterCPTerritory() {
		return enterCPTerritory;
	}

	public WebElement getEnterCPpincode() {
		return enterCPpincode;
	}

	public WebElement getEnterCPAboutYourself() {
		return enterCPAboutYourself;
	}

	
	public WebElement getEnterUsername() {
		return enterUsername;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getClickSignIn() {
		return clickSignIn;
	}

	public WebElement getClickForgotPassword() {
		return clickForgotPassword;
	}

	public WebElement getEnterEmailAddress() {
		return enterEmailAddress;
	}

	public WebElement getClickSubmit() {
		return clickSubmit;
	}

	public WebElement getEnterNewPassword() {
		return enterNewPassword;
	}

	public WebElement getEnterConfirmPassword() {
		return enterConfirmPassword;
	}

	public WebElement getClickCreatePassword() {
		return clickCreatePassword;
	}

	public WebElement getClickUsersMenu() {
		return clickUsersMenu;
	}

	public WebElement getClickCreateUser() {
		return clickCreateUser;
	}

	public WebElement getEnterFirstName() {
		return enterFirstName;
	}

	public WebElement getEnterLastName() {
		return enterLastName;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public WebElement getEnterUserEmail() {
		return enterUserEmail;
	}

	public WebElement getEnterPhoneNumber() {
		return enterPhoneNumber;
	}

	public WebElement getSelectUserRole() {
		return selectUserRole;
	}

	public WebElement getClickSaveBtn() {
		return clickSaveBtn;
	}



	
	}
