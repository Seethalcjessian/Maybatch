package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");					
	}

	

}
