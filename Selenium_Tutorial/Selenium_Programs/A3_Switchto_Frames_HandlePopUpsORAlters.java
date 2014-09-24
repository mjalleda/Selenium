/*  Description: "How to handle Alters/Popups Using Selenium"
 * Usually, Alters/Popups contain buttons like OK, Cancel Or Dismiss, etc.
 * Methods already available: 1:Clickin on "OK" button on popups/alters 
 * 		  	                  2: Clicking on "Cancel" button on popups/alters
Tested Website: http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert  && http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
Note: Important NOTE is: If htmlelement inside a frame, then you have to change/switch the driver focus on FRAMES. After your job is done, you need to come out from frames.
*/
package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A3_Switchto_Frames_HandlePopUpsORAlters {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
	WebDriver Obj1 = new FirefoxDriver();
	Obj1.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	
	Obj1.switchTo().frame(Obj1.findElement(By.id("iframeResult")));
	System.out.println("1: Changed the WebDriverObject focus to Frames");
	Obj1.findElement(By.xpath("html/body/button")).click();
	System.out.println("2: Clicked on 'TRY' button inside the frame");
	Thread.sleep(3000);
	System.out.println("3: Waited for 3 seconds for the popup to appear");
	Obj1.switchTo().alert().accept();
	System.out.println("4: Now, clicked on 'OK' Button on popups.");
	Obj1.switchTo().defaultContent();
	System.out.println("5: Our Job is done. COME OUT FROM FRAMES");
	
	Obj1.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	System.out.println("6: Now, navigate to a different URL.");
	Obj1.switchTo().frame(Obj1.findElement(By.id("iframeResult")));
	System.out.println("7: Changed the WebDriverObject focus to Frames");
	Obj1.findElement(By.xpath("html/body/button")).click();
	System.out.println("8: clicked on TRY button inside the frame");
	Thread.sleep(3000);
	System.out.println("9: Waited for 3 seconds for the popup to appear");
	Obj1.switchTo().alert().dismiss();
	System.out.println("10: Now, clicked on 'CANCEL' Button on popups.");
	Obj1.switchTo().defaultContent();
	System.out.println("11: Our Job is done. COME OUT FROM FRAMES");

Obj1.close();
}
}
