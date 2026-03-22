package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{
	public static String getProperty(String propertyName) throws IOException
	{
		String path = "D:\\TRAININGS\\NOV_25_BATCH\\NOV_25_GIT_LOCAL\\NOV25_SeleniumBatch\\BDDFramework\\src\\test\\resources\\Config.properties";
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file); // open file
		String propertyValue =prop.getProperty(propertyName);
		
		return propertyValue;
	}

}
