package HW4P;

import java.util.Scanner;

public class HW4P8 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printP();
	}
	
	public static int Permutation1(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * Permutation1(--number);
		}
	}
	
	public static int Permutation2(int n, int r) {
		int a = n - r;
		if (a == 1) {
			return 1;
		} else {
			return a * Permutation1(--a);
		}
	}
	
	public static void printP() {
		int n = scanner.nextInt();
		int r = scanner.nextInt();
		int a = Permutation1(n);
		int b = Permutation2(n, r);
		int c = a / b;
		System.out.print("P" + "(" + (n) + "," + (r) + ") = " + n + "! / (" + n + "-" + r +")! = (");
		for(int i = 0; i + 1 < n; i++) {
			System.out.print(n-i + " X ");
		} System.out.print(1 + ") / (");
		for(int i = 0; i + 1 < r; i++) {
			System.out.print(r-i + " X ");
		} System.out.println(1 + ") = " + a + " / " + b + " = " + c);
	}
}
