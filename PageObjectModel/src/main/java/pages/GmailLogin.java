package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class GmailLogin extends ProjectSpecification {

public GmailLogin(ChromeDriver driver) {
	this.driver=driver;//it is declare the global variable
	driver.findElementByLinkText("Sign in").click();
	
}
public GmailLogin Login(String username) {
	driver.findElementByXPath("//input[@name='identifier']").sendKeys(username);
	reportStep(username+" entered successfully", "pass");
	driver.findElementByXPath("(//div[@class='VfPpkd-RLmnJb'])[2]").click();
	return this;
}
public GmailLogin passwordEnter(String password) {
	driver.findElementByXPath("//input[@name='Passwd']").sendKeys(password);
	reportStep(password+" entered successfully", "pass");
	driver.findElementByXPath("(//div[@class='VfPpkd-RLmnJb'])[2]").click();
	return this;
}
}
