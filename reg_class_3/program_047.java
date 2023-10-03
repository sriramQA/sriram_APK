package reg_class_3;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_047 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement dt = driver.findElement(By.id("day"));
		Select s = new Select(dt);
		s.selectByValue("18");
		Thread.sleep(2000);
		
		WebElement mn = driver.findElement(By.id("month"));
		Select s1 = new Select(mn);
		s1.selectByValue("6");
		Thread.sleep(2000);
		
		
		WebElement yr = driver.findElement(By.id("year"));
		Select s2 = new Select(yr);
		s2.selectByVisibleText("1998");

	}
}
