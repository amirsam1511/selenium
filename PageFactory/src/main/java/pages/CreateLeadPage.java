package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	WebElement eleFirstName;
	public CreateLeadPage enterFirstName(String firstName) {
		eleFirstName.sendKeys(firstName);
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	WebElement eleLastName;
	public CreateLeadPage enterLastName(String lastName) {
		eleLastName.sendKeys(lastName);
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	@FindAll(
				{
				@FindBy(how = How.ID, using = "createLeadForm_companyName"),
				@FindBy(how = How.NAME, using = "CompanyName")
				}
				)
	WebElement eleCompanyName;
	public CreateLeadPage enterCompanyName(String companyName) {
		eleCompanyName.sendKeys(companyName);
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}

	public ViewLeadPage clickCreateLeadButton() {

		driver.findElement(By.className("smallSubmit")).click();

		return new ViewLeadPage(driver);
	}
}
