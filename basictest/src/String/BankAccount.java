package String;

public class BankAccount extends Thread {
	
	private int Accno;
	private String AccName;
	private Double Balance;
	
	
	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String accName) {
		AccName = accName;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}
	

	public BankAccount(int accno, String accName, Double balance) {
		super();
		Accno = accno;
		AccName = accName;
		Balance = balance;
	}
	

	@Override
	public String toString() {
		return "BankAccount [Accno=" + Accno + ", AccName=" + AccName + ", Balance=" + Balance + "]";
	}

	public void Withdraw(Double amt) {
		this.Balance=this.Balance-amt;
	}
	
	public void Deposite(Double amt) {
		this.Balance=this.Balance+amt;
	}

	public void Currentlance() {
		System.out.println(Balance);;
	}
	
	
}
