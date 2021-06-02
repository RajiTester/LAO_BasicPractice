package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizedclass {
	
	@Test
	@Parameters("Name")
	public void para(String name)
	{
		System.out.println(" my name is:"+name);
	}

}
