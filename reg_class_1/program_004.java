package reg_class_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class program_004 {
	public static void main (String[]args)throws Exception
	{
	ChromeDriver driver	=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
	String src =driver.getPageSource();
	System.out.println(src);
	driver.close(); 
	}
}
