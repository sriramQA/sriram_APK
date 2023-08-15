package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_027 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		String tag = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		if (tag.contains("a"))
		{
			System.out.println("tag name of forget pasword is ..."+tag);
		}else {
			System.out.println("tagname of forget password is ..."+tag);
		}
		driver.close();
		
		
	}
}
