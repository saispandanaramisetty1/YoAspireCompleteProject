package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;

public class NominateInterviewsPage {
	
	@FindBy(xpath = "//BUTTON[@class='btn register-drive-btn'][text()='Nominate Interviewers']")
	public WebElement nomination;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]	")	
	public WebElement search;
	
	@FindBy(xpath = "//BUTTON[@value='5c2323015baf780f39333f3b'][text()='Add']")
	public WebElement adding;
	
	@FindBy(xpath = "//BUTTON[@value='5c2323015baf780f39333f3b'][text()='Remove']")
	public WebElement removing;
	
	public void nominatingInterviews(int i) throws InterruptedException {
		nomination.click();
		search.sendKeys(CommonMethods.readingUserName(i));
		Thread.sleep(2000);
		adding.click();
		Thread.sleep(2000);
		removing.click();
		Thread.sleep(2000);
	}
}
