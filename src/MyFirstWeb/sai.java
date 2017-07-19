package MyFirstWeb;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class sai {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter capacity ");
		int max_capacity = input.nextInt();
		while (true) {
			if (max_capacity > 0) {
				int available_space = max_capacity;
				System.out.println("available sapces are " + available_space);
				List<String> garage = new LinkedList<String>();
				System.out.println("enter your choice to park or leave ");
				String choice = input.next();
				if (choice.equals("p")) {
					garage.add("p");
					System.out.println("car is parking");
					max_capacity--;
					 
				} else if (choice.equals("l")) {
					garage.remove("p");
					System.out.println("car is leaving");
					max_capacity++;
					
				} else {
					System.out.println("eneter proper input");
				}
				
				available_space -= garage.size() - max_capacity;
				

			} else
			{
				System.out.println("you have to wait ,parking is full");
				break;
			}
			
		}

	}

}
