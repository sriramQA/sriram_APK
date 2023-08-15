package reg_class_2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class program_028 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.id("email"));
		textbox.sendKeys("yuvan");
		Thread.sleep(2000);
		String ER = textbox.getText();
		textbox.sendKeys(Keys.CONTROL+"ac");
		textbox.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		pwd.sendKeys(Keys.CONTROL+"v)");
		Thread.sleep(2000);
		String AR=pwd.getText();
		if (ER.equals(AR))
		{
			System.out.println("both the text are same");
		}else 
		{
			System.out.println("both the text are same");
		}
		driver.close();
	}

}
