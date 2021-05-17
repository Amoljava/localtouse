package Student;

import java.util.Comparator;

public class Mycom implements Comparator<stud> {

	@Override
	public int compare(stud o1, stud o2) {
		int DX=o1.getRoll()-o2.getRoll();
		if (DX==0) {
			DX=o1.getName().compareTo(o2.getName());
		}
		
		return DX;
	}
	

}
