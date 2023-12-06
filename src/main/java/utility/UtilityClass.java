package utility;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UtilityClass  {

	public static WebDriver driver;
	public  String excelfile;
	public  Alert alert;
	public void launchBroswer(String browser, String url) {
		  
		  // To launch the browser
		  
		  	ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			if(browser.equalsIgnoreCase("chrome")) {
				
			driver = new ChromeDriver(options);
			
			} else if (browser.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
				
			} else if (browser.equalsIgnoreCase("firefox")) {
				
				driver= new FirefoxDriver();
				
			} else {
				
				driver = new ChromeDriver(options);
				
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			
	  }
	//Method to close the browser
	
	public void close() {
		driver.close();
	}
	
	//Method to close all tabs in current windown 
	public void quit() {
		driver.quit();
	}
	//Method to take data from excel file 
	
	public static String[][] readExcel(String excelfile) throws IOException {
		  
		  XSSFWorkbook book=new XSSFWorkbook("./data/"+excelfile+".xlsx");  // open work book
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum(); 
			short columnCount = sheet.getRow(0).getLastCellNum(); 
			
			String [][] data= new String[rowcount][columnCount]; 
			for (int i = 1; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);
					//System.out.println(cell.getStringCellValue());
					data[i-1][j]=cell.getStringCellValue();   
					
				}
			}
			book.close();
			return data;
	  }
	//Method to click any webelement 
	public void click(WebElement element) {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	//Method to enter values to any webelement 
	public void sendKeys(WebElement ele, String value)  {
		
		
		ele.sendKeys(value);
		
	}
	// Method to take screenshot 
	public String getScreenshot(String testmethodname) throws IOException 
	{
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		String path="./snap/"+testmethodname+".png";
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(path);
		
		FileUtils.copyFile(src,dest);
		return path;
	}
	//Method to handle alert 
	public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
	//Method to wait for an alert 
	public void waitforalert() {
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(25));
			wait.until(ExpectedConditions.alertIsPresent());
	}
	//Method to accept any alert 
	public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
	// Method to wait for the element to be available
public void WaitForVisibility(WebElement element) {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

//Method to wait for an element to be clickable
public void WaitForElement(WebElement element) {
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(35));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
}

//Method to validate the title of the webpage 
public void validationOfTitle(String excepted) {
	
	String acutal=driver.getTitle();
	Assert.assertEquals(acutal, excepted);
	System.out.println("Title Matches");
	
}

//Method to validate the text of a element 
public void validationOfText(WebElement element,String excepted) {
	
	
	String acutal=element.getText();
	Assert.assertEquals(acutal, excepted);
	System.out.println("Message displayed correctly");
	
}

//Method to refresh the webpage 
public void refresh() {
	driver.navigate().refresh();
}

//Method to navigate back of a webpage
public void back() {
	
	driver.navigate().back();
}

//method to clear the webelement
public void clear(WebElement element) {
	
	element.clear();
}

//Method to slow down the execution of the program 
public void sleep() throws InterruptedException {
	Thread.sleep(5000);
}

//Method to mouse hoover an element using actions class
public void moveToElement(WebElement element) {
	
	Actions builder= new Actions(driver);
	builder.moveToElement(element).perform();
	
}

//Method to click an element using actions class
public void actionClick(WebElement element) {
	
	Actions builder= new Actions(driver);
	builder.click(element).perform();
	
}


//Method to select an value from dropdown using select class
public void select(WebElement element ,String value) {
	
	Select options=new Select(element);
	options.selectByVisibleText(value);
}

//Method to verify whether the URL is broken or not 
public  void verifyLinks(String linkUrl)
{
	try {
		URL link = new URL(linkUrl);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(link + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(link + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} 
	catch (Exception e) {
		System.out.println(linkUrl + " - " + "is a broken link");
		}
}

//Method to switch to next window using windowhandles
public void switchToWindow() {
	
	
			//set created to get the windows 
			Set<String> windowhandles=driver.getWindowHandles();
			//converted to list to access the window
			List<String> first_window=new ArrayList<>(windowhandles);
			//switch to particular window using index
			driver.switchTo().window(first_window.get(1));
			
}
//Method to scroll down until the webelement using java script executor
public void scrolldown(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	
}

//Method to scroll up using java script executor
public void scrollup() {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("scroll(0, -250);");
}

//Method to click an webelement using java script executor
public void jsClick(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);
	
}

//Method to check whether element is displayed 
public boolean isElementDisplayed(WebElement element) {
	
	boolean displayed=element.isDisplayed();
	if(displayed)
		System.out.println("Fields are displayed");
	else
		System.out.println("Fields are not displayed");
	return displayed;
}

//Method to check whether button is enabled

public boolean isElementEnabled(WebElement element) {
	
	boolean enabled=element.isEnabled();
	if(enabled)
		System.out.println("Button is enabled");
	else
		System.out.println("Button is not enabled");
	return enabled;
}

//Method to switch to frame by webelement 
public void switchToFrame(WebElement frame)
{
	driver.switchTo().frame(frame);
}

//Method to come of the  current frame to first frame   
public void comeOutOfFrame() {
	driver.switchTo().defaultContent();
}
}