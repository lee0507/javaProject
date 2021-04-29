package HW05_1;

import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Menu1.showMenu();
		int n = scanner.nextInt();
		
		if (n == 1) {
			CourseList22.showCourse();
			CourseList22.addCourse();
		} else if (n == 2) {
			MyCourse22.showList();
		}
	}
	public static void showMenu() {
		System.out.println("Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
	}

}
