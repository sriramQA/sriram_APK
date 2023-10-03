package reg_class_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.edge.EdgeDriver;

public class Program_042 {

	public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.tagName("Button")).submit();
	
	
	
	}

}