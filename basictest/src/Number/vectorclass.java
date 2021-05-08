package Number;

import java.util.Enumeration;
import java.util.Vector;

public class vectorclass  {
	
	public static void main(String[] args) {
		
		Vector<Student> v1= new Vector();
		/*
		 * v1.add(1); v1.add(2); v1.add("a"); v1.add("a"); v1.add('p'); v1.add(6.4);
		 * v1.add(null); v1.add(null);
		 */
		v1.add(new Student(123,"Amol"));
		v1.add(new Student(123,"Amol"));
		v1.add(new Student(123,"Amol"));
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println(v1.contains(new Student(123,"Amol")));
		System.out.println((new Student(123,"Amol").hashCode()));
		System.out.println((new Student(183,"Amol").hashCode()));
		System.out.println(v1.contains("s"));
		Enumeration<Student> e=v1.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
	
	}
	
	

}
