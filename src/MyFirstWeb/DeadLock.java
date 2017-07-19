package MyFirstWeb;

public class DeadLock extends Thread {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		final String a = "satish";
		final String b = "kumar";
		Thread t = new Thread()
		{
		public void run()
		{
		
		synchronized(a)
		{
			System.out.println("resource a ins't availabl e ");
		
		try
		{
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(b)
		{
			System.out.println("resource a ins't available ");
			 }
		}	
			
		   }
		};
		
		Thread t1 = new Thread()
		{
		public void run()
		{
		
		synchronized(b)
		{
			System.out.println("resource a ins't availabl e ");
		
		try
		{
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(a)
		{
			System.out.println("resource a ins't available ");
			 }
			
		}	
		   }
		};
		
		t.start();
		t1.start();
		}

}
