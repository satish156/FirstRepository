package MyFirstWeb;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "sats");
		hm.put(2, "gun");
		hm.put(3, "raj");
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		System.out.println(hm.clone());
		System.out.println(hm.size());
		Set<Integer> a = hm.keySet();
		String  b = hm.get("sats");
		System.out.println("key is " +b);
		System.out.println(a);
		System.out.println(hm.containsKey(1));
		hm.remove(2);
		
		
		System.out.println("-----------------------------------------");
		for(Map.Entry<Integer, String> entry : hm.entrySet()){
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
	}

}
