package MyFirstWeb;

class Table{
	synchronized void print(int n){
		for(int i =1;i<5;i++){
			System.out.println(n*i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}
class Table1 extends Thread{
	Table t;

	public Table1(Table t) {
		super();
		this.t = t;
	}
	public void run(){
		t.print(5);
	}
	
}
class Table2 extends Thread{
	Table t;

	public Table2(Table t) {
		super();
		this.t = t;
	}
	public void run(){
		t.print(4);
	}
}
public class SynchronizationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		Table1 t1 = new Table1(obj);
		Table2 t2 = new Table2(obj);
		t1.start();
		t2.start();
	}

}
