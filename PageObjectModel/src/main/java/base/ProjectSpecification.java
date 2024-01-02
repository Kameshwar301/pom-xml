package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class ProjectSpecification {

	public ChromeDriver driver;
	public String excedlFileName;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public String testName, testDesc, testAuthor, testCategory;
	public static ExtentTest test;
	
	@BeforeSuite
	public void startReport() {

		reporter = new ExtentHtmlReporter("./NewReports/result1.html");

		reporter.setAppendExisting(true);

		extent = new ExtentReports();

		extent.attachReporter(reporter);
	}
@BeforeClass
	public void testDetails() {
		test = extent.createTest(testName,testDesc);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
		
	}

public void reportStep(String msg, String status) {
	if (status.equalsIgnoreCase("pass")) {
		test.pass(msg);
		
	}
	else if(status.equalsIgnoreCase("fail")) {
		test.fail(msg);
	}
}
	@BeforeMethod
	public void startApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider(name = "fetcha")
	public String[][] sendData() throws IOException {
		ReadExcelData red = new utils.ReadExcelData();
		String[][] data = red.readExcel(excedlFileName);
		return data;
	}

	@AfterSuite
	public void endReport() {
		extent.flush();

	}
}
