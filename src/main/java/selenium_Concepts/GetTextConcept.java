package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		
		String text1=driver.findElement(By.xpath("//div[@class='text']")).getText();
		System.out.println(text1);
		
		WebElement username= driver.findElement(By.id("Email"));
		username.sendKeys("testuser@gmail.com");
		
		String email=username.getText();
		System.out.println(email);

	}
	
	public static WebElement getWebElement(By Locater) {
		return driver.findElement(Locater);
	}
	
	public static String doGetText(By Locater) {
		return getWebElement(Locater).getText();
	}

}
