
package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sampletest {

	WebDriver driver;
	long starttime;
	long endtime;



	@BeforeSuite
	public void launchbrowser()
	{
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\OLD_SETUP_SEL&JAVA\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Test(priority=1)
	public void google() 
	{
		driver.get("http://www.google.co.in");
	}
	@Test(priority=3)
	public void bing()
	{
		driver.get("http://www.bing.com");
	}
	@Test(priority=2)
	public void yahoo()
	{
		driver.get("http://www.yahoo.co.in");
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println("total time is:"+totaltime);	
	}
}

