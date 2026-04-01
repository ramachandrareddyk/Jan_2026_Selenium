package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// Locaters in selenium

		// to create the webelemnt(FE) + Perform action

		driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/login");
		
		//in selenium we have 8 locaters
		
		//1. Id: its a attribute: Unique --1
		
	//	driver.findElement(By.id("Email")).sendKeys("Test@abc.com");
	//	driver.findElement(By.id("Password")).sendKeys("Test@123");
		
		//mount_0_0_E2---there is chance to change dynamically when page is refreshing
		
		//2. Name:  is a attribute: can be duplicate  --2
	//	driver.findElement(By.name("Email")).sendKeys("Test@123.com");
	//	driver.findElement(By.name("Password")).sendKeys("Test@123");
		
		//3. className: is a attribute: can be duplicate---3
//		driver.findElement(By.className("email")).sendKeys("Test@123.com");
//		
//		driver.findElement(By.className("button-1"));
		
		//button-1 register-button---classname
		//you can use only any one class
		
		//4. xpath: is not a attribute: it's address of webElement in DOM---4
//		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Test@13.com");
//		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Test#123");
		
		//5. CSS Selector: not a attribute----rare case
		//css: cascaded style sheet
//		driver.findElement(By.cssSelector("#Email")).sendKeys("Test@13.com");
//		driver.findElement(By.cssSelector("#Password")).sendKeys("Test@123");
		
		//6. Link text: Only for links 
		//htmltag =<a>
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		//7. Partial Link text
		//driver.findElement(By.partialLinkText("password?")).click();
		
		//8. tagname:
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);

	}

}
