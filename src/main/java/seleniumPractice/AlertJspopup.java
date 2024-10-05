package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlertJspopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       
//       driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
//       Alert alert=driver.switchTo().alert();
//       
//       String text=alert.getText();
//       System.out.println(text);
//       
//       alert.accept();//its like click 
//       
//
//       driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//       Alert alert=driver.switchTo().alert();
//       
//       String text=alert.getText();
//       System.out.println(text);
//       
//       alert.accept();
//       
       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
       Alert alert=driver.switchTo().alert();
       
       String text=alert.getText();
       System.out.println(text);
       alert.sendKeys("mayuri");
       
       alert.accept();
       
       }

}
