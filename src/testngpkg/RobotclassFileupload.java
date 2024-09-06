package testngpkg;
//File upload using Robot class
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotclassFileupload {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void fileuploadpgm() throws Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();            //'Select WORD files'button click
		
	fileUpload("C:\\Users\\hp\\Documents\\Seethal_CV final.docx");                 //file path to be uploaded
	}
	
	public void fileUpload (String p) throws AWTException  {
		StringSelection strSelection = new StringSelection(p);                      //select the file to be uploaded
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);   //copying file path to clipboard & paste it into the field
		
		Robot robot = new Robot();
	robot.delay(3000);
	
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    robot.keyPress(KeyEvent.VK_ENTER);

    robot.keyRelease(KeyEvent.VK_ENTER);
    //robot.delay(2000);

	}

}
