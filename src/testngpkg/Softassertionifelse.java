package testngpkg;
//soft assertion or if-else method
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Softassertionifelse {
	

	
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
			if(actualtitle.equals(exptitle))
			{
		        System.out.println("pass");                                                                                     
			}
			else
			{
		        System.out.println("fail");                                                                                     
			}
	        System.out.println("Hello");      //here hello will be printed, even though test is failed                                                                                                                                                                          
		}

	}



