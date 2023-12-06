package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC005_Logout extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC005_Logout";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	
	public void logout(String email,String password ,String text,String title,String msg) throws InterruptedException, IOException {
		
		//Login Page methods called to Login and Logout page methods are called to click logout button 
		new HomePage(driver)
		.clickLogin()
		.clickEmail()
		.enterEmail(email)
		.enterPassword(password)
		.clickLoginButton()
		.verifyLoginMessage(text)
		.verifyLoginPage(title)
		.clickLogout()
		.clickUserName()
		.clickLogoutButton()
		.verifyLogoutMessage(msg)
		.getScreenshot("TC005_Logout");
	}

}