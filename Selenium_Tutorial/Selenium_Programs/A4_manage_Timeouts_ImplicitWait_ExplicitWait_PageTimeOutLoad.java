/* Description: This assignment shows "How to use Timeout() methods and also PageLoadTimeOut() method"
 * 1: Run pageLoadTimeout() Method.
 * 2: Window Maximize() method.
 * 3: Thread.sleep() method: Which will blindly wait for 10 seconds. It won't check during 10 seconds. 
 * 4: Implicit() timeout method.
 * 5: Explicit() timeout methods.
ANY PENDINGS: Need to execute few more Explicit & Implicit methods().
 */  
package Tutorial;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A4_manage_Timeouts_ImplicitWait_ExplicitWait_PageTimeOutLoad {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1  = new FirefoxDriver();
		Obj1.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//1: Run pageLoadTimeout() Method.
		//How it works: We have so many timeouts like thread.sleep, implicitTimeout & explicitTimeout. But all those only works on htmlelements but not for the page. So Selenium gave a separate command for the page, i.e., PageLoadTImeout().
		Obj1.manage().timeouts().pageLoadTimeout(2, TimeUnit.MILLISECONDS);
		System.out.println("1: PageLoaded within given time. PageTimeOutLoad didnt return exception");
		//2: Window Maximize() method.
		Obj1.manage().window().maximize();
		
		//3: Thread.sleep() method: Which will blindly wait for 10 seconds. It won't check during 10 seconds. 
		Thread.sleep(10000);
		
		/* 4: Implicit() method. How it works: 
		1: We have to call implicitlyWait() method. 
		2: Basically we want the compiler to, Search htmlelemt for x number (here, 120) seconds, if you find then continue with next line of code. O.w return an exception
		3: Basically, we have to write that htmlelement in next line after the implicitTimeout() method */
		Obj1.switchTo().frame(Obj1.findElement(By.id("iframeResult")));
		Obj1.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		Obj1.findElement(By.xpath("//button")).click();
		Obj1.switchTo().alert().accept();
		
		/* 5: ExplicitWait() using method PresenceofElementLocated()
		How it works: 
		1: For any ExplicitTimeout() method, first you need to create object for WebDriverWait class.
		2: Later, we call Until() with ExpectedConditions
		3: Here we need to mention explicitly, that check for TRY button for 120 seconds, if button not find then return exception. */
		WebDriverWait WaitObject = new WebDriverWait(Obj1, 120);
		WaitObject.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button")));
		Obj1.findElement(By.xpath("//button")).click();
		
		
		
		//5: ExplicitTimeout using method alertIsPresent().
		// How it works: checking if alters is NOT present, if so it goes in to IF loop, o.w. it goes to else loop. 
		if(WaitObject.until(ExpectedConditions.alertIsPresent()) == null)
		{
		System.out.println("alert was NOT present");
		}
		else
		{
			System.out.println("alert was present");
			Obj1.switchTo().alert().dismiss();
		}
		
		//5: 5.3: InvisibilityOfElementLocated & 5.4: frameToBeAvailableAndSwitchToIt()
		//WaitObject.until(ExpectedConditions.invisibilityOfElementLocated(By.));
		//WaitObject.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.))
		
Obj1.close();
}
}
