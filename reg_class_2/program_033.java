package reg_class_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_033 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/HTML%20LINKS/mutiple%20elements.html");
	 List<WebElement> allLinks =driver.findElements(By.xpath("//a"));
	int count =allLinks.size();
	Thread.sleep(2000);

	System.out.println(count);
	driver.close();
	
	
	
	}

}
