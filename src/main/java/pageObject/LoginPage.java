package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By heading=By.xpath("//h2[text()='Login Page']");
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.xpath("//*[@type='submit']");
	By loginSuccess=By.id("flash");
	By logout=By.cssSelector("a[href*='logout']");
	
public LoginPage(WebDriver driver)	
{
	this.driver=driver;
}

public WebElement LoginText()
{
	return driver.findElement(heading);

}
public WebElement getUsername()
{
	return driver.findElement(username);
}

public WebElement getPassword()
{
	return driver.findElement(password);
}

public WebElement submitButton()
{
	return driver.findElement(submit);
}
public WebElement loginSuccessMessage()
{
	return driver.findElement(loginSuccess);
}
public WebElement logoutButton()
{
	return driver.findElement(logout);
}
}
