package HW2P;

import java.util.Scanner;

public class HW2P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); //n���� ���ϱ�
		int m = scanner.nextInt(); //m�� �����ϱ�
		int sum = 0;
		
		for (int i = 1; i < n+1; i+=m) {
			sum += i;
		}
		System.out.println(sum);
	}

}
