package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class CreateLeadPage extends ProjectSpecification{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	public CreateLeadPage companyName() {
		try {
			driver.findElementById("createLeadForm_companyName").sendKeys("MNW IT India Pvt Ltd");
		reportStep("company name not entered as MNW IT India Pvt Ltd", "pass");
		}
		catch (Exception e){
			reportStep("company name not entered as MNW IT India Pvt Ltd", "fail");
		}
		return this;
	}
	public CreateLeadPage firtsName() {
		try {
			driver.findElementById("createLeadForm_firstName").sendKeys("Kameshwar");
			reportStep("first name is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("first name is not entered successfully", "fail");
		}
		return this;
	}
	public CreateLeadPage lastName() {
		try {
			driver.findElementById("createLeadForm_lastName").sendKeys("Subramanian");
			reportStep("last name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("last name not entered successfully", "fail");
		}
		
		return this;

	}
	public ViewLeadPage createNewLead() {
		try {
			driver.findElementByClassName("smallSubmit").click();	
			reportStep("submit button clicked", "pass");
		} catch (Exception e) {
		reportStep("submit button not clicked", "fail");
		}
		
		return new ViewLeadPage();
	}
 
}
