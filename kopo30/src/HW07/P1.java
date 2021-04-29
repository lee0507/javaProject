package HW07;

import java.util.Collections;
import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class P1 {
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String A = scanner.nextLine();
		String A = "When I was young, I wanted to be a doctor";
		String[] B = A.split(" ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		ArrayList<String> name = new ArrayList<String>();
		for(int i = 0; i < B.length; i++) {
			name.add(B[i]);
		}
		System.out.println();
		Arrays.sort(B);
		for(int i = 0; i <B.length; i++) {
			System.out.print(B[i] + " ");
		}

	}
}
