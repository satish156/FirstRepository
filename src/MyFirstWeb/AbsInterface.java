package MyFirstWeb;
interface Inter{
	void a();
	void b();
	void c();
	void d();
}
abstract class abs implements Inter{
	public void a(){
		System.out.println("i am a");
	}
	public void b(){
		System.out.println("i am b");
	}
	
}
class ad extends abs{
	public void c(){
		System.out.println("i am c");
	}
	public void d(){
		System.out.println("i am d");
	}
	
}
public class AbsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter obj = new ad();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}

}
