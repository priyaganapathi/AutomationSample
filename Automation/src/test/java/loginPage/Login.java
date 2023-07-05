package loginPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import loginPage.pageobjects.landingPage;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration and instantiation of objects/variables
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Boodskap Labs\\Downloads\\chromedriver_win32 (4)\\Chrome.exe");

		ChromeDriver driver = new ChromeDriver();
		landingPage landingpage = new landingPage(driver);
//			 // Launch website
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // pageload timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("priyaganpat13@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Divyapriya@13");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Edit Account']")).click();

		driver.findElement(By.xpath("//input[@id='input-firstname']")).clear();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		// Take a screenshot

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
