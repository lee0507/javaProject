package HW3P;

import java.util.Scanner;

public class HW01P2 {
	
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int subNum = scan.nextInt();
		int[] numbers = new int [subNum];
		String[] grades = new String[subNum];
		double[] sums = new double [subNum];
		double sum = 0;
		double devnum = 0;
		
		for (int i = 0; i < subNum; i++) {
			numbers[i] = scan.nextInt();	
		}//input the unit for each subject
		
		for (int i = 0; i < subNum; i++) {
			grades[i] = scan.next();
		}//input the grade for each subject

		
		for (int i = 0; i < subNum; i++) {
			if(grades[i].equals("A+") == true) {
				sums[i] = (numbers[i] * 4.5);
			} else if(grades[i].equals("A") == true) {
				sums[i] = (numbers[i] * 4);
			} else if(grades[i].equals("B+") == true) {
				sums[i] = (numbers[i] * 3.5);
			} else if(grades[i].equals("B") == true) {
				sums[i] = (numbers[i] * 3);
			} else if(grades[i].equals("C+") == true) {
				sums[i] = (numbers[i] * 2.5);
			} else if(grades[i].equals("C") == true) {
				sums[i] = (numbers[i] * 2);
			} else if(grades[i].equals("D+") == true) {
				sums[i] = (numbers[i] * 1.5);
			} else if(grades[i].equals("D") == true) {
				sums[i] = (numbers[i] * 1);
			} else if(grades[i].equals("F") == true) {
				sums[i] = (numbers[i] * 0);
			} else {
				System.out.println("error");
			}
		}
		for (int i = 0; i < sums.length; i++) {
			sum += sums[i];
		}
		for (int i = 0; i < sums.length; i++) {
			devnum += numbers[i];
		}
		System.out.println(sum);
		System.out.println(sum / devnum);

	}

}
