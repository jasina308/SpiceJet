package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC008_OneWayTrip  extends ProjectSpecification{
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC008_OneTrip";
		
	}
	
	//@Test annotation with data provider parameter to fetch the data from excel 
	
	@Test(dataProvider ="NewData")
	public void onewaytrip(String from, String to,String firstname,String lastname,String phone,
			String mail1,String town,String fname,String lname ,String number,String name,String month,String year,String code,String msg) throws IOException, InterruptedException {
	
					//Flights page methods called to book tickets for one way trip  
					new HomePage(driver)
			.clickFlights()
			.enterFrom(from)
			.enterTo(to)
			.selectDate()
			.addPassengers()
			.addChildern()
			.clickSearch()
			.clickContinue1()
			.selectTitle1()
			.enterFirstName1(firstname)
			.enterLastName1(lastname)
			.enterContactNo(phone)
			.enterEmail(mail1)
			.enterCity(town)
			.clickCheckBox()
			.clickNext()
			.selectTitlePassenger2()
			.enterfname(fname)
			.enterlname(lname)
			.clickContinue2()
			.clickContinue3()
			.enterCardNo(number)
			.enterCardName(name)
			.enterMonth(month)
			.enterYear(year)
			.enterCode(code)
			.clickProceedPay()
			.verifyMessage(msg)
			.getScreenshot("TC008_OneWayTrip");
		

		}

	

}
