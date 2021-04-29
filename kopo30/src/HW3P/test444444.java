package HW3P;

import java.util.Scanner;

public class test444444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] words = text.split(" ");
		float Min1 = 0;
		float Max1 = 0;
		String A = words[0];
		float a = Float.parseFloat(A);

		String B = words[1];
		float b = Float.parseFloat(B);

		String C = words[2];
		float c = Float.parseFloat(C);

		String D = words[3];
		float d = Float.parseFloat(D);

		float Sum1 = a + b + c + d;
		float Avr1 = (a + b + c + d) / 4;
		
		if (a > b && a > c && a > d) {
			Max1 += a;
		} else if(b > a && b > c && b > d) {
			Max1 += b;
		} else if(c > a && c > b && c > d) {
			Max1 += c;
		} else {
			Max1 += d;
		}
		if (a < b && a < c && a < d) {
			Min1 += a;
		} else if(b < a && b < c && b < d) {
			Min1 += b;
		} else if(c < a && c < b && c < d) {
			Min1 += c;
		} else {
			Min1 += d;
		}
		System.out.println("Summation : " + Sum1);
		System.out.println("Average : " + Avr1);
		System.out.println("Minimum : " + Min1);
		System.out.println("Mavimum : " + Max1);
//		
	}

}
