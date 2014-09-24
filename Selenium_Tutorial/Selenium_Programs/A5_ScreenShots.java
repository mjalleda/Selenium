/* Description: This assignment shows How to take screenshot of a webpage. And store them into local desktop. Later, using Java code, we can check if screenshot stored correctly or not?
1: Take screenshot as Filetype. And store it.
2: Verify if above screenshot stored correctly.
*/
package Tutorial;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A5_ScreenShots {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1  = new FirefoxDriver();
		Obj1.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		//1: Take screenshot as Filetype. And store it.
		File src = ((TakesScreenshot)Obj1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/appledev/Desktop/Screenshot1"));
		System.out.println("1: Storing screenshot into Desktop");
		
		//2: Verify if above screenshot stored correctly.
		File f3 = new File("/Users/appledev/Desktop/Screenshot1");  
		if(f3.exists()==true) 
		{  
			System.out.println("2: ScreenShot Stored correctly");
		}
		else
		{
			System.out.println("2: ScreenShot not stored correctly.");
		}
	
Obj1.close();
}
}
