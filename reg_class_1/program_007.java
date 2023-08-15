package reg_class_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class program_007 {

	public static void main(String[] args)throws Exception {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.indeed.com");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(url);
	
		driver.getClass();
	
	}

}
