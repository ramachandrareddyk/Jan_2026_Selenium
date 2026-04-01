package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://flipkart.com");
		
		System.out.println(driver.getTitle());
		
		driver.get("https://myntra.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
	}

}
