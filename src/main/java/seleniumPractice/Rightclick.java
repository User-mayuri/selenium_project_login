package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
     
     WebElement Rightclicke=driver.findElement(By.xpath("//span[text()='right click me']"));
     
    Actions act=new Actions(driver);
    act.contextClick(Rightclicke).perform();
    
    driver.findElement(By.xpath("//span[text()='Cut']")).click();
    
	}

}
