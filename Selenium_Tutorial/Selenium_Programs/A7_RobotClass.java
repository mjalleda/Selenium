/*  Description: This assignment shows "How to use Robot Class, Keyword & Mouse Events".
 * Tested Robot class.
 * Keyboard events are: KeyPress(), KeyRelease(), KeyEvent() methods
 * Mouse Events are: mouseMove(), mousePress(), mouseRelease(), InputEvent() methods.

 Basically, the Java Robot class help us with keyboard and mouse functions. 
 Keyboards functions: You can enter any keys which are appeared on keyboard like esc, return, back, alphabets, numbers, spcial characters, etc.
 Mouse functions: You can perform all mouse functions like, right click, left click, scrolling with middle scrool bar.
 In this example, We are performing Keyboard & Mouse events in google serach text box, it pass some alphabets from keyboard and then press on key "enter", later enters on number 8...so on.
 */
package Tutorial;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A7_RobotClass 
{
		public static void main(String args[]) throws AWTException, InterruptedException
		{
			System.out.println("*********************************************************************************************************");
			System.out.println("                                      CLASSNAME: Class_L_RobotClass   ");
			System.out.println("*********************************************************************************************************");			
			Thread.sleep(2000);
			Robot r = new Robot();
			
			System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
			WebDriver Obj1 = new FirefoxDriver();
			Obj1.get("http:www.google.com");		
			Obj1.findElement(By.id("gbqfq")).clear();
			Obj1.findElement(By.id("gbqfq")).sendKeys("Selenium ");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			System.out.println("1: Clicked on Enter button from keyboard");
						
			r.keyPress(KeyEvent.VK_8);
			r.keyRelease(KeyEvent.VK_8);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("2: Clicked on 1 & Enter buttons from keyboard");	
			
			r.mouseMove(500, 500);
			Thread.sleep(2000);
			System.out.println("3: Mouse moved to latititude and longitude at 300 & 300.");
			
			r.mousePress(InputEvent.BUTTON3_MASK);
			r.mouseRelease(InputEvent.BUTTON3_MASK);
			Thread.sleep(2000);
			System.out.println("4.Clicked on mouse right cllick");
						
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(2000);
			System.out.println("5.Clicked on mouse left click");
						
			r.mousePress(InputEvent.BUTTON2_MASK);
			r.mouseRelease(InputEvent.BUTTON2_MASK);
			System.out.println("6.Clicked on mouse middle scrollbutton");
			
		} 
}
