package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
      
      driver.findElement(By.id("input-firstname")).sendKeys("mayuri");
      driver.findElement(By.cssSelector("#input-lastname")).sendKeys("bute");
      driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("bute.mayuri@gmail.com");
      driver.findElement(By.id("input-telephone")).sendKeys("0000000000");
      driver.findElement(By.id("input-password")).sendKeys("password");
      driver.findElement(By.id("input-confirm")).sendKeys("password");
      driver.findElement(By.xpath("//label[normalize-space()=\"Yes\"]")).click();
      driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	}

}
