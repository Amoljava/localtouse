package INheritance;

public class C extends B {
	int c=30;
	void m1() { 
		int a=30;
		  System.out.println("m1 at c"+a); 
	  }
	 
	static void m2() {
		System.out.println("m2 at static c");
	}
	void m3() {
		System.out.println("m3 at c");
	}
}
