package reg_class_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_048 {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/HTML%20LINKS/swiggy.html");
		WebElement list =driver.findElement(By.id("s1"));
		Select s=new Select(list);
		s.selectByIndex(0);
		s.selectByValue("ds");
		s. selectByVisibleText("puri");
		s.deselectByIndex(2);
		s.deselectByValue("iy");
		s.deselectByVisibleText("dosa");
	}
}
