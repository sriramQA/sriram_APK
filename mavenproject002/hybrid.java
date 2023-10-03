package mavenproject002;

import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hybrid extends Baseclass {
	
	@Test
	public void testcase_002() throws InterruptedException
	{
		stockclass pc=new stockclass();
		PageFactory.initElements(driver, pc);
		pc.testcase_002();
		Reporter.log("testcase-02 is pass",true);
		
	}
	@Test
	public void testcase_003() throws InterruptedException
	{
		stockclass pc=new stockclass();
		PageFactory.initElements(driver, pc);
		pc.testcase_002();
		Reporter.log("testcase-03 is pass",true);
	}
	@Test
	public void testcase_004() throws InterruptedException
	{
		stockclass pc=new stockclass();
		PageFactory.initElements(driver, pc);
		pc.testcase_002();
		Reporter.log("testcase-04 is pass",true);
	}
	@Test
	public void testcase_005() throws InterruptedException
	{
		stockclass pc=new stockclass();
		PageFactory.initElements(driver, pc);
		pc.testcase_002();
		Reporter.log("testcase-05 is pass",true);
	}
	@Test
	public void testcase_006() throws InterruptedException
	{
		stockclass pc=new stockclass();
		PageFactory.initElements(driver, pc);
		pc.testcase_002();
		Reporter.log("testcase-06 is pass",true);
	}
	@Test
	public void testcase_007() throws InterruptedException
	{
		stockclass pc=new stockclass();
		PageFactory.initElements(driver, pc);
		pc.testcase_002();
		Reporter.log("testcase-7 is pass",true);
	}
	
}
