/* Description: This Assignment shows "TestNG Annotations"
 * In this, we perform "Before & After" class annotations with @Test annotation. It shows their priority order.
 * */
package Tutorial;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
public class B1_TestNG_Annotations_BeforeAfter_Class {
  @Test
  public void f() {
	  System.out.println("2: Second, TEST should execute");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("1: First, BEFORECLASS should execute");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("2: Third, AFTERCLASS should execute");
  }

}
