/* Description: This Assignment shows, "how to move a mouse on to an object". 
Problem: Options are invisible mode in dropdown box, but if you move mouse then options should be visible. 
Web Site: http://www.naukri.com */

package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class A2_Actions_MourseMove_2ndExample {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1 = new FirefoxDriver();
		
				Obj1.get("http://www.southwest.com");
				System.out.println("Purpose: Options are invisible mode in dropdowb box, but if you move the mouse then options can be visible ");
				Actions MouseMoveObj1  = new Actions(Obj1);
				System.out.println("1: Created an Object 'MouseMoveObj' from Actions Class");
				WebElement Var2;
				Var2 = Obj1.findElement(By.xpath("html/body/div[2]/div[2]/div/ul/li[2]/ul/li[3]/a"));
				System.out.println("2: Finding dropdown element's location and storing it in Var2");
				MouseMoveObj1.moveToElement(Var2).build().perform();
				Thread.sleep(10000);
				System.out.println("3: Moving mouse controller on to our object 'MouseMoveOBJ', then the select box options will be visible. ");
				Obj1.findElement(By.id("car-view-reservation")).click();
				System.out.println("4: After options are visible, getting option location and clicking on it. ");
				Obj1.close();	
	}

}
