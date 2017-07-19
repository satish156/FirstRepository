package MyFirstWeb;
class Car{
 void add(){	
	System.out.println("");
}
	}
	
public class InstanceOf extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car c = new InstanceOf(); 
       System.out.println(c instanceof InstanceOf);
	}

}
