package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "DuplicateLead";//Created setFileName dynamically using excel
	}
	
	@Test(dataProvider = "fetchData")
	public void executeDuplicateLead(String phoneNumber) throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLeads()
		.enterPhoneNumber(phoneNumber)
		.clickFirstResultingId()
		.clickDuplicateButton()
		.clickCreateLead();

	}

}
