package HW4P;

import java.util.Scanner;

public class HW4P3 {
	public static final String Father = "John";
	public static final String Mother = "Kate";
	public static final String Son = "Michael";
	public static final String Daughter = "Sue";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW4P3 main = new HW4P3();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			main.showMenu();
			int i = scanner.nextInt();
			main.showName(i);
			System.out.println();
		}
	}
	public void showMenu() {
		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.print("-> ");
	}
	public void showName(int a) {
		if (a == 1) {
			System.out.println(Father);
		} else if (a == 2) {
			System.out.println(Mother);
		} else if (a == 3) {
			System.out.println(Son);
		} else if (a == 4) {
			System.out.println(Daughter);
		}
	}
}
