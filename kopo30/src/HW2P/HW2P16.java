package HW2P;

import java.util.Scanner;

public class HW2P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int i = 0;
		int P = N;
		int K;
		int lcm = 0;
		
		if (N > M) {
			for(i = 0; i < N; i++) {
				if (N % P == 0 && M % P == 0) {
				break;
				}
			P--;
			}
			lcm = N * M / P;
			System.out.println("\n" + lcm);
		} else {
			for(i = 0; i < N; i++) {
				if (N % P == 0 && M % P == 0) {
				break;
				}
			P--;
			}
			lcm = N * M / P;
			System.out.println("\n" + lcm);
		}
	}
}
