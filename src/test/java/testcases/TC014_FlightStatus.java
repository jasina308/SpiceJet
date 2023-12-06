package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC014_FlightStatus extends ProjectSpecification {
	
	
	@Test
	public void flightStatus() throws IOException, InterruptedException {
		
		//Flight Status  page methods called to check fields and button are displayed  
		new HomePage(driver)
		.clickFlightStatus()
		.checkFrom()
		.checkTo()
		.checkFlightNo()
		.checkSearchButton()
		.getScreenshot("TC014_FlightStatus");
	}

}
