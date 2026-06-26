import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google3 {
WebDriver driver;
	
	@Test (groups = "smoke")
	public void googlesearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium info");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
