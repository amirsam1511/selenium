package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "EditLead";//Created setFileName dynamically using excel
	}
	
	@Test(dataProvider = "fetchData")
	public void executeEditLead(String phoneNumber, String updatedCompanyName) throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLeads()
		.enterPhoneNumber(phoneNumber)
		.clickFirstResultingId()
		.clickEditButton()
		.updateCompanyName(updatedCompanyName)
		.clickUpdateButton()
		.verifyCompanyName();

	}

}
