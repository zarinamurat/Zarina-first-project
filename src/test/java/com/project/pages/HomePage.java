package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.utilities.NavigationMenu;


/**
 * @author Saule
 *
 * 
 */
public class HomePage extends NavigationMenu{
	
	@FindBy(id = "ctl00_MainContent_username")
	public WebElement usernameInputBox;

	@FindBy(id = "ctl00_MainContent_password")
	public WebElement passwordInputBox;

	@FindBy(id = "ctl00_MainContent_login_button")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[contains(text(),'Welcome, Tester!')]")
	public WebElement welcomeText;
	
	@FindBy(id = "ctl00_logout")
	public WebElement logOutButton;
	
public void login(String userName,String password){
	usernameInputBox.sendKeys(userName);
	passwordInputBox.sendKeys(password);
	loginButton.click();
}
}