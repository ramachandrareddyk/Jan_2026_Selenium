package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		//WebElement fname= driver.findElement(By.id("fnamee"));//NoSuchElementException: no such element: Unable to locate element: 
		//WebElement pass= driver.findElement(By.id("pass"));
		
		String text=driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(text);

	}

}
