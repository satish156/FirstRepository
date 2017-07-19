package MyFirstWeb;



class Ab{
	Ab(){
		System.out.println("constructor");
	}
}
class B extends Ab{
	B(){
		super();
		System.out.println("b class constructor ");
	}
	{System.out.println("instance block");}
}
public class InstanceBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj= new B();
		
	}

}
