package testNG;

import org.testng.annotations.Test;

public class Grouptestcase {
	@Test(groups = {"apple"})
	public void apple1()
	{
		System.out.println(" this is apple phone");
	}
	@Test(groups = {"apple"})
	public void apple2()
	{
		System.out.println(" this is apple2 phone");
	}
	@Test(groups = {"moto"})
	public void moto1()
	{
		System.out.println(" this is moto1 phone");
	}
	@Test(groups = {"moto"})
	public void moto2()
	{
		System.out.println(" this is moto2 phone");
	}
	@Test(groups = {"lenovo"})
	public void lenovo1()
	{
		System.out.println(" this is lenovo1 phone");
	}
	@Test(groups = {"lenovo"})
	public void lenovo2()
	{
		System.out.println(" this is lenovo2 phone");
	}
	@Test(groups = {"realme"})
	public void realme1()
	{
		System.out.println(" this is realme1 phone");
	}
	@Test(groups = {"realme"})
	public void realme2()
	{
		System.out.println(" this is realme2 phone");
	}
	

}
