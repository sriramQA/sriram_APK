package reg_class_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class program_002 {
	public static void main(String[] args)throws Exception {
		ChromeDriver driver  =new ChromeDriver();
		driver .get("https://www.lenskart.com/");
		Thread.sleep(100);
		String Title= driver.getTitle();
		System.out.print(Title);
		driver.close();
	}
}
