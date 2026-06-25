package org.wipro.automation.utilities;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropFiles
{

	public static String read_config_file(String key) throws Exception
	{
		FileReader fr = new FileReader("./testdata/config.properties");
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
	public static String read_element_file(String key) throws Exception
	{
		FileReader fr = new FileReader("./testdata/element.properties");
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
}
