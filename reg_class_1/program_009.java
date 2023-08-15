package reg_class_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_009 {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement activeElement=driver.switchTo().activeElement();
				Thread.sleep(2000);
		activeElement.sendKeys("yuvan");	
	}

}
