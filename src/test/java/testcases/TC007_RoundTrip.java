package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC007_RoundTrip extends ProjectSpecification {
	
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC007_RoundTrip";
		
	}
	
	//@Test annotation with data provider parameter to fetch the data from excel 
	
@Test(dataProvider ="NewData")
	
	public void roundtrip(String from,String to,String firstname,String lastname,String phone,
			String mail1,String town,String number,String name,String month,String year,String code,String msg) throws IOException, InterruptedException {
		
		
	// Flights page method called and round trip radio button clicked and proceeded till booking 
	new HomePage(driver)
	.clickFlights()
	.clickRoundTrip()
	.enterFrom(from)
	.enterTo(to)
	.selectDate()
	.selectReturnDate()
	.clickSearch()
	.clickContinue1()
	.selectTitle1()
	.enterFirstName1(firstname)
	.enterLastName1(lastname)
	.enterContactNo(phone)
	.enterEmail(mail1)
	.enterCity(town)
	.clickCheckBox()
	.clickContinue2()
	.clickContinue3()
	.enterCardNo(number)
	.enterCardName(name)
	.enterMonth(month)
	.enterYear(year)
	.enterCode(code)
	.clickProceedPay()
	.verifyMessage(msg)
	
	.getScreenshot("TC007_RoundTrip");
		

		}
		
	

}
