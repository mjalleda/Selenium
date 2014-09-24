/* Description: This Assignment shows "TestNG Annotation, @DataProvider"
 * @DataProvider Annotation: Returns an Object datatype Variable with multidimensional array.
 * This will be called only in @Test annotation.
 */
package Tutorial;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class B1_TestNG_Annotations_DataProvider 
{
  
  @Test(dataProvider = "dataProviderMethod_Sum")
  public void f(int a, int b)
  {
      System.out.println("@Test : dataProviderMethod_Sum()");
  }                                   

  @DataProvider 
  public Object[][] dataProviderMethod_Sum() 
  {
    return new Object[][] { { 5, 5 }, { 10, 10 }, { 20, 20 } };
  }
}
