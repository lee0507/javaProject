package HW08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class P13 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		HashSet<String> A2 = new HashSet<String>();
		ArrayList<String> B2 = new ArrayList<String>();
		System.out.println("1. Size of the first word");
		System.out.println("2. Size of the second word");
		System.out.println("3. Number of the same characters");
		String A = scanner.next();
		String B = scanner.next();
		String[] A1 = A.split(""); 
		String[] B1 = B.split("");
		
		for(int i = 0; i < A1.length; i++) {
			for(int j = 0; j < B1.length; j++) {
				if (A1[i].equals(B1[j])) {
					A2.add(A1[i]);
				}
			}
		}
		System.out.println("1 : " + A1.length);
		System.out.println("2 : " + B1.length);
		System.out.println("3 : " + A2.size());
	}
}
