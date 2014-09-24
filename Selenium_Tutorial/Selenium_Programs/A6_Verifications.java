/* Description: This Assignment shows, How to do "Verifying/retrieving of a Text, attribute values, enabled/disabled, font values, etc..
1: Checking getText()
2: getAttribute() methods. You can test any attribute like: id, name, class, type, src, etc..
3: Checking isEnabled(), isDisplayed() & isSelected() methods.
4: Checking getCssValue() method. here, you can test attributes which display under computer tab. Firebug > right tab > Computer tab 
5: getCSSValues.
6: Checking getTagName(), getSize() && getLocation() Methods.
*/	
package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A6_Verifications {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1  = new FirefoxDriver();
		
		//1: Checking getText()
		Obj1.get("https:edit.yahoo.com/registration?.intl=us&.lang=en-US");
		String TestingGetText =Obj1.findElement(By.cssSelector("div.column>h1")).getText();
		System.out.println("1: Retrived text using getText() method: The result is: "+TestingGetText);
		
		//2: getAttribute() methods.
		String TestingGetClass = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("class");
		System.out.println("2: Retrived text using getText() method: The result is: "+TestingGetClass);
		
		String TestingGetid = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("id");
		System.out.println("3: Retrived ID using getAttribute() method: The result is: "+TestingGetid);
		
		String TestingGetnmae = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("name");
		System.out.println("4: Retrived Name using getAttribute() method: The result is: "+TestingGetnmae);
		
		String TestingGetTitle = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("title");
		System.out.println("5: Retrived title using getAttribute() method: The result is: "+TestingGetTitle);
		
		String TestingGetType = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("type");
		System.out.println("6: Retrived type using getAttribute() method: The result is: "+TestingGetType);
		
		String TestingGetautofocus = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("autofocus");
		System.out.println("7: Retrived autofocus using getAttribute() method: The result is: "+TestingGetautofocus);
		
		String TestingGettype = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("type");
		System.out.println("8: Retrived type using getAttribute() method: The result is: "+TestingGettype);
			
		String TestingGetautocapitalize = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("autocapitalize");
		System.out.println("9: Retrived autocapitalize using getAttribute() method: The result is: "+TestingGetautocapitalize);
	
		String TestingGetautocomplete = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("autocomplete");
		System.out.println("10: Retrived autocomplete using getAttribute() method: The result is: "+TestingGetautocomplete);
	
		String TestingGetmaxlength = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("maxlength");
		System.out.println("11: Retrived maxlength using getAttribute() method: The result is: "+TestingGetmaxlength);
	
		String TestingGetariarequired = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("aria-required");
		System.out.println("12: Retrived aria-required using getAttribute() method: The result is: "+TestingGetariarequired);
	
		String TestingGetariainvalid = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("aria-invalid");
		System.out.println("13: Retrived aria-invalid using getAttribute() method: The result is: "+TestingGetariainvalid);
	
		String TestingGetariadescribedby = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("aria-describedby");
		System.out.println("14: Retrived aria-describedby using getAttribute() method: The result is: "+TestingGetariadescribedby);
	
		String TestingGetautocorrect = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("autocorrect");
		System.out.println("15: Retrived autocorrect using getAttribute() method: The result is: "+TestingGetautocorrect);
	
		String TestingGetplaceholder = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("placeholder");
		System.out.println("16: Retrived placeholder using getAttribute() method: The result is: "+TestingGetplaceholder);
	
		String TestingGetvalue = Obj1.findElement(By.cssSelector("input#first-name")).getAttribute("value");
		System.out.println("17: Retrived value using getAttribute() method: The result is: "+TestingGetvalue);
	
		//3: Checking isEnabled(), isDisplayed() & isSelected() methods.
		Boolean TextBoxEnabled = Obj1.findElement(By.cssSelector("input#first-name")).isEnabled();
		System.out.println("18: Verifying if inputbox is enabled or not using isEnabled() method: The result is: "+TextBoxEnabled);
	
		Boolean TextBoxDisplayed = Obj1.findElement(By.cssSelector("input#first-name")).isDisplayed();
		System.out.println("19: Verifying if inputbox is displayed or not using using isDisabled() method: The result is: "+TextBoxDisplayed);
	
		Boolean IsRadioButtonSelected = Obj1.findElement(By.xpath("//fieldset")).isSelected();
		System.out.println("20: Verifying if inputbox is selected or not using: The result is: "+IsRadioButtonSelected);
		
		Boolean IsInformationButtonEnabled = Obj1.findElement(By.cssSelector("span.icon.icon-i")).isEnabled();
		System.out.println("21: Verifying if informationButton enabled or not using isEnabled() method: The result is: "+IsInformationButtonEnabled);
		
		
		//4: Checking getAttributes
		Obj1.navigate().to("http:www.w3schools.com/html/default.asp");
		String getStyle = Obj1.findElement(By.xpath("//div[3]")).getAttribute("style");
		System.out.println("22: Retrived style using getAttribute() method: The result is: "+getStyle);

		String getAlt = Obj1.findElement(By.xpath("//div[3]")).getAttribute("alt");
		System.out.println("23: Retrived alt using getAttribute() method: The result is: "+getAlt);
		
		String getSrc = Obj1.findElement(By.xpath("div[3]")).getAttribute("src");
		System.out.println("24: Retrived src using getAttribute() method: The result is: "+getSrc);	
	
		//5: Checking getCssValue() method.
		String getFontFamily = Obj1.findElement(By.xpath("div[3]")).getCssValue("font-family");
		System.out.println("25: Retrived font-family using getCssValue() method: The result is: "+getFontFamily);
		
		String getFontsize = Obj1.findElement(By.xpath("div[3]")).getCssValue("font-size");
		System.out.println("26: Retrived font-size using getCssValue() method: The result is: "+getFontsize);
		
		String getFontColor = Obj1.findElement(By.xpath("div[3]")).getCssValue("color");
		System.out.println("27: Retrived color using getCssValue() method: The result is: "+getFontColor);
		
		String getFontHeight = Obj1.findElement(By.xpath("div[3]")).getCssValue("line-height");
		System.out.println("28: Retrived line-height using getCssValue() method: The result is: "+getFontHeight);
		
		String getMarginTop = Obj1.findElement(By.xpath("div[3]")).getCssValue("margin-top");
		System.out.println("29: Retrived margin-top using getCssValue() method: The result is: "+getMarginTop);
		
		//6: getCSSValues.
		Obj1.navigate().to("http:www.w3schools.com/html/default.asp");
		String getFontSize1 = Obj1.findElement(By.cssSelector("div.next > a")).getCssValue("font-size");
		System.out.println("30: Retrived font-size using getCssValue() method: The result is: "+getFontSize1);
	
		String getFontFamily1 = Obj1.findElement(By.cssSelector("div.next > a")).getCssValue("font-family");
		System.out.println("31: Retrived font-family using getCssValue() method: The result is: "+getFontFamily1);
		
		String getFontColor1 = Obj1.findElement(By.cssSelector("div.next > a")).getCssValue("color");
		System.out.println("32: Retrived color using getCssValue() method: The result is: "+getFontColor1);
	
		
		//8: Checking getTagName(), getSize() && getLocation() Methods.
		Obj1.navigate().to("http:www.w3schools.com/html/default.asp");
		String getTagName = Obj1.findElement(By.cssSelector("div.next > a")).getTagName();
		System.out.println("33: Retrived TagName using getTagName() method: The result is: "+getTagName);
		
		Dimension getSize = Obj1.findElement(By.cssSelector("div.next > a")).getSize();
		System.out.println("34: Retrived Size using getSize() method: The result is: "+getSize);
		
		Point getLocation = Obj1.findElement(By.cssSelector("div.next > a")).getLocation();
		System.out.println("35: Retrived location using getLocation() method: The result is: "+getLocation);
				
Obj1.close();
}
}
