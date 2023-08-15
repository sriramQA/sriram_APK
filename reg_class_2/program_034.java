package reg_class_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_034 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/mutiple%20elements.html");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println(count);
		String linktext = alllinks.get(0).getText();
		System.out.println(linktext);
		driver.close();
	}
}
