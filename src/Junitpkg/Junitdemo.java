package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test1()
	{
		String s=driver.getTitle();                                                //or      System.out.println(driver.getTitle());
        System.out.println("Title is: "+s);                                                                                     
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}
