package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ImplicitylyWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=New Chromedriver();
       
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
