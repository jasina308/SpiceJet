package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC002_ValidateBrokenLink extends ProjectSpecification {
	
	@Test
	public void brokenLink() throws InterruptedException {
		
		//verify links method called to validate the link is broken link or not 
		new HomePage(driver)
		.verifyLinks("https://www.spicejet.com/");
	}

}
