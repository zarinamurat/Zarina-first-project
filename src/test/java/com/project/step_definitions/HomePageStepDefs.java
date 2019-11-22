package com.project.step_definitions;



import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.pages.HomePage;
import com.project.utilities.CommonSteps;
import com.project.utilities.ConfigReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Saule
 *
 * 
 */
public class HomePageStepDefs extends CommonSteps{
	
	@Given("Theu user should be able to launch the application")
	public void theu_user_should_be_able_to_launch_the_application() {
		System.out.println("I am opening the HomePage");
	    driver.get(ConfigReader.getProperty("url"));
	}

	@Then("The homepage should be displayed")
	public void the_homepage_should_be_displayed() {
		System.out.println("I can see the HomePage now!");
	    String expected = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	   wait.until(ExpectedConditions.urlContains("smartbearsoftware"));
	   String actual = driver.getCurrentUrl();
	  
	   Assert.assertEquals(expected, actual);
	}

	@Given("The user enters username and password")
	public void the_user_enters_username_and_password() {
		HomePage homePage = new HomePage();
		homePage.usernameInputBox.sendKeys(ConfigReader.getProperty("username"));
		homePage.passwordInputBox.sendKeys(ConfigReader.getProperty("password"));
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		HomePage homePage = new HomePage();
		homePage.loginButton.click();
	}

	@Then("The user should be able to see the Welcome page")
	public void the_user_should_be_able_to_see_the_Welcome_page() {
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.welcomeText.isDisplayed());
	}
	
	

	

}
