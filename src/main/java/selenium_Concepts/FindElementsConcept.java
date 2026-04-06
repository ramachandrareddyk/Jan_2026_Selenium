package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		//WebElement fname= driver.findElement(By.id("fnamee"));//NoSuchElementException: no such element: Unable to locate element: 
		//WebElement pass= driver.findElement(By.id("pass"));
		
		String text=driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(text);
		
		List<WebElement>h2Headers= driver.findElements(By.tagName("h5"));
		
		System.out.println(h2Headers.size());//3
		
//		System.out.println(h2Headers.get(0).getText());
//		System.out.println(h2Headers.get(1).getText());
//		System.out.println(h2Headers.get(2).getText());
		//System.out.println(h2Headers.get(3).getText());//IndexOutOfBoundsException
		
//		for(int i=0;i<h2Headers.size();i++) {
//			String text1=h2Headers.get(i).getText();
//			System.out.println(text1);
//		}
		
		
		

	}

}
