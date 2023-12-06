package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC012_ForgotPassword  extends ProjectSpecification{
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC012_ForgotPassword";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	
	@Test(dataProvider ="NewData" )
	
	public void getOTP(String phone,String excepted) throws InterruptedException, IOException {
		
		//Forgot password page method called to click forgot password link and enter mobile number to get OTP
		new HomePage(driver)
		.clickForgotPassword()
		.enterMobile(phone)
		.clickSendOTP()
		.verifyOTPMesaage(excepted)
		.getScreenshot("TC012_ForgotPassword");
	}	

}
