package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	@Given("Enter the username as {string}")
	public void enter_the_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("I click Login button")
	public void click_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("I should be navigated to homepage without any issues")
	public void should_be_navigated_to_homepage_without_any_issues() {
		System.out.println("Homepage is displayed");
	}
	@Then("I should see Error message in it")
	public void should_see_error_message() {
		String text = driver.findElement(By.xpath("//p[contains(text(),'User not found.')]")).getText();
		if(text.contains("User not found")) {
			System.out.println("The Following Errors Occurred:\r\n"
					+ "\r\n"
					+ "following error occurred during login: User not found.");
		}
		else {
			System.out.println("Credentials are valid");
		}
	}

}
