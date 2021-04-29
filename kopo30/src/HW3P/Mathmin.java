package HW3P;

import java.util.Scanner;

public class Mathmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (N < M) {
			System.out.println(N);
		} else
		System.out.println(M);
		}

	}
