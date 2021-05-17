package INheritance;

public class A {
	static int a=10;
	 void m1() {
		 int a=100;
		System.out.println( a + this.a);
	}
	static void m2() {
		System.out.println("m2 at static a");
	}
	 int m1(int a) {
			System.out.println("m1 at a");
			return a;
		}
	 
}
