package testNG;

import org.testng.annotations.Test;

public class Sampletestcase {

	@Test(enabled = true)
	public void firstcase()

	{
		System.out.println("my first case");
	}

	@Test(dependsOnMethods = "firstcase")
	public void secondcase()
	{
		System.out.println("my second case");
	}
	@Test(priority=2)
	public void musicon()
	{
		System.out.println("my music case");
	}
	@Test(priority=3)
	public void fourcase()
	{
		System.out.println("my four case");
	}
	@Test(priority=2)
	public void thirdcase()
	{
		System.out.println("my third case");
	}
}