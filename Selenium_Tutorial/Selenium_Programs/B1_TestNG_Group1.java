/* Relation:  This class talks about TestNG Groups.
 * Here, we have a case. Where, we have some group of test cases, we divided them into SmokeTest, RegressionTest & FunctionalTest groups.
 * Now, we want to run them in some order. How to achieve this?
 * 
 * We have two classes here: 
 *  - Class_L_TestNG_Group1 
 *  - Class_L_TestNG_Group2. 
 *  And we are executing these two classes in two different suites. 
 *  - TestNG_Groups_WithSingleClass
 *  - TestNG_Gorups_WithMultipleClass
 * 
 * Description: 
 * Basically, we can create groups (for ex: SmokeTest Group OR RegressionTest Group, Login Group) and we can call that particular group tests only.
 * For ex: In below class, we have some groups. Smoke, functional & Regression. When a group is called in TestNG Suite, only those cases will be executed.
 * For ex: For smokeTest group, only smoke() method will be executed. 
 * For ex: For regressionTest group, only regression() method will be executed.
 * Priority:Basically we are prioritizing groups, so they can run in their priority order in TestNG suite.
 * */
package Tutorial;
import org.testng.annotations.Test;
public class B1_TestNG_Group1 {
  
	//Priority:Basically we are prioritizing groups, so they can run in their priority order in TestNG suite.
	@Test(priority=2, groups="functional") // This Test annotation included in functional group
	public void functional1() 
	{
		System.out.println("This is a functional test case1");
	}
	@Test(priority=1, groups="smoke") //This Test annotation included in Smoke Group.
	public void smoke1() 
	{
		System.out.println("This is a smoke test case1");
	}
	  
	@Test(priority=3, groups="regression") // This Test annotation included in regression group
	public void regression1() 
	{
		System.out.println("This is a Regression test case1");
	}
	  
	@Test //This annotation doesn't include in any group.
 	public void RegularMethod1() 
	{
	  System.out.println("This is a Regular method");
	}
}


