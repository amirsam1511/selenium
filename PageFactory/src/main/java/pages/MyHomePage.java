package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
			}
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(prop1.getProperty("link_leads"))).click();
		return new MyLeadsPage(driver);
	}

}
