package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basetest.BaseTest;
import com.util.CommonMethods;

public class LoginPage extends BaseTest{
	@FindBy(xpath = "//I[@class='icon-arrow']")
	public WebElement arrow;
	
	@FindBy(xpath = "//INPUT[@id='input_11']")	
	public WebElement userName;
	
	@FindBy(xpath = "//INPUT[@id='input_12']")
	public WebElement password;
	
	@FindBy(xpath = "//BUTTON[@class='btn signin-btn'][text()='Sign in']")
	public WebElement signIn;
	
	public void validateLoginPage(int i) {
		arrow.click();
		userName.sendKeys(CommonMethods.readingUserName(i));
		password.sendKeys(CommonMethods.readingPassword(i));
		signIn.click();
	}
}
