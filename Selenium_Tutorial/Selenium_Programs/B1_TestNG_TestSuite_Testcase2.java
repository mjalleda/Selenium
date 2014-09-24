/* Description: 
 * What if you need to execute all TestNG Annotations including Before Suite & After Suite. What would be their priority order?
 * In order to run this task, we need to create two class files. 
 * Class 1: Class_J_TestNG_TestSuite_Testcase1 : This contains "Before & After Suite annotations. This class related with other class "Class_J_TestNG_TestSuite_TestCase2".
 * Class2: Class_J_TestNG_TestSuite_TestCase2 : This contains,
 * - Before & After Test annotations
 * - Before & After Class annotations
 * - Before & After Method annotations
 * - & Test annotation
 * Basically, we are executing Before&After Suites from other class and remaining code from this class. And we are checking their priority order.
 * Test Suite: TestNG_Suite1.xml file has a suite to execute these two files. Go to that XML file and run the code. You will see the priority order.
 */
package Tutorial;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class B1_TestNG_TestSuite_Testcase2 extends B1_TestNG_TestSuite_Testcase1 {
  @Test
  public void Method1() {
	  System.out.println("5: Test1");
	  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("4: Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("6: After Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("2: Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("8: After Test");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("3: BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("7: AFTER CLASS");
  }

}
