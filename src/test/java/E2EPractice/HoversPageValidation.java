package E2EPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.HomePage;
import pageObject.HoversPage;



public class HoversPageValidation extends BrowserInitialization{

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=Initializedriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void hoversValidation() throws IOException {
		
		HomePage hp=new HomePage(driver);
		hp.hoversLink().sendKeys(hp.clickOnLink());
		
		WindowHandle wh=new WindowHandle(driver);
		driver.switchTo().window(wh.childWindow());
		
		HoversPage ho=new HoversPage(driver);
		Assert.assertTrue(ho.HoversText().isDisplayed());

		Actions a=new Actions(driver);
		a.moveToElement(ho.firstUser()).build().perform();
		Assert.assertEquals("name: user1", ho.nameVerify().getText());
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
