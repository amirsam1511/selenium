package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{

	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.NAME,using = "submitButton")
	WebElement eleSubmitButton;
	public ViewLeadPage clickCreateLead() {
		eleSubmitButton.click();
		//driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}
	
}
