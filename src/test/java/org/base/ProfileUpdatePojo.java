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
		@FindBy(xpath="//a[text()=' Profile']")}) 
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
	private WebElement enterGovtIdType;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='pinCode']")}) 
	private WebElement enterPinCode;
	



	public WebElement getClickProfile() {
		return clickProfile;
	}


	public WebElement getEnterTitle() {
		return enterTitle;
	}


	public WebElement getEnterFirstName() {
		return enterFirstName;
	}


	public WebElement getEnterLastName() {
		return enterLastName;
	}
	
	
//	<---- Doctor Profile update ---->
	
	
	
}
