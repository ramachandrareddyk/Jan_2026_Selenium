package selenium_Concepts;

import org.openqa.selenium.WebDriver;

public class WebShopTest {

	public static void main(String[] args) {
	
		BrowserUtil brUtil= new BrowserUtil();
		
		WebDriver driver= brUtil.initDriver("chrome");
		
		//driver.get("https://demowebshop.tricentis.com/");
		brUtil.launchURL("https://demowebshop.tricentis.com/");
		
		String title=brUtil.getpageTitle();
		System.out.println(title);
		
		String pageSource=brUtil.getCurrentPageSource();
		System.out.println(pageSource);
		
	}

}
