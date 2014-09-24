/* Description: This Assignment shows, "how to move a mouse on to an object". 
Problem: Options are invisible mode in dropdown box, but if you move mouse on element then options will be visible. 
Using Web site: http://www.naukri.com
Select/drop down Box: "Search for Job"
Selecting option from select box are: Jobs for Category
What are we doing here: 
1: Using Actions class, created an Object 'MouseMoveObj'.
2: Finding dropdown element's location and storing it in Var1
3: Moving mouse controller on to our object 'MouseMoveOBJ', and then the dopdown box options should be visible. 
4: After options are visible, getting option location and clicking on it. */

package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class A2_Actions_MouseMove {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1 = new FirefoxDriver();
		Obj1.get("http://www.naukri.com");
		
		System.out.println("Problem: Options are invisible mode in dropdowb box, but if you move the mouse then options can be visible ");
		Actions MouseMoveObj  = new Actions(Obj1);
		System.out.println("1: Created an Object 'MouseMoveObj' from Actions Class");
		WebElement Var1;
		Var1 = Obj1.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/ul/li[2]/a"));
		System.out.println("2: Finding dropdown element's location and storing it in Var1");
		MouseMoveObj.moveToElement(Var1).build().perform();
		System.out.println("3: Moving mouse controller on to our object 'MouseMoveOBJ', then the select box options will be visible. ");
		Obj1.findElement(By.xpath("html/body/div[2]/div[2]/ul/li[4]/a")).click();
		System.out.println("4: After options are visible, getting option location and clicking on it. ");
		Obj1.close();
}
}
