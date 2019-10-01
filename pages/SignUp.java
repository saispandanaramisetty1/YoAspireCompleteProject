package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.basetest.BaseTest;
import com.util.CommonMethods;

public class SignUp extends BaseTest
{
	
	 @FindBy(how = How.XPATH, using = "//I[@class='icon-arrow']")
	public WebElement arrowclick;
	  @FindBy(how = How.XPATH, using = "//INPUT[@id='input_11']")
	public WebElement usernameclick;
	  @FindBy(how = How.XPATH, using = "//INPUT[@id='input_12']")
	public WebElement passwordclick;
	  @FindBy(how = How.XPATH, using = "//BUTTON[@class='btn signin-btn'][text()='Sign in']")
	public WebElement signinclick;
	 
	
public void data(String username,String password) throws InterruptedException
{
	driver.navigate().refresh();
	Thread.sleep(5000);
	CommonMethods.click(arrowclick);
	Thread.sleep(5000);
	CommonMethods.enter(usernameclick,username);
	CommonMethods.enter(passwordclick,password);
	CommonMethods.click(signinclick);
	 
}	
}