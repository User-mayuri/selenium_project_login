import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendKeys {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
        driver.findElement(By.id("pass")).click(); //no exception
        
      //  driver.findElement(By.id("pass")).sendKeys("abcdef");//element not interactable exception
        
        //driver.findElement(By.id("fname")).sendKeys(null);//null should not be passed beacuse of char seq
        
        StringBuilder sb=new StringBuilder("testing");
        String s="automation";
        
        driver.findElement(By.id("fname")).sendKeys(sb,s,"naveen");
        
        
	}

}
