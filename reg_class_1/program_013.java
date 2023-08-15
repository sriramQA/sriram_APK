package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_013 {
	public static void main (String[]arg) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/sriram%20v/OneDrive/Desktop/website%20.html");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("book"));
	}
}