package HW01;

import java.util.Scanner;

public class HW01P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(a);
		for (int i = 0; i < a; i++) {
			System.out.print(fibo(i) + " " );
		}
		
	}
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n-2) + fibo(n-1);
		}

	}
}
