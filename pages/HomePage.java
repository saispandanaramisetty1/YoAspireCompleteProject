package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basetest.BaseTest;
import com.util.CommonMethods;



public class HomePage {
	@FindBy(xpath="(//IMG[@src='/static/media/admin.dc8eb05f.jpg'])[1]")
	public WebElement image;
	@FindBy(xpath="//a[text()='Profile']")
	public WebElement profile;
	@FindBy(xpath="//A[text()='Sign Out']")
	public WebElement signout;
	@FindBy(xpath="(//BUTTON[@class='btn'][text()='Sign Out'][text()='Sign Out'])[1]")
	public WebElement signoutButton;
	@FindBy(xpath="//a[text()='Edit details']")
	public WebElement editDetalis;
	@FindBy(xpath="//input[@type='file'][@name='image']")
	public WebElement uploadImage;
	
	
	public void uploadImage() throws InterruptedException {
		CommonMethods.click(image);
		BaseTest.logger.info("clicked on the image");
		CommonMethods.click(profile);
		BaseTest.logger.info("clicked on the profile");
		CommonMethods.click(editDetalis);
		BaseTest.logger.info("click on the edit details");
		CommonMethods.click(uploadImage);
		BaseTest.logger.info("click on the upload image");
	}
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		CommonMethods.click(image);
		Thread.sleep(1000);
		CommonMethods.click(signout);
		CommonMethods.click(signoutButton);
	}

}
