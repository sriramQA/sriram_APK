package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_19 {

	public static void main(String[] args)throws InterruptedException {
		
	 ChromeDriver driver	= new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 Thread.sleep(2000);
	 driver.findElement(By.id("username")).sendKeys("admin");
	 Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("logoutLink")).click();
	 driver.close();
	}
}
