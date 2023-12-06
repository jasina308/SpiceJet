package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC004_Login_phone extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC004_Login_phone";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	
	public void loginByPhone(String phone,String password ,String text,String title) throws InterruptedException, IOException {
		
		
		//login page methods called to click login and login with credentials using phone number 
		new HomePage(driver)
		.clickLogin()
		.enterPhone(phone)
		.enterPassword(password)
		.clickLoginButton()
		.verifyLoginMessage(text)
		.verifyLoginPage(title)
		.getScreenshot("TC004_Login_phone");
	}


	

}
