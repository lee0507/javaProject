package HW2P;

import java.util.Scanner;

public class HW2P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(N + "\n");
		int i;
		
		for (i = 1; i < N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
