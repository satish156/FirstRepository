package MyFirstWeb;

import java.util.Scanner;

public class commandpromt {

	public static void main(String args[])  throws Exception{
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("enter name");
	String s = input.nextLine();
	if(s.equals(null)||s.equals(" ")){
		System.out.println("re enrer name");
		main(null);
	}
	else{
		System.out.println("enter name "+s);
		main(null);
	}
	}

}
