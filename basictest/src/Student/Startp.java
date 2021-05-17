package Student;

import java.util.ArrayList;
import java.util.Collection;

public class Startp {
	
	public static void main(String[] args) {
		ArrayList<stud> al= new ArrayList<stud>();
		stud s1= new stud(121, "Amol", "satara");
		stud s2= new stud(121, "Amol", "atara");
		stud s3= new stud(125, "Amo", "stara");
		stud s4= new stud(126, "Aol", "saara");
		stud s5= new stud(127, "mol", "sataa");
		
		al.add(s4);
		al.add(s2);
		al.add(s5);
		al.add(s1);
		
		al.sort(new Mycom());
		System.out.println(al);
	}

}
