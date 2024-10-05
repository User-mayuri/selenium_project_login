package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

public class Googletest {
	
	 WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 	 
	}
	 @Test
	 public void titletest()
	 {
		 String title=driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals(title, "Google","title is not matched");
	 }
	 
	 @Test
	public void imagetest()
	 {
		boolean flag= driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed(); 
		Assert.assertTrue(flag);
	 }
	 
	 @Test
	 public void urlTest()
	 {
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 Assert.assertTrue(url.contains("google"));
	 }
	 
	 @AfterTest
	 public void close()
	 {
		 System.out.println("close");
		 
	 }

}
