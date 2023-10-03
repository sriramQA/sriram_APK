package reg_class_3;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_060 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("sriram QA engineer");
		a.accept();
		Thread.sleep(2000);
		String exctext = "sriram QA engineer";
		
		String acttext = driver.findElement(By.id("demo1")).getText();

		if (acttext.contains(exctext)) {
			System.out.println("test case is pass");
		} else {
			System.out.println("test case is faill");
		}
		driver.close();

	}
}
