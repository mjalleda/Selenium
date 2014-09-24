/* Description: This assignment shows "Using Try/Catch block/code in Selenium". Usually, in Selenium Automation, if any error occurs, then we try to catch them in Catch Block there we can take screenshots :)
 * In this example, we are purposely returning an error from a web page and we are taking screenshot in CATCH block.
 * Try/catch block: In try block, we write the code & if any errors/exceptions are returned, then we take screenshots of that error in catch block.
 */
package Tutorial;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;public class A5_Screenshots_TryCatchBlock {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1  = new FirefoxDriver();
		
		try {
		Obj1.get("https://wwwww.google2.com/"); // This page will return SERVER NOT FOUND error. 
		Obj1.findElement(By.id("gbqfbb")).click(); // This button will not find and it will go to catch block.
		
		//1: Take screenshot as Filetype. And store it.
		}
		catch(Exception e)
		{
		File src = ((TakesScreenshot)Obj1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/appledev/Desktop/Screenshot2.png"));
		System.out.println("1: Storing screenshot into Desktop");
		
		//2: Verify if above screenshot stored correctly.
		File f3 = new File("/Users/appledev/Desktop/Screenshot2.png");  
		if(f3.exists()==true) 
		{  
			System.out.println("2: ScreenShot Stored correctly");
		}
		else
		{
			System.out.println("2: ScreenShot not stored correctly.");
		}
		}
	
Obj1.close();
}

}
