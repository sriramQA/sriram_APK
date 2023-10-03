package reg_class_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_054 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/swiggy.html");
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.id("si"));
		Select s = new Select(list);
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		
		//select
		for (int i = 0; i < count; i++) {
			Thread.sleep(200);
			s.selectByIndex(i);
		}
		//deselect
		for (int i = count - 1; i >= 0; i--) {
			Thread.sleep(2000);
			s.selectByIndex(i);
		}

	}
}
