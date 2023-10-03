package reg_class_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_051 {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("");
		WebElement list=driver.findElement(By.id("s1"));
		
		Select s = new Select(list);
		s.selectByValue("pg");
		s.selectByVisibleText("chappathi");
		s.selectByVisibleText("appam");
		
		List<WebElement> alloptions = s.getAllSelectedOptions();
		int count= alloptions.size();
		
		for(int i=0;i<count;i++)
		{
			String selectedoption = alloptions.get(i).getText();
		System.out.println(selectedoption);
		}
				
	}
}
