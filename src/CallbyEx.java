class Add{
	int num = 100;
	void sum(int num){
		num = num +100;
	}
	void sum(Add obj){
		num = num+120;
	}
}
public class CallbyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj = new Add();
		
		System.out.println(obj.num);
		obj.sum(300);
		System.out.println(obj.num);
		System.out.println(obj.num);
		obj.sum(obj);
		System.out.println(obj.num);
		
	}

}
