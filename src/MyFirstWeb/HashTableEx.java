package MyFirstWeb;

import java.util.Hashtable;

class fruit{
	String name;
	int price;
	public fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "fruit [name=" + name + ", price=" + price + "]";
	}
	
}
public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	fruit f = new fruit("apple", 10);
	fruit f1 = new fruit("banana", 12);
	Hashtable<Integer, fruit> ht = new Hashtable<>();
	ht.put(1, f1);
	ht.put(2, f);
	System.out.println(ht);

	}

}
