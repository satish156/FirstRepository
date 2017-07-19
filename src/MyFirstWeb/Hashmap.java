package MyFirstWeb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "sats");
		map.put(2, "sandy");
		map.put(3, "gun");
		map.put(4, "raj");
		map.put(5, "msd");
		map.put(6, "abd");
		System.out.println(map);
//		Set<Entry<Integer, String>> set = map.entrySet();
//		Iterator<Entry<Integer, String>> itr = set.iterator();
//		while(itr.hasNext()){
//			Map.Entry entry = itr.next();
//			System.out.println( entry.getKey() + " " +entry.getValue());
//		}
	for(Map.Entry<Integer, String> entry1 : map.entrySet()){
		System.out.println(entry1);
	}
	}

}
