package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentsPojo extends BaseClass {
	
	public AppointmentsPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
// < ---- Create Appointments page --->	
	
	
	@FindAll({
		@FindBy(xpath="//span[text()='Calendar ']"),
		@FindBy(xpath="//a[@href='#/en/home/calendar']")}) 
	private WebElement clickCalendar;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Create Appointment']"),
		@FindBy(xpath="//button[@title='Create Appointment']")}) 
	private WebElement clickcreateAppointmenBtn;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
	private WebElement enterVeteranName;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")}) 
	private WebElement enterAppointmentType;

	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[3]")}) 
	private WebElement enterAppointmentMode;
	
	@FindAll({
		@FindBy(xpath="//input[@placeholder='DD-MM-YYYY']")}) 
	private WebElement enterAppointmentDate;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='time']")}) 
	private WebElement clickTimePicker;
	
	@FindAll({
		@FindBy(xpath="//input[@placeholder='HH']")}) 
	private WebElement enterhour;
	
	@FindAll({
		@FindBy(xpath="//input[@placeholder='MM']")}) 
	private WebElement enterMin;

	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]")}) 
	private WebElement enterAppointmentDuration;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Book Appointment']")}) 
	private WebElement clickBookAppointment;
	
	
//  < --- Complete appointments -- >	
	
	@FindAll({
		@FindBy(xpath="//span[text()='Appointments ']"),
		@FindBy(xpath="//a[@href='#/en/home/appointment/upcoming']")}) 
	private WebElement clickAppointments;
	
	
	@FindAll({
		@FindBy(xpath="(//em[@class='ti-eye'])[1]")}) 
	private WebElement clickUpcomingAppointment;
	
	@FindAll({
		@FindBy(xpath="//h4[text()='START ']")}) 
	private WebElement clickStartBtn;
	
	@FindAll({
		@FindBy(xpath="//textarea[@formcontrolname='doctorNote']")}) 
	private WebElement enterDoctorNotes;
	
	@FindAll({
		@FindBy(xpath="//em[@class='mdi mdi-plus']")}) 
	private WebElement clickAddMedicines;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")}) 
	private WebElement enterMedicineName;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='duration']")}) 
	private WebElement enterNoOfDays;
	
	@FindAll({
		@FindBy(xpath="//textarea[@formcontrolname='instructions']")}) 
	private WebElement enterInstructins;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")}) 
	private WebElement enterLabTest;
	
	@FindAll({
		@FindBy(xpath="//button[text()=' Update Appointment ']")}) 
	private WebElement clickUpdateAppointment;
	
	@FindAll({
		@FindBy(xpath="//label[text()='After Food']")}) 
	private WebElement clickAfterFood;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Accept']")}) 
	private WebElement clickAceptBtn;
	

	
	
//  < --- Requested Appointments --- >
	
	@FindAll({
		@FindBy(xpath="//button[text()=' Requested ']")}) 
	private WebElement clickRequestedBtn;
	
	@FindAll({
		@FindBy(xpath="//button[text()=' Request Appointment ']")}) 
	private WebElement clickRequestAppointmentBtn;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[4]")}) 
	private WebElement enterRequestDoctorName;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[5]")}) 
	private WebElement enterRequestAppointmentType;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[6]")}) 
	private WebElement enterRequestAppointmentMode;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='date']")}) 
	private WebElement enterRequestAppointmentDate;
	
	@FindAll({
		@FindBy(xpath="(//input[@aria-autocomplete='list'])[7]")}) 
	private WebElement enterRequestAppointmentDuration;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Request Appointment']")}) 
	private WebElement clickSubmitRequestAppointment;

	
