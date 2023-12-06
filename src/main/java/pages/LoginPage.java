package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class LoginPage  extends ProjectSpecification{
	
	//@find by annotation used to locate webelements 
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement email;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement enter_email;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	WebElement enter_password;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement login_button1;
	
	@FindBy(xpath="//div[text()='Hi Jasina']")
	WebElement login_msg;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement enter_phone;
	
	@FindBy(xpath="//div[text()='Invalid Username/Password']")
	WebElement invalid_msg;
	
	@FindBy(xpath="//div[text()='Please enter a valid email address']")
	WebElement invalid_email;
	
	@FindBy(xpath="//div[text()='Please enter a valid password']")
	WebElement invalid_pass;
	
	
	//Constructor Initialization
public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//Method to click email radio button 
public LoginPage clickEmail() {
	click(email);
	return this;
}

//Method to enter email address
public LoginPage enterEmail(String email) {
	sendKeys(enter_email,email);
	return this;
}

//Method to enter password 
public LoginPage enterPassword(String pass) {
	
	sendKeys(enter_password,pass);
	return this;
	
}

//Method to verify the login message 
public LoginPage verifyLoginMessage(String text) {
	
	WaitForVisibility(login_msg);
	validationOfText(login_msg,text);
	
		return this;
}

//Method to verify the title after login 
public HomePage verifyLoginPage(String title) {

	validationOfTitle(title);
	return new HomePage(driver);
	
}
//Method to click login button 
public LoginPage clickLoginButton() throws InterruptedException  {
	
	actionClick(login_button1);
	sleep();
	
	return this;
}

//Method to enter phone number 
public LoginPage enterPhone(String phone) {
	
	sendKeys(enter_phone,phone);
	return this;
	
}

//Method to verify invalid login error message 
public LoginPage verifyInvalidMessage(String text) {
	
	validationOfText(invalid_msg,text);
	
	return this;
}

//Method to validate the error message of email field 
public LoginPage verifyInvalidEmailMessage(String text) {
	
	validationOfText(invalid_email,text);
	
	return this;
}

//Method to validate the error message of password  field 
public LoginPage verifyInvalidPasswordMessage(String text) {
	
	validationOfText(invalid_pass,text);
	
	return this;
}

}