package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {
	
	public WebDriver driver;
	By heading=By.xpath("//h3[text()='Checkboxes']");
	By totalCheckboxes=By.xpath("//input[@type='checkbox']");
	
public CheckboxesPage(WebDriver driver)	
{
	this.driver=driver;
}

public WebElement checkboxesText()
{
	return driver.findElement(heading);

}

public List<WebElement> numberOfcheckboxes() {
	return driver.findElements(totalCheckboxes);
}
}
