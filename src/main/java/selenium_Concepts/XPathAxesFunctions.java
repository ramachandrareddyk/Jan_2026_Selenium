package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesFunctions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		driver= new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(5000);
		
		//parent to child
		
		//parentTag[@attr='value']/childTag[@attr='value']//  signle / can find an elements only direct child's
		//div[@class='inputs']/input[@id='Email']
		
		//parentTag[@attr='value']//childTag[@attr='value']//  double // can find direct/indirect child
		//form[@method='post']//input[@id='Email']
		
		//parentTag[@attr='value']/child::childTag[@attr='value']
		//div[@class='inputs']/child::input[@id='Email']
		//form[@method='post']//child::input[@id='Email']
		
		//child to parent: backword traversing 
		//input[@id='Email']/../../..
		//input[@id='Email']//parent::div
		
		
		//ancestor:-->Selects all the ancestors(parents, grandParents)
		//it will move upword in the DOM
		//input[@id='Email']//ancestor::div
		
		//descendant: selects all the descendants(childran, grand childrans)
		//form[@method='post']/descendant::input[@id='Email']
		
		//following
		//input[@id='Email']/following::span
		
		//Following-sibling
		//input[@id='Email']//following-sibling::span
		
		//preceding
		//input[@id='Email']//preceding::label
		
		//preceding-sibling
		//input[@id='Email']//preceding-sibling::label
		
		//driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("//a[text()='Kevin.Mathews']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

		selectUser("Joe.Root");
		selectUser("Jordan.Mathews");
		
		WebElement element = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		//img[@alt='Tricentis Demo Web Shop']
		
	}
	
	public static void selectUser(String username) {
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

	}

}
