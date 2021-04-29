package HW2P;

import java.util.Scanner;

public class HW2P12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i;
		int j;
		int k;
		int P = N;
		System.out.println(N + "\n");
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < P-1; j++) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			P--;
		}
	}

}
