package HW4P;

import java.util.Scanner;

public class HW4P8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = n - m;

		System.out.print("P(" + n + "," + m + ") = " + n + "! / (");
		System.out.print(n + " - " + m + ")! = (");
		rf2(n);
		System.out.print(") / (");
		rf2(a);
		System.out.print(") = " + rf1(n) + " / " + rf1(a) + " = " + rf1(n) / rf1(a));
	}
	
	public static int rf1(int N) {
		if (N == 1) {
			return 1;
		} else {
			return N * rf1(--N);
		}
	}
	
	public static int rf2(int M) {
		if (M == 1) {
			System.out.print(M);
			return 1;
		} else {
			System.out.print(M + " X ");
			return M * rf2(--M);
		}
	}
}
