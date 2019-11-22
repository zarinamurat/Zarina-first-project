package com.project.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.pages.HomePage;
import com.project.pages.OrderPage;
import com.project.utilities.CommonSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Saule
 *
 * 
 */
public class OrderPageStepDefs extends CommonSteps{
	
	@When("The user clicks on Order button")
	public void the_user_clicks_on_Order_button() {
		OrderPage orderPage = new OrderPage();
		orderPage.orderLink.click();
		
	}

	@And("The user should be able to see the Order page")
	public void the_user_should_ve_able_to_see_the_Order_page() {
		OrderPage orderPage = new OrderPage();
		Assert.assertTrue(orderPage.orderText.getText().contains("Order"));   
	}

	@When("The user sees the Product dropdown menu")
	public void the_user_click_on_dropdown_menu() {
		OrderPage orderPage = new OrderPage();
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(orderPage.dropDownButton));
	
	}

	@And("The user should be able to make a selection from Dropdown menu")
	public void the_user_should_be_able_to_make_a_selection() {
		OrderPage orderPage = new OrderPage();
	    Select select = new Select(orderPage.dropDownButton);
	    select.selectByIndex(1);
	    
	}

}
