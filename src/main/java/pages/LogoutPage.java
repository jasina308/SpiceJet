package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class LogoutPage  extends ProjectSpecification{

	//@FindBy annotation used to locate webelements
	@FindBy(xpath="//div[text()='You have been successfully logged out.']")
	WebElement logout_msg;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj'])[1]")
	WebElement logout_button;
	
	@FindBy(xpath="//div[text()='Hi Jasina']")
	WebElement login_msg;
	
	//constructor initialization 
public LogoutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

//Method to check the logout message 

public LogoutPage verifyLogoutMessage(String text) {
	
	validationOfText(logout_msg,text);
	
	return this;
}

//Method to click the user name 
public LogoutPage clickUserName() {
	click(login_msg);
	return this;
}

//Method to click logout button 
public LogoutPage clickLogoutButton() {
	click(logout_button);
	return this;
}


}
