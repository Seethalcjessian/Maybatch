package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;

	By fbemail=By.id("email");
	By fbpswd=By.id("pass");
	By fbloginbutton=By.name("login");
	
	public Fbloginpage(WebDriver driver)
    {
		this.driver=driver;	
    }
	public void setValues(String email,String pswd)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpswd).sendKeys(pswd);
	}
	public void loginclick()
	{
		driver.findElement(fbloginbutton).click();
	}

	
	
	
}