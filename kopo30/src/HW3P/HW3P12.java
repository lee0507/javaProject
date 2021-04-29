package HW3P;

import java.util.Scanner;

public class HW3P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Current Converter");
			System.out.println("1. Celsius -> Fahrenheit");
			System.out.println("2. Fahrenheit -> Celsius");
			int n = scanner.nextInt();
			float a = scanner.nextFloat();
			if (n == 1) {
				float c = (a*9/5) +32;
		        System.out.printf("%.2f \n" , c);	
			} else if (n == 2) {
				float c = (float) (5.0/9.0 * (a-32));
		        System.out.printf("%.2f \n" , c);	        
			}
		}
	}

}
