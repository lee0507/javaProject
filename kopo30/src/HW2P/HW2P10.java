package HW2P;

import java.util.Scanner;

public class HW2P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
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
