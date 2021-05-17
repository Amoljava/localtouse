package INheritance;

public class B extends A {
	int b=20;
	void m1() {
		int a=20;
		System.out.println("m1 at b"+a);
	}
	static void m2() {
		System.out.println("m2 at static b");
	}
	void m3() {
		System.out.println("m3 at b");
	}
	
	static void m4() {
		System.out.println("m4 at static b");
	}
}
