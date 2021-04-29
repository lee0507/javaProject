package HW4P;

import java.util.Scanner;

public class HW02P1 {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

		while(true) {
			System.out.println("#Menu");
			System.out.println("1. Encoder");
			System.out.println("2. decoder");
			System.out.println("3. Exit");
			int selecMenu = scan.nextInt();
			
			if (selecMenu == 1) {
				String inputNum = scan.next();
				String[] numbers = inputNum.split("");
				
				for (int i = 0; i < inputNum.length(); i++) {
					for (int j = 0; j < nums.length; j++) {
						if(numbers[i].equals(nums[j])) {
							System.out.print(alphabets[j]);
					}

					}
				}
				System.out.println();
				
			} else if(selecMenu == 2) {
				String inputNum = scan.next();
				String[] numbers = inputNum.split("");
				
				for (int i = 0; i < inputNum.length(); i++) {
					
					for (int j = 0; j < alphabets.length; j++) {
						
						if(numbers[i].equals(alphabets[j])) {
							System.out.print(nums[j]);
					}
	 
					}
				}
				System.out.println();
				
			} else {
				System.out.println("error");
				break;
			}

		}
		
		
	}

}
