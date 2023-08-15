package reg_class_2;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_037 {

	public static void main(String[] args) {

		System.out.println("enter the input in the URL ");
		Scanner sc = new Scanner(System.in);
		String userinput = sc.nextLine();
		ChromeDriver driver = new ChromeDriver();
		driver.get(userinput);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String link = alllinks.get(i).getAttribute("href");
			System.out.println(link);
		}
		driver.close();
	}

}
