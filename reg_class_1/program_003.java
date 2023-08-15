package reg_class_1;

import org.openqa.selenium.edge.EdgeDriver;

public class program_003 {

	public static void main(String[] args) throws Exception {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/?affid=affveve&affExtParam1=27701a0c650e67bc6de04bacb1e32545&affExtParam2=60827");
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.manage().window().minimize();
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.close();			
	}

}
