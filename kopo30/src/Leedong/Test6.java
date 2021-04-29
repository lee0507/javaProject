package Leedong;

import java.util.Scanner;

public class Test6 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[] score = {"milk", "apple", "orange", "melon", "water"};
		int[] price = {0, 0, 0, 0, 0};
		while(true) {
			int mainChoice = mainMenu(score, price);
			if (mainChoice == 1) {
				setPrice(price);
			} else if (mainChoice == 2) {
				totalCharge(price);
			} else if (mainChoice == 3) {
				resetPrice(price);
			}
		}
	}
	
	public static int mainMenu(String[] score, int[]price) {
		System.out.println("#Menu");
		System.out.print("[PRICE] ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print(score[i]);
				System.out.print(" - ");
				System.out.print(price[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println("1. Set the prices of items");
		System.out.println("2. Calculate the charges");
		System.out.println("3. Reset the prices of items");
		return scanner.nextInt();
	}
	
	public static int setPrice(int[]price) {
		System.out.println("# Please input the prices of milk, apple, orange, melon and water in order");
		System.out.print("----> ");
		int[] A = new int[5];
		
		for (int i = 0; i < 5; i++) {
			A[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) { 
			price[i] = A[i] + price[i];
		}
		return 0;
	}
	
	public static int totalCharge(int[]price) {
		System.out.println("# Please input the quantities of milk, apple, orange, melon and water in order");
		System.out.print("----> ");
		int[] A = new int[5];
		int[] B = new int[5];
		int total = 0;
		
		for (int i = 0; i < 5; i++) {
			A[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			B[i] = A[i] * price[i];
		}
		for (int i = 0; i < 5; i++) {
			total += B[i];
		}
		System.out.println("total : " + total);
		return 0;
	}
	
	public static int resetPrice(int[]price) {
		System.out.println("#Reset complete!");
		for (int i = 0; i < 5; i++) {
			price[i] = 0 ;
		}
		return 0;
	}
}
