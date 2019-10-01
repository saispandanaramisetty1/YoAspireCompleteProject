package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;

public class SetFeedBackFormPage {
	@FindBy(xpath = "//BUTTON[@class='btn register-drive-btn'][text()='Set Feedback Format']")
	public WebElement clickOnSetFedBack;
	
	@FindBy(xpath = "//INPUT[@id='skill_rating-0']")	
	public WebElement skillRating;
	
	@FindBy(className = "skill_category")	
	public WebElement skillCategory;
	
	
	@FindBy(xpath = "//INPUT[@id='max_rating-0']")
	public WebElement maxRating;

	@FindBy(xpath = "//INPUT[@id='cutoff_rating-0']")	
	public WebElement cutRating;
	
	@FindBy(xpath = "//BUTTON[@class='btn logout-btn'][text()='Submit form']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//BUTTON[@class='btn addnewskill-btn'][text()='Add new feedback skill']")
	public WebElement addNewFeedBack;
	
	@FindBy(xpath = "//INPUT[@id='skill_rating-1']")	
	public WebElement skillRating1;
	
	@FindBy(xpath = "//input[@type='number'][@name='skill_rating-1']")	
	public WebElement skillCategory1;
	
	
	@FindBy(xpath = "//INPUT[@id='max_rating-1']")
	public WebElement maxRating1;

	@FindBy(xpath = "//INPUT[@id='cutoff_rating-1']")	
	public WebElement cutRating1;
	
	@FindBy(xpath = "//BUTTON[@class='btn register-drive-btn'][text()='View Feedback Format']")
	public WebElement viewButton1;

	public void setFeedBackForm() {
		try {
			clickOnSetFedBack.click();
			skillRating.sendKeys(CommonMethods.readingUserName(2));
			skillCategory.sendKeys(CommonMethods.readingUserName(3));
			maxRating.sendKeys(CommonMethods.readingUserName(4));
			cutRating.sendKeys(CommonMethods.readingUserName(5));
			//submitButton.click();
		}
		catch(Exception e) {
			viewButton1.click();
		}
	}
	public void AddingdiffSkill() {
		try {
		setFeedBackForm();
		addNewFeedBack.click();
		skillRating1.sendKeys(CommonMethods.readingPassword(2));
		skillCategory1.sendKeys(CommonMethods.readingPassword(3));
		maxRating1.sendKeys(CommonMethods.readingPassword(4));
		cutRating1.sendKeys(CommonMethods.readingPassword(5));
		submitButton.click();
		}catch(Exception e) {
			
		}
	}
}
