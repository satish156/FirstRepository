package MyFirstWeb;

import java.util.TreeSet;

class Books implements Comparable<Books>{
	int id ;
	String name;
	double price;
	public Books(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Books o) {
		// TODO Auto-generated method stub
		if(id == o.id)
		return 0;
		else if(id > o.id)
			return -1;
		else
			return 1;
	}
	
}
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b = new Books(1, "sats", 129.0);
		Books b1 = new Books(3, "gun", 222.0);
		Books b2 = new Books(2, "raj", 233.0);
		TreeSet<Books> t = new TreeSet();
		t.add(b);
		t.add(b1);
		t.add(b2);
		for(Books s: t){
			System.out.println(s);
		}

	}

}
