package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Big3 {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      driver =new ChromeDriver();
      driver.get("https://www.bigbasket.com/");
      Thread.sleep(1500);
      
      By value1=By.xpath("(//span[contains(text(),'Shop by')])[2]");
      By value2=By.linkText("Baby Care");
      By value3=By.linkText("Baby Bath & Hygiene");
      By value4=By.linkText("Baby Buds");
      
    handlemenu(value1,value2,value3,value4);
     
    
   
      
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void handlemenu(By value1,By value2,By value3,By value4) throws InterruptedException
	{
		getElement(value1).click();
		Thread.sleep(1500);
		
      Actions act=new Actions(driver);
      act.moveToElement(getElement(value2)).perform();
      Thread.sleep(1500);

      act.moveToElement(getElement(value3)).perform();
      Thread.sleep(1500);
      
      getElement(value4).click();
      }
	


}
