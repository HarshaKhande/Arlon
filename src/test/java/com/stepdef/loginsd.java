package com.stepdef;

import com.factory.DriverFactory;
import com.pages.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsd {
	
	private static String title;
	
	private login loginpage = new login(DriverFactory.getDriver()) ;
	
	@Given("user is on loginpage")
	public void user_is_on_login_page() {

		DriverFactory.getDriver()
				.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters the username <admin> in the username text field")
	public void user_enters_the_username_admin_in_the_username_text_field(String username) {
		
		loginpage.enterusername(username);
	   
	}

	@When("user enters the password <admin123> in the password text field")
	public void user_enters_the_password_admin123_in_the_password_text_field(String password) {
	    
		loginpage.enterpassword(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		
		loginpage.clicklogin();
	   
	}

	

}
