package MyFirstWeb;

public class NewThreadGroup implements Runnable{
	@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThreadGroup group = new NewThreadGroup();
		ThreadGroup tg1 = new ThreadGroup("parent thread group");
		Thread t1 = new Thread (tg1,group,"one");
		t1.start();
		Thread t3 = new Thread (tg1,group,"three");
		t3.start();
		Thread t2 = new Thread (tg1,group,"two");
		t2.start();
		System.out.println("group thread name " +tg1.getName());
		tg1.list();
		

	}

}
