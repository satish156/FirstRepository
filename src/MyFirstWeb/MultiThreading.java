package MyFirstWeb;

public class MultiThreading extends Thread{
	public void run(){
		for(int i = 0;i<5;i++){
			try{Thread.sleep(500);}catch(Exception e){
				System.out.println(e);
				
				
			}
			
			System.out.println("thread is executing " +i );
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading obj = new MultiThreading();
		MultiThreading obj1 = new MultiThreading();
		obj.start();
		obj1.start();
		System.out.println(Thread.currentThread().getId());

	}

}
