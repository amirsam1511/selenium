package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods{
	
	public MergeLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadsPage clickImageIconOfFromLead() {
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadsPage(driver);
	}
	
	public FindLeadsPage clickImageIconOfToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadsPage(driver);

	}
	
	public FindLeadsPage clickMergeLeadButton() {
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}

}
