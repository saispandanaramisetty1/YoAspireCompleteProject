package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;




public class EditProfile  {
	@FindBy(xpath = "//IMG[@src='https://yoaspire.com:8050/public/images/15459808276545c604359-4ee8-406a-9d70-53ad4e3392bd.jpg']")
	public WebElement profile;
	
	@FindBy(xpath = "//A[@href='/myprofile'][text()='Profile']")
	public WebElement profileButton;
	
	@FindBy(xpath = "//A[@class='edit-img-link'][text()='Edit details']")
	public WebElement editProfile;
	
	@FindBy(xpath = "//INPUT[@id='input_6']")
	public WebElement lastName;
	
	@FindBy(xpath = "//INPUT[@id='input_7']")
	public WebElement cityName;
	
	@FindBy(xpath = "//INPUT[@id='input_8']")
	public WebElement mobile;
	
	@FindBy(xpath = "(//BUTTON[@class='btn waves-effect waves-light btn-flat modal-action modal-close'][text()='Close'][text()='Close'])[4]")
	public WebElement closeButton;
	
	@FindBy(xpath = "(//BUTTON[@class='btn waves-effect waves-light'][text()='Save'][text()='Save'])[1]")
	public WebElement saveButton;
	
	

	public void editAndCancel(String last, String city, String number) throws InterruptedException {
		CommonMethods.click(profile);
		Thread.sleep(3000);
		CommonMethods.click(profileButton);
		Thread.sleep(3000);
		CommonMethods.click(editProfile);
		Thread.sleep(3000);
		CommonMethods.enter(lastName, last);
		Thread.sleep(3000);
		CommonMethods.enter(cityName, city);
		Thread.sleep(3000);
		CommonMethods.enter(mobile, number);
		Thread.sleep(3000);
		CommonMethods.click(closeButton);
	}
	
	

	public void editAndSave(String last, String city, String number) throws InterruptedException {
		CommonMethods.click(editProfile);
		Thread.sleep(3000);
		CommonMethods.enter(lastName, last);
		Thread.sleep(3000);
		CommonMethods.enter(cityName, city);
		Thread.sleep(3000);
		CommonMethods.enter(mobile, number);
		Thread.sleep(3000);
		CommonMethods.click(closeButton);
	}

}
