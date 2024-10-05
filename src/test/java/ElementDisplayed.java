import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//boolean flag=driver.findElement(By.className("img-responsive")).isDisplayed();
		//if(flag)
		//{System.out.println("symbol displayed");
		//}
		//else {
			//System.out.println("not displaed");
		//}
		
		By logo= By.className("img-responsive");
		
		if(isElementDispaled(logo)) {
			System.out.println("logo diaplayed");
		}
		else
		{
			System.out.println("logo not dispaled");
		}
}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static boolean isElementDispaled(By locator)
	{
		return getElement(locator).isDisplayed();
	}
}
