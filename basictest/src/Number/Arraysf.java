package Number;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraysf {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("b");
		
		ArrayList al2= new ArrayList();
		al2.add("c");
		al2.add("d");
		
		al.add(al2);
		System.out.println(al);
		
	}

}
