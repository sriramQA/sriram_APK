package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_023 {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		boolean loginbutton=driver.findElement(By.xpath("//button")).isEnabled();
		
		if (loginbutton==true)
		{
			System.out.println("login button is enabled--->"+loginbutton);
		}else {
			System.out.println("login button is not enabled --->"+loginbutton);
		}
		driver.close();
		
	}

}
