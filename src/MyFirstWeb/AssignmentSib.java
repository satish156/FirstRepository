package MyFirstWeb;

import java.util.Scanner;

public class AssignmentSib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        while (name.equals(name)){
            System.out.println("enter your name " +name);
            System.out.print("enter your name ");
            name = input.nextLine();
            if(name.equals("exit"))
                break;
        }
        input.close();
        System.out.println("you are out");
	}

}
