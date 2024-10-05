package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement value1=driver.findElement(By.xpath("(//div[text()=\"SpiceClub\"])[1]"));
		
		Actions act= new Actions(driver);
		act.moveToElement(value1).perform();
		
		driver.findElement(By.linkText("Benefits")).click();
		

}}
