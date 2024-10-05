package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
	WebElement country=	driver.findElement(By.id("Form_getForm_Country"));
		
		Select select=new Select(country);
		
	// select.selectByIndex(5);
	select.selectByValue("India");
	select.selectByVisibleText("Australia");
		
	//System.out.println(select.selectByIndex(5));
	}
	
	

}
