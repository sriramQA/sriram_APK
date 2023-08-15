package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_014 {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/HTML%20LINKS/website%20.html");
	driver.findElement(By.cssSelector("a[id]='13']")).click();
	driver.close();
	}
}
