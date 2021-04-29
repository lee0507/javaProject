package HW3P;

import java.util.Date;
import java.util.Scanner;

public class HW3P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Current Converter");
			System.out.println("1. South Korean won -> United States Dollar");
			System.out.println("2. United States Dollar -> South Korean won");
			System.out.println("3. Europe Euro -> South Korean won");
			System.out.println("4. South Korean won -> Europe Euro");
			int n = scanner.nextInt();
			float a = scanner.nextFloat();
			
			if (n == 1) {
				a = (float) (a / 1123.9);
				System.out.printf("%.2f",a);
			} else if (n == 2) {
				a = (float) (a * 1123.9);
				System.out.printf("%.2f",a);
			} else if (n == 3) {
				a = (float)(a * 1342.3);
				System.out.printf("%.2f",a);
			} else if (n == 4) {
				a = (float)(a / 1342.3);
				System.out.printf("%.2f",a);
			}
		}
	}

}
