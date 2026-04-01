package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		//create WebElement + perform Action(click, sendkeys, getText,isDisplay)
		
		//DOM: Document Object Modal
		
		//1.
//		driver.findElement(By.id("Email")).sendKeys("ramureddy4555@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Ramureddy@77");
		
		//2.
//		WebElement email= driver.findElement(By.id("Email"));
//		WebElement Password= driver.findElement(By.id("Password"));
//		
//		email.sendKeys("test@gmail.com");
//		Password.sendKeys("test@123");
//		
//		email.sendKeys("ram@123.com");
//		Password.sendKeys("Test@890");
		
		//3. By locater
		
//		By email=By.id("Email");
//		By pass=By.id("Password");
//		
//		WebElement email_ele= driver.findElement(email);
//		WebElement pass_ele= driver.findElement(pass);
//		
//		email_ele.sendKeys("test@gmail.com");
//		pass_ele.sendKeys("Test@890");
		
		
		//4.By locater + genaric method for webElement
		

//		By email=By.id("Email");
//		By pass=By.id("Password");
//		
//		getWebElemnt(email).sendKeys("testing");
//		getWebElemnt(pass).sendKeys("test@123");
		
		//5.By locater + genaric method for webElement and Action
		
//		By email=By.id("Email");
//		By pass=By.id("Password");
//		
//		doSendKeys(email, "Testing");
//		doSendKeys(pass, "Test@123");
		
		//6.By locater + generic function to get the element and perform action -Element utils
		
		By email=By.id("Email");
		By pass=By.id("Password");
		
		ElementUtil util= new ElementUtil(driver);
		
		util.doSendKeys(email, "Testing@123.com");
		util.doSendKeys(pass, "Test@123");
		
		
	}
	
	public static void doSendKeys(By Locater, String Value) {
		getWebElemnt(Locater).sendKeys(Value);
	}
	
	public static WebElement getWebElemnt(By Locater) {
		return driver.findElement(Locater);
	}

}
