package HW2P;

import java.util.Scanner;

public class HW2P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i;
		int j;
		
		System.out.println(N + "\n");
		
		for (i = 0; i < N; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
