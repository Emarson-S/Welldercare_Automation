package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bson.Document;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import bsh.ParseException;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert l;
	public static Select s;
	public static WebDriverWait w;
	

	// launch Chrome browser
	public static void openChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	// launch Firefox browser

	public static void openFirefox() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	// launch Edge browser

	public static void openEdge() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}



	// closeBrower
	public static void closeBrowser() {
		driver.quit();
	}

	// closeCurrentTab
	public static void closeCurrentTab() {
		driver.close();
	}

	// maxWindow
	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	// toRefresh
	public static void toRefresh() {
		driver.navigate().refresh();
	}

	// launchUrl
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// sendKeys
	public static void toFillTextbox(WebElement element, String data) {

		element.sendKeys(data);
	}

	int myInt = 7;

	public static void toFillIntigerTextbox(WebElement element, int myInt) {

		element.sendKeys(String.valueOf(myInt));
	}

	// clickButton
	public static void toClickButton(WebElement element) {

		element.click();
	}

	// getText value
	public static void textValue(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// getAttribute value
	public static String attributeValue(WebElement element, String Name) {
		String value = element.getAttribute(Name);
		System.out.println(value);
		return value;
	}

	// getTitle
	public static void toFetchTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}

	// getCurrentUrl
	public static String toFetchUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	// drag and drop
	public static void dragDrop(WebElement sr, WebElement dn) {
		a.dragAndDrop(sr, dn).perform();
	}

	// mouseHovering
	public static void mouseHovering(WebElement element) {
		a.moveToElement(element).perform();
	}

	// doubleClick
	public static void toDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	// rightClick
	public static void toRightClick(WebElement element) {
		a.contextClick(element).perform();
	}

	// 16.copy the text
	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// 17.paste the text
	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// press Down key
	public static void pressDownKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// press Enter key
	public static void pressEnterKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// press Tab key
	public static void pressTabKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	// select all text
	public static void selectAllText() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	// use JavascriptExecutor method replaced by click
	public static void replaceClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	// ScrollDown
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// ScrollUp
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// to pass thread sleep value
	public static void toThreadSleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	// acceptAlert
	public static void acceptAlert() {
		l = driver.switchTo().alert();
		l.accept();
	}

	// dismissAlert
	public static void dismissAlert() {
		l = driver.switchTo().alert();
		l.dismiss();
	}

	// switch into other Window with String windowsId
	public static void switchToWindow(int i) {
		Set<String> allWindowsId = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(allWindowsId);
		driver.switchTo().window(l.get(i));
	}

	// select dropDown by visible text
	public static void toSelectVisibleText(WebElement element, String visibleText) {
		s = new Select(element);
		s.selectByVisibleText(visibleText);
	}

	// select dropDown by value
	public static void toSelectValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	// select dropDown by index
	public static void toSelectIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	// take screenshot
	public static void takePicture(String pictureName) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File sr = tk.getScreenshotAs(OutputType.FILE);
		File dn = new File("C:\\Users\\Mavensi Lap017\\Welldercare\\Screenshots" + pictureName + ".png");
		FileUtils.copyFile(sr, dn);
	}

	// create new Excel Sheet
	public static void tocreateExcelSheet(String fileName, String sheetName, int rowNo, int cellNo, String value)
			throws IOException {
		File f = new File("C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\Excel Files\\" + fileName + ".xlsx");
		FileInputStream fil = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fil);
		Sheet sh = b.createSheet(sheetName);
		Row r = sh.createRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		b.write(fo);

	}

	// create new row in old Sheet
	public static void toCreateNewRow(String fileName, String sheetName, int rowNo, int cellNo, String value)
			throws IOException {
		File f = new File("C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\Excel Files\\" + fileName + ".xlsx");
		FileInputStream fil = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fil);
		Sheet sh = b.getSheet(sheetName);
		Row r = sh.createRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		b.write(fo);

	}

	// create new cell in old row

	public static void toCreateNewCell(String fileName, String sheetName, int rowNo, int cellNo, String value)
			throws IOException {
		File f = new File("C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\Excel Files\\" + fileName + ".xlsx");
		FileInputStream fil = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fil);
		Sheet sh = b.getSheet(sheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		b.write(fo);
	}

	public static String toReadDataFromExcel(String fileName, String sheetName, int rowNo, int cellNo)
			throws IOException {

		File f = new File("C:\\Users\\Emarson\\eclipse-workspace\\Welldercare\\Excel Files\\" + fileName + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fin);
		Sheet sh = b.getSheet(sheetName);
		Cell c = sh.getRow(rowNo).getCell(cellNo);
		int type = c.getCellType();
		String res;
		if (type == 1) {
			res = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			res = sim.format(da);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			res = String.valueOf(l);
		}
		return res;

	}

	// Get current full date format

	public static String readDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	// Get current day

	public static String readDay() {
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	// Get current month

	public static String readMonth() {
		DateFormat dateFormat = new SimpleDateFormat("MM");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	// Get current year

	public static String readYear() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	// Get current hour

	public static String readHour() {
		DateFormat dateFormat = new SimpleDateFormat("HH");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	// Get current minutes

	public static String readMin() {
		DateFormat dateFormat = new SimpleDateFormat("mm");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	// Get current Time(AM/PM)

	public static String readAm() {
		DateFormat dateFormat = new SimpleDateFormat("a");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	public static Date getCurrentUtcTime() throws ParseException, java.text.ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		SimpleDateFormat ldf = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
		Date d1 = null;
		d1 = ldf.parse(sdf.format(new Date()));

		int hr = d1.getHours() + 5;
		int min = d1.getMinutes() + 30;
		d1.setHours(hr);
		d1.setMinutes(min);

		return d1;

	}




}
