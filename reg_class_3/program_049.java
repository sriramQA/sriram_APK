package reg_class_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_049 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/food.html");
		WebElement List = driver.findElement(By.id("S1"));
		Select s = new Select(List);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		for (int i = 0; i < count; i++) {
			String text = alloptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
