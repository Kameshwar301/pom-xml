package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
import pages.LogInPage;

public class LoginWithInvalidData extends ProjectSpecification{

	@BeforeTest
	public void setDetails() {
		excedlFileName = "LoginCreate";
		testName= "LoginWithInvalid";
		testDesc="Login in with invalid data";
		testAuthor="Kamesh";
		testCategory="smoke";
		
	}
	
	@Test
	public void loginWithInvalidData() throws InterruptedException {
		
		new LogInPage(driver).enterUserName("demo123").enterPassword("crmsfa").clickForInvalidData().verifyErrorMessage();
		//new HomePage().clickCRMSFA().clickLeads().clickCreateLead().companyName().firtsName().lastName().createNewLead().leadIscreated();

	}
}
