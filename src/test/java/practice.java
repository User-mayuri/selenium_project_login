import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By eMail = By.name("email");
		By mob = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwdConfrm = By.id("input-confirm");
        By subscribe=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By policyChkBox = By.name("agree");
		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");


        
	doSendKeys(fName,"mayuri");	
	doSendKeys(lName,"Bute");
	doSendKeys(eMail,"mayuri.bute@gmail.com");
	doSendKeys(mob,"7398715888");
	doSendKeys(pwd,"passsword");
	doSendKeys(pwdConfrm,"password");
	
	doClick(subscribe);
	
	doClick(policyChkBox);
	
	doClick(continueBtn);
	
	
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
}
