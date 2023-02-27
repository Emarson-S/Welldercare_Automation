package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VeteranOnboardingPojo extends BaseClass {

	public VeteranOnboardingPojo() {
		PageFactory.initElements(driver, this);
	}
	 
//		<--- Enquiry page --->
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='firstName'])[1]"),
			@FindBy(xpath="(//input[@placeholder='Enter first name'])[1]")}) 
		private WebElement enterVTFirstName;
	
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='lastName'])[1]"),
			@FindBy(xpath="(//input[@placeholder='Enter last name'])[1]")}) 
		private WebElement enterVTLastName;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
			@FindBy(xpath="(//input[@type='text'])[3]")}) 
		private WebElement enterVTGender;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='email'])[1]"),
			@FindBy(xpath="(//input[@placeholder='Enter email Id'])[1]")}) 
		private WebElement enterVTEmailAdress;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='phoneNo'])[1]"),
			@FindBy(xpath="(//input[@placeholder='Enter Contact Number'])[1]")}) 
		private WebElement enterVTContactNo;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='address1'])[1]"),
			@FindBy(xpath="(//input[@placeholder='Enter your mailing address...'])[1]")}) 
		private WebElement enterVTAddress1;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='address2'])[1]"),
			@FindBy(xpath="(//input[@id='address2'])[1]")}) 
		private WebElement enterVTAddress2;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]"),
			@FindBy(xpath="(//input[@type='text'])[5]")}) 
		private WebElement enterVTCountry;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]"),
			@FindBy(xpath="(//input[@type='text'])[6]")}) 
		private WebElement enterVTState;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]"),
			@FindBy(xpath="(//input[@type='text'])[7]")}) 
		private WebElement enterVTCity;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='pinCode']"),
			@FindBy(xpath="//input[@placeholder='Enter Pin code']")}) 
		private WebElement enterVTPincode;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[5]"),
			@FindBy(xpath="(//input[@type='text'])[9]")}) 
		private WebElement enterVTTerritory;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='firstName'])[2]"),
			@FindBy(xpath="(//input[@placeholder='Enter first name'])[2]")}) 
		private WebElement enterCGFirstName;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='lastName'])[2]"),
			@FindBy(xpath="(//input[@placeholder='Enter last name'])[2]")}) 
		private WebElement enterCGLastName;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[6]"),
			@FindBy(xpath="(//input[@type='text'])[12]")}) 
		private WebElement enterCGGender;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='email'])[2]"),
			@FindBy(xpath="(//input[@placeholder='Enter email Id'])[2]")}) 
		private WebElement enterCGEmailAdress;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='phoneNo'])[2]"),
			@FindBy(xpath="(//input[@placeholder='Enter Contact Number'])[2]")}) 
		private WebElement enterCGContactNo;
		
		@FindAll({
			@FindBy(xpath="//textarea[@formcontrolname='address1']"),
			@FindBy(xpath="//textarea[@formcontrolname='address1']")}) 
		private WebElement enterCGAddress;
		
		
//		<--- Assign Channel partner --->	
		
		@FindAll({
			@FindBy(xpath="//span[text()='Enquiries ']"),
			@FindBy(xpath="//a[@href='#/en/home/enquiries']")}) 
		private WebElement clickEnquiriesMenu;
		
		@FindAll({
			@FindBy(xpath="(//i[@class='fa fa-ellipsis-h'])[1]")}) 
		private WebElement clickNewEnquiry;
		
		@FindAll({
			@FindBy(xpath="(//a[text()='Assign  Partner'])[1]")}) 
		private WebElement clickNewAssignPartner;
		
		@FindAll({
			@FindBy(xpath="//select[@formcontrolname='channelPartnerId']")})
		private WebElement selectChannelPartner;

		@FindAll({
			@FindBy(xpath="//button[text()=' Assign channel partner ']")}) 
		private WebElement clickAssignChannelPartner;
		
		

		
