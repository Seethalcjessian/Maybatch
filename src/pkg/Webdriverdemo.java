package pkg;
// To verify the title  //To compare the actual & expected title
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();   //to open browser
		driver.get("https://www.google.com");     //to launch application
		String actualtitle=driver.getTitle();     //to capture the title of application
		String expectedtitle="google";
		System.out.println("title="+actualtitle);
		
		if(actualtitle.equals(expectedtitle))               //case sensitive
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.quit();                            //to close the application after getting loaded

	}

}
