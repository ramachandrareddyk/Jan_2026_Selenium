package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil= new BrowserUtil();
		
		WebDriver driver= brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://demowebshop.tricentis.com/login");
		
		System.out.println(brUtil.getpageTitle());
		
		By email=By.id("Email");
		By pass=By.id("Password");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(email, "Test@123.com");
		eleUtil.doSendKeys(pass, "Test@123");
		
		brUtil.quitBrowser();
		

	}

}
