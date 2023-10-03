package reg_class_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_050 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("\"file:///C:/Users/sriram%20v/OneDrive/Desktop/HTML%20LINKS/listboxmulti.html\"");
		
		WebElement list = driver.findElement(By.id("s1"));
		Select s=new Select(list);
		String text = s.getWrappedElement().getText();
		boolean output=s.isMultiple();
	
		System.out.println("yes this multi -select list box -->"+output);
		System.out.println("**********");
		System.out.println(text);
		driver.close();
		
	}

}
