package MyFirstWeb;

import java.util.*;
class std{
  int rollno;
  String name;
  int age;
 std(int rollno,String name,int age){
   this.rollno=rollno;
   this.name=name;
   this.age=age;
   
  }
@Override
public String toString() {
	return "std [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}
}

public class TestCollection3{
 public static void main(String args[]){
  
 std s1=new std(101,"Sonoo",23);
 std s2=new std(102,"Ravi",21);
 std s3=new std(103,"Hanumat",25);
    
  ArrayList<std> al=new ArrayList<std>();
  al.add(s1);
  al.add(s2);
  al.add(s3);
  
  Iterator<std> itr=al.iterator();
  while(itr.hasNext()){
	  System.out.println(itr.next());
//   std st=itr.next();
//    System.out.println(st.rollno+" "+st.name+" "+st.age);
  }
 }
}
