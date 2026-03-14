package pack1;

import org.testng.annotations.DataProvider;

public class DataReader
{
	
	@DataProvider(name="TestData")
	public Object[] getData()
	{
		Object[] objArr = new Object[3];
		
		objArr[0] = "ABC";
		objArr[1] = "PQR";
		objArr[2] = "XYZ";
		
		return objArr;
	}

}
