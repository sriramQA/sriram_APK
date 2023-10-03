package reg_class_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_059 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel '] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(2000);
		
		
		String actualresult = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		Thread.sleep(2000);
		String excpetesresult = "You Pressed Cancel";
		Thread.sleep(2000);	
		if(excpetesresult.contains(actualresult))

		{
			System.out.println("same text is present =="+actualresult);
			
		}else 
		{
			System.out.println("different text is present="+actualresult);
			
		}
		a.dismiss();
	}
}


