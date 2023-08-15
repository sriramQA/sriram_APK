package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.dom.model.BackendNode;

public class program_011{ 
		public static void main (String[]arg)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/sriram%20v/Downloads/website%20.html");
		Thread.sleep(200);
		driver .findElement(By.tagName("a")).click();
		Thread.sleep(200);
		driver.navigate().back();
		driver.findElement(By.id("i2")).click();
		driver.close();
		}
}
