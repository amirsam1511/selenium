package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	
	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadsPage enterFirstNameFromLead(String fromLeadFirstName) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fromLeadFirstName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public MergeLeadPage clickFirstResultingIdFromLead() throws InterruptedException {
		Thread.sleep(1000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadPage(driver);
	}
	
	public FindLeadsPage enterFirstNameToLead(String toLeadFirstName) {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(toLeadFirstName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public MergeLeadPage clickFirstReusltingIdToLead() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
		return new MergeLeadPage(driver);
	}
	
	public FindLeadsPage enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public void verifyMergedRecord() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Assert.assertEquals(text, "No records to display");
			System.out.println("Record is Merged");
	}

}
