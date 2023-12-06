package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC009_Invalid_Login extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC009_Invalid_Login";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	
	@Test(dataProvider ="NewData" )
	
	public void invlaidlogin(String email,String password,String msg) throws InterruptedException, IOException {
		
		//Login page methods called to check login using invalid credentials 
		new HomePage(driver)
		.clickLogin()
		.clickEmail()
		.enterEmail(email)
		.enterPassword(password)
		.clickLoginButton()
		.verifyInvalidMessage(msg)
		.getScreenshot("TC009_Invalid_Login");
	}
	
	
	

}
