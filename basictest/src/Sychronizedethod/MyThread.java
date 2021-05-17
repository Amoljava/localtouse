package Sychronizedethod;
 
public class MyThread extends Thread {
	
	private Numer1 nm;
	private int x,y;

	public MyThread(Numer1 nm, int x, int y) {
		
			this.nm = nm;
			this.x = x;
			this.y = y;
			try {
				Thread.sleep(500);;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}


	@Override
	public void run(){
			nm.addition(x,y);
	
	}
}
