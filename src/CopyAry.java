
public class CopyAry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] cf = {'a','b','s','a','t','i','s','h'};
		char[] ct=new char[7];
		System.arraycopy(cf,2 ,ct ,0, 6);
		System.out.println(new String(ct ));

	}

}
