/* Description: This Assignment shows "How to use TestNG Assertions"
 * TestNG Assertions: There are many assertions in TestNG, but most used ones are. assertEqual(), assertNotEqual()
 * But, I also tested, assertArrayEqual(), assertTrue(), assertFalse(), assertSame() & assertNull().
 * Pass: If assert pass, it returns a message. 
 * Fails: If assert fails, it returns a exception. i.ee., java.lang.AssertionError
 * */

package Tutorial;
import org.junit.Assert;
import org.testng.annotations.Test;
public class B1_TestNG_Assertions {

  @Test
  public void f() {  
	System.out.println("*********************************************************************************************************");
	System.out.println("                                      CLASSNAME: Class_J_TestNG_Assertions   ");
	System.out.println("*********************************************************************************************************");

	//************************************************************************************************//
	System.out.println("*********************************************************************************************************");
	System.out.println("assertEquals()");
	System.out.println("*********************************************************************************************************");
    //Methods: assertEquals() & assertNotEquals() : Checks if two given parameter values are matching, if not they assert returns error.
	  String str1 = "Sel";
	  String str2 = "Sel";
	  Assert.assertEquals(str1, str2); // In this case, both string values are same.
	  System.out.println("1.1: assertEquals(String, String) PASSED");
	  	 
	  int j = 100;
	  int k = 200;
	  Assert.assertNotEquals(j, k); // In this case, both int values are same.
	  System.out.println("1.2: assertNotEquals(int, int) PASSED");
   //************************************************************************************************//
	  
	//************************************************************************************************//
	     System.out.println("*********************************************************************************************************");
		 System.out.println("assertArrayEquals()");
		 System.out.println("*********************************************************************************************************");
		 //Method: "assertArrayEquals(StringObject, StringObject). both should match, o.w. it returns error.
		  String[] myStringArray = {"a","b","c"};
		  String[] myStringArray1 = {"a","b","c"};
		  Assert.assertArrayEquals(myStringArray, myStringArray1);
		  System.out.println("2: assertArrayEquals(StringObject, StringObject) PASSED");
		 
		  /* How to reproduce when it fails: 
		  String[] myStringArray2 = {"a","b","c","d"}
		  Assert.assertArrayEquals(myStringArray2, myStringArray1);
		  Error should be: FAILED: f.  java.lang.AssertionError:  */
	//************************************************************************************************//
		  
    //************************************************************************************************//
      System.out.println("*********************************************************************************************************");
	  System.out.println("assertTrue()");
	  System.out.println("*********************************************************************************************************");
	  //Method: "assertTrue(String, condition). both should match, o.w. it returns error.
	  int i=1;
	  Assert.assertTrue("10", i<10);
	  System.out.println("3: assertTrue(String, condition) PASSED");
	  
	  /* How to reproduce when it fails: 
	  int i=100;
	  Assert.assertTrue("10", i<10);
	  Error should be: FAILED: f.  java.lang.AssertionError: 10 */
	//************************************************************************************************//
	  	 
	//************************************************************************************************//
	  System.out.println("*********************************************************************************************************");
	  System.out.println("assertFalse()");
	  System.out.println("*********************************************************************************************************");
	 //Method: "assertFalse(condition). condition should be failed/Not match, o.w. it returns error. 
	  i = 100;
	  String value = "John";
	  Assert.assertFalse(i<2); //In this case, i=100 but condition checks for <2. So condition returns false. Assertion expecting false, hence assertion is passed.
	  System.out.println("4.1: assertFalse(condition) PASSED");
	  Assert.assertFalse(value=="Joe"); //In this case, value=John but condition checks for "Joe". So condition is not matching, hence it returns false. Assertion expecting false, hence assertion is passed.
	  System.out.println("5.2: assertFalse(condition) PASSED");
	  
	 /* How to reproduce when it fails: 
	  i = 1;
	  String value = "Joe";
	  Assert.assertFalse(i<2);
	  Assert.assertFalse(value=="Joe"); 
	  Error should be: FAILED: f.  java.lang.AssertionError:  */
	//************************************************************************************************//
	  
	//************************************************************************************************//
	  System.out.println("*********************************************************************************************************");
	  System.out.println("assertSame()");
	  System.out.println("*********************************************************************************************************");
	 //Method: "assertSame(object, object). Both object should be the same. Here it checks Both Object TYPE & Their values. Both should match. o.w. it retunrs error. Passing message is an optional parameter. 
	 //assertSame() VS asserEqual():  assertSame() verifies if both objects TYPES & Values are same. Where assertEqual() verifies if both Object values are same.
	  Object one_obj = new Long(10);
	  Object other = new Long(10);
	  other=one_obj;
	  Assert.assertSame("assert Same passed", one_obj,other); //In this case, both objects TYPES & Values are same. And we can also pass message which we want to return/print.
	  System.out.println("5.1: assertSame(message is optional, Object, Object) PASSED");
	  

	  Object one_obj1 = new Long(10);
	  Object other1 = new Long(10);
	  other1=one_obj1;
	  Assert.assertSame(one_obj1,other1); //In this case, we are not passing message.
	  System.out.println("5.2: assertSame(Object, Object) PASSED");
	  
	  /* How to reproduce when it fails: 
	  Object one_obj2 = new Long(10);
	  Object other2 = new Long(10);
	  Assert.assertSame(one_obj2,other2); //In this case, both Objects TYPES are same But NOT their values. So it will fail.
	  Error should be: FAILED: f.  java.lang.AssertionError:  */
	//************************************************************************************************//
	
	//************************************************************************************************//  
	  System.out.println("*********************************************************************************************************");
	  System.out.println("assertNull()");
	  System.out.println("*********************************************************************************************************");
	 //Method: "assertNull(object). Object value should be NULLL, o.w. it returns assertion error.
	  Object one_obj3 = null;
	  Assert.assertNull("assert null passed", one_obj3); //In this case, it verifies if Object value is NULL. If it is not then it returns error. 
	  System.out.println("6.1: assertNull(message, Object) PASSED");
	  
	  Object one_obj4 = null;
	  Assert.assertNull(one_obj4); //In this case, we are not passing message parameter. 
	  System.out.println("6.2: assertNull(Object) PASSED");
	  
	  /* How to reproduce when it fails: 
	  Object one_obj6 = new Long(10);
	  Assert.assertNull(one_obj6); //In this case, Object is NOT Null. So it will fail. 
	  Error should be: FAILED: f.  java.lang.AssertionError:  */	  
	//************************************************************************************************//
  }
}
