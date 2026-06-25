package learnJava;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class FileHandling 
{
	
	public static void read_propfile() throws Exception
	{
		FileReader fr = new FileReader("./testdata/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("browsername"));
		System.out.println(prop.get("url"));
	}
	
	

	public static void read_textfile() throws Exception
	{
		//File f = new File("C:\\TestData\\data.txt"); //file connection
		
		File f = new File("./testdata/data.txt"); //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
	
		read_propfile();
		
	}
	
	
}
