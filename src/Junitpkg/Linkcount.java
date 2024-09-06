package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
		ChromeDriver driver;
			
			@Before
			public void setUp()
			{
				driver=new ChromeDriver();
				driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			}
			
			@Test
			public void test() //throws Exception
			{
				//Thread.sleep(3000);
			    List<WebElement> li=driver.findElements(By.tagName("a"));
				System.out.println("Total no.of links="+li.size());
				
				for(WebElement ele:li)                               
				{
					String link=ele.getAttribute("href");
					String text=ele.getText();
					System.out.println("link="+link+"------"+text);
					verify(link);                                    // to get the responsecode of all links  //try & catch method is used here
				}   
				
			/*	for(WebElement ele:li)                               // For Each loop method - to get the content of link & get the text written
				{
					String link=ele.getAttribute("href");
					String text=ele.getText();
					System.out.println("link="+link+"------"+text);
				} */
				
			/*	for(int i=0;i<li.size();i++)                  //for loop method
				{
					WebElement element=li.get(i);
					String link=element.getAttribute("href");
					String linktext=element.getText();
					System.out.println("link="+link+"------"+linktext);
				}    */
				
				
			}
			private void verify(String link) {
				try
				{
					URI ob=new URI(link);                                                            
					HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();            
					System.out.println(link+" "+con.getResponseCode());
					if(con.getResponseCode()==200)
					{
						System.out.println("successful----"+link);
					}
					else if(con.getResponseCode()==404)
					{
						System.out.println("brokenlink----"+link);
					}
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			} 

			@After
			public void tearDown()
			{
				//driver.quit();
			}

	}


