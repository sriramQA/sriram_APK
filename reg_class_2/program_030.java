package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_030 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		String ff = link.getCssValue("font-family");
		String fc = link.getCssValue("color");
		String fs = link.getCssValue("font-size");
		System.out.println(ff);
		System.out.println(fc);
		System.out.println(fs);
		
		driver.close();
	}

}
