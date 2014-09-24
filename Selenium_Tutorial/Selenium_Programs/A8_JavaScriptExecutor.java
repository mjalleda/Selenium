/* Description: This class shows how to execute JavaScriptMethods in Selenium.
 * Limitations: This will be applicable only when developer use javascript code. 
 * Objective: Sometimes, selenium can't interact/work with HTML elements because of many reasons. In that case, we can ask developers to provide JavaScript Methods which are used in their code.
 * And later, we can directly call those JS method names OR the method code. 
 
 * Two types we can call them: 
 * 1: Call the method name and pass parameters if there are any
 * 2: OR Call the code directly and pass parameters if there are any.
 * For ex: In below case, I'm calling javascript methods like domain.name, alert(date). 
 * */
package Tutorial;
import org.json.JSONException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class A8_JavaScriptExecutor {
public static void main(String[] args) throws JSONException, InterruptedException {
	System.out.println("*********************************************************************************************************");
	System.out.println("                                      CLASSNAME: Class_L_JavaScriptExecutor   ");
	System.out.println("*********************************************************************************************************");
	
	System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
	WebDriver driver=new FirefoxDriver();
    driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
    driver.manage().window().maximize();
    System.out.println("1: The document domain OR URL is: "+ driver.getCurrentUrl());
    
    JavascriptExecutor js=(JavascriptExecutor) driver;
    String domain_name=(String) js.executeScript("return document.domain");
    System.out.println("2: The domain name returned by JavaScript Method document.domain is: "+ domain_name);
    
    Object domain_name1 = js.executeScript("return document.domain");
    System.out.println("3: Stored Domain Name in Object datatype: The value is: "+ domain_name1.toString());

    //display current date on Alert box
    driver.navigate().to("http:www.google.com");
    js.executeScript("alert(Date());");
    System.out.println("4: The current date is displayed in Alert/Popup in google homepage");
    Thread.sleep(4000);
	driver.quit();

}
}