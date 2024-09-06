package pkg;
//check whether the text is present in the browser or not
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String pagesrc=driver.getPageSource();
		if(pagesrc.contains("Gmail"))                  //case sensitive
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}


	}

}
