package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC013_CheckIn extends ProjectSpecification {
	
	

	@Test
	public void checkin() throws IOException {
		
		//CheckIn page methods called to check fields and button are displayed  
		new HomePage(driver)
		.clickCheckin()
		.checkTicketNumberFeild()
		.checkEmailFeild()
		.checkSearchFeild()
		.getScreenshot("TC013_CheckIn");
	}

}
