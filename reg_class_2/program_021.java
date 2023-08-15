package reg_class_2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_021 {

	public static void main(String[] args) {
		
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	int usernametbx =driver.findElement(By.id("username")).getLocation().getX();
	int  pwtbx=driver.findElement(By.name("pwd")).getLocation().getX();
	
	
	
	
	if (usernametbx==pwtbx)
	{
		System.out.println("both of equal---->"+usernametbx+"="+pwtbx);
	}else {
		System.out.print("both are not equal--->"+usernametbx+"="+pwtbx);
		
	}
	driver.close();	}

}
