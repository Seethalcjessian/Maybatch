package testngpkg;
//selenium waits(synchronization)
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehovering {
	WebDriver driver;
	String baseurl="https://www.ebay.com";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);		
				
	}
	
	@Test
	public void test()
	{
	//  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));             //Explicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));            //implicit wait
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();    //explicit wait
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		

}
}

