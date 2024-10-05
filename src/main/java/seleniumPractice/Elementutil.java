package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//srp- single resposibility principle
public class Elementutil {
 
	
	private WebDriver driver;
	
	public Elementutil(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	private By getBy(String locatorType, String locatorValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}
	
	
	
	
}
