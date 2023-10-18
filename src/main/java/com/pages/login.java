package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

	private WebDriver driver;

	// locators

	private By username = By.xpath("//input[@name = 'username']");
	private By password = By.xpath("//input[@name = 'password']");
	private By login = By.xpath("//button[@type = 'submit']");

	// constructor of the page

	public login(WebDriver driver) {

		this.driver = driver;
	}

	// page methods

	public String getLoginpagetitle() {

		return driver.getTitle();

	}

	public void enterusername(String un) {

		driver.findElement(username).sendKeys(un);

	}

	public void enterpassword(String pass) {

		driver.findElement(password).sendKeys(pass);

	}

	public void clicklogin() {

		driver.findElement(login).click();

	}

}
