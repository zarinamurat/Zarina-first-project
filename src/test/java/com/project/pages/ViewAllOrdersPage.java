package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utilities.NavigationMenu;

/**
 * @author Saule
 *
 * 
 */
public class ViewAllOrdersPage extends NavigationMenu{

	@FindBy(xpath = "//a[text()='View all orders']")
	public WebElement viewAllOrdersLink;
	
	@FindBy(xpath = "//h2[contains(text(),'List of All Orders')]")
	public WebElement listOfOrdersText;
	
	@FindBy(xpath = "//table[@class='SampleTable']")
	public WebElement webTable;
	

}
