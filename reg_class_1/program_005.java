package reg_class_1;


import org.openqa.selenium.chrome.ChromeDriver;

public class program_005 {

	public static void main(String[] args)throws Exception{
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			driver.get("https:www.facebook.com");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.close();
	}

}
