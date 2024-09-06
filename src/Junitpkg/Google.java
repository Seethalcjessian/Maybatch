package Junitpkg;
//search & load an item on google
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
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
	    WebElement searchbutton=driver.findElement(By.name("q"));
	    searchbutton.sendKeys("car",Keys.ENTER);                    //on the same field type item for search and clicking on enter button to display results
	    
	  //searchbutton.sendKeys("car");     //a method other than ENTER
	  //searchbutton.submit();
		
	 //driver.findElement(By.name("q")).sendKeys("car");    //using name locator;
	 //driver.findElement(By.name("btnk")).click();        // by clicking on'Google Search' option;   //will show error as element not interactable or no such element exception
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
	

}
