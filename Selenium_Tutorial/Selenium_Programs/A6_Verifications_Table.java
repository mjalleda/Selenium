/* Description: This Assignment shows "How to do Verification/Retrieving Values from a Table".
 * Note: It will return in the following order: 
 * Each row value will be displayed from left to right. 
 * All rows will be iterated excepting column names since, it is working on tagname "td" NOT ON "tr".
What are we doing here?
1: Get the complete table into a variable "Table". Since it is singleTable. It will be taken into WebElement variable.
2: Now, retrieve all rows into a list. Since now we have multiple rows, we need to store them in a List. Not in WebElement.
3: Above, you have a list, so you need to iterate on the list And get a single row and store them into singleRow variable. Now, singleRow considered as a single variable. 
4: Above SingleRow variable containing a value for each row. Now, from each row, we need to return all Cells. 
5: Now, you have each cell, now you need to retrieve its value by using getText().
*/
package Tutorial;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A6_Verifications_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","/Users/appledev/Downloads/Never_Remove/Firefox/Firefox");
		WebDriver Obj1  = new FirefoxDriver();
		Obj1.get("http://www.w3schools.com/html/html_tables.asp");
		
		//1: Get the complete table into a variable "Table". Since it is singleTable. It will be taken into WebElement variable.
		WebElement Table = Obj1.findElement(By.className("reference"));
		
		//2: Now, retrieve all rows into a list. Since now we have multiple rows, we need to store them in a List. Not in WebElement.
		List<WebElement> AllRows = Table.findElements(By.tagName("tr"));
		System.out.println("The Number of rows are: " + AllRows.size());
		
		//3: Above, you have list, so you need to iterate all the rows And get a single row and store them into singleRow variable. Now, singleRow considered as a single variable. 
		for(int i=0; i<AllRows.size(); i++) 
		{ 	
		WebElement SingleRow = AllRows.get(i);
		
		//4: Above SingleRow variable containing a value for each row. Now, from each row, we need to return allCells. 
		List<WebElement> EachCell = SingleRow.findElements(By.tagName("td"));
			for(int j=0;j<EachCell.size();j++)
			{
				//5: Now, you have each cell, now you need to retrieve its value by using getText().
				String Value = EachCell.get(j).getText(); 
				System.out.println("The row is: " + i + ". The cell is that row is: " + j + ". The value of that cell is: " +Value);
			}
		}		
Obj1.close();		
}
}
