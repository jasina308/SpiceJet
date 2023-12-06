package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ForgotPasswordPage  extends ProjectSpecification{
	
	//@find by annotation used to locate webelements 
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4']")
	WebElement mobile;
	
	@FindBy(xpath="//div[text()='SEND OTP']")
	WebElement send;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1862ga2 r-2t9rge r-n6v787 r-1bymd8e']")
	WebElement message;
	
	//Constructor Initialization
public ForgotPasswordPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//Method to enter phone number in mobile field 
public ForgotPasswordPage enterMobile(String phone) {
	
	sendKeys(mobile,phone);
	return this;
}

//Method to click send button 
public ForgotPasswordPage clickSendOTP() {
	actionClick(send);
	return this;
}

//Method to verify the  display message 
public ForgotPasswordPage verifyOTPMesaage(String excepted) {
	
	validationOfText(message,excepted);
	return this;
}
}
