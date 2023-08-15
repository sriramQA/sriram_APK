package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_025 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		String text=driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		
		System.out.println(text);
		driver.close();
		
}
}
