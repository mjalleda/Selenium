/* Description: This Assignment shows, "how to double click on a html element". 
How: First store the html element location into one object and then click on the object. 
Testing Web site: http://www.naukri.com
Html Element is: ChipDsg/Semicond.Calsoft Labs.

What are we doing here: 
1: Using Actions class, created an Object 'DoubleClickObj'.
2: Finding htmlelement's location and storing it in Var1
3: Performing doubleClick method on our object 'DoubleClickObj', and then clicking on it. 
 */
package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class A2_Actions_DoubleClick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1 = new FirefoxDriver();
		Obj1.get("http://www.naukri.com/");
		
		System.out.println("Purpose: First store the htmlelement's location into one object and then click on it.");
		Actions DoubleClickObj = new Actions(Obj1);
		System.out.println("1: Using Actions class, created Object 'DoubleClickObj'.");
		
		WebElement Var1;
		Var1 = Obj1.findElement(By.xpath("html/body/div[7]/div[2]/div[2]/div[1]/a[1]"));
		System.out.println("2: Finding the html element's location and storing it in Var1");
		
		DoubleClickObj.doubleClick(Var1).build().perform();
		System.out.println("3: Performing doubleClick method on our object 'DoubleClickObj', then clicking on it.");
		Obj1.close();
	}

}
