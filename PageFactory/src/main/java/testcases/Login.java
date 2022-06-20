package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class Login extends ProjectSpecificMethods{
	@Test
	public void executeLogin() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin();

	}

}
