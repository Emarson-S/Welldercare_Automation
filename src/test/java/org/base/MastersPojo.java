package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MastersPojo extends BaseClass {

	public MastersPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//span[text()='Masters ']") })
	private WebElement clickMasters;

	@FindAll({ @FindBy(xpath = "//i[@class='fa fa-plus']") })
	private WebElement clickAddMasterBtn;

	@CacheLookup
	@FindAll({ @FindBy(xpath = "(//button[@class='btn-edit-well ng-star-inserted'])[1]") })
	private WebElement clickEditBtn;

	@FindAll({ @FindBy(xpath = "//button[text()='Save']") })
	private WebElement clickSaveBtn;

	@FindAll({ @FindBy(xpath = "//button[text()='Cancel']") })
	private WebElement clickCancelBtn;
	
	
	//<----------------- Special Skills ------------------>
	

	@FindAll({ @FindBy(xpath = "//a[text()=' Special Skills ']") })
	private WebElement clickSpecialSkills;
	
	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='specialSkillName']") })
	private WebElement clickSpecialSkillName;
	
	
	// <-----------Medicine Brands Name -------------->
	
	
	@FindAll({ @FindBy(xpath = "//a[text()=' Medicines Brands ']") })
	private WebElement clickMedicinesBrands;

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='brandName']") })
	private WebElement clickBrandName;

	
	// <------------ Medicine ---------------->

	@CacheLookup
	@FindAll({ @FindBy(xpath = "//a[text()=' Medicine ']"),
    @FindBy(xpath="//a[@class='active']") })
	private WebElement clickMedicine;
	
	@CacheLookup
	@FindAll({ @FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]") })
	private WebElement clickBrand;

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='medicineName']") })
	private WebElement clickMedicineName;

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='dosage']") })
	private WebElement clickDosage;

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='unit']") })
	private WebElement clickUnit;
	
	
	//<---------- Degree ----------->

	@CacheLookup
	@FindAll({ @FindBy(xpath = "//a[text()=' Degree ']") })
	private WebElement clickDegree;
	

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='degreeCode']") })
	private WebElement clickDegreeCode;
	

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='description']") })
	private WebElement clickDegreeDescription;
	
	
	//<---------- Lab Tests ---------->
	
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//a[text()=' Lab tests ']") })
	private WebElement clickLabTests;
	

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='labCode']") })
	private WebElement clickLabTestCode;
	

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='description']") })
	private WebElement clickLabTestDescription;
	
	
	//<------------- Comorbidities -------------->
	
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//a[text()=' Comorbidities ']") })
	private WebElement clickComorbidities;
	

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='comorbidityName']") })
	private WebElement clickComorbiditiesName;
	

	// < ---- Specialty ---->
	
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//a[text()=' Specialties ']") })
	private WebElement clickSpecialties;
	

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='description']") })
	private WebElement clickSpecialityDescription;
	
	
	// <---- Insurance Company details --->

	@CacheLookup
	@FindAll({ @FindBy(xpath = "//a[text()=' Insurance companies ']") })
	private WebElement clickInsuranceCompanies;

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='insuranceCompanyCode']") })
	private WebElement enterInsuranceCode;

	@FindAll({ @FindBy(xpath = "//input[@formcontrolname='insuranceCompanyName']") })
	private WebElement enterInsuranceCompanyName;

	
	
	public WebElement getClickSpecialSkills() {
		return clickSpecialSkills;
	}

	public WebElement getClickSpecialSkillName() {
		return clickSpecialSkillName;
	}

	public WebElement getClickDegree() {
		return clickDegree;
	}

	public WebElement getClickDegreeCode() {
		return clickDegreeCode;
	}

	public WebElement getClickDegreeDescription() {
		return clickDegreeDescription;
	}

	public WebElement getClickLabTests() {
		return clickLabTests;
	}

	public WebElement getClickLabTestCode() {
		return clickLabTestCode;
	}

	public WebElement getClickLabTestDescription() {
		return clickLabTestDescription;
	}

	public WebElement getClickComorbidities() {
		return clickComorbidities;
	}

	public WebElement getClickComorbiditiesName() {
		return clickComorbiditiesName;
	}

	public WebElement getClickSpecialityDescription() {
		return clickSpecialityDescription;
	}

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

	public WebElement getClickMedicinesBrands() {
		return clickMedicinesBrands;
	}
	
	public WebElement getClickBrandName() {
		return clickBrandName;
	}

	public WebElement getClickCancelBtn() {
		return clickCancelBtn;
	}

	public WebElement getClickMedicine() {
		return clickMedicine;
	}

	public WebElement getClickBrand() {
		return clickBrand;
	}

	public WebElement getClickMedicineName() {
		return clickMedicineName;
	}

	public WebElement getClickDosage() {
		return clickDosage;
	}

	public WebElement getClickUnit() {
		return clickUnit;
	}

	public WebElement getClickSpecialties() {
		return clickSpecialties;
	}

}