//		<--- Veteran onboarding form --->	
		
		@FindAll({
			@FindBy(xpath="//a[text()='Onboard']")}) 
		private WebElement clickOnboardBtn;
		

		@FindAll({
			@FindBy(xpath="//input[@id='file-upload']")}) 
		private WebElement uploadVTProfilePicture;
		
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
			@FindBy(xpath="(//input[@type='text'])[1]")}) 
		private WebElement enterVTTitle;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='dateOfBirth']"),
			@FindBy(xpath="//input[@placeholder='Pick your date of birth']")}) 
		private WebElement enterVTDOB;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='emergencyContactNo']"),
			@FindBy(xpath="//input[@placeholder='Enter alternate contact Number']")}) 
		private WebElement enterVTAlternateNumber;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]"),
			@FindBy(xpath="(//input[@type='text'])[8]")}) 
		private WebElement enterVTGovtIdType;
		
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='govtId']"),
			@FindBy(xpath="//input[@placeholder='Enter govt.id no']")}) 
		private WebElement enterVTGovtIdNumber;
		
		@FindAll({
			@FindBy(xpath="//input[@id='govtProof']"),
			@FindBy(xpath="//input[@formcontrolname='govtProof']")}) 
		private WebElement uploadVTIdProof;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='height']"),
			@FindBy(xpath="//input[@placeholder='Height']")}) 
		private WebElement enterHight;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='weight']"),
			@FindBy(xpath="//input[@placeholder='Weight']")}) 
		private WebElement enterWeight;
		
		@FindAll({
			@FindBy(xpath="//select[@formcontrolname='bloodGroup']"),
			@FindBy(xpath="//select[@placeholder='Select blood group']")}) 
		private WebElement selectBloodGroup;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='smokeDuration']"),
			@FindBy(xpath="//input[@name='smokeDuration']")}) 
		private WebElement enterSmokeDuration;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='smokeCount']"),
			@FindBy(xpath="//input[@placeholder='cigarettes per day']")}) 
		private WebElement enterSmokingPerDay;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='drinkerDuration']"),
			@FindBy(xpath="//input[@name='drinkerDuration']")}) 
		private WebElement enterDrinkingDuration;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='drinkerCount']"),
			@FindBy(xpath="//input[@placeholder='Per week']")}) 
		private WebElement enterDrinkingPerWeek;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='celsius']"),
			@FindBy(xpath="//input[@placeholder='Enter Celsius']")}) 
		private WebElement enterCelsius;
		
		@CacheLookup
		@FindAll({
			@FindBy(xpath="//input[@placeholder='Enter blood glucose']"),
			@FindBy(xpath="(//input[@formcontrolname='value'])[1]")}) 
		private WebElement enterBloodGlucose;
		
		@CacheLookup
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
			@FindBy(xpath="(//input[@type='text'])[4]")}) 
		private WebElement enterMealTime;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='systolic']"),
			@FindBy(xpath="//input[@placeholder='Enter systolic']")}) 
		private WebElement enterSystolic;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='diastolic']"),
			@FindBy(xpath="//input[@placeholder='Enter diastolic']")}) 
		private WebElement enterDiastolic;
		
		@CacheLookup
		@FindAll({
			@FindBy(xpath="//input[@placeholder='Enter oxygen level(%)']"),
			@FindBy(xpath="(//input[@formcontrolname='value'])[2]")}) 
		private WebElement enterOxygenLevel;
		
		@CacheLookup
		@FindAll({
			@FindBy(xpath="//input[@placeholder='Enter BPM']"),
			@FindBy(xpath="(//input[@formcontrolname='value'])[3]")}) 
		private WebElement enterHeartRate;
		
		@CacheLookup
		@FindAll({
			@FindBy(xpath="//input[@placeholder='Enter BR rate per min']"),
			@FindBy(xpath="(//input[@formcontrolname='value'])[4]")}) 
		private WebElement enterRespiratoryRate;
		
		@FindAll({
			@FindBy(xpath="//span[text()='+ Add Comorbidities']")}) 
		private WebElement clickAddComorbidities;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
		private WebElement enterComorbidities;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='fromYear']"),
			@FindBy(xpath="//input[@placeholder='From Year']")}) 
		private WebElement enterFromYear;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='toYear']"),
			@FindBy(xpath="//input[@placeholder='To Year']")}) 
		private WebElement enterToYear;
		
		@FindAll({
			@FindBy(xpath="//textarea[@formcontrolname='historyOfComorbidity']"),
			@FindBy(xpath="//textarea[@placeholder='Enter history of comorbidities']")}) 
		private WebElement enterComorbiditiesHistory;
		
		@FindAll({
			@FindBy(xpath="//button[text()=' Save ']")}) 
		private WebElement SaveComorbidities;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='No'])[1]")}) 
		private WebElement clickAllergiesNo;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='No'])[2]")}) 
		private WebElement clickFallsNo;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='No'])[3]")}) 
		private WebElement clickHospitalizationNo;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='No'])[4]")}) 
		private WebElement clickHeartdiseaseNo;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='No'])[5]")}) 
		private WebElement clickkidneydiseaseNo;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='No'])[6]")}) 
		private WebElement clickCancerHistoryNo;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='Yes'])[1]")}) 
		private WebElement clickAllergiesYes;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='Yes'])[2]")}) 
		private WebElement clickFallsYes;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='Yes'])[3]")}) 
		private WebElement clickHospitalizationYes;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='Yes'])[4]")}) 
		private WebElement clickHeartdiseaseYes;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='Yes'])[5]")}) 
		private WebElement clickkidneydiseaseYes;
		
		@FindAll({
			@FindBy(xpath="(//label[text()='Yes'])[6]")})
		private WebElement clickCancerHistoryYes;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='when'])[1]"),
			@FindBy(xpath="(//input[@placeholder='When'])[1]")}) 
		private WebElement enterWhenHospitalization;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='where'])[1]"),
			@FindBy(xpath="(//input[@placeholder='Where'])[1]")}) 
		private WebElement enterWhereHospitalization;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='report']"),
			@FindBy(xpath="//input[@id='report']")}) 
		private WebElement uploadHospitalizationPDF;
		
		@FindAll({
			@FindBy(xpath="(//textarea[@formcontrolname='history'])[1]"),
			@FindBy(xpath="(//textarea[@placeholder='History'])[1]")}) 
		private WebElement enterHospitalizationHistory;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='when'])[2]"),
			@FindBy(xpath="(//input[@placeholder='When'])[2]")}) 
		private WebElement enterWhenHeartdisease;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='where'])[2]"),
			@FindBy(xpath="(//input[@placeholder='Where'])[2]")}) 
		private WebElement enterWhereHeartdisease;
		
		@FindAll({
			@FindBy(xpath="(//textarea[@formcontrolname='history'])[2]"),
			@FindBy(xpath="(//textarea[@placeholder='History'])[2]")}) 
		private WebElement enterHeartdiseaseHistory;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='when'])[3]"),
			@FindBy(xpath="(//input[@placeholder='When'])[3]")}) 
		private WebElement enterWhenkidneydisease;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='where'])[3]"),
			@FindBy(xpath="(//input[@placeholder='Where'])[3]")}) 
		private WebElement enterWherekidneydisease;
		
		@FindAll({
			@FindBy(xpath="(//textarea[@formcontrolname='history'])[3]"),
			@FindBy(xpath="(//textarea[@placeholder='History'])[3]")}) 
		private WebElement enterkidneydiseaseHistory;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='when'])[3]"),
			@FindBy(xpath="(//input[@placeholder='When'])[3]")}) 
		private WebElement enterWhenCancerHistory;
		
		@FindAll({
			@FindBy(xpath="(//input[@formcontrolname='where'])[3]"),
			@FindBy(xpath="(//input[@placeholder='Where'])[3]")}) 
		private WebElement enterWhereCancerHistory;
		
		@FindAll({
			@FindBy(xpath="//span[text()='+ Add Prescription']")}) 
		private WebElement clickAddPrescription;
		

		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='prescribedBy']"),
			@FindBy(xpath="//input[@placeholder='Enter Doctor name']")}) 
		private WebElement enterPrescribedDoctorName;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='brand']"),
			@FindBy(xpath="//input[@placeholder='Medicine Name']")}) 
		private WebElement enterMedicineName;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='dosage']")}) 
		private WebElement enterDosage;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
		private WebElement selectGram;
		
		@FindAll({
			@FindBy(xpath="(//span[text()='Morning'])[1]")}) 
		private WebElement clickMorning;
		
		@FindAll({
			@FindBy(xpath="(//span[text()='Afternoon'])[1]")}) 
		private WebElement clickAfternoon;
		
		@FindAll({
			@FindBy(xpath="(//span[text()='Evening'])[1]")}) 
		private WebElement clickEvening;
		
		@FindAll({
			@FindBy(xpath="(//span[text()='Night'])[1]")}) 
		private WebElement clickNight;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='fromWhen']"),
			@FindBy(xpath="//input[@placeholder='Enter MM/YYYY']")}) 
		private WebElement enterFromYearMedicine;
		
		@FindAll({
			@FindBy(xpath="//label[text()='Before Food']")}) 
		private WebElement clickBeforeFood;
		
		@FindAll({
			@FindBy(xpath="//button[text()=' Save ']")}) 
		private WebElement ClickSaveMedicines;
		
		@FindAll({
			@FindBy(xpath="//span[text()='+ Add Health Insurance']")}) 
		private WebElement ClickAddHealthInsurance;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
			@FindBy(xpath="(//input[@type='text'])[1]")}) 
		private WebElement enterInsuranceName;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='policyNumber']"),
			@FindBy(xpath="//input[@placeholder='Enter policy no']")}) 
		private WebElement enterPolicyNumber;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='sumAssure']"),
			@FindBy(xpath="//input[@placeholder='Enter sum']")}) 
		private WebElement enterSumAssured;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='email']"),
			@FindBy(xpath="//input[@placeholder='Enter email address']")}) 
		private WebElement enterInsuranceEmail;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='copyOfPolicy']"),
			@FindBy(xpath="(//input[@type='file'])[1]")}) 
		private WebElement enterInsuranceCopy;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='policyExpiryDate']"),
			@FindBy(xpath="//input[@placeholder='Policy expiry date']")}) 
		private WebElement enterInsuranceExpiryDate;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='phoneNo']"),
			@FindBy(xpath="//input[@placeholder='Enter Contact Number']")}) 
		private WebElement enterInsurancePhoneNo;
		
		@FindAll({
			@FindBy(xpath="//textarea[@formcontrolname='insuranceAddress']"),
			@FindBy(xpath="//textarea[@placeholder='Enter address']")}) 
		private WebElement enterInsuranceAddress;
		
		@FindAll({
			@FindBy(xpath="//button[text()=' Save ']")}) 
		private WebElement ClickSaveInsurance;
		

		@FindAll({
			@FindBy(xpath="//i[@class='ti-marker-alt fs-16']")}) 
		private WebElement ClickAddFamilymember;
		
		@FindAll({
			@FindBy(xpath="//input[@id='file-upload']"),
			@FindBy(xpath="(//input[@type='file'])[1]")}) 
		private WebElement uploadCGProfilePicture;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
			@FindBy(xpath="(//input[@type='text'])[1]")}) 
		private WebElement enterCGTitle;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]"),
			@FindBy(xpath="(//input[@type='text'])[8]")}) 
		private WebElement enterCGGovtIdType;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='proofId']"),
			@FindBy(xpath="//input[@id='proofId']")}) 
		private WebElement enterCGGovtIdnumber;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='proofImage']"),
			@FindBy(xpath="(//input[@type='file'])[2]")}) 
		private WebElement uploadCGProofId;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='dateOfBirth']"),
			@FindBy(xpath="//input[@placeholder='Pick your date of birth']")}) 
		private WebElement enterCGDOB;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='policeStation']"),
			@FindBy(xpath="//input[@placeholder='Police station']")}) 
		private WebElement enterPoliceStationNo;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='stationPin']"),
			@FindBy(xpath="//input[@placeholder='Pin code']")}) 
		private WebElement enterStationPincode;
		
		@FindAll({
			@FindBy(xpath="//input[@formcontrolname='alternatePhoneNo']"),
			@FindBy(xpath="//input[@placeholder='Enter Alternate Number']")}) 
		private WebElement enterCGAlternateContactNo;
		
		public WebElement getEnterCGAlternateContactNo() {
			return enterCGAlternateContactNo;
		}

		@FindAll({
			@FindBy(xpath="//button[text()=' Save ']")}) 
		private WebElement ClickSaveFamilyMember;
		
		@FindAll({
			@FindBy(xpath="//span[text()='+ ADD Devices']")}) 
		private WebElement ClickAddDevices;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]"),
			@FindBy(xpath="(//input[@type='text'])[1]")}) 
		private WebElement enterDepartmentName;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]"),
			@FindBy(xpath="(//input[@type='text'])[2]")}) 
		private WebElement enterUnitName;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]"),
			@FindBy(xpath="(//input[@type='text'])[3]")}) 
		private WebElement enterRoomName;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]"),
			@FindBy(xpath="(//input[@type='text'])[4]")}) 
		private WebElement enterSmartPillBoxId;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[5]"),
			@FindBy(xpath="(//input[@type='text'])[5]")}) 
		private WebElement enterFalldevicesId;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[6]"),
			@FindBy(xpath="(//input[@type='text'])[6]")}) 
		private WebElement enterVitaldevicesId;
		
		
		@FindAll({
			@FindBy(xpath="//a[text()='Assign Doctor']")}) 
		private WebElement clickAssignDoctorBtn1;
		
		@FindAll({
			@FindBy(xpath="//a[text()='Verify & Approve']")}) 
		private WebElement clickVerifyAndApprove;
		
		@FindAll({
			@FindBy(xpath="(//input[@type='range'])[1]")}) 
		private WebElement enterMedicalScore;
		
		@FindAll({
			@FindBy(xpath="(//input[@type='range'])[2]")}) 
		private WebElement enterRiskScore;
		
		@FindAll({
			@FindBy(xpath="//button[text()=' Submit ']")}) 
		private WebElement clickSubmitMedicalScore;
		
		
