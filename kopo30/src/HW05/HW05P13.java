package HW05;

import java.util.Scanner;

public class HW05P13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();
		converterCm();

	}
	
	public static void showMenu() {

		System.out.println("# Unit");
		System.out.println("1. cm");
		System.out.println("2. m");
		System.out.println("3. mm");
		System.out.println("4. km");
		System.out.println("5. mile");

		
	}
	
	public static void converterCm() {
		Scanner scanner = new Scanner(System.in);
		double firstUnit = scanner.nextInt();
		double secondUnit = scanner.nextInt();
		double inputNum = scanner.nextInt();
		int c = 0;
		
		if (firstUnit == 1) {
			inputNum = inputNum;
		} else if (firstUnit == 2) {
			inputNum *= 100; 
		} else if (firstUnit == 3) {
			inputNum /= 10;
		} else if (firstUnit == 4) {
			inputNum *= 100000;
		} else if (firstUnit == 5) {
			inputNum *= 160934.4;
		} else {
			System.out.println("error");
		}
		
		if (secondUnit == 1) {
			inputNum = inputNum;	
		} else if (secondUnit == 2) {
			inputNum /= 100;
		} else if (firstUnit == 3) {
			inputNum *= 10;
		} else if (firstUnit == 4) {
			inputNum /= 100000;
		} else if (firstUnit == 5) {
			inputNum /= 160934.4;
		} else {
			System.out.println("error");
		}
		System.out.println(inputNum);
	}
}
