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
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class B1_TestNG_TestSuite2_TestCase3 {
  @Test
  public void f() {
	  System.out.println("3: **********  Executing CASE3 TEST ANNOTATION ****************");
	 }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("1: **********  Executing BeforeSuite ****************");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("10: **********  Executing AFTER Suite ****************");
	 }

}
