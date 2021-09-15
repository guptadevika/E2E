package E2EPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;

public class BasicAuthPageValidation extends BrowserInitialization{
	
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=Initializedriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void authPageValidation()
	{
		HomePage hp=new HomePage(driver);
		hp.basicAuthLink().click();
		LoginPage lp=new LoginPage(driver);
		Assert.assertEquals(lp.basicAuthHeading().getText(), p.getProperty("auth"));
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
