package com.pom_webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ss.Base.ShopperStackBaseClass;

public class RegistrationPage extends ShopperStackBaseClass{
	
	public RegistrationPage(WebDriver driver) {
		webDriver=driver;
	}
	
	@FindBy(xpath = "(//h1)[1]")
	private WebElement ReagistrationPageText;
	
	@FindBy(id = "First Name")
	private WebElement firstName;
	
	@FindBy(id="Last Name")
	private WebElement lastName;

	@FindBy(id="Female")
	private WebElement femaleGender;
	
	@FindBy(id="Male")
	private WebElement maleGender;
	
	@FindBy(id="Other")
	private WebElement otherGender;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id="Email Address")
	private WebElement emailAddress;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="Confirm Password")
	private WebElement confirmPassword;
	
	@FindBy(id="Terms and Conditions")
	private WebElement checkBox;
	
	@FindBy(id="Register")
	private WebElement registerButton;
}
