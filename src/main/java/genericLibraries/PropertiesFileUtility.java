package genericLibraries;
												// 13-02-23
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesFileUtility {
	Properties property;

	public void propertyFileInitialization(String filepath) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		property = new Properties();

		try {
			property.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	/**
	 * This method return the data from properties file based on the key passed
	 * @param key
	 * @return
	 */
	
	
	public String fetchProperty(String key)
	{
		return property.getProperty(key);
	}
}
