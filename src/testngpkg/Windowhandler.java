package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	ChromeDriver d;
	@BeforeTest
	public void beforetest()
	{
		d= new ChromeDriver();
	}
	@Test
	public void test() throws Exception{
		d.get("http://demo.guru99.com/popup.php");
		String parentwindow = d.getWindowHandle();   //current window
		System.out.println("Parent window Title" + d.getTitle());
		d.findElement(By.xpath("/html/body/p/a")).click();   //'click here' button
		
		Set<String> allWindowHandles = d.getWindowHandles();
		for(String handle: allWindowHandles) {
			
			if(!handle.equalsIgnoreCase(parentwindow))  {
				d.switchTo().window(handle);
				d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("seethal@gmail.com");
				Thread.sleep(3000);
				d.close();	
			}
			d.switchTo().window(parentwindow);
		}

	}

}
