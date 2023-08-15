package reg_class_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_035 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/HTML%20LINKS/mutiple%20elements.html");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		for (int i=0;i<count; i++)
		{
			String text = alllinks.get(i).getText();
			System.out.println(text);
		} driver.close();
	}

}
