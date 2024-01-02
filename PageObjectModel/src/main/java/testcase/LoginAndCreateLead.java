package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
import pages.LogInPage;

public class LoginAndCreateLead extends ProjectSpecification{
	
	@BeforeTest
	public void setDetails() {
		excedlFileName = "LoginCreate";
		testName= "LoginAndLogout";
		testDesc="Login in leaftaps and create lead";
		testAuthor="Kamesh";
		testCategory="smoke";
		
	}
	
	@Test(dataProvider = "fetcha")
	public void creatingLead(String username, String password) throws InterruptedException {
		
		new LogInPage(driver).enterUserName(username).enterPassword(password).clickButton();
		new HomePage(driver).clickCRMSFA().clickLeads().clickCreateLead().companyName().firtsName().lastName().createNewLead().leadIscreated();

	}

}
  