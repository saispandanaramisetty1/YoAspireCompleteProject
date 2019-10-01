package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;



public class ProfileBio {
	
	@FindBy(xpath="(//BUTTON[@class='btn'])[1]")
	public WebElement bio;
	
	@FindBy(xpath="//TEXTAREA[@id='input_10']")
	public WebElement summery;
	
	@FindBy(xpath="(//BUTTON[@class='btn waves-effect waves-light btn-flat modal-action modal-close'][text()='Close'][text()='Close'])[5]")
	public WebElement closeButton;
	
	@FindBy(xpath="(//BUTTON[@class='btn waves-effect waves-light'][text()='Save'][text()='Save'])[2]")
	public WebElement saveButton;
	
	
	
	
	
	public void bioWithCancel(String text) throws InterruptedException
	{
		CommonMethods.click(bio);
		Thread.sleep(3000);
		CommonMethods.enter(summery, text);
		Thread.sleep(3000);
		CommonMethods.click(closeButton);
	}
	
	public void bioWithsave(String text) throws InterruptedException
	{
		CommonMethods.click(bio);
		Thread.sleep(3000);
		CommonMethods.enter(summery, text);
		Thread.sleep(3000);
		CommonMethods.click(saveButton);
	}


}
