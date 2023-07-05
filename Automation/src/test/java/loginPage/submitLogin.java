package loginPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import loginPage.pageobjects.landingPage;

public class submitLogin {
	ChromeDriver driver = new ChromeDriver();

	
	@Test
	public void run() {
		// TODO Auto-generated method stub

		// declaration and instantiation of objects/variables
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Boodskap Labs\\Downloads\\chromedriver_win32 (4)\\Chrome.exe");

		//ChromeDriver driver = new ChromeDriver();
		landingPage landingpage1 = new landingPage(driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // pageload timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Launch website
		landingpage1.goTo();

		landingpage1.loginApplication("priyaganpat13@gmail.com", "Divyapriya@13");
		

	}
	@Test
	public void error() {
		// TODO Auto-generated method stub

		// declaration and instantiation of objects/variables
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Boodskap Labs\\Downloads\\chromedriver_win32 (4)\\Chrome.exe");

		
		landingPage landingpage1 = new landingPage(driver);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); // pageload timeout
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Launch website
		landingpage1.goTo();

		landingpage1.errorApplication("", "");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Copy the file to a location and use try catch block to handle exception
		try {
			FileHandler.copy(screenshot,
					new File("C:\\Users\\Boodskap Labs\\Downloads\\Scrshot\\homePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

		
		
	
	}


