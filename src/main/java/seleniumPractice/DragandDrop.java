package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
	    WebElement src=	driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		Action action=act.clickAndHold(src).moveToElement(dest).build();
		
		action.perform();
		
	}

}
