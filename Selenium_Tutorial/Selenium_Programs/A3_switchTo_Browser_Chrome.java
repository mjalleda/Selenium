/* Description: how to "Launcg Chrome browser"
HOW IT WORKS:System.properties needed to be added. We need to download SeleniumChrome browser addon first and then we should add that addon to chrome driver.
ANY Special Downloads: Yes. I've downloaded ChromeSeleiumAddon and added to System.properties().
ANY PROBLEMS: 
ANY PROBLEMS: That you can fix.
- 1: Browser runs in the background. You can't see automation when it is running. Need to find a fix.
 */
package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A3_switchTo_Browser_Chrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/appledev/Documents/workspace/Downloads_Documents/Selenium/Tools_Libraries/ChromeDriver");
		WebDriver Obj1 = new ChromeDriver();
		System.out.println("1: Created a webdriver Object for ChromeDriver");
		Obj1.navigate().to("http://www.google.com");
		System.out.println("2: In Chrome browser, going to google home page");
		Thread.sleep(2000);
		Obj1.findElement(By.id("gbqfbb")).click();
		System.out.println("3: clicked on I'm lucky button ");
		Thread.sleep(2000);
	Obj1.close();
	System.out.println("4: Closing the browser ");
	
}
}
