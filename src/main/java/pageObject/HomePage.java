package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	private By checkboxes=By.cssSelector("a[href*='checkboxes']");
	private By dropdown=By.cssSelector("a[href*='dropdown']");
	private By login=By.cssSelector("a[href*='login']");
	private By hovers=By.cssSelector("a[href*='hovers']");
	private By auth=By.cssSelector("a[href*='basic']");
	private By fileUpload=By.cssSelector("a[href*='upload']");
	
public HomePage(WebDriver driver)	
{
	this.driver=driver;
}

public WebElement checkboxesLink()
{
	return driver.findElement(checkboxes);
}

public WebElement dropdownLink()
{
	return driver.findElement(dropdown);
}

public WebElement loginLink()
{
	return driver.findElement(login);
}
public WebElement hoversLink()
{
	return driver.findElement(hovers);
}
public WebElement basicAuthLink()
{
	return driver.findElement(auth);
}
public WebElement fileUploadLink()
{
	return driver.findElement(fileUpload);
}
public String clickOnLink()
{
	String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	return clickOnLink;
}

}
