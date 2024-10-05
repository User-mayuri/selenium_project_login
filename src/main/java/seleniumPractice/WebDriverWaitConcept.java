package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		By fullName=By.id("Form_getForm_Name");
		
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       WebElement fullName_ele= wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
       fullName_ele.sendKeys("testing");
       
      
	}

}
