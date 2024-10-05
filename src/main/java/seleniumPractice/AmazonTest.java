package seleniumPractice;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String browserName="chrome";
       
       BrowserUtil brutil=new  BrowserUtil();
       brutil.launchBrowser(browserName);
       
       brutil.launchURL("https:\\www.amazon.com");
       
       String title=brutil.getPageTitle();
       System.out.println(title);
	}

}
