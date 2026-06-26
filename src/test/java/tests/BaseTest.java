package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void setup(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox")) driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("ie")) driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");	
	}
	
	private WebDriver getDriver() {
		return null;
	}
	
//	@BeforeMethod
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//	}
	
	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
}
