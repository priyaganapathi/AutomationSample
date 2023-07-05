import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportDemo {
	ChromeDriver driver = new ChromeDriver();
	
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Report Results");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Priyanka");
	}
	
	@Test
	public void inital()
	{
		extent.createTest("inital");
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Boodskap Labs\\Downloads\\chromedriver_win32 (4)\\Chrome.exe");

		
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		extent.flush();

	}
	

	

}
