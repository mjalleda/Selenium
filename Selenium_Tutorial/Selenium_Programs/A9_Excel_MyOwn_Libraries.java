/* Description: This File contains some METHODS which helps while working with Excel Application.
 * Methods are:
 * 1: PrintAllCellValues for given Sheet
 * 2: Confirm if a sheet exist?
 * 3: Return TotalRowCount for given sheetname
 * 4: Return TotalColumnCount for given sheetname
 * 5: Return a cellvalue when ROW number & Column number are given
 * 6: Return a cellvalue when a ROW number & Column Name are given
 * */
package Tutorial;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
public class A9_Excel_MyOwn_Libraries {
	
	// ****************************************************************   1: DEFINING VARIABLES **************************************************************** //
	//Defining Variables.
	public  String filepath=null;
	public  FileInputStream file = null;
	public  HSSFWorkbook Workbook = null;
	public  HSSFSheet Sheet = null;
	public  String SheetName = null;
	public HSSFRow row   =null;
	public HSSFCell cell = null;
	public int SheetNumber=0;
	public int PhysicalNumberOfRowsInaSheet;
	
	// **************************************************************** 2: CONSTRUCTOR **************************************************************** //
	//CONSTRUCTOR: Creating a Constructor. Using two parameters. If any other class want to use this class methods, they can call this constructor. While calling the constructor they have to pass the parameters.
	public A9_Excel_MyOwn_Libraries(String filepath, int SheetNumber) {
		
		this.filepath=filepath;
		this.SheetNumber=SheetNumber;
		try {
			file = new FileInputStream(filepath);
			Workbook = new HSSFWorkbook(file);
			Sheet = Workbook.getSheetAt(SheetNumber);
			SheetName = Workbook.getSheetName(SheetNumber);
			PhysicalNumberOfRowsInaSheet = Sheet.getPhysicalNumberOfRows();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	// **************************************************************** 3: MAIN METHOD **************************************************************** //
	public static void main(String[] arg) throws IOException {
		//Created a Object using this class constructor.
		A9_Excel_MyOwn_Libraries OBJ = new A9_Excel_MyOwn_Libraries("/Users/appledev/Documents/workspace/Downloads_Documents/Selenium/AutomationProject_Files/ExcelForTesting.xls",0);
		System.out.println("1: Number of sheets in excel file is "+ OBJ.Workbook.getNumberOfSheets()); 
		System.out.println("2: The sheet name is: "+ OBJ.Sheet.getSheetName()); 
		System.out.println("3: Sheet 3: Numer of rows which has data are:  "+ OBJ.PhysicalNumberOfRowsInaSheet);	
		
		//Calling all created Methods.
		OBJ.printAllSheetCells(3);
		OBJ.IsSheetExist(); 
		OBJ.getRowCount();
		OBJ.getColumnCount();
		OBJ.getCellValue(3, 2);
		OBJ.getCellValue(3, "Description");
		
	}
	
	// ****************************************************************  4: METHODS **************************************************************** //
	/* Method 1: Verifies if given Sheet Exists or NOT?. 
	 Provide: PhysicalNumberOfRowsInaSheet 
	 Returns: Prints all cell values by Row & Column order.
	 Steps: 1: This FOR loop wroks on ROWs.& second for loop works on Columns. 
	 		2: Retrieving EachRow value.
	   		3: Condition: Checking if ROW is NOT equal to NULL.
	   		4:: Retrieving totalcolumns in each row. 
			5: We are going in order "Get a row & print all its column values. When we reach last column, go for second row with help of outer for loop". So, outer for loop refers to ROW & Innerfor loop refers to column.
	        6: here onwards, we are checking what a cell valueTupe. If it blankType OR StringType OR numaricType. // 6: If it is blankType, then print value "blank/null"
			7: If it is blankType, then print value "blank/null"
			8 :If it is stringtype, then print cellvalue.
			9:If it is numaricType, then print value cellvalue.*/
//	public void printAllSheetCells(HSSFWorkbook Workbook,HSSFSheet Sheet1,int PhysicalNumberOfRowsInaSheet) throws IOException
	public void printAllSheetCells(int PhysicalNumberOfRowsInaSheet) throws IOException
		{
		System.out.println("************************* EXECUTING printAllSheetCells() METHOD ******************************************************");	
		try {
		for(int i=0; i<PhysicalNumberOfRowsInaSheet; i++) //1: This FOR loop wroks on ROWs.& second for loop works on Columns. 
		{
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ CELL VALUES FOR ROW NUMBER: "+i+  "  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");	
			Row EachRow = Sheet.getRow(i); //2: Retrieving EachRow value.
			if((EachRow==null)) //3: Condition: Checking if ROW is NOT equal to NULL.
			{
				System.out.println("The " + i+ "th Row has Skipped because Row has value:"+ EachRow);
			}
			else
			{
			System.out.println("4." + i+": The " +i+ "th Row HashCode is: "+ EachRow);
			int TotalColumnsInEachRow = EachRow.getPhysicalNumberOfCells(); //4: Retrieving totalcolumns in each row. 
			System.out.println("5."+i+": Total Numer of cells in " + i + "th rows is: "+ TotalColumnsInEachRow);	
			for(int j=0; j<TotalColumnsInEachRow; j++) //5: We are going in order "Get a row & print all its column values. When we reach last column, go for second row with help of outer for loop". So, outer for loop refers to ROW & Inner for loop refers to column.
				
			{
				Cell CellHashCodeValue = EachRow.getCell(j);
				// 6: here onwards, we are checking cell valueType. If it is blankType/StringType/numaricType? 
				if(CellHashCodeValue.getCellType()==Cell.CELL_TYPE_BLANK) // 7: If it is blankType, then print value "blank/null"
				//if(CellHashCodeValue.getCellType()==3) //This line also works.
				{
					String emptytype = "blank/null";
		            System.out.println("6."+j+": The row number is " + i + ". The Cell value is "+ emptytype);
				}
				
				if(Cell.CELL_TYPE_STRING==CellHashCodeValue.getCellType() ) //8:If it is string type, then print cell value.
				{
					String CellValue = CellHashCodeValue.getStringCellValue();
					System.out.println("6."+j+": The row number is " + i + ". The Cell value is "+ CellValue);
				}
				if(Cell.CELL_TYPE_NUMERIC==CellHashCodeValue.getCellType()) //9:If it is numaricType, then print value cell value.
				{
					double CellValue = CellHashCodeValue.getNumericCellValue();
					System.out.println("6."+j+": The row number is " + i + ". The Cell value is "+ CellValue);
				}
				
			}	
		}
		}
		}
		catch(Exception e){ 
			System.out.println("Exception found");
			e.printStackTrace();
		}
		}
	

	/* Method 2: Verifies if given Sheet Exists or NOT?. 
	 Provide: None. 
	 Returns: True or false. Returns boolean.
	 Steps: 1:Verifying if sheet exists by checking its index number? Sheet number starts from 0. SheetNumber given to index. So, Index starts from 0. If sheet doesn't find means, getSheetIndex returns -1. In this IF condition we are checking If index is not equal to -1, then we return TRUE.
	        2: Here, we are changing sheetname letters to Upper case letters and checking for index number.*/	
	public boolean IsSheetExist() throws IOException
	{
		System.out.println("************************* EXECUTING IsSheetExist() METHOD ******************************************************");	
		int index = Workbook.getSheetIndex(SheetName);
		if(!(index==-1)) //1:Verifying if sheet exists by checking its index number? Sheet number starts from 0. SheetNumber given to index. So, Index starts from 0. If sheet doesn't find means, getSheetIndex returns -1. In this IF condition we are checking If index is not equal to -1, then we return TRUE.
		{
			System.out.println("Sheet Exist, because it's index value is not equal to -1");
			return true;
		}
		else
		{
			index=Workbook.getSheetIndex(SheetName.toUpperCase());
			if(!(index==-1))//2: Here, we are changing sheetname letters to Upper case letters and checking for index number.
			{
				System.out.println("Sheet Doesn't exist. Even after converting sheet to uppercase, it didn't find. It's index value is: "+index);
				return true;
			}
			else
			{
				System.out.println("Sheet exists after converting it into uppercase. It's index value is: "+index);
				return false;
			}	
		}
	}

	/* Method 3: Return RowCount. 
	   Provide: None
	   Returns: In a sheet, how many number of rows has physical data.
	   Steps: 1:Verifying if sheet exists by checking its index number? Sheet number starts from 0. SheetNumber given to index. So, Index starts from 0.
              2: Incrementing with 1. Because in POI subject, Row number starts from 0. And user view, row number starts from 1. Since the row number passed by user, we need to add +1. And getLastRowNum() returns the last Rownumber of physical data in a sheet. */
	public int getRowCount()
	{
		System.out.println("************************* EXECUTING getRowCount() METHOD ******************************************************");	
		int index = Workbook.getSheetIndex(SheetName); //Defining sheets
		System.out.println("index is: "+index);
		if(index==-1)//STEPS-1: Verifying if sheet exists by checking its index number? Sheet number starts from 0. SheetNumber given to index. So, Index starts from 0.
		{
			System.out.println("Index value is -1. Means, passed sheetname not found. So returning value 0.");
			return 0;
		}
		else
		{
			HSSFSheet SheetObject = Workbook.getSheetAt(index);
			int TotalRows = SheetObject.getLastRowNum()+1;//STEPS-2: Incrementing with 1. Because in POI subject, Row number starts from 0. And user view, row number starts from 1. Since the row number passed by user, we need to add +1. And getLastRowNum() returns the last Rownumber of physical data in a sheet.
			System.out.println("TotalRows in Passed Sheet Are: "+TotalRows);
			return TotalRows;
		}
	}

	/* Method 4: Return ColumnCount for a Sheetname. 
	   Provide: Workbook, Sheetname.
	   Returns: Returns TotalcolumnCount 
	   Steps: 1: Verifying if sheet exists by checking its index number? 
	   		  2: Using first row (because it contians column names). Creating a Row (for first row '0') and retrieving LastCellNumber on this row.
	 */
		public int getColumnCount()
		{
			System.out.println("************************* EXECUTING getColumnCount() METHOD ******************************************************");	
			int TotalColumnCount = -1;
			int index = Workbook.getSheetIndex(SheetName);
			System.out.println("1: The index number for given sheet name is: "+index);	
			if(index==-1) //STEPS-1: Verifying if sheet exists by checking its index number? Sheet number starts from. SheetNumber given to index. So, Index starts from 0.
			{
				System.out.println("2: Index value is -1. Means, passed sheetname not found. So returning empty cellvalue");
				return TotalColumnCount;
			}
			else
			{	
				HSSFSheet SheetObject = Workbook.getSheetAt(index);
				Row RowStartsAt = SheetObject.getRow(0); //STEPS-2: Using first row (because it contians column names). Creating a Row (for first row '0') and retrieving LastCellNumber on this row
				TotalColumnCount = RowStartsAt.getLastCellNum();
				System.out.println("2: Total column count is: "+TotalColumnCount);
				return TotalColumnCount;
			}
		}
		
	/* Method 5: Return a cell value when columnNumber & RowNumber are passed. 
	   Provide: Workbook, Sheetname, row number and column number.
	   Returns: Returns cell value for given rownumber & column number.
	   Steps: 1: Verifying if sheet exists by checking its index number?
	 		  2: Rownumber Starts from 0. That's why we are decrementing with 1. Because a tester who use this method, might not know the RowNumber starts from 0. 
	 		  3: Verifying if Row is NOT equal to NULL. If it is Null it returns NULLVALUE.
			  4: Verifying if columnvalue is NOT equal to NULL. If it is Null it returns NULLVALUE.
			  5: Now, it started verifying what is cellvalue TYPE? Is it Blank? OR StringType OR NumaricType?
			  6: Verifying if cell Type is equal to Blank Type? If it is, it returns NULLVALUE.
			  7: Verifying if cell Type is equal to String Type? If so, it returns StringType of cellvalue.
			  8: Verifying if cell Type is equal to Numaric Type? if so, it returns numerictype of cellvalue. */
	public String getCellValue(int RowNumber, int ColumnNumber)
	{
		System.out.println("************************* EXECUTING getCellValue() METHOD by COLUMN Number & ROW Number ******************************************************");	
		String Nullvalue = "";
		
		int index = Workbook.getSheetIndex(SheetName);
		System.out.println("1: The index number for given sheet name is: "+index);
		if(index==-1) //STEPS-1: Verifying if sheet exists by checking its index number? Sheet number starts from. SheetNumber given to index. So, Index starts from 0.
		{
			System.out.println("2: Index value is -1. Means, passed sheetname not found. So returning value 0.");
			return Nullvalue;
		}
		else
		{
			HSSFSheet SheetObject = Workbook.getSheetAt(index);
			Row RowObj = SheetObject.getRow(RowNumber-1); //2: Rownumber Starts from 0. That's why we are decrementing with 1. Because a tester who use this method, might not know the RowNumber starts from 0. 
			if(RowObj == null) //3: Verifying if Row is NOT equal to NULL. If it is Null it returns NULLVALUE.
			{
				System.out.println("2: Given Row has NULL value, hence returning empty value.");
				return "";
			}
			Cell cellvalue = RowObj.getCell(ColumnNumber-1);
			if(cellvalue == null) //4: Verifying if columnvalue is NOT equal to NULL. If it is Null it returns NULLVALUE.
			{
				System.out.println("4: Given COLUMN has NULL value, hence returning empty value.");
				return "";
			}
			
			//5: Now, it started verifying what is cellvalue TYPE? Is it Blank? OR StringType OR NumaricType?
			if(Cell.CELL_TYPE_BLANK==cellvalue.getCellType()) //6: Verifying if cell Type is equal to Blank Type? If it is, it returns NULLVALUE.
			//if(CellHashCodeValue.getCellType()==3) //This line also works.
			{
			    System.out.println("2: The expected cell has blank value. Hence returning empty value.");
	            return Nullvalue;  //CellValue of BlankType will be returned.
			}
			
			if(cellvalue.getCellType()==Cell.CELL_TYPE_STRING) //7: Verifying if cell Type is equal to String Type? If so, it returns StringType of cellvalue.
			{
				String returnvalue = cellvalue.getStringCellValue(); //CellValue of StringType will be returned.
				System.out.println("2: The cell value contains a String value. Which is: "+returnvalue);
				return returnvalue;
			}
			if(cellvalue.getCellType()==Cell.CELL_TYPE_NUMERIC) //8: Verifying if cell Type is equal to Numaric Type? if so, it returns numerictype of cellvalue.
			{
			
				String returnvalue = String.valueOf(cellvalue.getNumericCellValue());  //CellValue of NumaricType will be returned.Actually, here we are converting Numaric to String because returnType of this method is "String only".
				System.out.println("2: The cell value contains a Numaric value. Which is: "+returnvalue);
				return returnvalue;
			}
		}	
		return Nullvalue;
	}
	
	
	/* Method 6: Return a cell value when columnNAME & RowNumber are passed.
	   Provide: Workbook, Sheetname, row number and column name.
	   Returns: Returns cell value for given rownumber & column name. 
	   Steps: 	1: If given Rownumber is <=0 then immediately return blank cellvalue. Because, in user view, 0th oes'nt exist. But in POI definition, 0th refers to first row. in this case, user is providing rownumber so 0number row doesn't exist.
				2: 1: Verifying if sheet exists by checking its index number?
				3: Now, we need to findout columnnumber with help of ColumnName. In this line, we are definitng RowStartAt variable. Since columnName exists in the 0th row number, so we are passing 0 value in getRow(0).Rownumber Starts from 0. That's why we are decrementing with 1. Because a tester who use this method, might not know the RowNumber starts from 0. 
				4: As you know getLastCellNum() returns totalcolumnNumbers. So we are looping in totalColumnNumber and finding ot our columnNumber with help of columnName.
				5: if((RowStartsAt.getCell(i).getStringCellValue().trim()).equals(ColumnName.trim()))
				6: Here, we are trimming the given ColumnName.
				7: Now, comparing both names. If they are same then we are assigning it to a variable.
				8: If it finds same then it will assign to this variable. Remember,even thou it finds and assign the value, it still loop for all other cell values. its a bug we need to fix it. But it is not harful thou. So don't worry.
				9: Since in POI subject, row starts from 0 number. We are decrementing 1. And defining a MyRow variable.
				10: Here, we are retrieving cell value using above assigned variable. 
				11: Verifying if Myrow has null. If so, it immediately returns Null value.
				12: Verifying if cellvalue has null. If so, it immediately returns Null value.
				13:Here onwards, we will verify what is the TYPE of our cell value. Is it blank type? Or String type? Or NumaricType. 
				14:It verifies is it blank Type, if so it returns blank value..
				15:It verifies is it String Type, if so it returns cell value in string type.
				16:It verifies is it numeric Type, if so it returns cell value in numeric type.. */
	public String getCellValue(int RowNumber, String ColumnName)
	{
		System.out.println("************************* EXECUTING getCellValue() METHOD by COLUMN Name & ROW Number ******************************************************");	
		try
		{
		String Nullvalue = "";
		int ColumnNumber = -1; 
		int index = Workbook.getSheetIndex(SheetName);
		System.out.println("1: The index number for given sheet name is: "+index);
		if(RowNumber <=0) //1: If given Rownumber is <=0 then immediately return blank cell value. Because, in user view, 0th oes'nt exist. But in POI definition, 0th refers to first row. in this case, user is providing rownumber so 0number row doesn't exist.
			{
			System.out.println("2: Given RowNumber is lessthan or equal to 0. Hence returning null value.");
			return Nullvalue;
		}
		
		if(index==-1) //2: Verifying if sheet exists by checking its index number?
		{
			System.out.println("2: Index value is -1. Means, passed sheetname not found. So returning empty cellvalue");
			return Nullvalue;
		}
		else
		{	
			HSSFSheet SheetObject = Workbook.getSheetAt(index);
			Row RowStartsAt = SheetObject.getRow(0);//3: Now, we need to findout columnnumber with help of ColumnName. In this line, we are defining RowStartAt variable. Since columnName exists in the 0th row number, so we are passing 0 value in getRow(0).Rownumber Starts from 0. That's why we are decrementing with 1. Because a tester who use this method, might not know the RowNumber starts from 0. 
			for(int i=0; i<RowStartsAt.getLastCellNum(); i++) //4: As you know getLastCellNum() returns totalcolumnNumbers. So we are looping in totalColumnNumber and finding ot our columnNumber with help of columnName.
			{
				//5: if((RowStartsAt.getCell(i).getStringCellValue().trim()).equals(ColumnName.trim()))
				String TrimmedCellValue = RowStartsAt.getCell(i).getStringCellValue().trim(); //5: In this line, we are getting each cell value, later changing the cell value to string value, and later trimming it.
				String TrimmedColumnName = ColumnName.trim(); //6: Here, we are trimming the given ColumnName.
				if(TrimmedCellValue.equals(TrimmedColumnName)) //7: Now, comparing both names. If they are same then we are assigning it to a variable.
				{
					ColumnNumber = i; //8: If it finds same then it will assign to this variable. Remember,even though it finds and assign the value, it still loop for all other cell values. its a bug we need to fix it. But it is not harful thou. So don't worry.
				}
			}
			Row MyRow = SheetObject.getRow(RowNumber-1); //9: Since in POI subject, row starts from 0 number. We are decrementing 1. And defining a MyRow variable.
			
			if(MyRow==null) //11: Verifying if Myrow has null. If so, it immediately returns Null value.
			{
				System.out.println("2: Given Row has NULL value, hence returning empty value.");
				return Nullvalue;
			}
			Cell cellvalue = MyRow.getCell(ColumnNumber); //10: Here, we are retrieving cellvalue using above assigned variable. 
			if(cellvalue==null)  //12: Verifying if cellvalue has null. If so, it immediately returns Nullvalue.
			{
				System.out.println("2: The Cell contains NULL value, hence returning empty value.");
				return Nullvalue;
			}
			//13:Here onwards, we will verify what is the TYPE of our cell value. Is it blank type? Or String type? Or NumaricType. 
			if(Cell.CELL_TYPE_STRING==cellvalue.getCellType()) //14:It verifies is it blank Type, if so it returns blank value..
			{
				String returnvalue = cellvalue.getStringCellValue(); 
				System.out.println("2: The cell value is String. Which is: "+returnvalue);
				return returnvalue;
			}
			if(Cell.CELL_TYPE_NUMERIC==cellvalue.getCellType())  //15:It verifies is it String Type, if so it returns cell value in string type.
			{
				String returnvalue = String.valueOf(cellvalue.getNumericCellValue());
				System.out.println("2: The cell value is String. Which is: "+returnvalue);
				return returnvalue;
			}
			if(Cell.CELL_TYPE_BLANK==cellvalue.getCellType())  //16:It verifies is it numeric Type, if so it returns cell value in numeric type..
				//if(CellHashCodeValue.getCellType()==3) //This line also works.
				{
				System.out.println("2: The cell value contianed blank value. Which is: "+Nullvalue);
				return Nullvalue;
				}
			
		} 
		return Nullvalue;
		} 
		catch(Exception e){
		
		e.printStackTrace();
		return "";
	}
	}
	

}