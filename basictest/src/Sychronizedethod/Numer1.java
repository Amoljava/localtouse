package Sychronizedethod;

public class Numer1 {
	
	//private int x;
	//private int y;
	
	public Numer1() {
	}

	
	public synchronized int addition(int x, int y) {
		int z=x+y;
		System.out.println(z);
		return z;
	}

	

}
