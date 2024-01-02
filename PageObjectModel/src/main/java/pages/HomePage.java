package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification{
	
	public HomePage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	
	public MyHomePage clickCRMSFA() {
	try {
		driver.findElementByLinkText("CRM/SFA").click();
		reportStep("CRM/SFA clicked successfully", "pass");
		
	} catch (Exception e) {
		reportStep("CRM/SFA not clicked successfully", "fail");
	}
		
		return new MyHomePage(driver);
	}

}
