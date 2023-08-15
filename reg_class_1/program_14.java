package reg_class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_14 {

	public static void main(String[] args) {
		ChromeDriver driver	=new ChromeDriver();
		driver.get("file:///C:/Users/sriram%20v/OneDrive/Desktop/website%20.html");
		driver.findElement(By.cssSelector("a[id.'c2']")).click();
		driver.close();
	}

}