//		<--- Doctor & Caretaker Assigns --->
		
		@FindAll({
			@FindBy(xpath="//span[text()='Veterans ']")}) 
		private WebElement clickVeteransMenu;
		
		@FindAll({
			@FindBy(xpath="(//i[@class='fa fa-ellipsis-h'])[1]")}) 
		private WebElement clickNewVeteran;
		
		@FindAll({
			@FindBy(xpath="//a[text()=' Assign Caretaker ']")}) 
		private WebElement clickAssignCaretakerBtn;
		
		@FindAll({
			@FindBy(xpath="//a[text()=' Assign Doctor ']")}) 
		private WebElement clickAssignDoctorBtn;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
		private WebElement enterAssignCaretakerName;
		
		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")})
		private WebElement enterAssignDoctorName;
		
		@FindAll({
			@FindBy(xpath="(//button[text()=' Assign '])[2]")}) 
		private WebElement clickAssignDoctor;
		
		@FindAll({
			@FindBy(xpath="(//button[text()=' Assign '])[1]")}) 
		private WebElement clickAssignCaretaker;
		
		public WebElement getClickVeteransMenu() {
			return clickVeteransMenu;
		}

		public WebElement getClickNewVeteran() {
			return clickNewVeteran;
		}

		public WebElement getClickAssignCaretakerBtn() {
			return clickAssignCaretakerBtn;
		}

		public WebElement getClickAssignDoctorBtn() {
			return clickAssignDoctorBtn;
		}

		public WebElement getEnterAssignCaretakerName() {
			return enterAssignCaretakerName;
		}

		public WebElement getEnterAssignDoctorName() {
			return enterAssignDoctorName;
		}

		public WebElement getClickAssignDoctor() {
			return clickAssignDoctor;
		}

		public WebElement getClickAssignCaretaker() {
			return clickAssignCaretaker;
		}

		public WebElement getClickVerifyAndApprove() {
			return clickVerifyAndApprove;
		}

		public WebElement getEnterMedicalScore() {
			return enterMedicalScore;
		}

		public WebElement getEnterRiskScore() {
			return enterRiskScore;
		}

		public WebElement getClickSubmitMedicalScore() {
			return clickSubmitMedicalScore;
		}

		public WebElement getClickAssignDoctorBtn1() {
			return clickAssignDoctorBtn1;
		}

		public WebElement getEnterDoctorName() {
			return enterDoctorName;
		}

		public WebElement getClickAssignDoctorBtn2() {
			return clickAssignDoctorBtn2;
		}

		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
		private WebElement enterDoctorName;
		
		@FindAll({
			@FindBy(xpath="//button[text()=' Assign Doctor ']")}) 
		private WebElement clickAssignDoctorBtn2;
		
		@FindAll({
			@FindBy(xpath="//button[text()=' Save ']")})
		private WebElement ClickSaveDevices;
		
		
		public WebElement getClickAddPrescription() {
			return clickAddPrescription;
		}
		
		public WebElement getClickOnboardBtn() {
			return clickOnboardBtn;
		}
		
		public WebElement getUploadVTProfilePicture() {
			return uploadVTProfilePicture;
		}

		public WebElement getEnterVTTitle() {
			return enterVTTitle;
		}

		public WebElement getEnterVTDOB() {
			return enterVTDOB;
		}

		public WebElement getEnterVTAlternateNumber() {
			return enterVTAlternateNumber;
		}

		public WebElement getEnterVTGovtIdType() {
			return enterVTGovtIdType;
		}

		public WebElement getEnterVTGovtIdNumber() {
			return enterVTGovtIdNumber;
		}

		public WebElement getUploadVTIdProof() {
			return uploadVTIdProof;
		}

		public WebElement getEnterHight() {
			return enterHight;
		}

		public WebElement getEnterWeight() {
			return enterWeight;
		}

		public WebElement getSelectBloodGroup() {
			return selectBloodGroup;
		}

		public WebElement getEnterSmokeDuration() {
			return enterSmokeDuration;
		}

		public WebElement getEnterSmokingPerDay() {
			return enterSmokingPerDay;
		}

		public WebElement getEnterDrinkingDuration() {
			return enterDrinkingDuration;
		}

		public WebElement getEnterDrinkingPerWeek() {
			return enterDrinkingPerWeek;
		}

		public WebElement getEnterCelsius() {
			return enterCelsius;
		}

		public WebElement getEnterBloodGlucose() {
			return enterBloodGlucose;
		}

		public WebElement getEnterMealTime() {
			return enterMealTime;
		}

		public WebElement getEnterSystolic() {
			return enterSystolic;
		}

		public WebElement getEnterDiastolic() {
			return enterDiastolic;
		}

		public WebElement getEnterOxygenLevel() {
			return enterOxygenLevel;
		}

		public WebElement getEnterHeartRate() {
			return enterHeartRate;
		}

		public WebElement getEnterRespiratoryRate() {
			return enterRespiratoryRate;
		}

		public WebElement getClickAddComorbidities() {
			return clickAddComorbidities;
		}

		public WebElement getEnterComorbidities() {
			return enterComorbidities;
		}

		public WebElement getEnterFromYear() {
			return enterFromYear;
		}

		public WebElement getEnterToYear() {
			return enterToYear;
		}

		public WebElement getEnterComorbiditiesHistory() {
			return enterComorbiditiesHistory;
		}

		public WebElement getSaveComorbidities() {
			return SaveComorbidities;
		}

		public WebElement getClickAllergiesNo() {
			return clickAllergiesNo;
		}

		public WebElement getClickFallsNo() {
			return clickFallsNo;
		}

		public WebElement getClickHospitalizationNo() {
			return clickHospitalizationNo;
		}

		public WebElement getClickHeartdiseaseNo() {
			return clickHeartdiseaseNo;
		}

		public WebElement getClickkidneydiseaseNo() {
			return clickkidneydiseaseNo;
		}

		public WebElement getClickCancerHistoryNo() {
			return clickCancerHistoryNo;
		}

		public WebElement getClickAllergiesYes() {
			return clickAllergiesYes;
		}

		public WebElement getClickFallsYes() {
			return clickFallsYes;
		}

		public WebElement getClickHospitalizationYes() {
			return clickHospitalizationYes;
		}

		public WebElement getClickHeartdiseaseYes() {
			return clickHeartdiseaseYes;
		}

		public WebElement getClickkidneydiseaseYes() {
			return clickkidneydiseaseYes;
		}

		public WebElement getClickCancerHistoryYes() {
			return clickCancerHistoryYes;
		}

		public WebElement getEnterWhenHospitalization() {
			return enterWhenHospitalization;
		}

		public WebElement getEnterWhereHospitalization() {
			return enterWhereHospitalization;
		}

		public WebElement getUploadHospitalizationPDF() {
			return uploadHospitalizationPDF;
		}

		public WebElement getEnterHospitalizationHistory() {
			return enterHospitalizationHistory;
		}

		public WebElement getEnterWhenHeartdisease() {
			return enterWhenHeartdisease;
		}

		public WebElement getEnterWhereHeartdisease() {
			return enterWhereHeartdisease;
		}

		public WebElement getEnterHeartdiseaseHistory() {
			return enterHeartdiseaseHistory;
		}

		public WebElement getEnterWhenkidneydisease() {
			return enterWhenkidneydisease;
		}

		public WebElement getEnterWherekidneydisease() {
			return enterWherekidneydisease;
		}

		public WebElement getEnterkidneydiseaseHistory() {
			return enterkidneydiseaseHistory;
		}

		public WebElement getEnterWhenCancerHistory() {
			return enterWhenCancerHistory;
		}

		public WebElement getEnterWhereCancerHistory() {
			return enterWhereCancerHistory;
		}

		public WebElement getEnterPrescribedDoctorName() {
			return enterPrescribedDoctorName;
		}

		public WebElement getEnterMedicineName() {
			return enterMedicineName;
		}

		public WebElement getEnterDosage() {
			return enterDosage;
		}

		public WebElement getSelectGram() {
			return selectGram;
		}

		public WebElement getClickMorning() {
			return clickMorning;
		}

		public WebElement getClickAfternoon() {
			return clickAfternoon;
		}

		public WebElement getClickEvening() {
			return clickEvening;
		}

		public WebElement getClickNight() {
			return clickNight;
		}

		public WebElement getEnterFromYearMedicine() {
			return enterFromYearMedicine;
		}

		public WebElement getClickBeforeFood() {
			return clickBeforeFood;
		}

		public WebElement getClickSaveMedicines() {
			return ClickSaveMedicines;
		}

		public WebElement getClickAddHealthInsurance() {
			return ClickAddHealthInsurance;
		}

		public WebElement getEnterInsuranceName() {
			return enterInsuranceName;
		}

		public WebElement getEnterPolicyNumber() {
			return enterPolicyNumber;
		}

		public WebElement getEnterSumAssured() {
			return enterSumAssured;
		}

		public WebElement getEnterInsuranceEmail() {
			return enterInsuranceEmail;
		}

		public WebElement getEnterInsuranceCopy() {
			return enterInsuranceCopy;
		}

		public WebElement getEnterInsuranceExpiryDate() {
			return enterInsuranceExpiryDate;
		}

		public WebElement getEnterInsurancePhoneNo() {
			return enterInsurancePhoneNo;
		}

		public WebElement getEnterInsuranceAddress() {
			return enterInsuranceAddress;
		}

		public WebElement getClickSaveInsurance() {
			return ClickSaveInsurance;
		}

		public WebElement getClickAddFamilymember() {
			return ClickAddFamilymember;
		}

		public WebElement getUploadCGProfilePicture() {
			return uploadCGProfilePicture;
		}

		public WebElement getEnterCGTitle() {
			return enterCGTitle;
		}

		public WebElement getEnterCGGovtIdType() {
			return enterCGGovtIdType;
		}

		public WebElement getEnterCGGovtIdnumber() {
			return enterCGGovtIdnumber;
		}

		public WebElement getUploadCGProofId() {
			return uploadCGProofId;
		}

		public WebElement getEnterCGDOB() {
			return enterCGDOB;
		}

		public WebElement getEnterPoliceStationNo() {
			return enterPoliceStationNo;
		}

		public WebElement getEnterStationPincode() {
			return enterStationPincode;
		}

		public WebElement getClickSaveFamilyMember() {
			return ClickSaveFamilyMember;
		}

		public WebElement getClickAddDevices() {
			return ClickAddDevices;
		}

		public WebElement getEnterDepartmentName() {
			return enterDepartmentName;
		}

		public WebElement getEnterUnitName() {
			return enterUnitName;
		}

		public WebElement getEnterRoomName() {
			return enterRoomName;
		}

		public WebElement getEnterSmartPillBoxId() {
			return enterSmartPillBoxId;
		}

		public WebElement getEnterFalldevicesId() {
			return enterFalldevicesId;
		}

		public WebElement getEnterVitaldevicesId() {
			return enterVitaldevicesId;
		}

		public WebElement getClickSaveDevices() {
			return ClickSaveDevices;
		}

		public WebElement getClickEnquiriesMenu() {
			return clickEnquiriesMenu;
		}

		public WebElement getClickNewEnquiry() {
			return clickNewEnquiry;
		}

		public WebElement getClickNewAssignPartner() {
			return clickNewAssignPartner;
		}

		public WebElement getSelectChannelPartner() {
			return selectChannelPartner;
		}

		public WebElement getClickAssignChannelPartner() {
			return clickAssignChannelPartner;
		}

		public WebElement getEnterVTFirstName() {
			return enterVTFirstName;
		}

		public WebElement getEnterVTLastName() {
			return enterVTLastName;
		}

		public WebElement getEnterVTGender() {
			return enterVTGender;
		}

		public WebElement getEnterVTEmailAdress() {
			return enterVTEmailAdress;
		}

		public WebElement getEnterVTContactNo() {
			return enterVTContactNo;
		}

		public WebElement getEnterVTAddress1() {
			return enterVTAddress1;
		}

		public WebElement getEnterVTAddress2() {
			return enterVTAddress2;
		}

		public WebElement getEnterVTCountry() {
			return enterVTCountry;
		}

		public WebElement getEnterVTState() {
			return enterVTState;
		}

		public WebElement getEnterVTCity() {
			return enterVTCity;
		}

		public WebElement getEnterVTPincode() {
			return enterVTPincode;
		}

		public WebElement getEnterVTTerritory() {
			return enterVTTerritory;
		}

		public WebElement getEnterCGFirstName() {
			return enterCGFirstName;
		}

		public WebElement getEnterCGLastName() {
			return enterCGLastName;
		}

		public WebElement getEnterCGGender() {
			return enterCGGender;
		}

		public WebElement getEnterCGEmailAdress() {
			return enterCGEmailAdress;
		}

		public WebElement getEnterCGContactNo() {
			return enterCGContactNo;
		}

		public WebElement getEnterCGAddress() {
			return enterCGAddress;
		}

		public WebElement getEnterCGRelationship() {
			return enterCGRelationship;
		}

		public WebElement getEnterNotes() {
			return enterNotes;
		}

		@FindAll({
			@FindBy(xpath="(//input[@aria-autocomplete='list'])[7]"),
			@FindBy(xpath="(//input[@type='text'])[14]")}) 
		private WebElement enterCGRelationship;
		
		@FindAll({
			@FindBy(xpath="//textarea[@formcontrolname='notes']"),
			@FindBy(xpath="//textarea[@placeholder='Notes']")}) 
		private WebElement enterNotes;
		
		
}
