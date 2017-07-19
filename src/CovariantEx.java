class Co{
	Co a(){
		return this;
	}
}
public class CovariantEx extends Co {
	CovariantEx a(){
		return this;
	}
	void b(){
		System.out.println("this is covarient");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CovariantEx().a().b();
		

	}

}
