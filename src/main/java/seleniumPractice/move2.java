package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		WebElement value=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(value).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Add-ons']")).click();
		
		
	

}}
