package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	
	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage updateCompanyName(String updatedCompanyName) {
		
		WebElement beforeUpdate = driver.findElement(By.id("updateLeadForm_companyName"));
		beforeUpdate.clear();
		beforeUpdate.sendKeys(updatedCompanyName);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
}
