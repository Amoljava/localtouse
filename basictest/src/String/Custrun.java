package String;

public class Custrun implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i < 20; i++) {
		System.out.println("run   :"+getClass()  +i);	
		}
	}
	
	public static void main(String[] args) {
		Custrun c=new Custrun();
		Thread t1=new Thread(c);
		t1.start();
		for (int i = 1; i < 10; i++) {
			System.out.println("main   :"  +i);
		}
	}

}
