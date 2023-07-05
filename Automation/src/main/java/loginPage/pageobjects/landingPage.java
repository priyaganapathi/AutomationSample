package loginPage.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {


	WebDriver driver;
	
	//Using constructor to initializing
	//class name should be same as method name in constructor
	//this.driver refers to local class of Webdriver driver
	public landingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail=driver.findElement(By.xpath("//input[@id='input-email']"));
	
	//PageFactory
	@FindBy(xpath="//input[@id='input-email']")
	WebElement userEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passwordEle;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement submit;
	
	public void loginApplication(String email,String password)
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
	}
	public void errorApplication(String email,String password)
	{
		userEmail.sendKeys("");
		passwordEle.sendKeys("");
		submit.click();
	}
	
	
	public void goTo()
	{
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
		
	}


