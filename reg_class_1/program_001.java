package reg_class_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class program_001 {
	public static void main(String[]args)throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String expectedresult="Facebook";
		Thread.sleep(2000);
		String actualresult=driver.getTitle();
		
		if (actualresult.contains(expectedresult))
		{
			System.out.println("test case is pass----->"+actualresult);
		}
		else 
		{
			System.out.println("test case is fail----->"+actualresult);
		}
		driver.close();
	}
	}


