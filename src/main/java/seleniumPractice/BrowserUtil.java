package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {

	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName)
	{
		System.out.println("brosername:"+browserName);
		
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			driver=new ChromeDriver();
		  break;
	case "firefox":
		driver=new ChromeDriver();
	   break;
case "edge":
	driver=new ChromeDriver();
   break;
case "safari":
	driver=new ChromeDriver();
 break;
 
 default:
	 System.out.println("plz pass roght browser");
	}
	return driver;
}
	
	public void launchURL(String url) {
		if (url == null) {
		System.out.println("url is missing");
		}
		else
		{
			driver.get(url);
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}



