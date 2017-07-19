package MyFirstWeb;
class Customer{
	double amount =10000;
	synchronized void withdraw(double amount){
		System.out.println("you going to withdraw amount is  " + amount);
		
		if(this.amount< amount){
		System.out.println("sorry less balance deposit more ");
		try {wait();} catch (Exception e) {}
		}
		
		this.amount -=  amount;
		System.out.println("withdrawl amount " +amount);
	}
	synchronized void deposit(double amount){
		System.out.println("you going to deposit money " +amount);
		
		this.amount += amount;
		System.out.println("new amount " + (this.amount));
		notify();
	}
}
public class InnerCommn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer obj  = new Customer();
		
		Thread t = new Thread(){
			public void run(){
			obj.withdraw(11000);
			}
		};
		 Thread t1 =  new Thread(){
				public void run(){
				obj.deposit(6000);
				}
				};
		 t.start();
		 t1.start();
	}

}
