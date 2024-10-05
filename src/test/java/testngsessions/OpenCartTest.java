package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class OpenCartTest {

	@BeforeSuite
	public void db() {
		System.out.println("bs");
	}

	@BeforeTest
	public void create() {
		System.out.println("bt");
	}

	@BeforeClass
	public void launchbrowser() {
		System.out.println("bc");
	}

	@BeforeMethod
	public void login() {
		System.out.println("ba");
	}

	@Test
	public void gettitle() {
		System.out.println("tile");
	}

	@Test
	public void url() {
		System.out.println("url");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void closebrowser() {
		System.out.println("close");
	}

	@AfterTest
	public void deleteuser() {
		System.out.println("del user");
	}

	@AfterSuite
	public void deletedb() {
		System.out.println("del db");
	}
}
