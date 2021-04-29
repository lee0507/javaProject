package test1;

import java.util.Scanner;

public class javatest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A= scanner.nextInt();
		int N = scanner.nextInt();
		int M = scanner.nextInt();
//		float B;
//		float C;	
//		B = A / N;
//		C = A / M;
		
		System.out.println(A);
		System.out.println(N);
		System.out.println(M);
		
//		System.out.println(B);
//		System.out.println(C);
		
//		틀린 정답
//		if (B == M && C == N) {
//			System.out.println("Divisible by " + N + " and " + M + "!");
//		} else {
//			System.out.println("NOT divisible by " + N + " and " + M + "!");
//		}
		
//		정답
		if (A % M == 0 && A % N == 0) {
			System.out.println("Divisible by " + N + " and " + M + "!");
		} else {
			System.out.println("NOT divisible by " + N + " and " + M + "!");
		}
	}

}
