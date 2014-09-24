/* Description: This Assignment shows, "How to select options after you right click". 
Problem: If you right click on an element, there would be some options available, how to select an option form the list
Web Site: http://medialize.github.io/jQuery-contextMenu/demo.html
Html Element: "Right click me"
Options from right click: Edit
What are we doing here: 
1: Using Actions class, created an Object 'RightClickObj'.
2: Finding the html element's location and storing it in Var1
3: Performing rightclick method on our object 'RightClickObj', and then the options should be visible. 
4: After options are visible, getting option's location and clicking on it. */

package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class A2_Actions_RightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1 = new FirefoxDriver();
		Obj1.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		
		System.out.print("Purpose: If you right click on an element, the options will be visible and then you can click on them.");
		Actions RightClickObj = new Actions(Obj1);
		System.out.println("1: Using Actions class, created an Object 'RightClickObj'.");
		
		WebElement Var1;
		Var1 = Obj1.findElement(By.xpath("//*[@id='container']/div/div/strong"));
		System.out.println("2: Finding the html element's location and storing it in Var1");
		
		RightClickObj.contextClick(Var1).build().perform();
		System.out.println("3: Performing rightclick method on our object 'RightClickObj', then the options will be visible.");

		Obj1.findElement(By.xpath("/html/body/ul/li[2]/span")).click();
		System.out.println("4: After options are visible, getting option location and clicking on it");		
		//Obj1.close();
	}
}
