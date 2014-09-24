/*  Description: Tested Locators for,
HTML ELEMENT:  Button (I'm feelig lucky in home page).
Tested Locators: id, name, class, Xpath (Absolute, Positional & Relative) & CSS
Tested website: http://www.google.com -- homepage.
Notes: 
1: Imported the following build in package inorder to  execute select commands.
*/
package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A1_Locators_HtmleElement_Button {
	public static void main(String[] args)
	{
		// TESTING: In google home page, TESTING Im' feeling lucky Button.
		// Available Locators for BUtton: ID, name & Class.
		//System.setProperty("webdriver.firefox.bin","/Volumes/Firefox/Firefox");
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		
		
		WebDriver Obj1  = new FirefoxDriver();
		Obj1.get("http://www.google.com");
	
		System.out.println("1: Checking locators for button");
		Obj1.findElement(By.id("gbqfbb")).click();
		System.out.println("**** 1: Clicked with id ****");
		
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.name("btnI")).click();
		System.out.println("**** 2: Clicked with name **** ");
		
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.className("gbqfba")).click();  // Since both buttons (Google search & I'm feeling lucky have the same classname, selenium will click on the first buton, in this case it will click on google serach button).
		System.out.println("**** 3: Clicked with className: Since Search &I'm feeling lucky have shairng same class name, selenium will click on first button, in this case it is Searchbutton. **** ");
		
		//Xpath
		//2: Positonal Xpath:
		System.out.println("**** 4: Testing Xpath **** ");
		System.out.println("**** 4.1: Testing Absolute Xpath **** ");
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.xpath("/html/body/div/div[2]/div/div/div[3]/div/div/div/form/div[2]/button[2]")).click();
		System.out.println("******* 4.1.1: Clicked with Absolute Xpath: Using Tree Structure **** ");
	
		System.out.println("**** 4.2: Testing Positional Xpath **** ");
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.xpath("//form//div[2]//button[2]")).click();
		System.out.println("******* 4.2.1: Clicked with Positional Xpath: Using Uplevels **** ");
	
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.xpath("//button[2]")).click();
		System.out.println("******* 4.2.2: Clicked with Positional Xpath: Directly calling **** ");
		
		System.out.println("**** 4.3: Testing Relative xpath **** ");
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.xpath("//button[@id='gbqfbb']")).click();
		System.out.println("******* 4.3.1: Clicked with Relative Xpath: With help of ID locator **** ");
		
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.xpath("//button[@name='btnI']")).click();
		System.out.println("******* 4.3.2: Clicked with Relative Xpath: With help of NAME locator **** ");
		
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.xpath("//button[2][@class='gbqfba']")).click();
		System.out.println("******* 4.3.3: Clicked with Relative Xpath: With help of CLASS locator **** "); 
	
		//CSS:
		//1: Using Id.
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.cssSelector("button#gbqfbb")).click();
		System.out.println("******* 5.1: Clicked with CSS: Using Id locator **** ");
	
		//2; Using Classname. But here, it clicks on "GoogleSerach" buton on "I'm lucky", because both have same classname, so selenium will click on the first element.
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.cssSelector("button.gbqfba")).click();
		System.out.println("******* 5.2: Clicked with CSS: Using name locator **** "); 
	
		//3: Using cssSelector --> thridway. Format: htmlelement[locator='value']
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.cssSelector("button[name='btnI']")).click();
		System.out.println("******* 5.3: Clicked with CSS: Using thirdformat (using on name) locator **** ");
	
		//4: Using cssSelector --> thridway. Format: htmlelement[id='value']
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.cssSelector("button[id='gbqfbb']")).click();
		System.out.println("******* 5.4: Clicked with CSS: thirdformat (using on id) locator **** ");
		
		//5: Using cssSelector --> thridway. Format: htmlelement[classname='value']
		//But here, it clicks on "GoogleSerach" buton on "I'm lucky", because both have same classname, so selenium will click on the first element.
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.cssSelector("button[class='gbqfba']")).click();
		System.out.println("******* 5.5: Clicked with CSS: thirdformat (using on clasname) locator **** ");

		//6: Using cssSelector --> Fourthway. Format: This is mostly used for child elements. parenthtmlelement > childhtmlelement[locator='value'] ]
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.cssSelector("div#gbqfbwa > button[id='gbqfbb']")).click();
		System.out.println("******* 5.6: Clicked with CSS: Fourthformat (using greater than symbol.) locator **** ");
		
		//7: Using cssSelector --> Fourthway. Using more up levels
		Obj1.navigate().to("http://www.google.com");
		Obj1.findElement(By.cssSelector("div#gbqfw > form#gbqf > div#gbqfbwa > button[id='gbqfbb']")).click();
		System.out.println("******* 5.7: Clicked with CSS: FourthFormat (using more uplevels) locator **** ");
				
				
Obj1.close();
	}
}
