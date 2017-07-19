package MyFirstWeb;

import java.io.FileReader;
import java.util.Properties;

public class propertiesEx {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("db.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));

	}

}
