package HW4P;

import java.util.Scanner;

public class HW4P1 {
	// main 함수의 void는 return의 값이 비어있음. void 대신 int를 쓰면 return 값을 지정해야 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

			HW4P1 main = new HW4P1();
			while (true) {
				main.showMenu();
				int a = scanner.nextInt();
				main.addition(a);
				System.out.println("");
			}

		}
	public void addition(int familyMember) {
		if (familyMember == 1) {
			System.out.println("Bale");
		} else if (familyMember == 2) {
			System.out.println("Bruno");
		} else if (familyMember == 3) {
			System.out.println("Rooney");
		} else if (familyMember == 4) {
			System.out.println("Pogba");
		} else {
			System.out.println("Error");
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
	}

