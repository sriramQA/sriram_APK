package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_010 {

	public static void main(String[] args)throws InterruptedException{
		Thread.sleep(2000);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2300);
		driver.get("file:///C:/Users/sriram%20v/Downloads/website%20.html");
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.tagName("a"));
		Thread.sleep(2000);
		link.click();
		driver.close();	
	}

}
