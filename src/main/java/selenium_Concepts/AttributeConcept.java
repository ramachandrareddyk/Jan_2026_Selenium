package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement serachBox= driver.findElement(By.id("small-searchterms"));
		
//		String value=serachBox.getAttribute("value");//deprecated
//		System.out.println(value);
		
		String value=serachBox.getDomAttribute("value");
		System.out.println(value);
		
		String tagname=serachBox.getDomProperty("tagName");
		System.out.println(tagname);
		
		WebElement username= driver.findElement(By.id("Email"));
		username.sendKeys("testuser@gmail.com");
		
		String email=username.getDomProperty("value");
		System.out.println(email);
		
		

	}
	
	public static WebElement getWebElement(By locater) {
		return driver.findElement(locater);
	}
	
	public static String getElementDomAttributeValue(By locater, String attName) {
		return getWebElement(locater).getDomAttribute(attName);
	}
	

	public static String getElementDomPropertyValue(By locater, String propName) {
		return getWebElement(locater).getDomProperty(propName);
	}


}
