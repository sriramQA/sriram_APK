package reg_class_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class program_006 {

	public static void main(String[] args)throws Exception {
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.fireflink.com/");
		Thread.sleep(2000);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
			
		String Title= driver.getTitle();
		System.out.print(Title);
		
		driver.close();
	}
}
