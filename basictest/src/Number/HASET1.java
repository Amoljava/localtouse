package Number;

import java.util.HashSet;
import java.util.Set;

public class HASET1 {
	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		
		for (String aa:s) {
		
			System.out.println(aa);
		}
	}

}
