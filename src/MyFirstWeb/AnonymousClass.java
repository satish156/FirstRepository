package MyFirstWeb;
abstract class p{
	abstract void eat();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p obj = new p(){
			void eat(){
				System.out.println("eating");
			}
		};
		
	}

}
