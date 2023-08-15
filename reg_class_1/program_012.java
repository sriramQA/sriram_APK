package reg_class_1;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_012 {

	public static void main(String[] args)throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/sriram%20v/Downloads/website%20.html");
	driver.findElement(By.name("n3")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.className("c4")).click();
	}
}
