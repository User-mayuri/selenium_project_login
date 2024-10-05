package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximise {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.manage().window().maximize();
//		driver.manage().window().maximize();
//		driver.manage().window().maximize();
//		driver.manage().window().maximize();
        driver.manage().window().minimize();
		
		
		
	}
	

}

