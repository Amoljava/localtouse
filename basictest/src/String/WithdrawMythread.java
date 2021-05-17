package String;

public class WithdrawMythread extends Thread {
	
	private BankAccount acc;
	private Double amt;

	
	public WithdrawMythread(BankAccount acc, Double amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}


	@Override
	public void run() {
		acc.Withdraw(amt);
	}

}
