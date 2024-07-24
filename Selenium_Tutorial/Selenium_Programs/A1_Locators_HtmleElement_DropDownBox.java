/* Description: The assignment made for "Testing combo/dropdown/select box. There are three ways to select options from a dropdown.
 * 1: Directly select the option by using sendkeys()
 * 2: Get Xpath value for option and then use click() on the option 
 * 3: With the help of selectByIndex() method.
 */
package Tutorial;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1_Locators_HtmleElement_DropDownBox {
	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.bin","/Volumes/Firefox/Firefox"); // Since in MAC OS, firefox is NOT a default browser, the default browser is Safari, hence eclipse doesn't open friefox browser by default. Hence we are adding libraries to open firefox in autmation by itself.
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1 = new FirefoxDriver();		
		Obj1.get("http://secure.in.com/sso/commonregister.php?ref=IN");
		
		//1: Directly select the option by using sendkeys()
		Obj1.findElement(By.id("day")).sendKeys("30");		
		System.out.println("1: Tested sendKeys method for selecting options");
		
		// 2: Get Xpath value for option and then use click() on the option 
		Obj1.findElement(By.xpath("//select[@id='month']//option[5]")).click();
		System.out.println("2: Selected options directly from dropdown using Xpath value.");
		
		//3: With the help of selectByIndex() method.
		WebElement Var1 = Obj1.findElement(By.id("year"));
		Select Var2 = new Select(Var1);
		Var2.selectByVisibleText("2013");
		// Select options by index, value, and visible text
        	Var2.selectByIndex(1);
       	 	Var2.selectByValue("value1");
        	Var2.selectByVisibleText("Option 1");
		System.out.println("3: Used SelectByVisibleText method and selected options from dropdown box");
		System.out.println("******* The value of Var1 is: "+Var1 + " ***********");
		System.out.println("The value of Var2 is: "+Var2 + " ***********");
		Obj1.close();
		
}
}
