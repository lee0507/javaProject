package HW07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashSet<String> A2 = new HashSet<String>();
		ArrayList<String> B2 = new ArrayList<String>();
		int cnt = 0;
		String A = scanner.nextLine();
		String B = scanner.nextLine();
		System.out.println("1. Size of the first word");
		System.out.println("2. Size of the second word");
		System.out.println("3. Number of the same characters");

		String[] A1 = A.split("");
		String[] B1 = B.split("");
		
		for(int i = 0; i < A1.length; i++) {
			A2.add(A1[i]);
			A2.add(B1[i]);
		}
		for(int i = 0; i < A1.length; i++) {
			B2.add(A1[i]);
			B2.add(B1[i]);
		}
		System.out.println(B2);
		System.out.println(A2);
		int C2 = Math.abs(B2.size() - A2.size());
		
		System.out.println("1 : " + A1.length);
		System.out.println("2 : " + B1.length);
		System.out.println("3 : " + C2);
		
	}
}
