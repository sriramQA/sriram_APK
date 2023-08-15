package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.page.Page.GetAppIdResponse;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class program_17 {
	public static void main(String[]arg) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
	  WebElement username=driver.findElement(By.id("Phone number, username, or email"));
		Thread.sleep(2000);
    	int height=username.getSize().getHeight();
    	
    	int width=username.getSize().getWidth();
    	Thread.sleep(2000);
    	System.out.println("height if the email---->"+height);
    
    	System.out.println("width if the email---->"+width);
	}
}
