package mavenproject002;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public WebDriver  driver;
	public FileInputStream fis;
	public Properties p;
	
	@BeforeMethod
	public void openbrowser() throws IOException
	{
		Reporter.log("open the browser",true);
		fis=new FileInputStream("./data/brikenstock_data.txt");
		p=new Properties();
		p.load(fis);
		String link =p.getProperty("url");
		driver =new ChromeDriver();
		driver.get(link);
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
		Reporter.log("close the broswer",true);
		driver.close();
	}
}
