package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportSpicejet {
	
public static ExtentReports getReport() {
		
		ExtentSparkReporter reporter= new ExtentSparkReporter("./reports/report.html");
		reporter.config().setReportName("SpiceJet Reporter");
		reporter.config().setDocumentTitle("SpiceJet Reporter title");
		
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
		
	}

}
