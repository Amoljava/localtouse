package Number;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(123,"amol"));
		al.add(new Student(123,"amol"));
		al.add(new Student(123,"amol"));
		
		al.add(new Student(133,"aru"));
		al.add(new Student(143,"pooja"));
		al.add(new Student(163,"kiran"));
		al.add(new Student(153,"kiran"));
		al.add(new Student(153,"kiran"));
		System.out.println(al.size());
		System.out.println();
		remov(al);
	}
		public static void remov(ArrayList<Student> al){
			
			for (int i=0;i<al.size();i++){ 
				
				for(int j=i+1 ; j<al.size();j++) {
					int cont=0;
					Student a=(Student)al.get(i);
					Student b=(Student)al.get(j); 
					 if(a.equals(b)) { 
						 ++cont; 
						 }
					 System.out.println("same id "+(a)+cont);
					 }
				}
			}
}
					
			