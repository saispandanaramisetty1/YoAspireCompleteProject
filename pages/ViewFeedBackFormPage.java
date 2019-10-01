package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewFeedBackFormPage extends SetFeedBackFormPage{
	@FindBy(xpath = "//BUTTON[@class='btn register-drive-btn'][text()='View Feedback Format']")
	public WebElement viewButton;
	
	public void viewDetails() {
		try {
			viewButton.click();
		}
		catch(Exception e){
			setFeedBackForm();
			
		}
	}
}