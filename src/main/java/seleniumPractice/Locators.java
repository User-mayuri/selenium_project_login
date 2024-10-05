package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	  static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      driver= new ChromeDriver();
     driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register:");
     
     //1.
   //  driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
     
     //2
  //  WebElement emailId= driver.findElement(By.id("input-email"));
  // / 
   // emailId.sendKeys("gmail.com");
    
    //3
//   By emailId1= By.id("input-email");
//   WebElement emailId2=driver.findElement(emailId1);
//   emailId2.sendKeys("gmail.com");
    
    //4
//   By username=By.id("input-email");
//   
//   WebElement emailId3=getElement(username);
   //WebElement password=getElement(username);
   
   
  // emailId3.sendKeys("mayuri.bute@gmail.com");
   //5
   
//By username1=By.id("input-email");
//   
//   WebElement emailId31=getElement(username1);
//   
//   dosendkeys(username1,"gmsil.com");
//   
   
   //6
   By username2=By.id("input-email");
   
   Elementutil eleutil=new Elementutil(driver);
   eleutil.doSendKeys(username2,"test@gmail.com");
   
   
	}
	
public static WebElement  getElement(By locator)
{
	return driver.findElement(locator);
	
}
public static void dosendkeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}
}
