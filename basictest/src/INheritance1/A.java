package INheritance1;

public class A {

	Object m1() {
		System.out.println("a m1");
		return null;
	}
	
	void m2() {
		System.out.println("a m2");
	}
	void m3() {
		System.out.println("a m3");
		m1();
	}
}
