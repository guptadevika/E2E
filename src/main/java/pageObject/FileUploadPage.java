package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
	
	public WebDriver driver;
	By heading=By.xpath("//h3[text()='File Uploader']");
	By chooseFile=By.id("file-upload");
	By uploadButton=By.id("file-submit");
	By FileUploadedMessage=By.xpath("//h3[text()='File Uploaded!']");
	
public FileUploadPage(WebDriver driver)	
{
	this.driver=driver;
}

public WebElement FileUploaderText()
{
	return driver.findElement(heading);

}
public WebElement chooseFile()
{
	return driver.findElement(chooseFile);
}

public WebElement uploadButton()
{
	return driver.findElement(uploadButton);
}
public WebElement FileUploadedMessage()
{
	return driver.findElement(FileUploadedMessage);
}

}
