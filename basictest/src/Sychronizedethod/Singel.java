package Sychronizedethod;

 class Singel1 {
	private int x,y;
	
	public synchronized void add(int x, int y) {
		this.x = x;
		this.y = y;
		int z=this.x+this.y;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(z);
	}}
class amol extends Thread{
	private Singel1 s;
	
	public amol(Singel1 s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.add(10, 20);
	}
}
class amol1 extends Thread{
	private Singel1 s;
	
	public amol1(Singel1 s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.add(20, 20);
	}
}
public  class Singel{
	public static void main(String[] args) {
		Singel1 s1=new Singel1();
		amol a1=new amol(s1);
		amol1 a2=new amol1(s1);
		a1.start();
		a2.start();
	}
}