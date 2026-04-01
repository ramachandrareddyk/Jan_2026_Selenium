package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		boolean flag= driver.findElement(By.tagName("h1")).isDisplayed();
		System.out.println(flag);
		
		if(flag) {
			System.out.println("Header is displaying and user can able to see: PASS");
		}else {
			System.out.println("Header is not visable to the user: FAIL");
		}
	}
	
	public static WebElement getWebElement(By Locater) {
		return driver.findElement(Locater);
	}
	
	
	public static boolean doIsElementDisplayed(By Locater) {
		return getWebElement(Locater).isDisplayed();
	}

}
