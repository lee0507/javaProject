package test1;

import java.util.Scanner;

public class scanner2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.print((a / 9) % 3);
		System.out.print((a / 3) % 3);
		System.out.print(a % 3);
	}
}
