package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Amazonwindowhandler {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void test1()
	{
	    WebElement a=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));    //search field
	    a.sendKeys("mobile phones",Keys.ENTER);
	    
	}   

}
