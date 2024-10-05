package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		WebElement country=driver.findElement(By.xpath("//select[@id=\"Form_getForm_Country\"]"));
		
		Select select=new Select(country);
		select.selectByIndex(5);
		Thread.sleep(1000);
		select.deselectByValue("India");
		select.selectByVisibleText("afganisthan");
		
	}

}
