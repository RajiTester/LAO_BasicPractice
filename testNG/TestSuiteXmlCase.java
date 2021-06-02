package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSuiteXmlCase {
	@Test
	public void testlink()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\OLD_SETUP_SEL&JAVA\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
	}
}
