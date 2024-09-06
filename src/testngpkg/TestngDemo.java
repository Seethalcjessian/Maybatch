package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	/* @beforesuite
	   @beforetest
	   @beforeclass
	   @beforemethod
	   @test
	   @aftermethod
	   @afterclass
	   @aftertest
	   @aftersuite */                     //execution order for annotation
	
	@BeforeTest(alwaysRun=true)           //for grouping need to give alwaysRun
	public void setUp()
	{
		System.out.println("browser open");
	}
	

	@BeforeMethod(alwaysRun=true)         //for grouping need to give alwaysRun
	public void urlLoading()
	{
		System.out.println("url loading");
	}
	

	@Test(groups= {"smoke"})                                                       //(priority=2,dependsOnMethods= {"test2"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"sanity","smoke"})                                             //(priority=3,invocationCount=3)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"regression","sanity"})                                        //(priority=1,enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("quit browser");
	}

}
