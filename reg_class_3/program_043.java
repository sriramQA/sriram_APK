package reg_class_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program_043 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebDriverWait wd=new WebDriverWait(driver,Duration.ofSeconds(20));
		wd.until (ExpectedConditions.titleContains("Google"));
		driver.findElement(By.xpath("(//textarea)[1]"));
	}
}
