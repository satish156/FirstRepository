package MyFirstWeb;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.concurrent.Worker;
class workThread implements Runnable{
	String s;
	
	public workThread(String s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName() + "start message " +s);
	processs();
	System.out.println(Thread.currentThread().getName() + "end ");
	}


	private void processs() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class PoolThread {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ser = Executors.newFixedThreadPool(5);
		for(int i =1;i<=10;i++){
			Runnable work = new workThread(" " +i );
			ser.execute(work);
		}
		ser.shutdown();
		while(!ser.isTerminated()){
			
		}
		System.out.println("fnished all threads");
	}



	
}
