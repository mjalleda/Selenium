/*  Description: Tested Locators for,
HTML ELEMENT:  TextBox (GoogleSearch Textbox)
Tested Locators: id, class, Xpath (Absolute, Positional & Relative)
Tested website: http://www.goolg.eocm -- homepage
*/

package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A1_Locators_HtmleElement_Textbox {
	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.bin","/Volumes/Firefox/Firefox"); // Since in MAC OS, firefox is NOT a default browser, the default browser is Safari, hence eclipse doesn't open friefox browser by default. Hence we are adding libraries to open firefox in autmation by itself.
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1 = new FirefoxDriver();		
		Obj1.get("http://www.google.com");
		
		//****************************************************************
		// TESTING: In google home page, TESTING GOOGLESEARCH TEXTBOX "google serach textbox"
		// Available Locators for TEXTBOX: ID & Class.
				System.out.println("1: Checking locators for TEXTBOX");
				Obj1.findElement(By.id("gbqfq")).clear();
				Obj1.findElement(By.id("gbqfq")).sendKeys("welcome1");
				System.out.println("**** 1: Tested with id ****");
					
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.className("gbqfif")).sendKeys("Welcome2");  // Since both buttons (Google search & I'm feeling lucky have the same classname, selenium will click on the first buton, in this case it will click on google serach button).
				System.out.println("**** 2: Tested it with className ****");	
				
				//Xpath
				//2: Positonal Xpath:
				System.out.println("**** 4: Testing Xpath **** ");
				System.out.println("**** 4.1: Testing Absolute Xpath **** ");
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.xpath("/html/body/div/div[2]/div/div/div[3]/div/div/div/form/fieldset[2]/div/div/div/table/tbody/tr/td/div/input[1]")).sendKeys("Wecome3");
				System.out.println("******* 4.1.1: Tested with Absolute Xpath: Using Tree Structure **** ");
			
				System.out.println("**** 4.2: Testing Positional Xpath **** ");
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.xpath("//table//tbody//tr//td//div//input[1]")).sendKeys("Wecome4");
				System.out.println("******* 4.2.1: Tested with Positional Xpath: Using Uplevels **** ");
			
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.xpath("//td//div//input[1]")).sendKeys("Wecome5");
				System.out.println("******* 4.2.2: Tested with Positional Xpath: Directly calling **** ");
				
				System.out.println("**** 4.3: Testing Relative xpath **** ");
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("Wecome6");
				System.out.println("******* 4.3.1: Tested with Relative Xpath: With help of ID locator **** ");
				
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.xpath("//input[1][@class='gbqfif']")).sendKeys("Wecome7");
				System.out.println("******* 4.3.2: Tested with Relative Xpath: With help of CLASS locator **** ");

				//CSSSelector
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.cssSelector("input#gbqfq")).sendKeys("Wecome8");
				System.out.println("******* 5.1: Tested with cssSelector: With help of ID locator **** ");			
	
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.cssSelector("input.gbqfif")).sendKeys("Wecome9");
				System.out.println("******* 5.2: Tested with cssSelector: With help of ID locator **** ");
								
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.cssSelector("input[class='gbqfif']")).sendKeys("Wecome10"); //Here, we are using class
				//Obj1.findElement(By.cssSelector("input[id=ÔgbqfqÕ]")).sendKeys("Wecome11"); //Here, we are using id
				//Obj1.findElement(By.cssSelector("input[name=ÔqÕ]")).sendKeys("Wecome10"); // Here, we are using name
				System.out.println("******* 5.3: Tested with cssSelector: With help of ThirdFormat locator **** ");
				
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.cssSelector("div#gs_lc0 > input#gbqfq")).sendKeys("Wecome11"); // Here, we are going one level up.
				System.out.println("******* 5.4: Tested with cssSelector: With help of Forth Format locator **** ");
				
				Obj1.navigate().to("http://www.google.com");
				Obj1.findElement(By.cssSelector("td#gs_tti0 > div#gs_lc0 > input#gbqfq")).sendKeys("Wecome12"); // Here, we are going two levels up.
				System.out.println("******* 5.5: Tested with cssSelector: With help of Forth Format locator **** ");
				Obj1.close();
}
}
