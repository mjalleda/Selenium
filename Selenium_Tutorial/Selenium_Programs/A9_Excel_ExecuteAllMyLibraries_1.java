/* Description: In this assignment, we execute all methods which are created in "Class_L_Excel_MyOwn_Libraries"
 * 1: Calling all Excel libraries/methods from  class "Class_L_Excel_MyOwn_Libraries" and executing them.
 */
package Tutorial;
import java.io.IOException;
public class A9_Excel_ExecuteAllMyLibraries_1 {
	public String xls = "";
	public int SheetNumber= 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Created an Object using "Class_L_Excel_MyOwn_Libraries" class constructor which has multiple arugments. I will use this object in methods signature in this class only. 
		A9_Excel_MyOwn_Libraries OBJ = new A9_Excel_MyOwn_Libraries("/Users/appledev/Documents/workspace/Downloads_Documents/Selenium/AutomationProject_Files/ExcelForTesting.xls",3);
			
		//Calling all created Methods from class "Class_L_Excel_MyOwn_Libraries".
		OBJ.printAllSheetCells(3);
		System.out.println(OBJ.IsSheetExist()); 
		System.out.println(OBJ.getRowCount());
		System.out.println(OBJ.getColumnCount());
		System.out.println(OBJ.getCellValue(2, 2));
		System.out.println(OBJ.getCellValue(3, "Description"));
	}
	
	
	/* In below method, I want to execute getColumnCount from file "Class_L_Excel_MyOwn_Libraries".
	 * For this I'm passing two parameters.
	*/
	public void m1(A9_Excel_MyOwn_Libraries OBJ, String SomeDummyVariable)
	{
		System.out.println("Method from class Class_L_Excel_MyOwn_Libraries");
		OBJ.getColumnCount();
	} 
	

}
