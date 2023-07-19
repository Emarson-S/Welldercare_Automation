package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileUpdatePojo extends BaseClass{

	public ProfileUpdatePojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({
		@FindBy(xpath="//span[text()='My Profile ']")}) 
	private WebElement clickProfile;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
	private WebElement enterTitle;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='firstName']")}) 
	private WebElement enterFirstName;
	
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='lastName']")}) 
	private WebElement enterLastName;

	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")}) 
	private WebElement enterGendar;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='dateOfBirth']")}) 
	private WebElement enterDoB;
	
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='address']")}) 
	private WebElement enterAddress1;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='address1']")}) 
	private WebElement enterAddress2;

	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pinCode']")}) 
	private WebElement enterPinCode;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='govtId']")}) 
	private WebElement enterGovtIDNum;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emergencyContactNo']")}) 
	private WebElement enterAlterContNum;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Submit']")}) 
	private WebElement clickProfileSubmit;
	
	
	
//	<---- Doctor and Caretaker profile ----> 
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]")}) 
	private WebElement enterCountry;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]")}) 
	private WebElement enterState;
	
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[5]")}) 
	private WebElement enterCity;

	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[6]")}) 
	private WebElement enterTerritory;	
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[7]")}) 
	private WebElement enterGovtIDType;


	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[8]")}) 
	private WebElement enterSpecialty;

	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[9]")}) 
	private WebElement enterDegree;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='endTime']")}) 
	private WebElement clickEndTime;
		
	
	
//  < --- Channel partner and Caremanager profile ---->	
		

	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]")}) 
	private WebElement enterCpDegree;
	
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]")}) 
	private WebElement enterCpCountry;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[5]")}) 
	private WebElement enterCpState;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[6]")}) 
	private WebElement enterCpCity;
	
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[7]")}) 
	private WebElement enterCpTerritory;
	
	@FindAll({
		@FindBy(xpath="//button[text()=' Submit']")}) 
	private WebElement clickCpSubmitBtn;
	

	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[8]")}) 
	private WebElement enterCpGovtIDType;
	
	
	
	
  // <-------  Pharmacist profile --------->	
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[8]")}) 
	private WebElement enterPhDegree;	
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyName']")}) 
	private WebElement enterPhPharmacyName;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyRegisterNo']")}) 
	private WebElement enterPhPharmacyRegNum;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='contactNo']")}) 
	private WebElement enterPhPharmacyConNumber;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyGST']")}) 
	private WebElement enterPhPharmacyGSTNumber;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emailId']")}) 
	private WebElement enterPhPharmacyEmail;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pharmacyPAN']")}) 
	private WebElement enterPhPharmacyPanNum;
	
	@FindAll({
		@FindBy(xpath="//textarea[@formcontrolname='address']")}) 
	private WebElement enterPhPharmacyAddress;
	
	
//  <--------  Veteran profile update  ------>	
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='emergencyContactNo']")}) 
	private WebElement enterVTAlternateNumber;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='height']")}) 
	private WebElement enterVTHeight;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='weight']")}) 
	private WebElement enterVTWeight;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='smokeCount']")}) 
	private WebElement enterVTNoOfCigarettes;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='drinkerCount']")}) 
	private WebElement enterVTDrinkerCount;
	
	
	
	
	public WebElement getEnterVTAlternateNumber() {
		return enterVTAlternateNumber;
	}


	public WebElement getEnterVTHeight() {
		return enterVTHeight;
	}


	public WebElement getEnterVTWeight() {
		return enterVTWeight;
	}


	public WebElement getEnterVTNoOfCigarettes() {
		return enterVTNoOfCigarettes;
	}


	public WebElement getEnterVTDrinkerCount() {
		return enterVTDrinkerCount;
	}


	public WebElement getEnterPhDegree() {
		return enterPhDegree;
	}


	public WebElement getEnterPhPharmacyName() {
		return enterPhPharmacyName;
	}


	public WebElement getEnterPhPharmacyRegNum() {
		return enterPhPharmacyRegNum;
	}


	public WebElement getEnterPhPharmacyConNumber() {
		return enterPhPharmacyConNumber;
	}


	public WebElement getEnterPhPharmacyGSTNumber() {
		return enterPhPharmacyGSTNumber;
	}


	public WebElement getEnterPhPharmacyEmail() {
		return enterPhPharmacyEmail;
	}


	public WebElement getEnterPhPharmacyPanNum() {
		return enterPhPharmacyPanNum;
	}


	public WebElement getEnterPhPharmacyAddress() {
		return enterPhPharmacyAddress;
	}


	
	public WebElement getClickEndTime() {
		return clickEndTime;
	}
	
	
	public WebElement getClickCpSubmitBtn() {
		return clickCpSubmitBtn;
	}

	
	public WebElement getEnterCpDegree() {
		return enterCpDegree;
	}


	public WebElement getEnterCpCountry() {
		return enterCpCountry;
	}


	public WebElement getEnterCpState() {
		return enterCpState;
	}


	public WebElement getEnterCpCity() {
		return enterCpCity;
	}


	public WebElement getEnterCpTerritory() {
		return enterCpTerritory;
	}


	public WebElement getEnterCpGovtIDType() {
		return enterCpGovtIDType;
	}
	
	public WebElement getClickProfile() {
		return clickProfile;
	}


	public WebElement getEnterTitle() {
		return enterTitle;
	}


	public WebElement getEnterGendar() {
		return enterGendar;
	}


	public WebElement getEnterDoB() {
		return enterDoB;
	}


	public WebElement getEnterAddress1() {
		return enterAddress1;
	}


	public WebElement getEnterAddress2() {
		return enterAddress2;
	}


	public WebElement getEnterCountry() {
		return enterCountry;
	}


	public WebElement getEnterState() {
		return enterState;
	}


	public WebElement getEnterCity() {
		return enterCity;
	}


	public WebElement getEnterTerritory() {
		return enterTerritory;
	}



	public WebElement getEnterPinCode() {
		return enterPinCode;
	}


	public WebElement getEnterGovtIDType() {
		return enterGovtIDType;
	}


	public WebElement getEnterGovtIDNum() {
		return enterGovtIDNum;
	}


	public WebElement getEnterAlterContNum() {
		return enterAlterContNum;
	}


	public WebElement getEnterSpecialty() {
		return enterSpecialty;
	}


	public WebElement getEnterDegree() {
		return enterDegree;
	}


	public WebElement getClickProfileSubmit() {
		return clickProfileSubmit;
	}


	public WebElement getEnterFirstName() {
		return enterFirstName;
	}


	public WebElement getEnterLastName() {
		return enterLastName;
	}
	
	
//	<---- Doctor Profile update ---->
	
	
	
}
