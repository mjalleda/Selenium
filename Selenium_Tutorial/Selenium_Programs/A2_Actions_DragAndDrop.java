/* Description: This Assignment shows, "hot to drag and drop" 
Idea: Basically, here we will have two locations. One is the html elemnt where it is oringinally located. And the location where we want to move/drop to?
Usually this sort of htmlelemnts store in Frames, so we are using frames here.
How: Go inside a frome, get locations of Source and target of html element which we want to drag and drop, then do the action
Web Site: http://jqueryui.com/droppable
Html Element: "Frame, Drag and Drop"

What are we doing here: 
1: Switching to frame using our webDriver Obj1. Basically, it opens up the frame. Here, we find the frame with its Xpath location
2: Using Actions class, creating a object 'DragAndDropObj'
3: Using source and destionation's XpathLocations, storing their locations into webelements "Src" & "Dest"
4: We have, Source and target. And also frame is opened up, Now we need to drag from the source and dropp into destination
*/
package Tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class A2_Actions_DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1 = new FirefoxDriver();
		Obj1.get("http://jqueryui.com/droppable");
		
		System.out.println("Purpose: Go inside frome, get locations of Source and target, then drag and drop");
		Obj1.switchTo().frame(Obj1.findElement(By.xpath("//iframe")));
		System.out.println("1: Using our webDriver Obj1, switch to frame. Basically, it opens up the frame. We are finding the frame with its Xpath location.");
		
		Actions DragAndDropObj = new Actions(Obj1);
		System.out.println("2: From Actions class, creating object 'DragAndDropObj' ");
		
		WebElement Src = Obj1.findElement(By.xpath("//*[@id='draggable']"));
		WebElement Dest = Obj1.findElement(By.xpath("//*[@id='droppable']"));
		System.out.println("3: Using source and destionation's XpathLocations, storing their locations into webelements Src & Dest");
		
		DragAndDropObj.dragAndDrop(Src, Dest).build().perform();
		System.out.println("4: We have, Source and target and frame is opened, Now we are dragging the source and dropping into destination.");
		
Obj1.close();
}
}
