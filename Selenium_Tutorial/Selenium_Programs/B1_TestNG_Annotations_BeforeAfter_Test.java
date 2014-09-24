/* Description:This Assignment shows "TestNG Annotations"
 * In this, we perform "Before & After Test annotations with @Test annotation. It shows their priority order.
*/
package Tutorial;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class B1_TestNG_Annotations_BeforeAfter_Test {
  @Test
  public void f() {
	  System.out.println("2: Second, TEST should execute");
	  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("1: First, BeforeTest Should execute ");
	}

  @AfterTest
  public void afterTest() {
	  System.out.println("3: Third, AfterTest Should execute");
	}
}
