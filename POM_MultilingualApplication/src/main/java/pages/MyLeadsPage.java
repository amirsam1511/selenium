package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop1.getProperty("link_create_lead"))).click();
		return new CreateLeadPage(driver);
	}
	
	public MyLeadsPage clickFindLeads() {
		driver.findElement(By.linkText(prop1.getProperty("link_find_lead"))).click();
		return this;

	}
	
	public MyLeadsPage enterPhoneNumber(String phoneNumber) throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text() = "+prop1.getProperty("link_find_leads_button")+"]")).click();
		Thread.sleep(3000);
		text = driver.findElement(By.xpath("//td[contains(@class,'first ')]/div/a[1]")).getText();
		return this;
	}
	
	public ViewLeadPage clickFirstResultingId() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}
	
	public MergeLeadPage clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);

	}
	
	public MyLeadsPage enterLeadId() {
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		return this;
	}
	
	public void verifyDeletedRecord() throws InterruptedException {
		Thread.sleep(3000);
		String recordDeleted = driver.findElement(By.xpath("//div[@class = 'x-paging-info']")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(recordDeleted, "No records to display");
		System.out.println("Record has been deleted");

	}

}
