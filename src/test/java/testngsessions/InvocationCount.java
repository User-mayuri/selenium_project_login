package testngsessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority=1)
	public void gettitle() {
		System.out.println("tile");
	}

	@Test(priority=0)
	public void url() {
		System.out.println("url");
	}
	


@Test(invocationCount=5,priority=-1)
public void login() {
	System.out.println("login");


}
}
