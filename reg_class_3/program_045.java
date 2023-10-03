package reg_class_3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program_045 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.");
		
		WebDriverWait wd=new WebDriverWait(driver,Duration.ofSeconds(20));
	}

}
