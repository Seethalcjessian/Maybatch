package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		ChromeDriver driver;
			
			@Before
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
			    
			    driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();        //Best Sellers
			    driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();        //cart
			    driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div")).click();    //Hello, sign in
			    driver.navigate().back();                                                   // navigate to backspace
			    driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a")).click();     //hamburger menu
			 //   driver.findElement(By.xpath("//div[@id='nav-belt']/div/div[3]/div[4]/div[13]/div/div/a[6]/span/i")).click();
			    
			}
			    

}
