package com.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basetest.BaseTest;
import com.util.CommonMethods;



public class AddDrive extends BaseTest {
	@FindBy(xpath = "(//INPUT[@class='credential-input-field'])[1]")
	public WebElement headingtext;
	@FindBy(xpath = "(//INPUT[@class='credential-input-field'])[2]")
	public WebElement subheadingtext;
	@FindBy(xpath = "(//TEXTAREA[@class='credential-text-area'])[1]")
	public WebElement description;
	@FindBy(xpath = "(//INPUT[@class='credential-input-field'])[3]")
	public WebElement cities;
	@FindBy(xpath = "(//INPUT[@class='credential-input-field'])[4]")
	public WebElement venue;
	@FindBy(xpath = "(//BUTTON[@class='react-date-picker__calendar-button react-date-picker__button'])[1]")
	public WebElement when;
	@FindBy(xpath = "(//div[@class='react-date-picker__calendar-button react-date-picker__button'])")
	public WebElement cal;
//      @FindBy(xpath = "BUTTON[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button'][text()='›']")
//      public WebElement arrow;
//      @FindBy(xpath = "//TIME[@datetime='2019-04-25T00:00:00.000'][text()='25']")
//      public WebElement dateclick;
	@FindBy(xpath = "(//BUTTON[@class='react-date-picker__calendar-button react-date-picker__button'])[2]")
	public WebElement upto;
//	  @FindBy(xpath = "//BUTTON[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button'][text()='›']")
//	  public WebElement month;
//	  @FindBy(xpath = "//TIME[@datetime='2019-02-22T00:00:00.000'][text()='22']")
//	  public WebElement date;
	@FindBy(xpath = "(//INPUT[@class='credential-input-field'])[5]")
	public WebElement urladd;
	@FindBy(xpath = "//INPUT[@id='uploadFile']")
	public WebElement uploadimage;
	@FindBy(xpath = "(//TEXTAREA[@class='credential-text-area'])[2]")
	public WebElement eligibility;
	@FindBy(xpath = "(//TEXTAREA[@class='credential-text-area'])[3]")
	public WebElement moreinformation;
	@FindBy(xpath = "(//INPUT[@class='credential-input-field'])[6]")
	public WebElement phno;
	@FindBy(xpath = "//BUTTON[@class='btn logout-btn'][text()='Submit']")
	public WebElement submitbut;
	
	@FindBy(xpath = "(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__month'])[1]")
	public WebElement month;

	@FindBy(xpath = "(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__day'])[1]")
	public WebElement date;

	@FindBy(xpath = "(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__year'])[1]")
	public WebElement year;
	
	@FindBy(xpath = "(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__month'])[2]")
	public WebElement monthin;

	@FindBy(xpath = "(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__day'])[2]")
	public WebElement datin;

	@FindBy(xpath = "(//INPUT[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__year'])[2]")
	public WebElement yearin;

//      @FindBy(xpath = "(//BUTTON[@class='react-date-picker__clear-button react-date-picker__button'])[2]")
//      public WebElement cross;
	public void drive(String heading, String daty, String mont, String yr, String day, String mony, String yea,
			String subheading, String des, String city, String ven, String url, String eligible, String moreinfo,
			String phnum) throws InterruptedException, IOException {
		Thread.sleep(3000);
		// CommonMethods.click(headingtext);
		CommonMethods.enter(headingtext, heading);
		CommonMethods.enter(subheadingtext, subheading);
		CommonMethods.enter(description, des);
		CommonMethods.enter(cities, city);
		CommonMethods.enter(venue, ven);
//      	CommonMethods.click(when);
//      	Thread.sleep(3000);
		CommonMethods.click(month);
		CommonMethods.enter(month, daty);
		CommonMethods.click(date);
		CommonMethods.enter(date, mont);
		CommonMethods.click(year);
		CommonMethods.enter(year, yr);
		// CommonMethods.click(cross);
		Thread.sleep(3000);
		CommonMethods.click(monthin);
		CommonMethods.enter(monthin, day);
		CommonMethods.click(datin);
		CommonMethods.enter(datin, mony);
		CommonMethods.click(yearin);
		CommonMethods.enter(yearin, yea);
		Thread.sleep(3000);
		// CommonMethods.click(upto);
//      	CommonMethods.click(month);
//        CommonMethods.click(date);
		CommonMethods.enter(urladd, url);
		CommonMethods.click(uploadimage);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E:\\AutoIT\\YoaspireImageUpload.exe");
		Thread.sleep(3000);
		CommonMethods.enter(eligibility, eligible);
		CommonMethods.enter(moreinformation, moreinfo);
		CommonMethods.enter(phno, phnum);
		CommonMethods.click(submitbut);
		Thread.sleep(3000);
	}
	public void drivedetail(String heading, String city, String ven) throws Exception
	{
		CommonMethods.clear(headingtext);
		CommonMethods.enter(headingtext, heading);
		CommonMethods.clear(cities);
		CommonMethods.enter(cities, city);
		CommonMethods.clear(venue);
		CommonMethods.enter(venue, ven);
		CommonMethods.click(submitbut);
		Thread.sleep(3000);
		
	}

//	public void calender() {
//		List<WebElement> dates = driver.findElements(By.xpath(
//				"//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev2-button']"));
//		System.out.println(dates.size());
//		for (int i = 0; i < dates.size(); i++) {
//			System.out.println(dates.get(i).getText());
//		}
//	}
}
