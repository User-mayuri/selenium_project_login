package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(5000);
		
		WebElement ele= driver.findElement(By.linkText("Banff, Canada"));
		String leftRank=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		
		
		
//		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		System.out.println(leftRank);

	}

}
