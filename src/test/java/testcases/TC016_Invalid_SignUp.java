package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC016_Invalid_SignUp extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC016_Invalid_SignUp";
		
	}
	
	//@Test annotation with data provider parameter to fetch the data from excel 

	@Test(dataProvider ="NewData" )
	
	public void invalid_signup(String title,String firstname,String lastname,String country,String year,String month,
			String pass ,String pass1,String message) throws InterruptedException, IOException {
		//Sign up page methods are called to enter user details and check whether error message is displayed 
		//when mandatory fields are not filled 
		
		new HomePage(driver)
		.clickSignup()
		.switchToSignUpPage()
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.selectCountry(country)
		.ClickDatePicker()
		.selectYear(year)
		.selectMonth(month)
		.selectDate()
		.enterPasword(pass)
		.reEnterPasword(pass1)
		.scrolltoSubmit()
		.clickCheckBox()
		.clickSubmit()
		.verifyErrorMessage(message)
		.getScreenshot("TC016_Invalid_SignUp");
		

}

	
	
}