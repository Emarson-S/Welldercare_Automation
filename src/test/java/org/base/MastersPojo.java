package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MastersPojo extends BaseClass{
	
	public MastersPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindAll({
		@FindBy(xpath="//span[text()='Masters ']")}) 
	private WebElement clickMasters;
	
	@FindAll({
		@FindBy(xpath="//i[@class='fa fa-plus']")}) 
	private WebElement clickAddMasterBtn;
	
	
	@FindAll({
		@FindBy(xpath="(//button[@class='btn-edit-well ng-star-inserted'])[1]")}) 
	private WebElement clickEditBtn;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Save']")}) 
	private WebElement clickSaveBtn;
	
	
	// <----  Insurance Company details --->
	


	@FindAll({
		@FindBy(xpath="//a[text()=' Insurance companies ']")}) 
	private WebElement clickInsuranceCompanies;
		
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='insuranceCompanyCode']")}) 
	private WebElement enterInsuranceCode;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='insuranceCompanyName']")}) 
	private WebElement enterInsuranceCompanyName;
	
	
	// < ---- Specialty ---->
	
	@FindAll({
		@FindBy(xpath="//a[text()=' Specialties ']")}) 
	private WebElement clickSpecialties;


	
	public WebElement getClickSaveBtn() {
		return clickSaveBtn;
	}
	
	public WebElement getClickMasters() {
		return clickMasters;
	}


	public WebElement getClickAddMasterBtn() {
		return clickAddMasterBtn;
	}


	public WebElement getClickEditBtn() {
		return clickEditBtn;
	}


	public WebElement getClickInsuranceCompanies() {
		return clickInsuranceCompanies;
	}


	public WebElement getEnterInsuranceCode() {
		return enterInsuranceCode;
	}


	public WebElement getEnterInsuranceCompanyName() {
		return enterInsuranceCompanyName;
	}


	public WebElement getClickSpecialties() {
		return clickSpecialties;
	}
	
	
	

}
