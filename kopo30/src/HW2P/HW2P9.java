package HW2P;

import java.util.Scanner;

public class HW2P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); //n까지 더하기
		int m = scanner.nextInt(); //m씩 증가하기
		int sum = 0;
		
		for (int i = 1; i < n+1; i+=m) {
			sum += i;
		}
		System.out.println(sum);
	}

}
