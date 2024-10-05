package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CptureText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.javatpoint.com/java-program-to-count-occurrences-of-each-character");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@title='search']")).sendKeys("java");
	   String ele= driver.findElement(By.xpath("//input[@title='search']")).getText();
	   System.out.println(ele);
	}

}
