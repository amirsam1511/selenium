package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "username")
	WebElement eleUserName;
	public LoginPage enterUsername() {
		eleUserName.sendKeys("DemoCSR2");
		//driver.findElement(By.id("username")).sendKeys("DemoCSR2");		
		return this;
	}
	@FindBy(how = How.ID, using = "password")
	WebElement elePassword;
	public LoginPage enterPassword() {
		elePassword.sendKeys("crmsfa");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage(driver);

	}

}
