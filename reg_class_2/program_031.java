package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class program_031 {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement output = driver.findElement(By.xpath("//a[text()='Create new account']"));
			System.out.println(output);
			driver.close();
			
		}
}
