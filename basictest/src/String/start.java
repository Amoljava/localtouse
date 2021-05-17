package String;

public class start {
	
	
	public static void main(String[] args) throws InterruptedException {
		BankAccount acc5=new BankAccount(123, "amol", 50000.00);
		BankAccount acc6=new BankAccount(456, "arun", 25000.00);
		BankAccount acc7=new BankAccount(789, "pooja", 70000.00);
		
		System.out.println(acc5);
		System.out.println(acc6);
		System.out.println(acc7);
		
		DepositeMythread d1=new DepositeMythread(acc5, 1000.00);
		DepositeMythread d2=new DepositeMythread(acc6, 2000.00);
		WithdrawMythread d3=new WithdrawMythread(acc7, 3000.00);
		
		d1.start();
		d2.start();
		d3.start();
		
		Thread.sleep(5000);
	
		System.out.println();
		System.out.println(acc5);
		System.out.println(acc6);
		System.out.println(acc7);

	}

}
