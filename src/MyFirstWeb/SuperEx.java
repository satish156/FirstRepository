package MyFirstWeb;

class Animal{
	Animal(){
		System.out.println("new ant");
	}
}
class Dog extends Animal{
	
	Dog(){
	super();
		System.out.println("dog is eating");
	}
}
public class SuperEx extends Dog{

	public static void main(String[] args) {
		Dog obj = new Dog();
		
		
	}

}
