package HW07;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt(); // first input number
		int[] B = new int[A];
		
		for (int i = 0; i < A; i++) {
			B[i] = scanner.nextInt();
		}
		
		if (A == B.length) {
			Arrays.sort(B);
			for (int i = 0; i < B.length; i++) {
				System.out.print(B[i] + " ");
			}
		} else if (A > B.length && A < B.length){
			System.out.println("error");
		} else {
			
		}
		

	}

}
