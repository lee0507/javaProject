package HW2P;

import java.util.Scanner;

public class HW2P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i;
		int j;
		int k;
		int P;
		int t = 0;
		P = 2*N-1;
		System.out.println(N + "\n");
		
		for (i = 0; i < N; i++) {
			for (k = 0; k < t; k++) {
				System.out.print(" ");
			}
			for (j = 0; j < P; j++) {
				System.out.print("*");
			}
			for (k = 0; k < t; k++) {
				System.out.print(" ");
			}
			System.out.println();
			P-=2;
			t++;
		}
	}

}
