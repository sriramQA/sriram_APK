package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_20 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginbutton=driver.findElement(By.xpath("//div[.='Login ']"));
	int	xaxis=loginbutton.getLocation().getX();
	int	yaxis=loginbutton.getLocation().getY();	
	
	System.out.println("xaxis is login butoon--->"+xaxis);
	System.out.println("Yaxis is login butoon--->"+yaxis);
	driver.close();
	}
}
