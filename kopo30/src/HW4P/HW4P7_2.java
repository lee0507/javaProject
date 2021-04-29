package HW4P;

import java.util.Scanner;

public class HW4P7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.print(rf1(n) + " = ");
		rf2(n);
	}
	
	public static int rf1(int N) {
		if (N == 1) {
			return 1;
		} else {
			return N * rf1(--N);
		}
	}
	
	public static int rf2(int N) {
		if (N == 1) {
			System.out.print(N);
			return 1;
		} else {
			System.out.print(N + " X ");
			return N * rf2(--N);
		}
	}
}
