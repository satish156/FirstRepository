package MyFirstWeb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		try {
			FileInputStream in = new FileInputStream("E:\\test.txt");
			int i = in.read();
			System.out.println((char)i);
			
			int j =0;
			while((j = in.read()) != -1){
				System.out.print((char)j);
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
