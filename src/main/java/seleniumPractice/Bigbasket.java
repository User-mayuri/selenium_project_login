package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.bigbasket.com/");
      Thread.sleep(1500);
      
      driver.findElement(By.xpath("(//span[contains(text(),'Shop by')])[2]")).click();
      Thread.sleep(1500);
      
     WebElement menu= driver.findElement(By.linkText("Baby Care"));
     Thread.sleep(1500);
     
      Actions act=new Actions(driver);
      act.moveToElement(menu).perform();
      Thread.sleep(1500);

      WebElement stuff= driver.findElement(By.linkText("Baby Bath & Hygiene"));
      act.moveToElement(stuff).perform();
      Thread.sleep(1500);
      driver.findElement(By.linkText("Baby Buds")).click();
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
     
 
	}

}
