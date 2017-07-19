package MyFirstWeb;

interface Anima {
	   void eat();
	   public void walk();
	   void color();
	
}
abstract class Bc implements Anima{
	public void eat(){
		System.out.println("animal can eat food");
	}
	 
}
class C extends Bc{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("animals can walk and run");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("animals can have diffrent in colrs");
	}
	
}



public class InterfaceAbsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Anima obj = new C();
		obj.walk();
		obj.color();
		obj.eat();
	}

}
