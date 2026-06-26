package tests;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ProductPage;

public class LoginTest extends BaseTest {
	
	
	@Test(groups = {"smoke"})
	public void testLogin() throws InterruptedException {
		Loginpage loginpage = new Loginpage(driver);
		ProductPage ProductPage = new ProductPage(driver);
		Thread.sleep(2000);
		
		loginpage.loginPage("standard_user", "secret_sauce");
		Thread.sleep(2000);
		ProductPage.logout();
		
	}
}
