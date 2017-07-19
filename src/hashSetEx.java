

import java.util.LinkedHashSet;

class Book {
	int id;
	String name,author;
	double price;
	public Book(int id, String name, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
//	@Override
//	public int compareTo(Book o) {
//		// TODO Auto-generated method stub
//		if(id == o.id)
//		
//		return 0;
//		else if(id > o.id)
//			return 1;
//		else
//			return -1;
//	}
}

public class hashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b= new Book(1, "love", "sats", 100);
		Book b1 = new Book(4,"study", "gun", 200);
		Book b2 = new Book(3, "horror", "raj", 150);
		LinkedHashSet<Book> hs =  new LinkedHashSet<Book>();
		hs.add(b);
		hs.add(b1);
		hs.add(b2);
	//ava.util.Collections.sort(hs);
		System.out.println(hs);
		

	}

}
