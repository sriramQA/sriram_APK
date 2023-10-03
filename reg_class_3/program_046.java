package reg_class_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_046 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.className("_97w5")).click();
		WebElement date= driver.findElement(By.id("day"));
		Select s= new Select(date);
		s.selectByIndex(5);
		s.selectByValue("18");
		s.selectByVisibleText("18");
		
		
		
	}

}
