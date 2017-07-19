package MyFirstWeb;

import java.util.StringTokenizer;



public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Checker.isPa("javaj"));
		StringTokenizer st = new StringTokenizer("welcome to java", " ");
		String av = "my world";
		String c = av.substring(1);
		System.out.println("abc "+c);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		  
	
		

	
	}

}
 class Checker{
	public static boolean isPa(String str){
		StringBuilder s = new StringBuilder(str);
		s.reverse();
		String s1 = s.toString();
		
		
		if(str.equals(s1))
			return true;
		else
			return false;
	}
}
