package testngsessions;

import org.testng.annotations.Test;

public class prioprityTest {
	

	@Test(priority=1)
	public void gettitle() {
		System.out.println("tile");
	}

	@Test(priority=0)
	public void url() {
		System.out.println("url");
	}
	


@Test(priority=-1)
public void login() {
	System.out.println("login");

}
}
