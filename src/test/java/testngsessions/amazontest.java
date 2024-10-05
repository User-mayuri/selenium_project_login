package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazontest {
 
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS--DB Connection");
	}
	
	@BeforeTest
	public void createuser() {
		System.out.println("BT ===CREATE USER");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("bc--launchbrowser");
	}
	
	@BeforeMethod
	public void logon() {
		System.out.println("bc--login to app");
	}
	
	@Test
	public void titleTest() {
		System.out.println("Title test");
	}
	
	@Test
	public void headerTest() {
		System.out.println("Header Test");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	
	@AfterSuite
	public void disconnectwithDB()
	{
		System.out.println("Disconnect with db");
	}
}

