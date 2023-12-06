package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC001_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new HomePage(driver)
			.getScreenshot("TC001_LaunchApplication");
		

		}
		
	}


