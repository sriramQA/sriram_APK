package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_022 {
	public static void main(String[] arg) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		boolean FBLOGO = driver.findElement(By.xpath("(//img)[1]")).isDisplayed();

		if (FBLOGO == true) {
			System.out.print("logo is displayed -->" + FBLOGO);
		}
		{
			System.out.print("logo is not displayed -->" + FBLOGO);
		}
		driver.close();
	}

}
