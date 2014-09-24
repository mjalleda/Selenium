/* Description: This Assignment shows, how to handle multiple windows with SwitchTO() command.
 *In order to switch in between windows, we use their hashcodes. Hashcode is always unique to a window.
 * 1: Get Mainwindow's Hashcode with getWindowHandle()
 * 2: Open second window and get second window's hashcode.
 * 3: Compare two, both should be different.
 * 4: Now, get both windows hashcodes with getWindowHandles(). Store them to variables and find if any third window exist. 
 * 5: now switch in between using thier hashcodes.
 * 6: When you move in between windows, you can't directly work with windows, first you need to change/switch to that window using switchTo() & window() command.
*/
package Tutorial;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A3_SwitchTo_Windows {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1  = new FirefoxDriver();
		Obj1.get("http://www.w3schools.com/js/js_popup.asp");
		
		String FirstWindowsURL = Obj1.getCurrentUrl();
		System.out.println("1: Get the current/first window's URL: "+FirstWindowsURL);
		
		String FirstWindowTitle = Obj1.getTitle();
		System.out.println("2: Get the current/first window's Title: "+ FirstWindowTitle);
		
		String FirstWindowHashcode = Obj1.getWindowHandle();
		System.out.println("3: Get the current/first window's hashcode: "+FirstWindowHashcode);
		
		Obj1.findElement(By.xpath("//div[6]/a")).click();
		System.out.println("4: On firstwindow click on a button, which opened up a second window.");
		
		String SecondWindowHashCode = Obj1.getWindowHandle();
		System.out.println("5: Get the current/second window's hashcode: "+ SecondWindowHashCode);
		
		Boolean CompareHashcode = FirstWindowHashcode.equals(SecondWindowHashCode);
		System.out.println("6: Comapring two windows hashcodes, they are not euqals, hence it reutnred FALSE: "+ CompareHashcode);
		
		Set<String> AllWindows = Obj1.getWindowHandles();
		System.out.println("7: Get both windows hashcodes: "+ AllWindows);

		//Obj1.close();
		Iterator<String> IterateWindows = AllWindows.iterator();
		System.out.println("8: Iterate them and get each window hashcode.");
		String FirstWindowHashCode1 = IterateWindows.next();
		System.out.println("9: Store FirstWindow Hashcode into a variable. the hashcode is:" + FirstWindowHashCode1);
		String SecondWindowHashCode1 = IterateWindows.next();
		System.out.println("10: Store SecondWindow Hashcode into a variable. The hashcode is: "+ SecondWindowHashCode1);
		
		//Find if third windows exists? If so, go into if loop and store thirdwindow's hashcode into a variable.
		if(IterateWindows.hasNext())
			{
			String ThirdWIndow = IterateWindows.next();
			System.out.println("Try, if Third window's exist, if so it's hashcode is: "+ThirdWIndow);
			}
		
		//Here, we are using Window() command to change the focus.		
		Obj1.switchTo().window(SecondWindowHashCode1);
		System.out.println("11: Change the WebDriver focus on SecondWIndow");
		
		String SecondWindowHashCode2 = Obj1.getWindowHandle();
		System.out.println("12: Confirm, it changed the focus to secondwindow by retriivng secondwindow's hashcode. it is: "+ SecondWindowHashCode2);
		
		Obj1.close(); // It will close the second window. 
		System.out.println("13: Close second window");
		
		//Obj1.getWindowHandle(); //If you are trying to get Main/First windowhandle without changing the focus, then it will return error. hence commented it out. 
		Obj1.switchTo().window(FirstWindowHashCode1); //You need to switch the focus to mainwindow inorder to workwith mainwindow, If you close second window the driver wont switch the focus to mainwindow, you need to change it.
		System.out.println("14: Now, change to WebDriver focus to Firstwindow");
		
		String FirstWindowHashcode2 = Obj1.getWindowHandle();
		System.out.println("15: Confirm it changed the focus by retriving its hashcode, Firstwindow hashcode is:: "+ FirstWindowHashcode2);
		
		Obj1.close(); //It will close the Main window.
		System.out.println("16: Close FirstWIndow");
		Obj1.quit(); //It will close the WebDriverObject.
		System.out.println("17: Quit WebDriver Object");
}
}
