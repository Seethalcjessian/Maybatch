package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttontext {
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();					
	}
	
	@Test
	public void test() 
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		String buttontext=button.getAttribute("value");                  //to verify the button text
		String exp="Check availability";
		if(buttontext.equals(exp))
		{
			System.out.println("pass");	
		 }
		 else
		 {
			System.out.println("fail");
		 }
		
		

	}

}
