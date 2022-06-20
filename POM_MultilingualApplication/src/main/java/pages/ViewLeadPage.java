package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void verifyCreatedLead(String firstName) {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(firstName, text);
		

	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText(prop1.getProperty("link_edit"))).click();
		return new EditLeadPage(driver);
	}
	
	public void verifyCompanyName() {
		boolean updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(updatedCompanyName);
		
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		
		driver.findElement(By.linkText(prop1.getProperty("link_duplicate_lead"))).click();
		return new DuplicateLeadPage(driver);
	}
	
	public MyLeadsPage clickDeleteButton() {
		
		driver.findElement(By.xpath("//a[text() = 'Delete']")).click();
		return new MyLeadsPage(driver);
	}

}
