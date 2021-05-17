package Sychronizedethod;

public class Start {
	
	public static void main(String[] args) {
		Numer1  n1= new Numer1();
		MyThread t1=new MyThread(n1, 10, 50);
		t1.start();
		MyThread t2=new MyThread(n1, 20, 60);
		t2.start();
		MyThread t4=new MyThread(n1, 30, 70);
		t4.start();
		MyThread t3=new MyThread(n1, 40, 80);
		t3.start();
		
		
	}

}
