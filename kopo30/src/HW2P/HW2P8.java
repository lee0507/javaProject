package HW2P;

import java.util.Scanner;

public class HW2P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int i;
		int sum = 0;
		
		for (i = 1; i < a+1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
