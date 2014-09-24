/*  Description: Tested Locators for,
HTML ELEMENT:  TextLinks  (Advertisement & About)
Tested Locators: id, class, Xpath (Absolute, Positional & Relative)
Tested Website: htt[://www.google.com - homepage
*/

package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A1_Locators_HtmleElement_Link {

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.bin","/Volumes/Firefox/Firefox"); // Since in MAC OS, firefox is NOT a default browser, the default browser is Safari, hence eclipse doesn't open friefox browser by default. Hence we are adding libraries to open firefox in autmation by itself.
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");WebDriver Obj1 = new FirefoxDriver();		
		Obj1.get("http://www.google.com");
		// TESTING GOOGLESEARCH TEXTBOX
		//****************************************************************
		// TESTING: In google home page, TESTING GOOGLESEARCH Textlinks "Advertising", "BUsingess" & "About"
		// Available Locators for TEXTBOX: ID, Class & Text.
	System.out.println("1: Checking locators for LinkText");
	System.out.println("**** 1: Testing with Classname **** ");
	Obj1.findElement(By.className("_Ue")).click();
	System.out.println("************ Done.Tested with Classname **** ");
	System.out.println("**** 2: Tested with LinkText ****");				
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.linkText("Advertising")).click();
	System.out.println("************ Done.Tested with LinkText **** ");
	System.out.println("**** 3: Testing partialLinkText **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.partialLinkText("Adver")).click();
	System.out.println("************ Done.Tested with PartialLinkText **** ");
	
	//Xpath
	//2: Positonal Xpath:
	System.out.println("**** 4: Testing With Xpath **** ");
	System.out.println("**** 4.1: Testing Absolute Xpath **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div/span[2]/a[1]")).click();
	System.out.println("************ 4.1.1: Done: Tested with Absolute Xpath: Using Tree Structure **** ");

	System.out.println("**** 4.2: Testing Positional Xpath **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//span[2]//a[1]")).click();
	System.out.println("******* 4.2.1: Done. Tested with Positional Xpath: Using Uplevels **** ");

	/*Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//a[1]")).click(); Since Many a{1] exist on googlehome page, this wont work, hence commenting out.
	System.out.println("******* 4.2.2: Done. Tested with Positional Xpath: Directly calling **** "); */


	System.out.println("**** 4.3: Testing Relative xpath **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//span[@id='fsl']/a[1]")).click();
	System.out.println("******* 4.3.1: Done: Tested with Relative Xpath: With help of classname locator **** ");
	
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//a[1][@href='/intl/en/ads/?fg=1']")).click();
	System.out.println("******* 4.3.2: Done:  Tested with Relative Xpath: With help of linkText locator **** ");

	//********************** TESTING FOR 3RD LINK "ABOUT" *************. SKIPPING BUSINESS TEXTLINK AS IT IS SAME AS ABOUT.
	System.out.println(" \n*******************  TESTING FOR 3RD LINK ABOUT ***************************** \n");
	System.out.println("1: Checking locators for LinkText");
	System.out.println("**** 1: Testing with Classname **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.className("_Dd")).click();
	System.out.println("************ Done.Tested with Classname **** ");
	System.out.println("**** 2: Tested with LinkText ****");				
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.linkText("About")).click();
	System.out.println("************ Done.Tested with LinkText **** ");
	System.out.println("**** 3: Testing partialLinkText **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.partialLinkText("Abo")).click();
	System.out.println("************ Done.Tested with PartialLinkText **** ");
	
	//Xpath
	//2: Positonal Xpath:
	System.out.println("**** 4: Testing With Xpath **** ");
	System.out.println("**** 4.1: Testing Absolute Xpath **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div/span[2]/a[3]")).click();
	System.out.println("************ 4.1.1: Done: Tested with Absolute Xpath: Using Tree Structure **** ");

	System.out.println("**** 4.2: Testing Positional Xpath **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//span[2]//a[3]")).click();
	System.out.println("******* 4.2.1: Done. Tested with Positional Xpath: Using Uplevels **** ");

	/*Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//a[1]")).click(); Since Many a{3] exist on googlehome page, this wont work, hence commenting out.
	System.out.println("******* 4.2.2: Done. Tested with Positional Xpath: Directly calling **** "); */


	System.out.println("**** 4.3: Testing Relative xpath **** ");
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//span[@id='fsl']/a[3]")).click();
	System.out.println("******* 4.3.1: Done: Tested with Relative Xpath: With help of classname locator **** ");
	
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.xpath("//a[3][@href='/intl/en/about.html?fg=1']")).click();
	System.out.println("******* 4.3.2: Done:  Tested with Relative Xpath: With help of linkText locator **** ");
	
	//CSSSelector
	//1: By Id # will NOT work as there is no ID for the advertisement link.
	//2: By classname . will NOT work as there is no classname for the advertisement link.
	//3: For Thridformat > Id & Classnam will not work. Since there are no Id & classname.
	//3.1: ThridFormat: With help of href
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.cssSelector("a[href='/intl/en/ads/?fg=1']")).click();
	System.out.println("******* 5.3: Done:  Tested with cssSelector: In thirdformat > with href. **** ");
	
	//4: ForthFormat: 4.1: One parent level up
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.cssSelector("span#fsl>a._Ue")).click();
	System.out.println("******* 5.4.1: Done:  Tested with cssSelector: In ForthFormat > one parentlevel up **** ");
	
	//4.2:Two parent levels up
	Obj1.navigate().to("http://www.google.com");
	Obj1.findElement(By.cssSelector("span#fsl > a[href='/intl/en/ads/?fg=1']")).click();
	System.out.println("******* 5.4.2: Done:  Tested with cssSelector: In ForthFormat > one parentlevels up **** ");
	
Obj1.close();
}
}
