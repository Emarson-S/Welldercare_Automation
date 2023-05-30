package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartPillBox extends BaseClass {
	
	
	public SmartPillBox() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="//span[text()='Medicine Request ']")}) 
	private WebElement clickMedicineRequest;
	
	@FindAll({
		@FindBy(xpath="(//i[@class='fa fa-ellipsis-h'])[1]")}) 
	private WebElement clickNewMedicinesRequest;
	
	@FindAll({
		@FindBy(xpath="(//i[@class='ti-eye me-2'])[1]")}) 
	private WebElement clickViewMedicines;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Accept']")}) 
	private WebElement clickAcceptMedicines;
	
	@FindAll({
		@FindBy(xpath="//a[text()='Pill entry ']")}) 
	private WebElement clickPillEntry;

	
	@FindAll({
		@FindBy(xpath="//button[text()='Click and Refill the box']")}) 
	private WebElement clickRefillBtn;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='expiryDate']")}) 
	private WebElement enterExpiryDate;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='batchNo']")}) 
	private WebElement enterBatchNumber;
	
	@FindAll({
		@FindBy(xpath="//input[@formcontrolname='days']")}) 
	private WebElement enterNumberOfDays;
	
	@FindAll({
		@FindBy(xpath="//button[text()='Save']")}) 
	private WebElement clickPillSaveBtn;

	@FindAll({
		@FindBy(xpath="//button[text()='Approve']")}) 
	private WebElement clickPillApproveBtn;

	
	@FindAll({
		@FindBy(xpath="//table[@formarrayname='pillEntryDetails']")}) 
	private WebElement findPillTable;

	
	
	public WebElement getFindPillTable() {
		return findPillTable;
	}

	public WebElement getClickMedicineRequest() {
		return clickMedicineRequest;
	}

	public WebElement getClickNewMedicinesRequest() {
		return clickNewMedicinesRequest;
	}

	public WebElement getClickViewMedicines() {
		return clickViewMedicines;
	}

	public WebElement getClickAcceptMedicines() {
		return clickAcceptMedicines;
	}

	public WebElement getClickPillEntry() {
		return clickPillEntry;
	}

	public WebElement getClickRefillBtn() {
		return clickRefillBtn;
	}

	public WebElement getEnterExpiryDate() {
		return enterExpiryDate;
	}

	public WebElement getEnterBatchNumber() {
		return enterBatchNumber;
	}

	public WebElement getEnterNumberOfDays() {
		return enterNumberOfDays;
	}

	public WebElement getClickPillSaveBtn() {
		return clickPillSaveBtn;
	}

	public WebElement getClickPillApproveBtn() {
		return clickPillApproveBtn;
	}

}
