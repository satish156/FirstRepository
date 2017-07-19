package MyFirstWeb;

import java.io.IOException;

class a{
	void msg() throws Exception{
		System.out.println("main");
	}
}
public class ExcptionEx extends a{
	void msg() throws Exception{
		System.out.println("child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		a obj = new ExcptionEx();
		obj.msg();
		}catch (Exception e) {}
			// TODO: handle exceptio

	}

}
