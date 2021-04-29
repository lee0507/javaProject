package HW05_1;

import java.util.Scanner;

public class CourseList22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void showCourse() {

		// TODO Auto-generated method stub
		System.out.println("Course List");
		System.out.println("1. Korean");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to main");
		System.out.print("---> ");

	}
	public static void addCourse() {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
			if(i == 0) {
				Menu1.showMenu();
			} else if (i == 1) {
				System.out.println("Korean is registered!\n");
			} else if (i == 2) {
				System.out.println("Math is registered!\n");
			} else if (i == 3) {
				System.out.println("English is registered!\n");
			} else if (i == 4) {
				System.out.println("Social Studies is registered!\n");
			} else if (i == 5) {
				System.out.println("Science is registered!\n");
			} else {
				System.out.println("error\n");
			}
		}
		
	}

