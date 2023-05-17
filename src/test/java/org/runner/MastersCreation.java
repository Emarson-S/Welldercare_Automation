package org.runner;

import java.awt.AWTException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.base.BaseClass;
import org.base.Configurations;
import org.base.MastersPojo;
import org.base.MongoDBCollections;
import org.base.UserCreationPojo;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MastersCreation extends BaseClass {

	@Test(enabled = false)
	private void specialSkills() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(2000);

		toClickButton(l5.getClickSpecialSkills());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickSpecialSkillName(), "Administration Management");
		// toClickButton(l5.getClickSaveBtn());

	}

	@Test(enabled = false)
	private void brand() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(2000);

		scrollDown(l5.getClickMedicinesBrands());
		toThreadSleep(1000);
		toClickButton(l5.getClickMedicinesBrands());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickBrandName(), "Crestor");
		// toClickButton(l5.getClickSaveBtn());

	}

	@Test(enabled = false)
	private void medicine() throws IOException, InterruptedException, AWTException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(2000);

		// Add Medicine
		scrollDown(l5.getClickMedicine());
		toThreadSleep(1000);
		toClickButton(l5.getClickMedicine());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(2000);
		toFillTextbox(l5.getClickBrand(), "Cipla");
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l5.getClickMedicineName(), "Azithromycin");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickDosage(), "50");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickUnit(), "mg");
		// toClickButton(l5.getClickSaveBtn());
	}

	@Test(enabled = false)
	private void degree() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(1000);

		scrollDown(l5.getClickDegree());
		toThreadSleep(1000);
		toClickButton(l5.getClickDegree());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickDegreeCode(), "Bio.Tech");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickDegreeDescription(), "Bio Technology (urology)");
		// toClickButton(l5.getClickSaveBtn());

	}

	@Test(enabled = false)
	private void labtests() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(1000);

		scrollDown(l5.getClickLabTests());
		toThreadSleep(1000);
		toClickButton(l5.getClickLabTests());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickLabTestCode(), "BGT");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickLabTestDescription(), "Blood Glucose Test");
		// toClickButton(l5.getClickSaveBtn());
	}

	@Test(enabled = false)
	private void comorbidities() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(1000);

		scrollDown(l5.getClickComorbidities());
		toThreadSleep(2000);
		toClickButton(l5.getClickComorbidities());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickComorbiditiesName(), "Lung Cancer");
		// toClickButton(l5.getClickSaveBtn());
	}

	@Test(enabled = false)
	private void Specialities() throws IOException, InterruptedException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(1000);
		
		scrollDown(l5.getClickSpecialties());
		toThreadSleep(2000);
		toClickButton(l5.getClickSpecialties());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickSpecialityDescription(), "Consultant");
		// toClickButton(l5.getClickSaveBtn());
	}

	@Test(enabled = false)
	private void healthInsurance() throws IOException, InterruptedException {

		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(1000);

		scrollDown(l5.getClickInsuranceCompanies());
		toThreadSleep(1000);
		toClickButton(l5.getClickInsuranceCompanies());
		toThreadSleep(2000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getEnterInsuranceCode(), "TLI");
		toFillTextbox(l5.getEnterInsuranceCompanyName(), "TATA AIA Life Insurance");
		// toClickButton(l5.getClickSaveBtn());
	}


	@Test(enabled = true)
	public MastersCreation() throws IOException, InterruptedException, AWTException {
		openChrome();
		maxWindow();
		Configurations.readUrl("BaseUrl");
		UserCreationPojo l1 = new UserCreationPojo();
		MastersPojo l5 = new MastersPojo();
		Actions a = new Actions(driver);
        String s1;
		toThreadSleep(2000);
		toFillTextbox(l1.getEnterUsername(), toReadDataFromExcel("Files", "Login&Usercreation", 2, 1));
		toFillTextbox(l1.getEnterPassword(), toReadDataFromExcel("Files", "Login&Usercreation", 3, 1));
		toClickButton(l1.getClickSignIn());
		toThreadSleep(2000);
		toClickButton(l5.getClickMasters());
		toThreadSleep(1000);

		
		// ----- Special Skills -------
		try {
		toClickButton(l5.getClickSpecialSkills());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickSpecialSkillName(), "Administration1");
		toClickButton(l5.getClickSaveBtn());
		//toClickButton(l5.getClickCancelBtn());
		s1=checkAddedMasterData(MongoDBCollections.TBL_SPECIAL_SKILL, "specialSkills", "specialSkillName", "Administration3");
		if(s1==null) {
			toRefresh();
		}
		} catch (Exception e) {
			checkAddedMasterData(MongoDBCollections.TBL_SPECIAL_SKILL, "specialSkills", "specialSkillName", "Administration1");
		}
		
		
		// -------- Medicine --------
		try {	
		toThreadSleep(3000);		
		scrollDown(l5.getClickSpecialSkills());
		toThreadSleep(2000);
		toClickButton(l5.getClickMedicine());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(2000);
		toFillTextbox(l5.getClickBrand(), "Cipla");
		pressEnterKey();
		toThreadSleep(1000);
		toFillTextbox(l5.getClickMedicineName(), "Azithromycin2");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickDosage(), "50");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickUnit(), "mg");
		 toClickButton(l5.getClickSaveBtn());
		//toClickButton(l5.getClickCancelBtn());
		checkAddedMasterData(MongoDBCollections.TBL_MEDICINE, "medicines", "medicineName", "Azithromycin2");
		} catch (Exception e) {
			toRefresh();
			toThreadSleep(3000);
			checkAddedMasterData(MongoDBCollections.TBL_MEDICINE, "medicines", "medicineName", "Azithromycin2");	
			}
		
		
		// -------- Brands --------
		try {
		scrollDown(l5.getClickMedicinesBrands());
		toThreadSleep(1000);
		toClickButton(l5.getClickMedicinesBrands());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickBrandName(), "Crestor");
		toClickButton(l5.getClickSaveBtn());
		//toClickButton(l5.getClickCancelBtn());
		checkAddedMasterData(MongoDBCollections.TBL_BRAND, "medicineBrands", "brandName", "Crestor");
		} catch (Exception e) {
			toRefresh();
			toThreadSleep(3000);
			checkAddedMasterData(MongoDBCollections.TBL_BRAND, "medicineBrands", "brandName", "Crestor");
		}
		
		// -------- Degree --------
		try {
		scrollDown(l5.getClickDegree());
		toThreadSleep(1000);
		toClickButton(l5.getClickDegree());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickDegreeCode(), "Bio.Tech");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickDegreeDescription(), "Bio Technology (urology)");
		// toClickButton(l5.getClickSaveBtn());
		toClickButton(l5.getClickCancelBtn());
		checkAddedMasterData(MongoDBCollections.TBL_DEGREE, "degree", "degreeCode", "Bio.Tech");
		} catch (Exception e) {
			toRefresh();
			toThreadSleep(3000);
			checkAddedMasterData(MongoDBCollections.TBL_DEGREE, "degree", "degreeCode", "Bio.Tech");
		}
		
		
		// -------- Lab Tests --------
		try {
		scrollDown(l5.getClickLabTests());
		toThreadSleep(1000);
		toClickButton(l5.getClickLabTests());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickLabTestCode(), "BGT");
		toThreadSleep(1000);
		toFillTextbox(l5.getClickLabTestDescription(), "Blood Glucose Test");
		// toClickButton(l5.getClickSaveBtn());
		toClickButton(l5.getClickCancelBtn());
		checkAddedMasterData(MongoDBCollections.TBL_LAB, "labTests", "labCode", "BGT");
		} catch (Exception e) {
			toRefresh();
			toThreadSleep(3000);
			checkAddedMasterData(MongoDBCollections.TBL_LAB, "labTests", "labCode", "BGT");
		}
		
		// -------- Comorbidities --------
		try {
		scrollDown(l5.getClickComorbidities());
		toThreadSleep(2000);
		toClickButton(l5.getClickComorbidities());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickComorbiditiesName(), "Lung Cancer");
		// toClickButton(l5.getClickSaveBtn());
		toClickButton(l5.getClickCancelBtn());
		checkAddedMasterData(MongoDBCollections.TBL_COMORBIDITY, "comorbidities", "comorbidityName", "Lung Cancer");
		} catch (Exception e) {
			toRefresh();
			toThreadSleep(3000);
			checkAddedMasterData(MongoDBCollections.TBL_COMORBIDITY, "comorbidities", "comorbidityName", "Lung Cancer");
		}
		
		
		// -------- Specialities --------
		try {
		scrollDown(l5.getClickSpecialties());
		toThreadSleep(2000);
		toClickButton(l5.getClickSpecialties());
		toThreadSleep(1000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getClickSpecialityDescription(), "Consultant");
		// toClickButton(l5.getClickSaveBtn());
		toClickButton(l5.getClickCancelBtn());
		checkAddedMasterData(MongoDBCollections.TBL_SPECIALITY, "specialities", "description", "Consultant");
		} catch (Exception e) {
			toRefresh();
			toThreadSleep(3000);
			checkAddedMasterData(MongoDBCollections.TBL_SPECIALITY, "specialities", "description", "Consultant");
		}
		
		// -------- Insurance Companies --------
		try {
		
		scrollDown(l5.getClickInsuranceCompanies());
		toThreadSleep(1000);
		toClickButton(l5.getClickInsuranceCompanies());
		toThreadSleep(2000);
		toClickButton(l5.getClickAddMasterBtn());
		toThreadSleep(1000);
		toFillTextbox(l5.getEnterInsuranceCode(), "TLI");
		toFillTextbox(l5.getEnterInsuranceCompanyName(), "TATA AIA Life Insurance");
		// toClickButton(l5.getClickSaveBtn());
		toClickButton(l5.getClickCancelBtn());
		checkAddedMasterData(MongoDBCollections.TBL_INSURANCECOMPANY, "insuranceCompanies", "insuranceCompanyCode", "TLI");
		} catch (Exception e) {
			toRefresh();
			toThreadSleep(3000);
			checkAddedMasterData(MongoDBCollections.TBL_INSURANCECOMPANY, "insuranceCompanies", "insuranceCompanyCode", "TLI");
		}
		
	}
	

public static String checkAddedMasterData(String tableName, String FieldName, String keyName, String valueName ) throws IOException {
		String s =MongoDBCollections.mongoDBfetchRowData("DB_URL", "Database", tableName ,keyName, valueName);
		if (s!=null) {
			System.out.println(FieldName + "-------->" + s);
			
		}else {
			
		System.err.println(FieldName + " data is not added");
		}
		return s;
	}
}
