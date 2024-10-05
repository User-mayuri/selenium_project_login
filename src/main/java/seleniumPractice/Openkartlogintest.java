package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Openkartlogintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BrowserUtil brutil=new   BrowserUtil();
      WebDriver driver=brutil.launchBrowser("chrome");
      
      brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
     String title= brutil.getPageTitle();
     System.out.println(title);
     
     By username2=By.id("input-email");
     Elementutil eleutil=new Elementutil(driver);
     eleutil.doSendKeys(username2, "mayuri@gmail.com");
      
      
	}

}
