package MyFirstWeb;

import java.util.PriorityQueue;

public class queueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> que = new PriorityQueue<>();
		que.add("sats");
		que.add("raj");
		que.add("sai");
		que.add("ram");
		que.add("shiv");
		que.add("gun");
		que.add("kar");
		que.add("sat");
		for (String string : que) {
			System.out.println(string);
		}
		System.out.println("after crud");
		System.out.println(que.element());
		System.out.println(que.poll());
		System.out.println(que.peek());
		System.out.println(que.add("laxman"));
		
		
		

	}

}
