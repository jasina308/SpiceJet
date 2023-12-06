package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC006_SignUp  extends ProjectSpecification{
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC006_SignUp";
		
	}
	
	//@Test annotation with data provider parameter to fetch the data from excel 
	
	@Test(dataProvider ="NewData" )
	
	public void signup(String title,String firstname,String lastname,String country,String year ,String month,String phone,
			String email,String pass ,String pass1 ) throws InterruptedException, IOException {
		
		//Sign up page methods are called to enter user details and create new account 
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
		.enterMobile(phone)
		.enterEmail(email)
		.enterPasword(pass)
		.reEnterPasword(pass1)
		.scrolltoSubmit()
		.clickCheckBox()
		.clickSubmit()
		.getScreenshot("TC006_SignUp");
		
		
	}

}
