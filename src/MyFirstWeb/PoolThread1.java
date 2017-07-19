package MyFirstWeb;



import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkThreads implements Runnable{
	String message;

	public WorkThreads(String message) {
		super();
		this.message = message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName() +"start thread " +message);
	processmesseage();
	System.out.println(Thread.currentThread().getName() + "end thread");
	}
	private void processmesseage() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
public class PoolThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(5);
		for(int i =1;i<=10;i++){
			Runnable worker  = new WorkThreads(" " +i);
			service.execute(worker);
		}
		service.shutdown();
		while(!service.isTerminated()){
			
		}
		System.out.println("all thread r dead ");
	}

}
