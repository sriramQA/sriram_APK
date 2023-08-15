package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class program_16 {

	public static void main(String[] args)throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
			Thread.sleep(2000);
			WebElement emailtestbox = driver.findElement(By.id("email"));
			Thread.sleep(2000);
			emailtestbox.clear();
			emailtestbox.sendKeys("sriramtvm007@gmail.com");
	}
}
