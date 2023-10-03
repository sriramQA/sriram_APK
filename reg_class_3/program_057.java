package reg_class_3;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_057 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("");
		WebElement list = driver.findElement(By.id("s1"));
		Select s = new Select(list);
		List<WebElement> aloption = s.getOptions();
		int count=aloption.size();
		
		HashSet<String> hs=new HashSet<String>();
		for (int i=0;i<count;i++) {
			String al = aloption.get(i).getText();
		hs.add(al);
		}
		System.out.println(hs);
		
		
	}
}
