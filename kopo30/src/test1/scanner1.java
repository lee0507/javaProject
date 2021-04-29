package test1;

import java.util.Scanner;

public class scanner1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a-b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("10000 - " + c / 10000);
		System.out.println("5000 - " + c % 10000 / 5000);
		System.out.println("1000 - " + c % 5000 / 1000);
		System.out.println("500 - " + c % 1000 / 500);
		System.out.println("100 - " + c % 500 / 100);
		System.out.println("50 - " + c % 100 / 50);
		System.out.println("10 - " + c % 50 / 10);
		System.out.println("1 - " + c % 50 % 10);
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		
		

		
	}
}
