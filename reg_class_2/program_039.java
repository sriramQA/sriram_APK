package reg_class_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_039 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("yuvan");
		
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'yuvan')]"));
		int count = autosugg.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String text = autosugg.get(i).getText();
			
			System.out.println(text);
		}
		//click on the first auto suggestion
		autosugg.get(0).click();
		//click on the last auto suggestion
		autosugg.get(count-1).click();
	}
}
