package E2EPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	public String getScreenshot(String testname, WebDriver driver) throws IOException
	{
		TakesScreenshot  ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String des=System.getProperty("user.dir")+"\\reports\\"+testname+".png";
		FileUtils.copyFile(source, new File(des));
		return des;
	}

}
