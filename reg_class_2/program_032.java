package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_032 {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("sriram");
	driver.findElement(By.id("pass")).sendKeys("hai");
	driver.findElement(By.xpath("//button"));
}
}