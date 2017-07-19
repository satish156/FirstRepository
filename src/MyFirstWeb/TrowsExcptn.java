package MyFirstWeb;


public class TrowsExcptn {

	static void vote(int a){
		if(a<18){
			throw new ArithmeticException("not valid");
		}
		else
			System.out.println("you are eligible to vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vote(23);
		System.out.println("voted succesfully");
		FinalizeExample f1=new FinalizeExample();  
		FinalizeExample f2=new FinalizeExample();  
		f1=null;  
		f2=null;  
		System.gc();
		
	}

}
class FinalizeExample{  
public void finalize(){System.out.println("finalize called");}  
public static void main(String[] args){  
  
}}