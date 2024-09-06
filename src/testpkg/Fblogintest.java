package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");					
	}
	@Test
	public void test1() 
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("abc@gmail.com","abc123");
		ob.loginclick();
		//Fbcreatepage ob1=new Fbcreatepage(driver);
	}

}
