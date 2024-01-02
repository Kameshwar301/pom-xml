package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class LogInPage extends ProjectSpecification{
	
	public LogInPage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	public LogInPage enterUserName(String username) throws InterruptedException {
		try {
			driver.findElementById("username").sendKeys(username);
			reportStep(username+" entered successfully", "pass");
		} catch (Exception e) {
			reportStep(username+" not entered successfully", "fail");
		}
		
	
		return this;
	}
	public LogInPage enterPassword(String password) {
		try {
			driver.findElementById("password").sendKeys(password);
			reportStep(password+" entered successfully", "pass");
		} catch (Exception e) {
			reportStep(password+" not entered successfully", "fail");
		}
		
		return this;
	}
	public HomePage clickButton() {
		try {
			driver.findElementByClassName("decorativeSubmit").click();
			reportStep("Login button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Login button not clicked successfully", "fail");
		}
		
		return new HomePage(driver);
}
	
	public LogInPage clickForInvalidData() {
		driver.findElementByClassName("decorativeSubmit").click();
		return this;
}
	
	public void verifyErrorMessage() {
		System.out.println("Error message");

	}

}
  