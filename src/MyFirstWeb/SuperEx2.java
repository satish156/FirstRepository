package MyFirstWeb;

class Student{
	int id;
	String name;
	public Student(final int id, String name) {
		super();
		this.id = id + id ;
		this.name = name;
		
	}
	
}
class Person extends Student{
	int phone;

	public Person(int id, String name , int phone) {
		super(id, name);
		this.phone = phone;
			}
	void display(){
		System.out.println("details of a student is id  :" + id + ", name : " + name + ", phone no : " +phone);
	}
}
public class SuperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person(1,"satish" , 12389043);
		Person obj1 = new Person(2,"satish" , 12389043);
		obj.display();

	}

}
