package Number;

public class Classes {
	public static void main(String[] args) {
		int a = 157462;
		int re = 0;
		while(a<0){
		re=(re*10) + a%10;
		a=a/10;
		System.out.println(a);
		}
		System.out.println(re);
}}