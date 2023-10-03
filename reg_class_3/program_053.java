 package reg_class_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_053 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/swiggy.html");
		WebElement list = driver.findElement(By.id("si"));
		Select s = new Select(list);
		s.selectByIndex(1);
		s.selectByIndex(0);
		
		List<WebElement> text = s.getAllSelectedOptions();
		System.out.println(text);
	}
}
