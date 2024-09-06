package testngpkg;
//Hard Assertion
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titlecomparison {
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Facebook";
		Assert.assertEquals(actualtitle, exptitle,"title failed");
        System.out.println("Hello");            //here hello will not be printed,bcoz test is failed                                                                         
	}

}
