package MyFirstWeb;

import java.util.*;



public class EnumEx {
	enum days
	{
		sunday,monday,tues,wed,thurs,fri,sat
		};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<days> set = EnumSet.allOf(days.class);
		Set<days> set1 = EnumSet.allOf(days.class);  
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("week days are " +set);
		System.out.println("empty" +set2);
	}

}
