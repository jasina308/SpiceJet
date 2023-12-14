package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class FlightsPage extends ProjectSpecification {
	
	//@find by annotation used to locate webelements 
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73'])[2]")
	WebElement round_trip;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	
	@FindBy(xpath="(//div[text()='15'])[2]")
	WebElement date;
	
	@FindBy(xpath="(//div[text()='6'])[3]")
	WebElement return_date;
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement search_flight;
	
	@FindBy(xpath="//div[text()='Family & Friends']")
	WebElement family;
	
	@FindBy(xpath="//div[text()='Senior Citizen']")
	WebElement senior_citizen;
	
	@FindBy(xpath="//div[text()='1 Adult']")
	WebElement passengers;
	
	@FindBy(xpath="//div[text()='1 Adult, 1 Child']")
	WebElement add_passengers;
	
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	WebElement add_childern;
	
	@FindBy(xpath="(//div[text()='Continue'])[1]")
	WebElement continue_button1;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement title1;
	
	@FindBy(xpath="(//div[text()='Mrs'])[1]")
	WebElement Mrs1;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement contact_no;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement country;
	
	@FindBy(xpath="//div[text()='India']")
	WebElement india;
	
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;
	
	@FindBy(xpath="//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement firstname1;
	
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement lastname1;
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement continue_button2;
	
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']")
	WebElement primary_passenger;
	
	@FindBy(xpath="//div[@id='at_addon_close_icon']//img")
	WebElement close;
	
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement continue_button3;
	
	@FindBy(id="card_number")
	WebElement card_no;
	
	@FindBy(id="name_on_card")
	WebElement card_name;
	
	@FindBy(id="card_exp_month")
	WebElement exp_month;
	
	@FindBy(id="card_exp_year")
	WebElement exp_year;
	
	@FindBy(id="security_code")
	WebElement cvv_code;
	
	@FindBy(xpath="//div[text()='Proceed to pay']")
	WebElement procced_pay;
	
	@FindBy(xpath="//div[text()='Invalid Card Details']")
	WebElement invalid_message;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement frame1;
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement frame2;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement frame3;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement frame4;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement frame5;
		
	@FindBy(xpath="//div[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//div[@data-testid='traveller-1-title-field']")
	WebElement title_passenger2;
	
	@FindBy(xpath="//div[text()='Miss']")
	WebElement Miss;
	
	@FindBy(xpath="//div[text()='I have read and agreed to the ']")
	WebElement agree_checkbox;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1862ga2 r-1enofrn r-1kfrs79']")
	WebElement continue_popup;
	
	@FindBy(xpath="(//div[@data-testid='spiceflex-flight-select-radio-button-1'])[1]")
	WebElement flex;
	
	@FindBy(xpath="(//div[@data-testid='spicemax-flight-select-radio-button-2'])[6]")
	WebElement max;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-ymp9ed r-1j3t67a r-1w50u8q r-ah5dr5 r-1otgn73 r-1n20pny']")
	WebElement modify_search;
	
	@FindBy(xpath="(//div[text()='4'])[4]")
	WebElement modify_date;
	
	@FindBy(xpath="//span[text()='Sun, 04 Feb 2024']")
	WebElement modified_msg;
	
	@FindBy(xpath="(//div[text()='Mon, 15 Jan 2024'])[2]")
	WebElement original_date;
	
	
	//Constructor Initialization 
public FlightsPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//Method to click round trip radio button 
public FlightsPage clickRoundTrip() {
	click(round_trip);
	return this;
}

//Method to enter city in from field 
public FlightsPage enterFrom(String city) throws InterruptedException {
	click(from);
	sendKeys(from,city);
	return this;
}

//Method to enter city in to field 
public FlightsPage enterTo(String city) throws InterruptedException {
	clear(to);
	sendKeys(to,city);
	return this;
}

//method to to select date 
public FlightsPage selectDate() {
	WaitForVisibility(date);
	click(date);
	return this;
}

//Method to select the return date 
public FlightsPage selectReturnDate() {
	WaitForVisibility(return_date);
	click(return_date);
	return this;
}

//Method to add childern but click plus button 

public FlightsPage addChildern() {
	click(add_childern);
	click(add_passengers);
	return this;
}

//Method to click passengers field 
public FlightsPage addPassengers() {
	
	click(passengers);
	return this;
}

//Method to click agree check box 
public FlightsPage clickAgreeCheckbox() {
	WaitForVisibility(agree_checkbox);
	click(agree_checkbox);
	return this;
}

//Method to click search flight button 
public FlightsPage clickSearch() throws InterruptedException {
	try {
	actionClick(search_flight);}
	
	catch(Exception e) {
		System.out.println("button not clicked");
	}
	
	sleep();
	return this;
}


// Method to click first continue button 
public FlightsPage clickContinue1() throws InterruptedException {
	sleep();
	WaitForVisibility(continue_button1);
	actionClick(continue_button1);
	return this;
}

//Method to select title form drop down 
public FlightsPage selectTitle1( ) throws InterruptedException {
	
	click(title1);
	click(Mrs1);
	return this;
}

//Method to enter firstname under contact details 
public FlightsPage enterFirstName1(String fname) throws InterruptedException
{
	clear(firstname);
	sendKeys(firstname,fname);
	return this;
}

//Method to enter last name  under contact details 
public FlightsPage enterLastName1(String lname) throws InterruptedException
{
	clear(lastname);
	sendKeys(lastname,lname);
	return this;
}

//Method to enter contact number under contact details 
public FlightsPage enterContactNo(String no) throws InterruptedException
{
	clear(contact_no);
	sendKeys(contact_no,no);
	return this;
}

//Method to enter email id  under contact details 
public FlightsPage enterEmail(String mail) throws InterruptedException

{
	
	clear(email);
	sendKeys(email,mail);
	return this;
}

//Method to select country  under contact details 
public FlightsPage selectCountry()
{
	click(country);
	click(india);
	return this;
}

//Method to enter city under contact details 
public FlightsPage enterCity(String town) throws InterruptedException
{
	clear(city);
	sendKeys(city,town);
	return this;
	
}

//Method to click check box 
public FlightsPage clickCheckBox() {
	moveToElement(primary_passenger);
	actionClick(primary_passenger);
	return this;
}


//Method to enter first name of passenger 1 
public FlightsPage enterfname(String fname)  {

	
	sendKeys(firstname1,fname);
	return this;
}

//Method to enter last name of passenger 1 
public FlightsPage enterlname(String lname)  {
		
	sendKeys(lastname1,lname);
	scrollup();
	return this;
}

//Method to click close button 
public FlightsPage clickClose() {
	WaitForVisibility(close);
	click(close);
	return this;
}

//Method to click second continue button 
public FlightsPage clickContinue2() throws InterruptedException {
	sleep();
	scrolldown(continue_button2);
	actionClick(continue_button2);
	sleep();
	return this;
}
//Method to click third continue button 
public FlightsPage clickContinue3() throws InterruptedException {
	scrolldown(continue_button3);
	click(continue_button3);
	sleep();
	return this;
}
//Method to enter card number 
public FlightsPage enterCardNo(String number)

{
	switchToFrame(frame1);
	sendKeys(card_no,number);
	comeOutOfFrame();
	return this;
}

//method to enter card name 
public FlightsPage enterCardName(String name)
{
	switchToFrame(frame2);
	sendKeys(card_name,name);
	comeOutOfFrame();
	return this;
}
//Method to enter year 
public FlightsPage enterYear(String year)
{
	switchToFrame(frame4);
	sendKeys(exp_year,year);
	comeOutOfFrame();
	return this;
}
//Method to enter expire month 
public FlightsPage enterMonth(String month) {
	switchToFrame(frame3);
	sendKeys(exp_month,month);
	comeOutOfFrame();
	return this;
}

//Method to enter cvv code in the card
public FlightsPage enterCode(String code)
{
	switchToFrame(frame5);
	sendKeys(cvv_code,code);
	comeOutOfFrame();
	return this;
}

//Method to click proceed to pay button 
public FlightsPage clickProceedPay() throws InterruptedException {
	sleep();
	scrolldown(procced_pay);
	actionClick(procced_pay);
	return this;
}

//Method to verify invalid error message 
public FlightsPage verifyMessage(String excepted) {
	
	WaitForVisibility(invalid_message);
	validationOfText(invalid_message,excepted);
	return this;
}

public FlightsPage selectTitlePassenger2() {
	moveToElement(title_passenger2);
	
	click(title_passenger2);
	click(Miss);
	return this;
	
}
//Method to click Next button to enter next passenger details 
public FlightsPage clickNext() {
	
	scrolldown(next);
	click(next);
	return this;
}
//Method to click Modify search button 
public FlightsPage clickModifySearch() {
	WaitForVisibility(modify_search);
	click(modify_search);
	
	return this;
	
}

//Method to modify the date 
public FlightsPage clickModifyDate() {
	
	WaitForVisibility(modify_date);
	click(modify_date);
	
	return this;
	
}

//Method to click  the date 
public FlightsPage clickOriginalDate() {
	
	WaitForVisibility(original_date);
	click(original_date);
	
	return this;
	
}

//Method to verify whether date is changed 

public FlightsPage VerifyDepartureDate(String excepted) {
	
	WaitForVisibility(modified_msg);
	validationOfText(modified_msg,excepted);
	
	return this;
	
}
}


