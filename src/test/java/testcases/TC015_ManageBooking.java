package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC015_ManageBooking extends ProjectSpecification{
	
	
	
	@Test
	public void managebooking() throws IOException, InterruptedException {
		//ManageBooking  page methods called to check fields and button are displayed  
		new HomePage(driver)
		.clickManageBooking()
		.checkTicketNumberFeild()
		.checkEmailFeild()
		.checkSearchFeild()
		.getScreenshot("TC015_ManageBooking");
	}


}
