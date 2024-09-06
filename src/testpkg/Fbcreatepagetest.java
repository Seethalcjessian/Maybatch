package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagepkg.Createpage;

public class Fbcreatepagetest extends Baseclass {
	@Test
	public void test2()
	{
		Createpage c=new Createpage(driver);
		c.createpageclick();
		String actualtitle=c.titleverification();
		Assert.assertEquals(actualtitle, "Facebook");
	}
	

}
