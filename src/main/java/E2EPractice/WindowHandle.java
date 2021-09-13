package E2EPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {
	
	public WebDriver driver;
	
	public WindowHandle(WebDriver driver) {
		this.driver=driver;
	}

	public String childWindow() {
		Set<String> w=driver.getWindowHandles();
		Iterator<String> it=w.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		return childWindow;
	}
	public String parentWindow() {
		Set<String> w=driver.getWindowHandles();
		Iterator<String> it=w.iterator();
		String parentWindow=it.next();
		return parentWindow;

}
}
