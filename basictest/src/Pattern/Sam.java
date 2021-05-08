package Pattern;

import java.util.HashMap;
import java.util.HashSet;

import javax.jws.Oneway;

public class Sam {
	public static void main(String[] args) {
		HashSet<Ex> h1= new HashSet<Ex>();
		Ex x1= new Ex(5 , 6);
		Ex x2= new Ex(7 , 4);
		System.out.println("new : "+x1.hashCode());
		System.out.println(x2.hashCode());
		h1.add(new Ex(5 , 6));
		h1.add(new Ex(1 , 2));
		h1.add(new Ex(7 , 4));
		System.out.println(h1);
		
	}

}
