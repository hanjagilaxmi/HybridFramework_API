package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_File {
	public static String fetch_data()
	{
	String value=null;
	try
	{
		Properties p=new Properties();
		p.load(new FileInputStream(".\\src\\test\\java\\utilities\\p.properties"));
		value = p.getProperty("baseuri");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return value;
	}
}
