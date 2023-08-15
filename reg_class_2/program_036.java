package reg_class_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_036 {
	public static void main(String[]args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count =alllinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String link=alllinks.get(i).getAttribute("href");
			System.out.println(link);
		}
		driver.close();
	}
}
