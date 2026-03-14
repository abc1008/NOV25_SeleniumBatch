package pack1;

import org.testng.annotations.Test;

public class DataTest
{
	
	@Test(dataProvider = "TestData", dataProviderClass = DataReader.class)
	public void testCase1(String s1)
	{
		System.out.println(s1);
	}

}
