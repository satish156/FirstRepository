package MyFirstWeb;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Book1{
	int id;
	String name;
	double price;
	public Book1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book1 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class HAshMapEx {

	public static void main(String[] args) {
		HashMap<Integer, Book1> hm = new HashMap<>();
		// TODO Auto-generated method stub
		Book1 b = new Book1(1, "sats", 123);
		
		Book1 b2 = new Book1(2, "god", 435);
		Book1 b1 = new Book1(3,"love", 234);
		
		hm.put(1, b);
		hm.put(3, b1);
		hm.put(2, b2);
		System.out.println(hm);
		System.out.println("for each");
		for(Map.Entry<Integer, Book1> entry : hm.entrySet()){
			int key = entry.getKey();
			Book1 a = entry.getValue();
			System.out.println(key);
			System.out.println(a);
		}
		

	}

}
