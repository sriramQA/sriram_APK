package reg_class_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class program_008 {
  public static void main(String[]arg) throws Exception {
	   ChromeDriver driver =new ChromeDriver();
	   Thread.sleep(2000);
	   driver.get("https://www.google.com/");
	   Thread.sleep(2000);
	   String address= driver.getWindowHandle();
	   System.out.println(address);
	   driver.close();
  }
}
