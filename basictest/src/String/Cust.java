package String;

public class Cust extends Thread {
	private int x;
	
	public Cust(int x) {
		this.x = x;
	}
	
	@Override
	public void run() {
		//System.out.println("thread name :"+getName());
		for (int i = 0; i <=x; i++) {
			System.out.println(getName()+":" +i);
			
		}
	}
	public static void main(String[] args) {
		Cust c=new Cust(5);
		c.start();
		Cust c1=new Cust(10);
		c1.start();
			for (int i = 10; i >=0; i--) {
				System.out.println("main :"+i);	
			}
			
	}
	

}
