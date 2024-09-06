package Junitpkg;
//TakesScreenshot interface is used
import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();             
	}
	 
	@Test
	public void pageScreenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);            //page screenshot
		FileHandler.copy(src, new File("D://rediffscreenshot1.png"));                   //to save in system driver(eg:E/D drive)
		
		WebElement checkavailability=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));       //element screenshot(here, check availability element is taken)         
		File buttonscreenshot=checkavailability.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonscreenshot, new File("./Screenshot/buttonscreenshot.png"));             //to redirect & save to our project/working directory in eclipse // always starts with ./
	}


}
