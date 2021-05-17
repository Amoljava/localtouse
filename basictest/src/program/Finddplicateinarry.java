package program;

public class Finddplicateinarry {
	
	public static void main(String[] args) {
		int[] a= {1,2,2,3,5,7,4,1,5,6,8,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i!=j)) {
					System.out.println(a[j]);
					
				}
			}
			
		}
		
	}

}
