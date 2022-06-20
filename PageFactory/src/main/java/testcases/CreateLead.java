package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "CreateLead";//Created setFileName dynamically using excel
	}
	
	
	@Test(dataProvider = "fetchData")
	public void executeCreateLead(String companyName,String firstName,String lastName) {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyCreatedLead(firstName);

	}
	
	

}
