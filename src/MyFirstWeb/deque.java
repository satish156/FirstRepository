package MyFirstWeb;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deq = new ArrayDeque<String>();
		//System.out.println(deq.add("sats"));
		deq.add("moon");
		deq.add("hit");
		deq.add("moon");
		deq.add("sun");
		deq.offer("hit");
		//System.out.println(deq.offer("raju"));
		deq.addLast("iundra");
		deq.addFirst("gun");
		//System.out.println(deq);
		System.out.println("thie is for foreach");
		for(String que : deq){
			if(que.contains("un")){
				System.out.println(que);
			}
		}

	}

}
