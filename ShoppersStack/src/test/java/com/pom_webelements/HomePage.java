package com.pom_webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ss.Base.ShopperStackBaseClass;

public class HomePage extends ShopperStackBaseClass{
	
	public HomePage(WebDriver driver) {
		webDriver=driver;
	}
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h3")
	private WebElement welcomeMesaage;
	
	@FindBy(linkText = "Home")
	private WebElement homeLink;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getWelcomeMesaage() {
		return welcomeMesaage;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}
	
	
	

}
