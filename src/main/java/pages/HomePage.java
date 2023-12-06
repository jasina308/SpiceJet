package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	//@find by annotation used to locate webelements 
	@FindBy(xpath="//div[text()='Login']")
	WebElement login_button;
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup_button;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
	WebElement flights;
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flight_status;
	
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement manage_booking;

	@FindBy(xpath="//div[text()='Forgot Password ?']")
	WebElement forgot_password;
	
	
	
	//constructor initialisation
			public HomePage(WebDriver driver) {
				
				this.driver = driver; 
				PageFactory.initElements(driver, this);
				
			}

			public LoginPage clickLogin() throws InterruptedException {
				
				
				click(login_button);
			
				return new LoginPage(driver);
				
			}
			
			//Method to click sign up button and constructor chaining done to return to sign up page 
			public SignUpPage clickSignup() throws InterruptedException {
				
				click(signup_button);
				sleep();
				
				return new SignUpPage(driver);
				
			}
			//Method to click flights button and constructor chaining done to return to Flights page 
			public FlightsPage clickFlights()  {
						
				click(flights);
			
				return new FlightsPage(driver);
				
			}
			//Method to click logout button and constructor chaining done to return to Logout page 
			public LogoutPage clickLogout()  {
				
				return new LogoutPage(driver);
				
			}
			//Method to click forgot password  button and constructor chaining done to return to forgot password page 
			public ForgotPasswordPage clickForgotPassword() {
				
				click(login_button);
				click(forgot_password);
				return new ForgotPasswordPage(driver);
			}
			
			//Method to click check in tabe and constructor chaining done to return to checkin page 
			public CheckinPage clickCheckin() {
				
				click(checkin);
				return new CheckinPage(driver);
				
			}
			//Method to click Flight status tab and constructor chaining done to return to flightstatus page 
			public FlightStatusPage clickFlightStatus() throws InterruptedException {
				
				click(flight_status);
				sleep();
				return new FlightStatusPage(driver);
				
			}
			
			//Method to click manage bookig tab and constructor chaining done to return to managebooking  page 
			
public ManageBookingPage clickManageBooking() throws InterruptedException {
				
				click(manage_booking);
				sleep();
				return new ManageBookingPage(driver);
				
			}
			
}
