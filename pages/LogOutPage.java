package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {
	@FindBy(xpath = "(//IMG[@src='https://yoaspire.com:8050/public/images/15458201955583fd4c63f-9845-43c3-b497-026bb6535abd.jpg'])[1]")
	public WebElement profileImage;
	
	@FindBy(xpath = "//A[text()='Sign Out']")	
	public WebElement signOut;
	
	@FindBy(xpath = "(//BUTTON[@class='btn'][text()='Sign Out'][text()='Sign Out'])[1]")
	public WebElement signOutBut;
	
	public void validatingLogOut() throws InterruptedException {
		profileImage.click();
		Thread.sleep(2000);
		signOut.click();
		Thread.sleep(2000);
		signOutBut.click();
		Thread.sleep(2000);
	}
}
