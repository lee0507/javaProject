package HW08;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
		int a = scanner.nextInt(); // first input number
		int[] nums = new int[a]; // initialize the array with the user input number

		nums[0] = 0;
		nums[1] = 1;

		for (int i = 2; i < a; i++) {
			nums[i] = nums[i-2] + nums[i-1];
		}
	
		for (int i = 0; i < a; i++) {
			System.out.print(nums[i] + " ");
		}
		
		} catch(java.util.InputMismatchException e) {
			System.out.println("error1");
		} catch(Exception e) {
			System.out.println("error2");
		}

	}
	
}
		