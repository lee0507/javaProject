package HW4P;

import java.util.Scanner;

public class HW4P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.print(sumToOne(n) + " = ");
		
		for(int i = 0; i + 1 < n; i++) {
			System.out.print(n-i + " X ");
		}
		System.out.println(1);
	}
	
	public static int sumToOne(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * sumToOne(--number);
		}
	}

}
