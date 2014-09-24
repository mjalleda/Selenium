/* Description: This assignment "Shows how to execute POI Excel related classes and thier methods". 
Important points:
1: First we need to store our excel file into a file variable.
2: Later, need to define workbook, sheet, rows & cells (here column is called cell).
3: Here, we learn some inbuilt/POI methods. 
4: For ex: getSheetAt() - which returns Sheet by using index number. In Excel/POI subject, sheet number starts from 0.
		   getSheetName() - returns sheetName using Sheet Object.
		   getPhysicalNumberOfRows() - returns number of rows which has data. 
		   So ...on.
 */
package Tutorial;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFSheet;
public class A9_Excel_InBuilt_Libraries {
	public static void main(String[] args) throws IOException {
		FileInputStream ExcelFile = new FileInputStream("/Users/appledev/Documents/workspace/Downloads_Documents/Selenium/AutomationProject_Files/ExcelForTesting.xls");
		System.out.println("1: hashcode of excel file is:  "+ ExcelFile);
		
		HSSFWorkbook Workbook = new HSSFWorkbook(ExcelFile); //Defining a workbook
		Workbook.createSheet(); //It will create a new sheet
		System.out.println("2: Number of sheets in excel file is "+ Workbook.getNumberOfSheets());
		System.out.println("2: Number of sheets in excel file is "+ Workbook.getNumberOfSheets());
		
		HSSFSheet Sheet1 = Workbook.getSheetAt(0); //Defining sheets
		HSSFSheet Sheet2 = Workbook.getSheetAt(1);
		HSSFSheet Sheet3 = Workbook.getSheetAt(2);
		HSSFSheet Sheet4 = Workbook.getSheetAt(3);
		Workbook.setSheetName(3, "Sheet created by Workbook method"); //Setting a name to a sheet
		System.out.println("3.1: 0th sheet name is: "+ Sheet1.getSheetName()); //Returning sheet names
		System.out.println("3.2: 1st sheet name is: "+ Sheet2.getSheetName());
		System.out.println("3.3: 2nd sheet name is: "+ Sheet3.getSheetName());
		System.out.println("3.3: 3rd sheet name is: "+ Sheet4.getSheetName());
		
		int PhysicalNumberOfRows = Sheet1.getPhysicalNumberOfRows(); //Number of rows which has data.
		System.out.println("4: Sheet 0: Numer of rows which has data are:  "+ PhysicalNumberOfRows);
		
		int LastRowNum = Sheet1.getLastRowNum(); //A Row Number where data ends.
		System.out.println("5: The last row number is: (row starts from 0):  "+ LastRowNum);
		
		int getFirstRowNum = Sheet1.getFirstRowNum(); //A row number where data starts.
		System.out.println("6: The First Number is: "+ getFirstRowNum);	
	
		Sheet1.createRow(7); //Creating a new Row
		int newRow = Sheet1.getLastRowNum();
		System.out.println("8: Created a new row, now get last row number is: "+ newRow);
	
		HSSFComment getCellComment1 = Sheet1.getCellComment(7, 0); //Returning cell comment
		getCellComment1.getString();
		System.out.println("9: The Cell comment of 5th Row and 0th columns is: "+ getCellComment1.getString());
		
		//CELL_TYPE Methods can be used to verify/compare if cell value of datatype. Is it string Or Numaric Or boolean OR blank OR error...etc.
		int var1 = Cell.CELL_TYPE_NUMERIC;
		int var2 = Cell.CELL_TYPE_STRING;
		int var3 = Cell.CELL_TYPE_FORMULA;
		int var4 = Cell.CELL_TYPE_BLANK;
		System.out.println("10.1:CELL_TYPE_NUMERIC value is: " + var1);
		System.out.println("10.2:CELL_TYPE_STRING value is: " + var2);
		System.out.println("10.3:CELL_TYPE_FORMULA value is: " + var3);
		System.out.println("10.4:CELL_TYPE_BLANK value is: " + var4);
		
		String SheetName = " Rajta ";
		System.out.println("11: A Sheet Name is: "+ SheetName);
		String UpperCase = SheetName.toUpperCase();
		System.out.println("12: Convert Above SheetName to uppercase. Now it becomes: "+ UpperCase);
		String LowerCase = SheetName.toLowerCase();
		System.out.println("13: Convert Above SheetName to Lowercase. Now it becomes: "+ LowerCase);
		String TrimmedSheetName = SheetName.trim();
		System.out.println("14: Trim Above SheetName. Now it removes leading and trailing spaces. Now, it becomes: "+ TrimmedSheetName);
		
	
		int index = Workbook.getSheetIndex("MyOwn_Libraries"); //It returns sheet number. 
		int index1 = Workbook.getSheetIndex("InBuilt_Libraries"); // This sheet exists, so it returns its sheet number.
		int index2 = Workbook.getSheetIndex("Test Steps");
		int index3 = Workbook.getSheetIndex("Test Data");
		int index4 = Workbook.getSheetIndex(SheetName); //This sheet doesn't exist, so it returns -1.
		int index5 = Workbook.getSheetIndex(UpperCase);
		System.out.println("15: index is: "+index);
		System.out.println("16: index1 is: "+index1);
		System.out.println("17: index2 is: "+index2);
		System.out.println("18: index3 is: "+index3);
		System.out.println("19: index4 is: "+index4);
		System.out.println("20: index5 is: "+index5);
		Workbook.close();
		
	}
}
