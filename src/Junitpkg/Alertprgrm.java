package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/alert.html");
	}
	
	@Test
	public void test() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();    //accept the alert
	//  a.dismiss(); //cancel the alert
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Seethal C");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Jessian");

	}

}
