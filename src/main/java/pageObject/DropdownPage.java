package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPage {
	
	public WebDriver driver;
	By heading=By.xpath("//h3[text()='Dropdown List']");
	By dropdown=By.id("dropdown");
	
public DropdownPage(WebDriver driver)	
{
	this.driver=driver;
}

public WebElement dropdownText()
{
	return driver.findElement(heading);

}
public WebElement dropdownlist()
{
	return driver.findElement(dropdown);
}

}
