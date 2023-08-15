package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_015 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		driver.findElement(By.xpath("html/body/div[1]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("html/body/div[2]/a[2]")).click();
		
		
	}

}
