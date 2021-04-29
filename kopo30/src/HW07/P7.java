package HW07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] A = {{"lee", "92"},{"park", "56"},{"kim", "81"},{"ryu", "29"},{"chang", "35"}
		,{"heo", "50"},{"jeon", "60"},{"choi", "47"},{"koo", "24"},{"ki", "11"}};
		String[] B = new String[10];
		int[] num = new int[10];
		for(int i = 0; i < A.length; i++) {
			String C = A[i][0];
			B[i] = C;

		}
		Arrays.sort(B);

		for(int i = 0; i < A.length; i++) {
			String C = A[i][1];
			num[i] = Integer.parseInt(C);

		}
		Arrays.sort(num);
		
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < B.length; i++) {
			System.out.print(num[i] + " ");
		}

		
	}
}

