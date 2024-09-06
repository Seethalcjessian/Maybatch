package Junitpkg;
//Using Locators:id,name,Xpath
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();              //to maximize browser
	}
	 
	@Test
	public void test1() throws Exception
	{
		//WebElement email=driver.findElement(By.id("email"));    also need to import WebElement
		//email.sendKeys("seethal@gmail.com");
		
		//WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));    //By using Xpath Locator
		//email.sendKeys("seethal@gmail.com");
		
		//Thread.sleep(3000);     //for waiting time:eg- instagram browser
		
		driver.findElement(By.id("email")).sendKeys("seethal@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("seethal");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
	

}
