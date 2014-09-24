/* Description: 
 * What if you need to execute all TestNG Annotations including Before Suite & After Suite. What would be their priority order?
 * In order to run this task, we need to create two class files. 
 * Class 1: Class_J_TestNG_TestSuite_Testcase1 : This contains "Before & After Suite annotations. This class related with other class "Class_J_TestNG_TestSuite_TestCase2".
 * Class2: Class_J_TestNG_TestSuite_TestCase2 : This contains,
 * - Before & After Test annotations
 * - Before & After Class annotations
 * - Before & After Method annotations
 * - & Test annotation
 * Basically, we are executing Before&After Suites from this class and remaining code from other class. And we are checking their priority order.
 * Test Suite: TestNG_Suite1.xml file has a suite to execute these two files. Go to that XML file and run the code. You will see the priority order.
 */
package Tutorial;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class B1_TestNG_TestSuite_Testcase1 {
  @BeforeSuite
  public void beforeSuite() {	 
	  System.out.println("1: **********  Executing BeforeSuite ****************");
	}

  @AfterSuite
  public void afterSuite() {	
	  System.out.println("9: ****** Executing AfterSuite *******************");
	  
  }
}
