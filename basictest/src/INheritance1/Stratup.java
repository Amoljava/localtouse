package INheritance1;

public class Stratup {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		System.out.println();
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		System.out.println();
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println();
		A Bc = new B();
		Bc.m1();
		Bc.m2();
		Bc.m3();
		System.out.println();
		A cc = new C();
		cc.m1();
		cc.m2();
		cc.m3();
		
	}
	

}
