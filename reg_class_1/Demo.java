package reg_class_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

public static void main(String[] args)throws InterruptedException {
	
	ChromeDriver driver =new ChromeDriver();
	Thread.sleep(100);
	driver.get("https://www.redbus.in/");
	Thread.sleep(500);
	driver.close();

	}

}
