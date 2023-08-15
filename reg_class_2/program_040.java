package reg_class_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_040 {

		public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> news = driver.findElements(By.xpath("//button[@id='loginbutton']"));
		
		for (int i = 0; i < news.size(); i++) {
			String text = news.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
