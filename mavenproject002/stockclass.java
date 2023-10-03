package mavenproject002;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class stockclass {
	/**
	 * declaring valuse for login page 
	 */
	@FindBy(id="customer_email")
	private WebElement usernametextbox;
	
	@FindBy(id="customer_password")
	private WebElement password;
	
	@FindBy(xpath ="(//input[@type='submit'])[2]")
	 private WebElement login;
	
	
	/**
	 * declaring valuse for login page 
	 */
	
	@FindBy(xpath = "(//a[@class='menu__moblie '])[3]")
	private WebElement menoption;
	
	@FindBy(id="boost-pfs-search-box-1")
	private WebElement search;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement logoutoption;
	
	@FindBy(xpath = "//span[contains(text(),'Log out')]")
	private WebElement logout;
	
	@FindBy(xpath = "(//a[text()='Zurich'])[1]")
	private WebElement product;
	
	@FindBy(className = "selection-icon")
	private WebElement sizeoption;
	
	
	

	/**
	 * utilization
	 * @throws InterruptedException 
	 */
	public void testcaseMethod(String key,String value) throws InterruptedException  ///v //v
	{
		usernametextbox.sendKeys(key);
		password.sendKeys(value);
		Thread.sleep(2000);
		login.click();
	}
	public void testcase_002() throws InterruptedException  ///iv //v
	{
		usernametextbox.sendKeys("sriramvr@gmail.com");
		password.sendKeys("@sri@123");
		Thread.sleep(2000);
		login.click();
	}
	public void testcase_003() throws InterruptedException //v//iv
	{
		usernametextbox.sendKeys("sriramvr98@gmail.com"); 
		password.sendKeys("@sri123");
		Thread.sleep(2000);
		login.click();
	}
	public void testcase_004() throws InterruptedException //iv //iv
	{
		usernametextbox.sendKeys("sriramvr@gmail.com"); 
		password.sendKeys("@sri123");
		Thread.sleep(2000);
		login.click();  
	}
	public void testcase_005() throws InterruptedException  //b //v
	{
		usernametextbox.sendKeys("");
		password.sendKeys("@sri@123");
		Thread.sleep(2000);
		login.click();
	}
	public void testcase_006() throws InterruptedException  //v//b
	{
		usernametextbox.sendKeys("sriramvr98@gmail.com");
		password.sendKeys("");
		Thread.sleep(2000);
		login.click();
	}
	public void testcase_007() throws InterruptedException   //b //b
	{
		usernametextbox.sendKeys("");
		password.sendKeys("");
		Thread.sleep(2000);
		login.click();
	}
	
	
	 
}