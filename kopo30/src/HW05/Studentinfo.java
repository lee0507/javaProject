package HW05;

public class Studentinfo {
	String name;
	int korean;
	int english;
	int math;
		
	public Studentinfo() {
		this("default", 0, 0, 0);
	}
		
	public Studentinfo(String name, int korean, int english, int math)  {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;	
	}
		
	public String printStudentinfo() {
		String ret ="";
		ret = name + ", " + korean + ", " + english + ", " + math;
		return ret;
	}
}

