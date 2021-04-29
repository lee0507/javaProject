package HW2P;

import java.util.Scanner;

public class HW2P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int P = N;
		int t = 0;
		int c = 0;
		System.out.println(N + "\n");
		
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < P-1; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= 0; k++) {
				System.out.print("*");
			}
			
			for (int k = 0; k <= t-2; k++) {
				System.out.print(" ");
			}
			
			if (i == 0) {
				System.out.print(" ");
			} else {
				for (int k = 0; k <= 0; k++) {
					System.out.print("*");
				}
			}
			
			for (int j = 0; j < P-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
			P--;
			t+=2;

		}
		for (int k = 0; k < 2*(N)-1; k++) {
			System.out.print("*");
		}
	}

}
