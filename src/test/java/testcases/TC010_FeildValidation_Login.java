package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC010_FeildValidation_Login extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC010_FeildValidation_Login";
		
	}
	
	//@Test annotation with data provider parameter to fetch the data from excel 
	
	@Test(dataProvider ="NewData" )
	
	public void invlaidEmail(String password,String msg) throws InterruptedException, IOException {
		
		//Login page method called to validate error message of email field 
		new HomePage(driver)
		.clickLogin()
		.clickEmail()
		.enterEmail("")
		.enterPassword(password)
		.clickLoginButton()
		.verifyInvalidEmailMessage(msg)
		.getScreenshot("TC010_FeildValidation_Login");
	}
	
	
	
	
}
