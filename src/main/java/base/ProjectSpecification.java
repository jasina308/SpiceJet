package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.UtilityClass;

public class ProjectSpecification  extends UtilityClass{
	
	//parameter annotation used to pass common parameters
	 @Parameters({"browser","url"})
	  @BeforeMethod
	  // method to launch browser
	  public void browserLaunch(String browser, String url) {
		  
		 launchBroswer(browser, url);
		  
	  }
		// Method to call getdata to take values from excelfile
		@DataProvider(name = "NewData")
		public String[][] getData() throws IOException {
			
			String[][] data = readExcel(excelfile);
			return data;
		}
	  
	  @AfterMethod   // To close the browser
	  public void closeBrowser() {
		  
		// close();
		 quit();
	  }

}
