package E2EPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserInitialization {
	
	public static WebDriver driver;
	public Properties p;
	public WebDriver Initializedriver() throws IOException {
		
		p=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		p.load(fis);
		
		String browserName=p.getProperty("browser");
		if(browserName.contains("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			
			if(browserName.contains("headless"))
			{
				options.addArguments("headless");
			}
			
			driver=new ChromeDriver(options);
			
		}
		else if(browserName.equals("firefox"))
		{
			
		}
		else if(browserName.equals("IE"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

}
}
