package com.lms.stepDefinitions;

import java.time.Duration;

import com.lms.driverfactory.DriverFactory;
import com.lms.pageObjects.LoginPageObject;

import io.cucumber.java.en.*;

public class LoginStepDef extends BaseClass{

	LoginPageObject loginpage =new LoginPageObject(DriverFactory.getDriver());

	
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get(url);	
		//DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("User clicks the Login button after entering valid username and password")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password() {
		loginpage.setUsername(username);
		loginpage.setPassword(password);
		loginpage.clickSubmit();
	}

	@Then("User should see the LMS Home page")
	public void user_should_see_the_lms_home_page() {
		loginpage.verifyLoginTitle();
	}
}
