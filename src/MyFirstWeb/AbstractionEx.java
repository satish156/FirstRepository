package MyFirstWeb;
abstract class bank{
	bank(){
		System.out.println("abstract");
	}
	abstract int getInterest();
}
class sbi extends bank{

	@Override
	int getInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	
}
class axis extends bank{

	@Override
	int getInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
public class AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank obj = new sbi();
		bank obj1 = new axis();
		System.out.println(obj.getInterest());
		System.out.println(obj1.getInterest());
	}

}
