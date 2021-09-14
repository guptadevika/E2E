package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage {
	
	public WebDriver driver;
	By heading=By.xpath("//h3[text()='Hovers']");
	By user1=By.xpath("//*[@id='content']/div/div[1]/img");
	By name=By.xpath("//h5[text()='name: user1']");
	

	
public HoversPage(WebDriver driver)	
{
	this.driver=driver;
}

public WebElement HoversText()
{
	return driver.findElement(heading);

}
public WebElement firstUser()
{
	return driver.findElement(user1);
}
public WebElement nameVerify()
{
	return driver.findElement(name);
}


}
