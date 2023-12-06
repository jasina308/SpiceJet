package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignUpPage extends ProjectSpecification {
	
	//@FindBy annotation used to locate webelements
	@FindBy(xpath="//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(id="dobDate")
	WebElement dob;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy(id="new-password")
	WebElement password;
	
	@FindBy(id="c-password")
	WebElement confpassword;
	
	@FindBy(css = "#defaultCheck1")
	WebElement agree_checkbox;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	@FindBy(xpath="//img[@class='d-inline-block datepicker']")
	WebElement datepicker;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement select_year;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement select_month;
	
	@FindBy(xpath="//div[text()='18']")
	WebElement select_date;
	
	@FindBy(xpath="(//div[@class='font-13 mt-10 inlineErrors'])[1]")
	WebElement error_message;
	
	//constructor initialization 
public SignUpPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//Method to switch to next window to continue sign up 
	public SignUpPage switchToSignUpPage() {
		switchToWindow();
		return this;
	}

	//Method to select the title 
	public SignUpPage selectTitle(String value) {
		select(title,value);
		return this;
	}
	//Method to enter the first name 
	public SignUpPage enterFirstName(String first_name) {
		sendKeys(firstname,first_name);
		return this;
	}
	
//Method to enter the last name 
	public SignUpPage enterLastName(String last_name) {
		sendKeys(lastname,last_name);
		return this;
	}
	
	//Method to select the country 
	public SignUpPage selectCountry(String value) {
		select(country,value);
		return this;
	}
	
	//Method to click calender icon 
	public SignUpPage ClickDatePicker() {
		click(datepicker);
		return this;
	}
	
	
	//method to select year 
	public SignUpPage selectYear(String value) {
		select(select_year,value);
		return this;
	}
	
	//Method to select month 
	public SignUpPage selectMonth(String value) {
		select(select_month,value);
		return this;
	}
	//Method to select date 
	public SignUpPage selectDate() {
		click(select_date);
		return this;
	}
	//Method to enter mobile number 
	public SignUpPage enterMobile(String mobile) {
		//moveToElement(email);
		sendKeys(phone,mobile);
		return this;
	}
	
	//Method to enter email address
	public SignUpPage enterEmail(String mail) {
		sendKeys(email,mail);
		return this;
	}
	
	//Method to enter password 
	public SignUpPage enterPasword(String pass) {
		sendKeys(password,pass);
		return this;
	}
	
	//Method to re enter password
	
	public SignUpPage reEnterPasword(String pass1) throws InterruptedException {
		sendKeys(confpassword,pass1);
		sleep();
		
		return this;
	
}
	//Method to click check box 
	public SignUpPage clickCheckBox() {
		jsClick(agree_checkbox);
		return this;
	}
	
	//Method to click submit button 
	public SignUpPage clickSubmit() throws InterruptedException {
		try {
		click(submit);}
		catch(Exception e) {
			System.out.println("button not clicked");
		}
		
		
		return this;
	}
	
	//method to scroll down to click submit button 
	public SignUpPage scrolltoSubmit() throws InterruptedException {
		scrolldown(submit);
		return this;
	}
	
	//Method to verify invalid sign in error message
	public SignUpPage verifyErrorMessage(String excepted) throws InterruptedException {
		scrollup();
		validationOfText(error_message,excepted);
		return this;
	}
}
