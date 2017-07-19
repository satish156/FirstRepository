package MyFirstWeb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class ByteOpEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fo1 = new FileOutputStream("E:\\1.txt");
		FileOutputStream fo2 = new FileOutputStream("E:\\2.txt");
		
		ByteOutputStream bout = new ByteOutputStream();
		String s  = "hello satish";
		byte[] b = s.getBytes();
		bout.write(b);
		bout.writeTo(fo1);
		bout.writeTo(fo2);
	
		bout.close();
		fo1.close();
		fo2.close();
		System.out.println("success");
		
		
		FileOutputStream f1 = new FileOutputStream("E:\\love.txt");
		FilterOutputStream f = new FilterOutputStream(f1);
		String s1 = " welcom back to india";
		byte[] b1 = s1.getBytes();
		f.write(b1);
		System.out.println("sucess1");

	}

}
