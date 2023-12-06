package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC011_FeildValidation_Login  extends ProjectSpecification{
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC011_FeildValidation_Login";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	
	public void invlaidPassword(String email,String msg) throws InterruptedException, IOException {
		
		//Login page method called to validate error message of password  field 
		new HomePage(driver)
		.clickLogin()
		.clickEmail()
		.enterEmail(email)
		.clickLoginButton()
		.verifyInvalidPasswordMessage(msg)
		.getScreenshot("TC011_FeildValidation_Login");
	}
	
	
	

}
