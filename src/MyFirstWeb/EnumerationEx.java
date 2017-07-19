package MyFirstWeb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import com.sun.jmx.snmp.Enumerated;

public class EnumerationEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin1  = new FileInputStream("E:\\a.txt");
		FileInputStream fin2  = new FileInputStream("E:\\b.txt");
		FileInputStream fin3  = new FileInputStream("E:\\c.txt");
		FileInputStream fin4  = new FileInputStream("E:\\d.txt");
		
		Vector v = new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		Enumeration e = v.elements();
		SequenceInputStream bin = new SequenceInputStream(e);
		int j;
		while((j=bin.read()) != -1){
			System.out.print((char)j);
		}
		bin.close();
		fin1.close();
		fin2.close();
		fin3.close();
		fin4.close();
		

	}

}
