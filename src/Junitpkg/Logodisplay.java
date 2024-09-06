package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplay {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();             
	}
	 
	@Test
	public void logoDisplay() 
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));               
		Boolean logodisplay=logo.isDisplayed();                                //check if rediff.com logo is visible on the browser
		if(logodisplay)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("failed");
		}

}
	@Test
	public void radioSelection() 
	{
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));               
		Boolean radioselection=radio.isSelected();                                //check if radio button is selected(M/F) on the browser
		if(radioselection)
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("not selected");
		}
}
	@Test
	public void buttonEnable() 
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));               
		Boolean buttonenable=button.isEnabled();                                //check if create my account button is enabled on the browser
		if(buttonenable)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
}
}

