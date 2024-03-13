package com.pom_webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ss.Base.ShopperStackBaseClass;

public class LoginPage extends ShopperStackBaseClass{
	
	public LoginPage(WebDriver driver) {
		webDriver=driver;
	}
	
	@FindBy(xpath = "//strong")
	private WebElement shopperLoginPageText;

	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
	private WebElement loginButton;

	@FindBy(xpath = "(//span[@class='MuiButton-label'])[2]")
	private WebElement createAccountButton;
	
	public WebElement getShopperLoginPageText() {
		return shopperLoginPageText;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	
}
