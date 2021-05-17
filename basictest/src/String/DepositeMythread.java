package String;

public class DepositeMythread extends Thread {
	
	private BankAccount acc;
	private Double amt;

	
	public DepositeMythread(BankAccount acc, Double amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}


	@Override
	public void run() {
		acc.Deposite(amt);
	}

}
