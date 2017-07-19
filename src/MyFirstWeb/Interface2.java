package MyFirstWeb;
interface Bomma {
	void area();
}
interface Draw extends Bomma{
	void shape();
	void color();
}
class Circle implements Draw,Bomma{
   public void shape(){
	   System.out.println("shape of circle");
   }
   public void color(){
	   System.out.println("color of circle");
   }
@Override
public void area() {
	// TODO Auto-generated method stub
	System.out.println("area of circle");
}
}
class Rectangle implements Draw{
	public void color(){
		System.out.println("color of rectangle");
	}
	public void shape(){
		System.out.println("shape of rectangle ");
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw obj = new Circle();
		Draw obj1  = new Rectangle();
		obj.color();
		obj.shape();
		obj.area();
		obj1.shape();
	}

}
