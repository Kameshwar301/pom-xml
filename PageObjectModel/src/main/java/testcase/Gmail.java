package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.GmailLogin;


public class Gmail extends ProjectSpecification{
	@BeforeTest
	public void setDetails() {
		excedlFileName = "LoginMail";
		testName= "GmailLogins";
		testDesc="Gmail Page login";
		testAuthor="Kamesh";
		testCategory="smoke";
		
	}
	
	@Test(dataProvider = "fetcha")
	public void creatingLead(String username, String password) throws InterruptedException {
		
		new GmailLogin(driver).Login(username).passwordEnter(password);
	}
}
