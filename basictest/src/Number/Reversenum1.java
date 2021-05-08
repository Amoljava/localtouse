package Number;

public class Reversenum1{
	public static void main(String[] args) {
		int a=123456789;
		int result=0;
		while (a>0) {
			result=(result*10)+a%10;
			
			a=a/10;
			
		}
		System.out.println(result);
				}

}
