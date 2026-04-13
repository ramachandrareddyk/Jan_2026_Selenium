package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("");
		
		driver.findElement(By.cssSelector(""));
	
		//CSS: Cascading style sheets
		
		//id, name, classname, attribute
		
		
		//1. id: #id  or tagname#id
		
		//#Email,  input#Email
		
		//2. class: .class or tagname.class
		
		//.email
		//input.email
		//input.login-button
		
		//multiple class names in CSS
		//.class1.class2
		//.button-1.login-button
		//tagname.class.class.class
		//input.button-1.login-button
		
		//3.tag#id.class
		//input#Email.email
		
		//4. tag.class#id
		//input.email#Email
		
		//5. tag.class1.class2.class3#id
		
		
		///how to use attributes to write CSS selector
		//xpath: //tag[@name='value']----//input[@value='Search store']
		//css: tag[attribute='value']----input[value='Search store']
		
		//input[@id='small-searchterms']
		
		//htmaltag[trri1='value'][attri2='value']
		//input[id='small-searchterms'][value='Search store']
		//input[id='Password'][class='password'][type='password']
		//input[name='Password'][type='password']#Password
		//input[name='Password'][type='password'].password
		//input[name='Password'][type='password'].password#Password
		//input.password#Password[name='Password'][type='password']
		
		
		//contains:
		// tag[attr *='value']
		// span[class *='field-validation']
		
		// input[placeholder='Enter email'] with complete attribute value
		// input[placeholder *='Enter P']
		
		//starts-with
		//tag[attr ^='value']
		//input[placeholder ^='Enter P']
		
		//ends-with
		//tag[attr $='value']
		//input[placeholder $='Password']
		
		//text: NA
		
		//parent to child
		//parent tag > child tag 
		//div>input
		//div[class='inputs']>input[id='Email']
		
		//child to parent: NA: Backword traversing is not supported by CSS selector
		
		
		//indexing
		//select#Form_getForm_Country > option:nth-of-type(2)
		//select#Form_getForm_Country > option:nth-of-type(n)
		
		//select#Form_getForm_Country > option:nth-of-type(1)
		//select#Form_getForm_Country > option:first-child
		//select#Form_getForm_Country > option:last-child
		
		//select#Form_getForm_Country > option:nth-child(5)
		//select#Form_getForm_Country > option:nth-child(100)
		//select#Form_getForm_Country > option:nth-last-child(3)
		
		//select#Form_getForm_Country > option:nth-child(even)
		//select#Form_getForm_Country > option:nth-child(odd)
		
		
		//dff b/w         CSS          Xpath
		//Syntex:		complex		  complex
		//performence	Faster		  Good
		//text			No			  Yes
		//parent child	yes			  Yes
		//child to parent no		  Yes
		
		
		
		
		
		

	}

}
