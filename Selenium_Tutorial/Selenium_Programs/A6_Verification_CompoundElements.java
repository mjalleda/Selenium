/*Description: This assingnment shows "How to handle Compound Elements". i.e., Handling/Verifying/retrieving the same group of html elements. For ex: Returning all htmlLinks from a page.
How it works: First retrieve all same htmlelements in a list. You can retrieve them by xpath, OR by.TagName() OR cssselector, id or class or name...any..is fine.
	- Later, iterate the list and print them. I just did for some and we can do for many others like, buttons, div, scripts, etc..
1: Retrieving/Verifying All html links from a web page. 
2: Retrieving/Verifying All images from a web page. 
3: Retrieving/Verifying All frames from a web page. 
4: Retrieving/Verifying All inputs from a web page. 
5: Retrieving/Verifying All tables from a web page. 
 */
package Tutorial;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A6_Verification_CompoundElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1  = new FirefoxDriver();
		Obj1.get("http://www.w3schools.com/html/html_tables.asp");
		
		//1: Retrieving/Verifying All html links from a webpage. 
		List<WebElement> AllLinks = Obj1.findElements(By.xpath("//a"));
		System.out.println(" \n *************************************************");
		System.out.println("1: The Number of Links  are: "+ AllLinks.size() + ". Thier Texts are below");
		for(int i=0;i<AllLinks.size();i++)
		{
			System.out.println(""+AllLinks.get(i).getText());
		}
		
		//2: Retrieving/Verifying All images from a webpage. 
		List<WebElement> AllImages = Obj1.findElements(By.xpath("//img"));
		System.out.println(" \n *************************************************");
		System.out.println("2: The Number of Images  are: "+ AllImages.size() + ". Thier src values are below");
		for(int j=0;j<AllImages.size();j++)
		{
			System.out.println(""+AllImages.get(j).getAttribute("src"));
		}
		
		//3: Retrieving/Verifying All frames from a web page. 
		Obj1.navigate().to("http://www.w3schools.com/html/default.asp");
		List<WebElement> AllFrames = Obj1.findElements(By.xpath("//iframe"));
		System.out.println(" \n *************************************************");
		System.out.println("3: The Number of Frames  are: "+ AllFrames.size() + ". Thier src values are below");
		for(int k=0;k<AllFrames.size();k++)
		{
			System.out.println(""+AllFrames.get(k).getAttribute("src"));
		}
		
		//4: Retrieving/Verifying All inputs from a web page. 
		Obj1.navigate().to("http://www.w3schools.com/html/html_forms.asp");
		List<WebElement> AllInputs = Obj1.findElements(By.xpath("//input"));
		System.out.println(" \n *************************************************");
		System.out.println("4: The Number of Inputs  are: "+ AllInputs.size() + ". Thier names are below");
		for(int l=0;l<AllInputs.size();l++)
		{
			System.out.println(""+AllInputs.get(l).getAttribute("name"));
		}	
		
		//5: Retrieving/Verifying All tables from a web page. 
		Obj1.navigate().to("http://www.w3schools.com/html/html_tables.asp");
		List<WebElement> AllTables = Obj1.findElements(By.xpath("//table"));
		System.out.println(" \n *************************************************");
		System.out.println("5: The Number of tables are: "+ AllTables.size() + ". Thier class attribute values are below");
		for(int m=0;m<AllTables.size();m++)
		{
			System.out.println(""+AllTables.get(m).getAttribute("class"));
		}	
		
Obj1.close();
}
}
