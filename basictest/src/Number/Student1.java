package Number;

public class Student1 {
	private String name;

	public Student1(String name) {
		
	}

	public Student1() {
		super();
		this.name = name;
	}

	public void m1() {
		System.out.println();
		super.hashCode();
	}
	

	@Override
	public String toString() {
		return "Student1 [name=" + name + "]";
	}

	public static void main(String[] args) {
		Student1 s1= new Student1("Aol");
		System.out.println(s1);
		s1.name="Amol";
		System.out.println(s1.toString());
	}

}
