package Student;

public class stud {
	
	private int Roll;
	private String Name;
	private String Addrss;
	
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddrss() {
		return Addrss;
	}
	public void setAddrss(String addrss) {
		Addrss = addrss;
	}
	@Override
	public String toString() {
		return "\n stud [Roll=" + Roll + ", Name=" + Name + ", Addrss=" + Addrss + "]";
	}
	public stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public stud(int roll, String name, String addrss) {
		super();
		Roll = roll;
		Name = name;
		Addrss = addrss;
	}
	@Override
	public int hashCode() {
		
		return Roll;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		stud other = (stud) obj;
		if (Addrss == null) {
			if (other.Addrss != null)
				return false;
		} else if (!Addrss.equals(other.Addrss))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Roll != other.Roll)
			return false;
		return true;
	}
	
}