// <--- Live Request --->
	
	@FindAll({
		@FindBy(xpath="//h4[text()='Emergency']")}) 
	private WebElement clickEmergencyBtn;
	
	@FindAll({
		@FindBy(xpath="//span[text()='Live Requests ']")}) 
	private WebElement clickLiveRequestMenu;
	
	@FindAll({
		@FindBy(xpath="(//i[@class='ti-eye me-4'])[1]")}) 
	private WebElement clickNewLiveRequest;
	
	@FindAll({
		@FindBy(xpath="//a[text()='Attend']")}) 
	private WebElement ViewLiveRequest;
	
	@FindAll({
		@FindBy(xpath="//button[text()=' Attend ']")}) 
	private WebElement clickAttendBtn;
	
	@FindAll({
		@FindBy(xpath="//button[text()=' False Alarm ']")}) 
	private WebElement clickFalseAlarmBtn;
	
	
	
	// <---- Request appointment reshcedule>
	
	
	@FindAll({
		@FindBy(xpath="//button[text()=' Requested ']")}) 
	private WebElement clickRequestFilterBtn;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='date']")}) 
	private WebElement  enterRescheduleDate;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='time']")}) 
	private WebElement  enterRescheduleTime;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Accept']")}) 
	private WebElement  clickAcceptRequestAppt;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Accept']")}) 
	private WebElement  clickRejectRequestAppt;
	
	
	// <--- Appointment Cancelled --->
	
	@FindAll({
		@FindBy(xpath="//button[text()='Cancel Appointment']")}) 
	private WebElement  clickCancelAppointment;
	
	@FindAll({
		@FindBy(xpath="//textarea[@placeholder='Enter the reason']")}) 
	private WebElement  enterCancelApptReason;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Yes, Cancel']")}) 
	private WebElement  clickCancel;
	
	@FindAll({
		@FindBy(xpath="//button[text()='OK']")}) 
	private WebElement  clickOKbtn;	
		
	public WebElement getClickOKbtn() {
		return clickOKbtn;
	}

	public WebElement getClickCancelAppointment() {
		return clickCancelAppointment;
	}

	public WebElement getEnterCancelApptReason() {
		return enterCancelApptReason;
	}

	public WebElement getClickCancel() {
		return clickCancel;
	}

	public WebElement getClickFalseAlarmBtn() {
		return clickFalseAlarmBtn;
	}

	public WebElement getClickRequestFilterBtn() {
		return clickRequestFilterBtn;
	}

	public WebElement getEnterRescheduleDate() {
		return enterRescheduleDate;
	}

	public WebElement getEnterRescheduleTime() {
		return enterRescheduleTime;
	}

	public WebElement getClickAcceptRequestAppt() {
		return clickAcceptRequestAppt;
	}

	public WebElement getClickRejectRequestAppt() {
		return clickRejectRequestAppt;
	}

	public WebElement getClickEmergencyBtn() {
		return clickEmergencyBtn;
	}

	public WebElement getClickLiveRequestMenu() {
		return clickLiveRequestMenu;
	}

	public WebElement getClickNewLiveRequest() {
		return clickNewLiveRequest;
	}

	public WebElement getViewLiveRequest() {
		return ViewLiveRequest;
	}

	public WebElement getClickAttendBtn() {
		return clickAttendBtn;
	}

	public WebElement getClickAceptBtn() {
		return clickAceptBtn;
	}

	public WebElement getClickRequestedBtn() {
		return clickRequestedBtn;
	}

	
	public WebElement getClickRequestAppointmentBtn() {
		return clickRequestAppointmentBtn;
	}

	public WebElement getEnterRequestDoctorName() {
		return enterRequestDoctorName;
	}

	public WebElement getEnterRequestAppointmentType() {
		return enterRequestAppointmentType;
	}

	public WebElement getEnterRequestAppointmentMode() {
		return enterRequestAppointmentMode;
	}

	public WebElement getEnterRequestAppointmentDate() {
		return enterRequestAppointmentDate;
	}

	public WebElement getEnterRequestAppointmentDuration() {
		return enterRequestAppointmentDuration;
	}

	public WebElement getClickSubmitRequestAppointment() {
		return clickSubmitRequestAppointment;
	}

	public WebElement getClickAppointments() {
		return clickAppointments;
	}

	public WebElement getClickUpcomingAppointment() {
		return clickUpcomingAppointment;
	}

	public WebElement getClickStartBtn() {
		return clickStartBtn;
	}

	public WebElement getEnterDoctorNotes() {
		return enterDoctorNotes;
	}

	public WebElement getClickAddMedicines() {
		return clickAddMedicines;
	}

	public WebElement getEnterMedicineName() {
		return enterMedicineName;
	}

	public WebElement getEnterNoOfDays() {
		return enterNoOfDays;
	}

	public WebElement getEnterInstructins() {
		return enterInstructins;
	}

	public WebElement getEnterLabTest() {
		return enterLabTest;
	}

	public WebElement getClickUpdateAppointment() {
		return clickUpdateAppointment;
	}

	public WebElement getClickAfterFood() {
		return clickAfterFood;
	}

	public WebElement getClickCalendar() {
		return clickCalendar;
	}

	public WebElement getClickcreateAppointmenBtn() {
		return clickcreateAppointmenBtn;
	}

	public WebElement getEnterVeteranName() {
		return enterVeteranName;
	}

	public WebElement getEnterAppointmentType() {
		return enterAppointmentType;
	}

	public WebElement getEnterAppointmentMode() {
		return enterAppointmentMode;
	}

	public WebElement getEnterAppointmentDate() {
		return enterAppointmentDate;
	}

	public WebElement getClickTimePicker() {
		return clickTimePicker;
	}

	public WebElement getEnterhour() {
		return enterhour;
	}

	public WebElement getEnterMin() {
		return enterMin;
	}

	public WebElement getEnterAppointmentDuration() {
		return enterAppointmentDuration;
	}

	public WebElement getClickBookAppointment() {
		return clickBookAppointment;
	}
	
	
	
}
