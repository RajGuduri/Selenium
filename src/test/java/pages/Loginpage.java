package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	//Locators
	
	@FindBy(id = "user-name")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement btnLogin;
	
		
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void loginPage(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		btnLogin.click();
	}
	
	
	
	
}
