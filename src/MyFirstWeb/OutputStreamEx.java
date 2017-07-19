package MyFirstWeb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream out;
		try {
			out = new FileOutputStream("E:\\test.txt");
			String s = "welcome to my world";
			byte[] b =s.getBytes();
			out.write(b);
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
		

	}

}
