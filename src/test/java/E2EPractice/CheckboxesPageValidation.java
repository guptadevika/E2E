package E2EPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.CheckboxesPage;
import pageObject.HomePage;


public class CheckboxesPageValidation extends BrowserInitialization {
	

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=Initializedriver();
		driver.get(p.getProperty("url"));
	}
	
	
	@Test
	public void checboxesValidation() throws IOException {
		
		HomePage hp=new HomePage(driver);
		hp.checkboxesLink().sendKeys(hp.clickOnLink());
		
		WindowHandle wh=new WindowHandle(driver);
		driver.switchTo().window(wh.childWindow());
		
		CheckboxesPage cp=new CheckboxesPage(driver);
		Assert.assertTrue(cp.checkboxesText().isDisplayed());
		String a=p.getProperty("checkboxes");
		Assert.assertEquals(cp.numberOfcheckboxes().size(),Integer.parseInt(a));
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
