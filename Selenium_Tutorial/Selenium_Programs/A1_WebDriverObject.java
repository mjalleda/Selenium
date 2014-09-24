// Description: Created a object for Web Driver & FirefoxDriver. Later, executed methods available for this driver.

package Tutorial;
import org.openqa.selenium.By; // Which will Selenium BY command, which we use in findelement() method.
import org.openqa.selenium.WebDriver;  // Which will import all webdriver libraries.
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver; //While will import all selenium firefor realted libraries. For ex: FirefoxDriver().

public class A1_WebDriverObject {

	public static void main(String[] args) {
		//1: Launch firefox browser
		//System.setProperty("webdriver.firefox.bin","/Volumes/Firefox/Firefox"); // Since in MAC OS, firefox is NOT a default browser, the default browser is Safari, hence eclipse doesn't open friefox browser by default. Hence we are adding libraries to open firefox in autmation by itself.
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver driver1=new FirefoxDriver(); // creating two webdriver objects, it also opens blank firefox driver.
		WebDriver driver2 = new FirefoxDriver();
		System.out.println("1: Launched Firefox browser");
				
		//2: navigating to any url
		driver1.get("http://www.google.com");
		System.out.println("2: Executing get() method");
		
		//3: Findelement() method: To find htmlelements with locators like id, name, class, findText, CSS and Xpath
		driver1.findElement(By.id("gbqfbb")).click();
		driver1.get("http://www.google.com");
		driver1.findElement(By.name("btnI")).click();
		//driver1.findElement(By.className(gbqfba")).click(); // We can't test classname here, as the classname shared by other elements too. 
		// As you can write, many different ways of Xpath.
		System.out.println("3: Executing FindElement() method");
		
		//4: Comparing with eauals method. 	`1`
		System.out.println("4: Executing equals() method");
		boolean b = driver1.equals(null); //comparing with null
		System.out.println("******* 4.1:Comapring webdriver Object with null: Results should false: "+b +"******* ");
		boolean c = driver1.equals(args[0]);  //comparing with dynamic value that you pass during running.
		System.out.println("******* 4.2:Comapring webdriver Object with a value which you should pass, pass value 10. Resuls should be false: "+c +" ******* ");				
		boolean d = driver1.equals(driver2); //comparing wth different object,
		System.out.println("******* 4.3:Comparing with other webdriver object, Result should be False: "+d + " ******* ");
				
		//5: getClass() Method. 6:getCurrentURL(). 7:getTitle().8: getWindowHandle(), 9: getWindowHadles(), 10: hascode(), 11: getpagesource()
		System.out.println("5: Executing getClass() method. The classname is: "+driver1.getClass()); 
		String S1 = driver1.getCurrentUrl();
		System.out.println("6: Executing getCurrentUrl() method. The current URL is: "+S1);		
		String S2 = driver1.getTitle();
		System.out.println("7: Executing getTitle() method. The title is: "+S2); // It will return the value which you passed in "get". Here, you passed "http://www.google.com"		
		System.out.println("8: Executing getWindowHanlde() method. The current windowHandle is: "+driver1.getWindowHandle());
		System.out.println("9: Executing getWindowHanlde() method. The current windowHandles are: "+driver1.getWindowHandles());
		int s4 = driver1.hashCode();
		System.out.println("10: Executing hashCode() method. The current hashCode is: "+s4);
		Options S5 = driver1.manage();
		System.out.println("11. Executing manag methid, the method options are: "+S5);
		String S3 = driver1.getPageSource();
		System.out.println("12. Executing getPageSource method but not printing them, because they take long pages.");
		System.out.println(""+S3);
		
		
		//13: navigate()
		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.navigate().refresh();
		System.out.println("***************************************************************************");
		System.out.println("13: Tested navigate() method");
		
		
		// PENDING: SWTICHTO.
		//14: Close & 15: Quit Method. 
		driver1.close();	
		System.out.println("13. Executing close() method, the browser is closed");
		driver1.quit(); // It is completely quitting the object, later it can't be used. For ex: Try to execute driver1.close();, it will you an error "sessionNotFoundException".
		System.out.println("14. Executing quite() methid, the web driver is quit");
		//driver1.close(); // If we run this, it will give an error "SessionNotFoundException", because the firefox cannt be used after quit() was called.
	}
}
