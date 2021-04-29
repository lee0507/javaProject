package test1;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		n = 2;
		switch (n) {
			case 1:
				System.out.println("One!");
			case 2:
				System.out.println("Two!");
			default:
				System.out.println("Except 1, 2!");
			case 3:
				System.out.println("Three!");
		}
	}
}
