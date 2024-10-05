package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpandDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/registe");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1500);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1500);
		
        act.scrollToElement(driver.findElement(By.linkText("Delivery Information")))
               .click(driver.findElement(By.linkText("Delivery Information"))).build().perform();
	}

}
