package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	By checkboxes=By.cssSelector("a[href*='checkboxes']");
	By dropdown=By.cssSelector("a[href*='dropdown']");

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
public String clickOnLink()
{
	String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	return clickOnLink;
}
}
