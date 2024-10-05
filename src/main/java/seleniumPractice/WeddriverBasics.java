package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeddriverBasics {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https:\\google.com");
		
		String title=driver.getTitle();
		System.out.println("Title is:"+title);
		
		if(title.equals("Google"))
		{
			System.out.println("CORRECT TITLE");
			
		}
		else
		{
			System.out.println("Incorrect tile");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("google.com"))
		{
			System.out.println("uri is right");
		}
		else
		{
			System.out.println("url is wrong");
		}
       driver.close();
		
	}

}
