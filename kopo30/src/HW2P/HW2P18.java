package HW2P;

import java.util.Scanner;

public class HW2P18 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();      
		for(int i = 0; i <= N; i++) {
			make_prime(i);
		}
    
	}
	public static void make_prime(int number) {
 
		// 0 and 1 exit
		if(number < 2) {
			return;
		}
		
		// 2 is prime number
		if(number == 2) {
			System.out.println(number);
			return;
		}
		
        
		for(int i = 2; i < number; i++) {
        
			// �Ҽ��� �ƴҰ�� ����
			if(number % i == 0) {
				return;
			}
		}
		// �� �ݺ������� ����� ���� ���� �ʴ°�� �Ҽ���.
		System.out.println(number);
		return;
	}
 
 
}