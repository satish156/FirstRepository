package MyFirstWeb;

import java.util.*;  
class av{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<Integer> al=new TreeSet<Integer>();  
  al.add(2);  
  al.add(3);  
  al.add(33);  
  al.add(22);  
  //Traversing elements  
  Iterator<Integer> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
   
  }  
 
  System.out.println();
 }  
}  