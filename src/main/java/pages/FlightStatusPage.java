package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class FlightStatusPage extends ProjectSpecification {
	
	//@find by annotation used to locate webelements 
	@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']")
	WebElement departure_date;
	
	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	
	@FindBy(xpath="//div[text()='To']")
	WebElement to;
	
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-1i10wst r-1eimq0t r-mk0yit r-xfkzu9 r-lnhwgy']")
	WebElement flight_no;
	
	@FindBy(xpath="//div[text()='Search Flights']")
	WebElement search_flights;
	
	//Constructor Initialization
public FlightStatusPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//Method to check whether departure date  field is displayed 
public FlightStatusPage checkDepartureDate() {
	
	isElementDisplayed(departure_date);
	return this;
}

//Method to check whether from  field is displayed 
public FlightStatusPage checkFrom() {
	
	isElementDisplayed(from);
	return this;
}

//Method to check whether to  field is displayed 
public FlightStatusPage checkTo() {
	
	isElementDisplayed(to);
	return this;
}

//Method to check whether flight number field is displayed 
public FlightStatusPage checkFlightNo() {
	
	isElementDisplayed(flight_no);
	return this;
}

//Method to check whether search button is displayed 
public FlightStatusPage checkSearchButton() {
	
	isElementEnabled(search_flights);
	return this;
}



}
