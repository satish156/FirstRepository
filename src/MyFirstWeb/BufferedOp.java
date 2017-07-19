package MyFirstWeb;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOp {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("E:\\test.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "this is going to be wonder";
		byte[] b = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("auccess");
	}

}
