/* Description: "how to launch/Use Safari browser in Selenium"
HOW IT WORKS:No system.properties need to be added. Because Safari is a defaultbrowser in Mac, so we can directly run.
ANY Special Downloads: Yes. For windows, I've Opera safari seleium addon and uploaded as a externalLibrary for this project.
ANY PROBLEMS: 
ANY PROBLEMS: That you can fix.
- 1: Browser runs in the background. You can't see automation when it is running. Need to find a fix.
- 2: Browser doesn't close even after running close() method.
 */
package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
public class A3_SwitchTO_Browser_Safari {
	public static void main(String[] args) throws InterruptedException {
				WebDriver Obj1 = new SafariDriver();
				System.out.println("1: Created WebDriverObject");
				Obj1.navigate().to("http://www.google.com");
				System.out.println("2: Open Google home page in Safari");
				Obj1.findElement(By.id("gbqfbb")).click();
				System.out.println("**** 3: Clicked on I'm lucky button with id ****");
				Obj1.navigate().to("http://www.yahoo.com");
				System.out.println("1: Going to YAHOO home page");
				Thread.sleep(2000);	
				Obj1.close();
				System.out.println("4: closing Safari browser");
}
}
