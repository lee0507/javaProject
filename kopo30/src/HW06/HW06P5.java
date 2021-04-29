package HW06;

import java.util.Scanner;

public class HW06P5 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[][] score = {{"Menu", "korean", "english", "math"}, {"kim", "80", "90", "90"},
				{"park", "60", "90", "90"}, {"lee", "70", "90", "90"}
		};
		while(true) {
			int mainChoice = mainMenu();
			if (mainChoice == 1) {
				int nameChoice = nameMenu(score);
				statisticsByName(score, nameChoice);
			} else if (mainChoice == 2) {
				int subjectChoice = subjectMenu(score);
				statisticsBySubject(score, subjectChoice);
			} else {
				System.out.println("error");
			}
		}
	}
	
	public static int mainMenu() {
		System.out.println("#Menu");
		System.out.println("1. Name");
		System.out.println("2. Subject");
		return scanner.nextInt();
	}
	
	public static int nameMenu(String[][] score) {
		System.out.println("#Name");
		for (int i = 1; i < score.length; i++) {
			System.out.println("#" + (i)+ " : " + score[i][0]);
		}
		return scanner.nextInt();
	}
	
	public static void statisticsByName(String[][] score, int nameIndex) {
		System.out.println("#Statistis : " + score[nameIndex][0]); 
		int sum = 0;
		int avg = 0;
		int min = Integer.parseInt(score[nameIndex][1]);
		int max = Integer.parseInt(score[nameIndex][1]);
		for (int i = 1; i < score[nameIndex].length; i++) {
			sum = sum + Integer.parseInt(score[nameIndex][i]);
		}
		avg = sum / score[nameIndex - 1].length -1;
		
		for (int i = 1; i < score[nameIndex - 1].length; i++) {
			if(min > Integer.parseInt(score[nameIndex][i])) {
				min = Integer.parseInt(score[nameIndex][i]);
			}
		}
		
		for (int i = 1; i < score[nameIndex - 1].length; i++) {
			if(max < Integer.parseInt(score[nameIndex][i])) {
				max = Integer.parseInt(score[nameIndex][i]);
			}
		}
		
		System.out.println("SUM : " + sum);
		System.out.println("AVG : " + avg);
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	}
	public static int subjectMenu(String[][] score) {
		System.out.println(("#Subject"));
		for (int i = 1; i < score.length; i++) {
			System.out.println("#" + i + " : " + score[0][i]);
		}
		return scanner.nextInt();
	}
	public static void statisticsBySubject(String[][] score, int nameIndex) {
		System.out.println("#Statistics : " + score[0][nameIndex]);
		int sum = 0;
		int avg = 0;
		int min = Integer.parseInt(score[1][nameIndex]);
		int max = Integer.parseInt(score[1][nameIndex]);
		
		for (int i = 1; i < score.length; i++) {
			sum = sum + Integer.parseInt(score[i][nameIndex]);
		}
		avg = sum / score.length - 1;
		
		for (int i = 1; i < score.length; i++) {
			if(min > Integer.parseInt(score[i][nameIndex])) {
				min = Integer.parseInt(score[i][nameIndex]);
			}
		}
		
		for (int i = 1; i < score.length; i++) {
			if(max < Integer.parseInt(score[i][nameIndex])) {
				max = Integer.parseInt(score[i][nameIndex]);
			}
		}
		
		System.out.println("SUM : " + sum);
		System.out.println("AVG : " + avg);
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
		
	}
}
