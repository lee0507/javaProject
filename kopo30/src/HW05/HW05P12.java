package HW05;

import java.util.Scanner;

public class HW05P12 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = scanner.nextLine();
		String [] numbersStr = text.split(" ");
		
		double[] numbers = new double[numbersStr.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Double.parseDouble(numbersStr[i]);
		}
		
		double target = scanner.nextDouble();
		double nearData = 0;
		double min = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			double a = Math.abs((numbers[i]-target));
			if(min > a && a != 0) {
				min = a;
				nearData = numbers[i];
			}
		}
		System.out.println(nearData);
	}

}
