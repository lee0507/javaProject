package HW05;

import java.util.Scanner;

public class HW0509 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	String[] s = {"Korean", "Math", "English", "Social Studies", "Science"};
	String[] reg = new String[5];
	
	int i = 0;
	
	while (true) {
		int type = printMenu();
		if (type == 1) {
			while(true) {
				int course = courseList();
				if (course == 0) {
					break;
				}
				String str = registerCourse(s, course);
				reg[i] = str;
				i++;
			}
		} else if (type == 2) {
			while (true) {
				int a = myCourse(reg);
				if(a == 0) {
					break;
				}
			}
		}
	}

	}
	
	public static int printMenu() {
		System.out.println("#Menu");
		System.out.println("1. Course List");
		System.out.println("2. My course");
		System.out.print("-->");
		
		return scanner.nextInt();
	}
	
	public static int courseList() {
		System.out.println();
		System.out.println("#Course List");
		System.out.println("1. Korean");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to Main");
		System.out.print("-->");
		
		return scanner.nextInt();
	}
	
	public static String registerCourse(String[] s, int a) {
		System.out.println("\"" + s[a - 1] + "\" is registered.");
		return s[a - 1];
	}
	
	public static int myCourse(String[] s) {
		System.out.println();
		System.out.println("#My Course");
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				break;
			}
			System.out.println((i + 1) + ". " + s[i]);
		}
		System.out.println("- End -");
		System.out.println("--->");
		System.out.println();
		
		return scanner.nextInt();
	}

}
