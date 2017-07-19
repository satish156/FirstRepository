package MyFirstWeb;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter the input");
		String ip1 = null;
		while(ip1.equals("end")){
			ip1 = input.nextLine();

		System.out.println("welcome to " + ip1);
		int length = ip1.length();
		System.out.println(length);
		
		}
		}

}
