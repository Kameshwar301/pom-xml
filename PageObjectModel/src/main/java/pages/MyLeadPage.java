package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class MyLeadPage extends ProjectSpecification{
	
	public MyLeadPage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	
	public CreateLeadPage clickCreateLead() {
		try {
			driver.findElementByLinkText("Create Lead").click();	
			reportStep("create lead is clicked", "pass");
		} catch (Exception e) {
			reportStep("create lead is not clicked", "fail");
		}
		
		return new CreateLeadPage(driver);
	}

}
