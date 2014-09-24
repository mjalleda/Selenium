/* Description: 
 * In other classes (Class_J_TestNG_TestSuite_Testcase1, Class_J_TestNG_TestSuite_Testcase2), we have seen the priority order 
 * -	"when all testNG annotations are in one class including @Test annotation"
 * -	" @beforeSuite & @afterSuite annotations are in different class"
 * 
 * Now, we have a case like below.
 * -	" A class contains Before & After Suite Annotations + @Test Annotation"
 * - 	" B class contains all remaining Annotations like "Before & After Test annotations, Before & After Class annotations & Before & After Method annotations"
 * Now, find their priority order. You can find this in below two classes.
 * Class_J_TestNG_TestSuite2_TestCase3
 * Class_J_TestNG_TestSuite2_TestCase4
 * 
 * Class A: Class_J_TestNG_TestSuite2_TestCase3 : This contains "BeforeSuite, AfterSuite & @Test annotations. This class related with other class "Class_J_TestNG_TestSuite2_TestCase4".
 * Class B: Class_J_TestNG_TestSuite2_TestCase4 : This contains,
 * - Before & After Test annotations
 * - Before & After Class annotations
 * - Before & After Method annotations
 * Test Suite: TestNG_Suite2.xml file has a suite to execute these two files. Go to that XML file and run the code. You will see the priority order.
 */
package Tutorial;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class B1_TestNG_TestSuite2_TestCase4 extends B1_TestNG_TestSuite2_TestCase3 {
  @Test
  public void f() {
	  System.out.println("6: TEST4 TEST ANNOTATION ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("5: BEFORE METHOD ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("7: After Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("2: BEFORE TEST ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("9: After TEST");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("4: BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("8: AFTER CLASS");
  }

}
