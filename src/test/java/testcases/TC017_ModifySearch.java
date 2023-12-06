package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC017_ModifySearch extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC017_ModifySearch";
		
	}
	
	//@Test annotation with data provider parameter to fetch the data from excel 
	
	@Test(dataProvider ="NewData")
	public void modifySearch(String from, String to,String message) throws IOException, InterruptedException {
	
					//Flights page methods called to check whether user able to modify search results 
					new HomePage(driver)
			.clickFlights()
			.enterFrom(from)
			.enterTo(to)
			.selectDate()
			.clickSearch()
			.clickModifySearch()
			.clickOriginalDate()
			.clickModifyDate()
			.clickSearch()
			.VerifyDepartureDate(message)
			.getScreenshot("TC017_ModifySearch");
		

		}
	

}
