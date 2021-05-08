package Number;

import java.util.ArrayList;

public class Arrayasd {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		add("s",al1);
		add("e",al1);
		add("a",al1);
		add("b",al1);
		add("a",al1);
		add("s",al1);
		add("null",al1);
		add("null",al1);
		System.out.println(al1);
		
	}
	
	  static void add(String s, ArrayList<String> al) { 
		  if(!al.contains(s))
		  al.add(s); } 

}
/*
 * { public static void du(ArrayList<Student> al) { for (int
 * i=0;i<al.size();i++){ Object a=al.get(i); for(int j=i+1 ; j< al.size();j++) {
 * Object b=al.get(j); if(a==b) { System.out.println("same id "+(b)); }else {
 * System.out.println("different obj"+b); }} }}} int inde = al.indexOf(new
 * Student(143,"pooja")); if (inde > 0 ) { Student s1=(Student)al.get(inde);
 * s1.setName("khu"); s1.setSID(258); al.toString();
 * System.out.println(al.toString());
 * 
 * }} }
 */