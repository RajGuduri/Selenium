import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sauceDemoTestNG {
	WebDriver driver;
	
	@Test (groups = "smoke")
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://saucedemo.com/");	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
}
