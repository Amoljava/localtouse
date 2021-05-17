package INheritance;

public class Stratup {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		A.m2();
		System.out.println(A.a);
		B b = new B();
		b.m1();
		B.m2();
		C c = new C();
		c.m1();
		C.m2();
		System.out.println();
		
		
		C ac = new C();
		ac.m1();
		ac.m4();
		
	}
	

}
