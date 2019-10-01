package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.basetest.BaseTest;
import com.util.CommonMethods;
/**
 * 
 * @author UserPage
 * Class for inspecting individual webelements in the YoAspire Website
 *
 */

public class UserPage extends BaseTest 
{
    //inspecting arrow icon	
	@FindBy(xpath="//I[@class='icon-arrow']")
	public static WebElement arrowIcon;
	//inspecting username field	
	@FindBy(xpath="//INPUT[@id='input_11']")
	public static WebElement userName;
	//inspecting password field
	@FindBy(xpath="//INPUT[@id='input_12']")
	public static WebElement password;
	//inspecting SignIn button
	@FindBy(xpath="//BUTTON[@class='btn signin-btn'][text()='Sign in']")
	public static WebElement signIn;
	//inspecting drives field in navigation bar
	@FindBy(xpath="(//SPAN[@class='navbar-option-txt'][text()='Drives'][text()='Drives'])[1]")
	public static WebElement drives;
	//inspecting one drive in new drives
	@FindBy(xpath="//P[@class='date-txt'][text()='14 | Mar']")
	public static WebElement march;
	//inspecting register button
	@FindBy(xpath="//BUTTON[@class='btn connect-btn'][text()='Register']")
	public static WebElement register;
	//inspecting search box
	@FindBy(xpath="//LABEL[@class=''][text()='Search people']")
	public static WebElement searchBox;
	//inspecting input of search
	@FindBy(xpath="//input[@type='text'][@name='search']")
	public static WebElement input;
	//inspecting one of the searched elements
	@FindBy(xpath="(//IMG[@src='https://yoaspire.com:8050/public/images/15513298765618f79bef3-cb78-48ea-90e5-47db11410c1c.jpg'])[1]")
	public static WebElement searchElement1;
	//inspecting Recommend button
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	public static WebElement Recommend;
	//inspecting dropdown
	@FindBy(xpath="//input[@type='text'][@value='You managed SaiSpandana']")
	public static WebElement managingProfile;
	//inspecting one of the selected texts in dropdown
	@FindBy(xpath="//SPAN[text()='You worked with SaiSpandana on same project']")
	public static WebElement dropdown;
	//inspecting feedback field
	@FindBy(xpath="//textarea[@name='reco']")
	public static WebElement feedback;
	//inspecting submit button
	@FindBy(xpath="//BUTTON[@class='btn'][text()='Submit']")
	public static WebElement submit;
	//inspecting My Connections in Navigation Bar
	@FindBy(xpath="(//SPAN[@class='navbar-option-txt'][text()='My Connections'][text()='My Connections'])[1]")
	public static WebElement MyConnections;
	//inspecting one of the searched elements
	@FindBy(xpath="(//IMG[@src='/static/media/admin.dc8eb05f.jpg'])[2]")
	public static WebElement searchElement2;
	//inspecting connect button
	@FindBy(xpath="//BUTTON[@class='btn'][text()='Connect']")
	public static WebElement connect;
	//inspecting one of the friends 
	@FindBy(xpath="//IMG[@src='https://yoaspire.com:8050/public/images/1551086671325420bb0d9-1d64-4a64-b64a-3f1b4e01a288.jpg']")
	public static WebElement friends;
	//inspecting friend reccommend button
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/div[1]/div[1]/button[1]")
	public static WebElement friendsRecommend;
	//inspecting the friend dropdown
	@FindBy(xpath="//input[@type='text'][@value='You managed Inturi']")
	public static WebElement manageFriends;
	//inspecting one of the selected texts from friend dropdown
	@FindBy(xpath="//span[text()='You worked with Inturi on different project']")
	public static WebElement friendsDropdown;
	//inspecting articles in Navigation Bar
	@FindBy(xpath="//span[text()='Articles']")
	public static WebElement articles;
//	@FindBy(xpath="(//BUTTON[@class='btn read-articles-btn'][text()='Read'][text()='Read'])[2]")
//	public static WebElement read;
	//inspecting read button
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[9]/div[1]/div[1]/a[1]/button[1]")
	public static WebElement read;
	//inspecting AllArticles Button in articles
	@FindBy(xpath="//A[@class='archivelist-link'][text()='All articles']")
	public static WebElement allArticles;
	//inspecting Messages in Navigation Bar
	@FindBy(xpath="//span[text()='Messages']")
	public static WebElement messages;
	//inspecting one of the profile from Messages
	@FindBy(xpath="//H6[@id='5c249a07e7179a748798445c']")
	public static WebElement messagesProfile;
	//inspecting chat box
	@FindBy(xpath="//TEXTAREA[@class='reply-textarea']")
	public static WebElement chat;
	//inspecting send button
	@FindBy(xpath="//BUTTON[@tabindex='0'][text()='Send']")
	public static WebElement send;
	//inspecting LogOut Image
	@FindBy(xpath="(//IMG[@src='https://yoaspire.com:8050/public/images/15459808276545c604359-4ee8-406a-9d70-53ad4e3392bd.jpg'])[1]")
	public static WebElement logoutImage;
	//inspecting signout popup
	@FindBy(xpath="//A[text()='Sign Out']")
	public static WebElement signOut;
	//inspecting signout button
	@FindBy(xpath="(//BUTTON[@class='btn'][text()='Sign Out'][text()='Sign Out'])[1]")
	public static WebElement logOut;
	//Method for sign in to the website with valid credentials	
	public void login(String uName,String pwd) throws Exception 
	{
		Thread.sleep(5000);
		CommonMethods.click(arrowIcon);
		Thread.sleep(5000);
		CommonMethods.enter(userName, uName);
		CommonMethods.enter(password, pwd);
		CommonMethods.click(signIn);
		
	}
	//Method for register for the drives
	public void driveRegistration() throws Exception
	{
		Thread.sleep(5000);
		CommonMethods.click(drives);
		CommonMethods.click(march);
//		CommonMethods.clickable(register);
		
	}
	//Method for recommending particular user
	public void recommendingConnections(String search,String text) throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.click(searchBox);
		CommonMethods.enter(input, search);
		Thread.sleep(5000);
		CommonMethods.click(searchElement1);
		Thread.sleep(3000);
		CommonMethods.click(Recommend);
		Thread.sleep(3000);
		CommonMethods.click(managingProfile);
		Thread.sleep(3000);
		CommonMethods.click(dropdown);
		Thread.sleep(3000);
		CommonMethods.enter(feedback,text);
		CommonMethods.click(submit);
	}
	//Method for connect to other users
	public void myConnections(String search) throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.click(MyConnections);
		Thread.sleep(3000);
		CommonMethods.click(searchBox);
		Thread.sleep(3000);
		CommonMethods.enter(input, search);
		Thread.sleep(3000);
		CommonMethods.click(searchElement2);
