package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestCase {
	
	@Test
	public void opengoogle()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\OLD_SETUP_SEL&JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.quit();
	}
	@Test
	public void openbing()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\OLD_SETUP_SEL&JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}
}
