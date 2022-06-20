package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MergeLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setFileName() {
		excelFileName = "MergeLead";//Created setFileName dynamically using excel
	}
	
	@Test(dataProvider = "fetchData")
	public void executeMergeLead(String fromLeadFirstName, String toLeadFirstName) throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickMergeLead()
		.clickImageIconOfFromLead()
		.enterFirstNameFromLead(fromLeadFirstName)
		.clickFirstResultingIdFromLead()
		.clickImageIconOfToLead()
		.enterFirstNameToLead(toLeadFirstName)
		.clickFirstReusltingIdToLead()
		.clickMergeLeadButton()
		.enterLeadId()
		.verifyMergedRecord();
		
	}

}
