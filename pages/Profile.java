package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;




public class Profile {
	
	@FindBy(xpath="(//BUTTON[@class='btn edit-credential-btn'][text()='Add'][text()='Add'])[1]")
	public WebElement add1;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[1]")
	public WebElement companyName;
	
	@FindBy(xpath=" (//INPUT[@class='credential-input-field'])[2]")
	public WebElement designation;
	
	@FindBy(xpath="(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__year'])[1]")
	public WebElement fromDate;
	
	@FindBy(xpath="//TIME[@datetime='2019-03-06T00:00:00.000'][text()='6']")
	public WebElement date1;
	
	@FindBy(xpath="(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__year'])[2]")
	public WebElement toDate;
	
	@FindBy(xpath="(//TIME[@datetime='2019-03-21T00:00:00.000'][text()='21'][text()='21'])[2]")
	public WebElement date2;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[3]")
	public WebElement location;
	
	@FindBy(xpath="//TEXTAREA[@class='credential-text-area']")
    public WebElement discription;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-credential-btn'][text()='Cancel']")
	public WebElement cancel1;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-credential-btn'][text()='Save']")
	public WebElement save1;
	
	@FindBy(xpath="//A[@href='/myprofile/all_recos'][text()='View All']")
	public WebElement recommendation;
	
	@FindBy(xpath="//SPAN[@id='5c752a76b6c5f6590e7e5a00']")
	public WebElement accept;
	
	@FindBy(xpath="//A[@href='/myprofile/'][text()='Back to My Profile']")
	public WebElement backToProfile;
	
	@FindBy(xpath="(//BUTTON[@class='btn edit-credential-btn'][text()='Add'][text()='Add'])[2]")
	public WebElement add2;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[1]")
	public WebElement degreeField;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[2]")
	public WebElement specializationField;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[3]")
	public WebElement universityField;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field percentage-input'])[1]")
	public WebElement percentageField;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-page-btn edit-credential-btn'][text()='Save']")
	public WebElement Save2;
	
	@FindBy(xpath="(//BUTTON[@class='btn edit-credential-btn'][text()='Add'][text()='Add'])[3]")
	public WebElement add3;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[1]")
	public WebElement collegeField;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[2]")
	public WebElement boardField;
	
	@FindBy(xpath="")
	public WebElement percentageField2;
	
	@FindBy(xpath="(//BUTTON[@class='btn waves-effect waves-light edit-page-btn edit-credential-btn'][text()='Save'][text()='Save'])[2]")
	public WebElement save3;
	
	@FindBy(xpath="(//BUTTON[@class='btn edit-credential-btn'][text()='Add'][text()='Add'])[4]")
	public WebElement add4;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[1]")
	public WebElement schoolField;
	
	@FindBy(xpath="(//INPUT[@class='credential-input-field'])[2]")
	public WebElement boardField1;
	
	@FindBy(xpath="//INPUT[@class='credential-input-field percentage-input']")
	public WebElement percentageField3;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-page-btn edit-credential-btn'][text()='Save']")
	public WebElement save4;
	
	@FindBy(xpath="(//BUTTON[@class='btn edit-credential-btn'][text()='Add'][text()='Add'])[5]")
	public WebElement add5;
	
	@FindBy(xpath="//INPUT[@class='credential-input-field']")
	public WebElement skills;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-credential-btn'][text()='Save']")
	public WebElement save5;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-credential-btn'][text()='Cancel']")
	public WebElement cancel2;
	
	@FindBy(xpath="(//BUTTON[@class='btn edit-credential-btn'][text()='Add'][text()='Add'])[6]")
	public WebElement add6;
	
	@FindBy(xpath="//INPUT[@class='credential-input-field']")
	public WebElement languagesField;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-credential-btn'][text()='Save']")
	public WebElement save6;
	
	@FindBy(xpath="(//BUTTON[@class='btn edit-credential-btn'][text()='Add'][text()='Add'])[7]")
	public WebElement add7;
	
	@FindBy(xpath="//INPUT[@class='credential-input-field']")
	public WebElement interestField;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-credential-btn'][text()='Save']")
	public WebElement save7;
	
	@FindBy(xpath="//BUTTON[@class='btn edit-credential-btn'][text()='Edit']")
	public WebElement add8;
	
