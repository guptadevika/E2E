package E2EPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.HomePage;
import pageObject.LoginPage;


public class LoginPageValidation extends BrowserInitialization{

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=Initializedriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void loginValidation() throws IOException {
		
		HomePage hp=new HomePage(driver);
		hp.loginLink().sendKeys(hp.clickOnLink());
		
		WindowHandle wh=new WindowHandle(driver);
		driver.switchTo().window(wh.childWindow());
		
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys(p.getProperty("username"));
		lp.getPassword().sendKeys(p.getProperty("password"));
		lp.submitButton().click();
		Assert.assertTrue(lp.loginSuccessMessage().isDisplayed());
		lp.logoutButton().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
