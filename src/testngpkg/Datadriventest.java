package testngpkg;
//Data driven Testing
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);					
	}
	
	@Test
	public void datadriventest() throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\hp\\Desktop\\facebooklogin.xlsx");  //to read file
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet s=wb.getSheet("Sheet1");
		       int r=s.getLastRowNum();
		       for(int i=1;i<=r;i++)
		       {
		    	   String email=s.getRow(i).getCell(0).getStringCellValue();
		    	   String pswd=s.getRow(i).getCell(1).getStringCellValue();
					System.out.println("email="+email+"-------"+"password= "+pswd);
					driver.findElement(By.id("email")).clear();
					driver.findElement(By.id("email")).sendKeys(email);
					driver.findElement(By.id("pass")).clear();
					driver.findElement(By.name("pass")).sendKeys(pswd);
					driver.findElement(By.name("login")).click();			
				//  driver.navigate().refresh();
					 String actualurl=driver.getCurrentUrl();
					 String exp="https://www.facebook.com/home";
					 if(actualurl.equals(exp)) {
							System.out.println("pass");
							
					 }
					 else
					 {
							System.out.println("fail");
					 }

		       }
	}

}
