package Number;

public class Student01 extends Thread {
	
	@Override
	public void run() {
		System.out.println("amol ");
	}
	
	public static void main(String[] args) {
		Student01 s1=new Student01();
		s1.start();
		System.out.println("end");
	}

}
