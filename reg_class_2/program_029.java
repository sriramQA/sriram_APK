package reg_class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_029 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		WebElement usertextbox= driver.findElement(By.id("email"));
		usertextbox.sendKeys("sriram");
		String output = usertextbox.getAttribute("value");
		if (output.isEmpty())
		{
			System.out.println("text is empty--->"+"the test present is "+output);
		}
		else {
			System.out.println("text is no empty--->"+"the test present is "+output);
		}
		driver.close();
	}

}
