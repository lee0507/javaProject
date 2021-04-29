package HW4P;

import java.util.Scanner;

public class HW4P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Multiplication(N);
	}
	public static void Multiplication(int a) {
		int i;
		int j;
		
		if (a > 1 && a < 10) {
			for (i = a; i < 10; i++) {
				for (j = 2; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + (i * j));
				}
			System.out.println("\n");
			}
		}
	}
}
