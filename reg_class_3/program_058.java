package reg_class_3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_058 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String text = a.getText();
		Thread.sleep(2000);
		System.out.println(text);
		a.accept();
		driver.close();
	}
}
