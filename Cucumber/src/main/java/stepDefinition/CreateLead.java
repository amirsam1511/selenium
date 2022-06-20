package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("I click CRMSFA link")
	public void clickCRMSFALink(){
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("I should navigate to leaftaps application main page")
	public void leaftapsApplication() {
		driver.findElement(By.linkText("Leads")).click();
	}

}