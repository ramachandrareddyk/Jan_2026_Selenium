package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement userName= driver.findElement(By.id("Email"));
		WebElement password=driver.findElement(By.id("Password"));
		
		String uname="Test@123.com";
		String pass="Test@123";
		
//		userName.sendKeys(uname);
//		password.sendKeys(pass);
//		
//		String str= new String("Ram@123.com");
//		
//		userName.sendKeys(str);
		
		String s="Raj";
		String s1="@gmail.com";
		
//		userName.sendKeys(s,s1);
//		
//		Thread.sleep(4000);
//		
//		userName.clear();
//		
//		userName.sendKeys(uname);
		
		userName.sendKeys(null);
		
		
		
		

	}

}
