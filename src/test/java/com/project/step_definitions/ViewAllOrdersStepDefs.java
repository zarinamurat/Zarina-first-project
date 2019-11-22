package com.project.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project.pages.ViewAllOrdersPage;
import com.project.utilities.CommonSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Saule
 *
 * 
 */
public class ViewAllOrdersStepDefs extends CommonSteps{
    
	
	
	@When("The user click on ViewAllOrders Link")
	public void the_user_click_on_ViewAllOrders_Link() {
		ViewAllOrdersPage viewAllOrders = new ViewAllOrdersPage();
		viewAllOrders.viewAllOrdersLink.click();
		Assert.assertTrue(viewAllOrders.listOfOrdersText.getText().contains("List of All Orders"));  
	}

	@Then("The user should be able to retrieve the value from the webtable")
	public void the_user_should_be_able_to_retrieve_the_value_from_the_webtable() {
		ViewAllOrdersPage viewAllOrders = new ViewAllOrdersPage();
		String actualName = viewAllOrders.webTable.findElement(By.xpath("//tr[3]/td[2]")).getText();
		String expectedName = "Mark Smith";
		Assert.assertEquals(expectedName, actualName);
	}
	
}
