package E2EPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.DropdownPage;
import pageObject.HomePage;


public class DropdownPageValidation extends BrowserInitialization{

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=Initializedriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void dropdownValidation() throws IOException {
		
		HomePage hp=new HomePage(driver);
		hp.dropdownLink().sendKeys(hp.clickOnLink());
		
		WindowHandle wh=new WindowHandle(driver);
		driver.switchTo().window(wh.childWindow());
		
		DropdownPage dp=new DropdownPage(driver);
		Assert.assertTrue(dp.dropdownText().isDisplayed());
		
		Select value=new Select(dp.dropdownlist());
		value.selectByVisibleText(p.getProperty("dropdownValue"));
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
