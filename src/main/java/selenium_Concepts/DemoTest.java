package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		//driver.get("www.google.com");//org.openqa.selenium.InvalidArgumentException
		
		//driver.get("https://google.com");//valid
		
		//driver.get("https:google.com");//valid
		
		//driver.get("https//www.google.com");//org.openqa.selenium.InvalidArgumentException
		
		driver.get("https://www.google.com");//valid
		
		System.out.println(driver.getTitle());
		

	}

}
