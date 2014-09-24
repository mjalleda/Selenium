/* Description: This Assignment shows "TestNG Annotations"
 * In this, we perform "Before & After Method annotations with @Test annotation. It shows their priority order.
*/
package Tutorial;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class B1_TestNG_Annotations_BeforeAfter_Methods {
  @Test
  public void f() {
	  System.out.println("2: Second, TEST should execute");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1: First, BEFOREMETHOD should execute");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("3: Third, AFTERMETHOD should execute");
  }

}
