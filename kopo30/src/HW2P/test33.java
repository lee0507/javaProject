package HW2P;

import java.util.Scanner;

public class test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int C = 1;
		System.out.println(N);
		
		while (true) {
			int M = (int)(Math.random() * 20);
			System.out.println(C + "-" + M);
			if (N == M) {
				System.out.println("Number of trials : " + C);
				break;
			}
			C++;
		}
	}
}

