package MyFirstWeb;

public class maths {
	public int i;
	public int j;
	public int k;

	public void mul() {
		// TODO Auto-generated method stub
		k = i * j;

	}

	public void sub() {
		// TODO Auto-generated method stub
		k = i - j;
	}

	public void add() {
		// TODO Auto-generated method stub
		k = i + j;
	}

	void cal(int i, int j) {
		k = i * j;
		k = i + j;
		k = i - j;
		this.add();
		this.sub();
	}

}