	@FindBy(xpath="//LABEL[@class='active'][text()='Female']")
	public WebElement genderField;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-page-btn edit-credential-btn'][text()='Save']")
	public WebElement save8;
	
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light edit-page-btn edit-credential-btn'][text()='Cancel']")
	public WebElement cancel3;
	
	
	
	
	//Add work experience and click  cancel button
	public void workExperienceAndClose(String company,String des,String loc,String discript) throws InterruptedException
	{
		
		CommonMethods.click(add1);
		Thread.sleep(3000);
		CommonMethods.enter(companyName, company);
		Thread.sleep(3000);
		CommonMethods.enter(designation, des);
		Thread.sleep(3000);
		CommonMethods.click(fromDate);
		Thread.sleep(3000);
		CommonMethods.click(date1);
		Thread.sleep(3000);
		CommonMethods.click(toDate);
		Thread.sleep(3000);
		CommonMethods.click(date2);
		Thread.sleep(3000);
		CommonMethods.enter(location, loc);
		Thread.sleep(3000);
		CommonMethods.enter(discription, des);
		Thread.sleep(3000);
		CommonMethods.click(cancel1);
	}
	
	
	//Add work experience and click  save button
	public void workExperienceAndSave(String company,String des,String loc,String discript) throws InterruptedException
	{
		CommonMethods.click(add1);
		Thread.sleep(3000);
		CommonMethods.enter(companyName, company);
		Thread.sleep(3000);
		CommonMethods.enter(designation, des);
		Thread.sleep(3000);
		CommonMethods.click(fromDate);
		Thread.sleep(3000);
		CommonMethods.click(date1);
		Thread.sleep(3000);
		CommonMethods.click(toDate);
		Thread.sleep(3000);
		CommonMethods.click(date2);
		Thread.sleep(3000);
		CommonMethods.enter(location, loc);
		Thread.sleep(3000);
		CommonMethods.enter(discription, des);
		Thread.sleep(3000);
		CommonMethods.click(save1);
	}
	
	
	//Accept recommendation
	public void recomendation() throws InterruptedException
	{
		CommonMethods.click(recommendation);
		Thread.sleep(3000);
		CommonMethods.click(accept);
		Thread.sleep(3000);
		CommonMethods.click(backToProfile);
	}
	
	
	//Add skills and click cancel button
	public void cancelSkills(String skil) throws InterruptedException
	{
		CommonMethods.click(add5);
		Thread.sleep(2000);
		CommonMethods.enter(skills, skil);
		CommonMethods.click(cancel2);
	}
	
	
	//Add skills and click  save button
	public void addSkills(String skil) throws InterruptedException
	{
		CommonMethods.click(add5);
		Thread.sleep(2000);
		CommonMethods.enter(skills, skil);
		CommonMethods.click(save5);
	}
	
	
	//Add gender and click cancel button 
	public void cancelGender() throws InterruptedException
	{
		CommonMethods.click(add8);
		Thread.sleep(2000);
		CommonMethods.click(genderField);
		CommonMethods.click(cancel3);
	}
	
	
	
	//Add gender click save button
	public void addGender() throws InterruptedException
	{
		CommonMethods.click(add8);
		Thread.sleep(2000);
		CommonMethods.click(genderField);
		CommonMethods.click(save8);
	}
	
	
	//Edit the profile
	public void profileDetails(String degree,String specilization,String university,String percentage,String college,String board,String percentage1,String school,String board1,String percentage2,String languages,String interests) throws InterruptedException
	{
		CommonMethods.click(add2);
		Thread.sleep(3000);
		CommonMethods.enter(degreeField, degree);
		Thread.sleep(3000);
		CommonMethods.enter(specializationField, specilization);
		Thread.sleep(3000);
		CommonMethods.enter(universityField, university);
		CommonMethods.click(fromDate);
		Thread.sleep(3000);
		CommonMethods.click(date1);
		Thread.sleep(3000);
		CommonMethods.click(toDate);
		Thread.sleep(3000);
		CommonMethods.click(date2);
		Thread.sleep(3000);
		CommonMethods.enter(percentageField, percentage);
		Thread.sleep(3000);
		CommonMethods.click(Save2);
		Thread.sleep(2000);
		CommonMethods.click(add3);
		Thread.sleep(2000);
		CommonMethods.enter(collegeField, college);
		Thread.sleep(2000);
		CommonMethods.enter(boardField, board);
		Thread.sleep(2000);
		CommonMethods.click(fromDate);
		Thread.sleep(3000);
		CommonMethods.click(date1);
		Thread.sleep(3000);
		CommonMethods.click(toDate);
		Thread.sleep(3000);
		CommonMethods.click(date2);
		Thread.sleep(3000);
		CommonMethods.enter(percentageField2, percentage1);
		Thread.sleep(2000);
		CommonMethods.click(add4);
		Thread.sleep(2000);
		CommonMethods.enter(schoolField, school);
		Thread.sleep(2000);
		CommonMethods.enter(boardField1, board1);
		CommonMethods.click(fromDate);
		Thread.sleep(3000);
		CommonMethods.click(date1);
		Thread.sleep(3000);
		CommonMethods.click(toDate);
		Thread.sleep(3000);
		CommonMethods.click(date2);
		Thread.sleep(3000);
		CommonMethods.enter(percentageField3, percentage2);
		Thread.sleep(2000);
		CommonMethods.click(save4);
		CommonMethods.click(add6);
		Thread.sleep(2000);
		CommonMethods.enter(languagesField, languages);
		CommonMethods.click(save6);
		CommonMethods.click(add7);
		Thread.sleep(2000);
		CommonMethods.enter(interestField, interests);
		CommonMethods.click(save7);
		
		
	}
	
	

}
