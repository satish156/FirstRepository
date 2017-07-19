package MyFirstWeb;

class sup{
	void display(){
		System.out.println("display something");
	}
}
class sup1 extends sup{
	void display(int i){
		super.display();
		System.out.println("sup1 display");
	}
}
public class SuperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sup1 s = new sup1();
	
		s.display(1);
	}

}
