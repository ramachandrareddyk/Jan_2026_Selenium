package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//xpath: address of the element in HTML DOM(Document Object Modal)
		//not attribute
		
		//1. Absolute xpath: /
		///html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/input
		
		//2. relative xpath: //
		
		//htmaltag[@attr='value']
		//input[@id='newsletter-email']
		//input[@name='NewsletterEmail']
		//input[@type='text']
		//input[@value='Subscribe']
		//*[@name='NewsletterEmail']
		
		
		//htmltag[@attr='value' and @attr='value']
		//input[@type='text' and @name='NewsletterEmail']
		//input[@type='text' or @name='NewsletterEmail']
		//input[@type='submit' and @value='Search' and @class='search-box-button']
		//input[@type='submit' and @value='Search' or @class='search-box-button']
		
		//text(): links, labels, headers
		//htmltag[text()='value']
		//a[text()='Register']
		//a[text()='Shopping cart']
		//strong[text()='Newsletter']
		
		//text() and attribute
		//htmltag[text()='value' and @attr='value']
		//a[text()='Register' and @class='ico-register']
		//label[text()='Male' and @class='forcheckbox' and @for='gender-male']
		//label[@class='forcheckbox' and @for='gender-male' and text()='Male']
		
		//contains(): partial attribute value, partial text
		
		//htmltag[contains(@attr,'value')]
		//input[contains(@name,'Email')]
		//input[contains(@name,'Email') and contains(@id,'Ema')]
		//input[contains(@name,'Email') and @id='Email']
		
		//caontains() with text()
		//div[contains(text(),'By creating an account on our website you will be able')]
		//label[contains(text(),'Email:') and @for='Email']
		//label[contains(text(),'Email:') and @for='Email' and text()='Email:']
		
		//dynamic attribute/text
		
//		<input id="firstname_123">
//		<input id="firstname_456">
//		<input id="firstname_789">
//		
//		<input id="first_123_name">
//		<input id="first_456_name">
		
		//input[contains(@id,'firstname')]
		
		driver.findElement(By.id("firstname_123"));// wont work
		driver.findElement(By.xpath("//input[contains(@id,'firstname')]"));// will work
		
		//<div> your order id is: 12345</div>
		
		//div(text()='your order id is: 12345')] wont work
		//div(contains(text(),'your order id is:')]
		
		//starts-with
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@id,'firstname') ]
		
		//label[starts-with(text(),'Email:') and @for='Email' and text()='Email:']
		//div[starts-with(text(),'By creating an account on our website you will be able')]
		
		//index in xpath
		//(//input[@type='text'])[3]
		//(//input[@type='text'])[1]
				
		//(//input[@type='text'])[position()=1]
		//(//input[@type='text'])[position()=3]
		
		//(//input[@type='text'])[last()]
		//(//input[@type='text'])[last()-1]
		
		//(//input[@type='text'])[position()=last()]
		

	}

}
