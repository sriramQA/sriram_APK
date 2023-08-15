package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_024 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();

		if (checkbox == true) {
			System.out.println("checkbox is selected-->" + checkbox);
		} else {
			System.out.println("checkbox is not selected-->" + checkbox);
		}
		driver.close();
	}	
}
