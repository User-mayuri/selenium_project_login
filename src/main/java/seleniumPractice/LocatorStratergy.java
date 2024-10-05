package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStratergy {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       driver=new ChromeDriver();
       driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	 // driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("mayuri.bute@gmail.com");
	 By fn=By.xpath("//*[@id=\"input-firstname\"]");
	 
	 Elementutil eleutil= new Elementutil(driver);
	 eleutil.doSendKeys(fn, "mayuri.bute@gmail.com");
	 
	  
	
	
	}

}
