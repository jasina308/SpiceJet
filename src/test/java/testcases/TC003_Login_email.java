package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC003_Login_email  extends ProjectSpecification{
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC003_Login_email";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	
	public void loginByMail(String email,String password ,String text,String title) throws InterruptedException, IOException {
		
		//login page methods called to click login and login with credentials using email id 
		new HomePage(driver)
		.clickLogin()
		.clickEmail()
		.enterEmail(email)
		.enterPassword(password)
		.clickLoginButton()
		.verifyLoginMessage(text)
		.verifyLoginPage(title)
		.getScreenshot("TC003_Login_email");
	}

}
