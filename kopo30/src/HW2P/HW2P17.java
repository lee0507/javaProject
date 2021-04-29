package HW2P;

import java.util.Scanner;

public class HW2P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int i = 0;
		
		if (N > M) {
			int P = N;
			while(i < N) {
				if (N % P == 0 && M % P == 0) {
				System.out.println("\n" + P);
				break;
				}
			i++;
			P--;
			}
		} else {
			int P = M;
			while(i < M) {
				if (N % P == 0 && M % P == 0) {
				System.out.println("\n" + P);
				break;
				}
			i++;
			P--;
			}
		}
	}
}
