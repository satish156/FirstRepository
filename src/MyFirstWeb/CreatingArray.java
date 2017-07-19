package MyFirstWeb;

import java.math.BigInteger;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class CreatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("9223372036854775807");
		BigInteger b = new BigInteger("2");
		BigInteger c = a.multiply(b); // 9223372036854775807 * 2
		System.out.println(c);
		String a1 = "Welcome to hyderabad".replace("to", "from");
//		a1.replace("from", "to");
		System.out.println(a1);
		boolean b1 = "Java is fun".matches("Java.*");
		System.out.println(b1);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("sats","gun","kar","akhil"));
		System.out.println(list);
		//		for(String p:list){
//			System.out.println(p);
//		}
		ArrayList<Integer> in = new ArrayList<>(Arrays.asList(1,4,3,7,2,9,5));
		System.out.println(in);
		Collections.sort(in);
		System.out.println(in);
		long value = Long.MAX_VALUE -1;
		System.out.println(value);
		
	}

}
