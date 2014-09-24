/* Description: This Assignment shows "Some actions/methods that we perform with SeleniumGrid Tool"
 * Those are: How to create RemoteWebDrivers & How to use DesiredCapabilities class methods
 * RemoteWebDriver() class; This class is used to create Remote WebDriver, this is used to run automation on Remote machines.
 * DesiredCapabilities: We can set/adjust characteristics on remote browsers. 
 * */
package Tutorial;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class B2_SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		//1: How to create regular Driver, which is used to run selenium commands only on this machine.
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Driver1 = new FirefoxDriver(); 
		Driver1.get("http://www.google.com");
		Driver1.quit();
		System.out.println("1: This will execute on this/HUB machine > on firefox browser");
				
		//2: How to create RemoteWebDriver, which is used to run selenium commands on remote machines or nodes.
		DesiredCapabilities Capability1 =  DesiredCapabilities.firefox(); //Capability1 Object will inherit properties from both. DesiredCapabilities & firefox().
		//Capability.setPlatform(Platform.MAC); //In case if you want to set, then remove comments.
		//Capability.setJavascriptEnabled(true);//In case if you want to set, then remove comments.
		//WebDriver Driver = new RemoteWebDriver(new URL("http://localhost:5070/wd/hub"), Capability); //This also works
		System.setProperty("RemoteWebDriver.firefox.bin","/Volumes/Firefox/Firefox");
		String nodeUrl = "http://192.168.1.234:5070/wd/hub"; //Which is nodeURL. So we are telling which node to connect to.
		WebDriver Driver2 = new RemoteWebDriver(new URL(nodeUrl), Capability1); 
		Driver2.get("http://www.google.com");
		Driver2.quit();
		System.out.println("2: This will execute on Node machine > on firefox browser");
		
		//3: How to create RemoteWebDriver, which is used to run selenium commands on remotemachines or nodes.
		DesiredCapabilities Capability2 =  DesiredCapabilities.chrome();
		System.setProperty("RemoteWebDriver.chrome.driver", "/Users/appledev/Downloads/ChromeDriver");		
		WebDriver Driver3 = new RemoteWebDriver(new URL("http://<node IP address>/wd/hub"), Capability2); 
		Driver3.get("http://www.google.com");	
		Driver3.quit();
		System.out.println("3: This will execute on Node machine > on chrome browser");
	}
}
