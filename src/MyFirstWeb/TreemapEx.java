package MyFirstWeb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

class book{
	int id;
	String name;
	double price;
	public book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class TreemapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b = new book(1, "sats", 120);
		book b1 = new book(3, "gun", 230);
		book b2 = new book(2, "rAJ", 123);
		book b3 = new book(4,"ros", 100);
		Map<Integer,book> map = new HashMap<Integer, book>();
		map.put(1, b);
		map.put(3, b2);
		map.put(4, b3);
		map.put(2, b1);
		System.out.println("hashmap");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, book> pair = (Entry<Integer, book>) itr.next();
			System.out.println("keys " +pair.getKey());
			System.out.println("values " +pair.getValue());
		}
		System.out.println(map);
		System.out.println("==============================================");
		System.out.println("treemap");
		SortedMap<Integer, book> sm = (SortedMap<Integer, book>) new TreeMap();
		
		sm.put(1, b);
		sm.put(3, b2);
		sm.put(4, b3);
		sm.put(2, b1);
		
//		sm.put(2, b1);
//		sm.put(1, b2);
//		sm.put(3, b);
//		sm.put(4, b3);
		for(Map.Entry<Integer, book> entry:sm.entrySet()){
			int key = entry.getKey();
			book value = entry.getValue();
			System.out.println("keys " +key + "value "+value);
		}
		LinkedHashMap<Integer, book> lm = new LinkedHashMap<>();
//		lm.put(1, b3);
//		lm.put(3, b);
//		lm.put(2, b1);
//		lm.put(3, b2);
		lm.put(1, b);
		lm.put(3, b2);
		lm.put(4, b3);
		lm.put(2, b1);
		System.out.println("========================================");
		System.out.println("linkedhashlist");
		for(Map.Entry<Integer, book> entry1 : lm.entrySet()){
			int keys = entry1.getKey();
			book values = entry1.getValue();
			System.out.println("keys " +keys + "values " +values);
		}
	}

}
