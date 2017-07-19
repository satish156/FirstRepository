package MyFirstWeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class ArrayEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("2","4","3","7","5","3","77","55","45","33"));
		for(int i =0; i<=arr.size();i++){
			if(arr.get(i).contains("3")){
			System.out.println(arr.get(i));
			}
	}
//		TreeSet<Integer> tree = new TreeSet<>();
//		tree.addAll(arr);
//		System.out.println(tree);
//		//System.exit(0);
	}

}
