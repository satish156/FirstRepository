package MyFirstWeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		ArrayList<Employee> obj = new ArrayList<Employee>();

		Employee emp1 = new Employee("karthik", 120, 1500);

		Employee emp2 = new Employee("Murali", 121, 2000);

		Employee emp3 = new Employee("Ravi", 122, 2500);
		

		obj.add(emp1);
		obj.add(emp2);
		obj.add(emp3);
		obj.add(new Employee("sats",23,60000));
		for (Employee i : obj){
			
			System.out.println(res(i));
		}
		
		}
	

	private static Object res(Employee i) {
		
		return i;
		
	}

	

}