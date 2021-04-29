package HW2P;

import java.util.Scanner;

public class newbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for (int j = 0; j < N; j++) {
			System.out.print("*");
			
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("*");
			}	
			for (int k = 0; k < N; k++) {
				System.out.print("*");
			}
			for (int l = 0; l < N; l++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}

}
