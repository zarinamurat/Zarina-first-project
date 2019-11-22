package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utilities.NavigationMenu;

/**
 * @author Saule
 *
 * 
 */
public class OrderPage extends NavigationMenu{

	@FindBy(xpath = "//a[text()='Order']")
	public WebElement orderLink;
	
	@FindBy(xpath = "//h2[contains(text(),'Order')]")
	public WebElement orderText;

	@FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
	public WebElement dropDownButton;
	
}
