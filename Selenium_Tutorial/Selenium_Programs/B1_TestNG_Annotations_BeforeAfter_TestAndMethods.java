/* Description: Again, this assignment also show "TestNG Annotations"
This assignments shows annotations priority order "If a program contains all types of annotations". Here, we have
 - 1: TEST ANNOTATION
 - 2: BEFORE METHOD ANNOTATION && AFTER METHOD ANNOTATION
 - 3: BEFORE CLASS ANNOTATION && AFTER CLASS ANNOTATION
 Usually, Annotations Priority: "BEFORE TEST" >> "BEFORE METHOD >> "TEST ANNOTATION" >> "AFTER METHOD" >> "AFTER TEST".
 This Assignment: Have two TEST ANNOTATIONS, then What would be the priority order? See below.
 In Below case, the priority will be 
 "BEFORE TEST" >>  
 	"BEFORE CLASS" >> 
 		"BEFORE METHOD >> "1st TEST ANNOTATION" >> "AFTER METHOD" >>
 		"BEFORE METHOD >>  "2nd TEST ANNOTATION" >>  "AFTER METHOD" >>
 		"BEFORE METHOD >>  "3rd TEST ANNOTATION" >>  "AFTER METHOD" >> 
 	"AFTER CLASS" >> 
 "AFTER TEST".
 NOTE: It doesn't matter where do you write the code (for ex: you can write "BEFORE TEST" at bottom of the code, control executes only in the above priority. 
 */
package Tutorial;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class B1_TestNG_Annotations_BeforeAfter_TestAndMethods {
  
  // 1: TEST Annotation
  @Test
  public void Method1() {
	  System.out.println("*** 4: Test1 ***");
	  }
  
  //2: 2nd TEST Annotation
  @Test
  public void Method2() {
	  System.out.println("*** 7: Test2 ***");
  }
  
  //3: 3rd TEST Annotation
  @Test
  public void Method3() {
	  System.out.println("*** 10: Test3 ***");
  }
  
  //4: BEFORE METHOD ANNOTATION
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("***** 3 >> 6 >> 9: Before Method *****");
  }

 //5: AFTER METHOD ANNOTATION
  @AfterMethod
  public void afterMethod() {
	  System.out.println("***** 5 >> 8 >> 11: After Method *****");
  }

  //6: BEFORE TEST ANNOTATION
  @BeforeTest
  public void beforeTest() {
	  System.out.println("********** 1: Before Test *************");
  }

 //7: AFTER TEST ANNOTATION
  @AfterTest
  public void afterTest() {
	  System.out.println(" ********** 13: After Test *************");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("**********2: BEFORECLASS  **********");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("**********12: AFTERCLASS  **********");
  }
}
