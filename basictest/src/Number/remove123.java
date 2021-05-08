package Number;

import java.util.Collection;
import java.util.Vector;

public class remove123 {
	
	public static void main(String[] args) {
		Collection<Integer> v1= new Vector<Integer>();
		v1.add(1);
		v1.add(4);
		v1.add(4);
		v1.add(7);
		v1.add(9);
		
		Vector<Integer> v2= new Vector<Integer>();
		v2.add(1);
		v2.add(4);
		System.out.println(v1);
		v1.remove(4);
		System.out.println(v1);
		
	}
	

}
