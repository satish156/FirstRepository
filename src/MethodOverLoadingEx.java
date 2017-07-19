 class Adder{
	static int add(int a , int b){
		return a+b;
	}
	static int add(int a,int b,int c){
		return a+b+c;
	}
}
public class MethodOverLoadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("addition of two no's is " +Adder.add(2,3));
		System.out.println("addition of three no's is " +Adder.add(2,3,5));
		

	}

}