//		CommonMethods.clickable(connect);
	}
	//Method for connect to friends connections
	public void connectionConnections(String text) throws Exception
	{
		Thread.sleep(5000);
		CommonMethods.click(friends);
		Thread.sleep(5000);
		CommonMethods.click(friendsRecommend);
		Thread.sleep(5000);
		CommonMethods.click(manageFriends);
		Thread.sleep(5000);
		CommonMethods.click(friendsDropdown);
		Thread.sleep(5000);
		CommonMethods.enter(feedback,text);
		CommonMethods.click(submit);
	}
	//Method for reading articles
	public void articles() throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.click(articles);
		Thread.sleep(3000);
		CommonMethods.click(read);
		Thread.sleep(3000);
		CommonMethods.click(allArticles);
	}
	//Method for sending messages
	public void messages(String message) throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.click(messages);
		Thread.sleep(3000);
		CommonMethods.click(messagesProfile);
		Thread.sleep(3000);
		CommonMethods.enter(chat, message);
		CommonMethods.click(send);
	}
	//Method for logout 
	public void logout() throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.click(logoutImage);
		Thread.sleep(5000);
		CommonMethods.click(signOut);
		Thread.sleep(5000);
		CommonMethods.click(logOut);
	}
//	public void beforeMethod()
//	{
//		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
//	}
	
	
}
