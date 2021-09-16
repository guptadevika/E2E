package E2EPractice;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.FileUploadPage;
import pageObject.HomePage;

public class FileUploadValidation extends BrowserInitialization{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=Initializedriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void fileUploadValidation() throws IOException, InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.fileUploadLink().click();
		
		FileUploadPage fu=new FileUploadPage(driver);
		Assert.assertTrue(fu.FileUploaderText().isDisplayed());
		fu.chooseFile().click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\fileupload.exe");
		Thread.sleep(5000);
		fu.uploadButton().click();
		Assert.assertTrue(fu.FileUploadedMessage().isDisplayed());
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
