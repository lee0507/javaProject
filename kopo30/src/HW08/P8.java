package HW08;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0 : Rock, 1 : Paper, 2 : Scissor");
		int comNum = (int)(Math.random() * 3);
		fightResult(rpsResult(comNum));
		System.out.println("computer : " + rpsResult(comNum));

	}
	
	public static String rpsResult(int randomNumber) {
		String ret = "";
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "Paper";
		} else if (randomNumber == 2) {
			ret = "Scissor";
		}

		return ret;
	}

	public static void fightResult(String ret) {
		Scanner scanner = new Scanner(System.in);
		int personResult = scanner.nextInt();
		
		if (ret.equals("Rock") && personResult == 0) {
			System.out.println("Draw");
			System.out.println("Person : Rock");
		} else if (ret.equals("Rock") && personResult == 1) {
			System.out.println("User Win");
			System.out.println("Person : Paper");
		} else if (ret.equals("Rock") && personResult == 2) {
			System.out.println("Computer Win");
			System.out.println("Person : Scissor");
		} else if (ret.equals("Paper") && personResult == 0) {
			System.out.println("Computer Win");
			System.out.println("Person : Rock");
		} else if (ret.equals("Paper") && personResult == 1) {
			System.out.println("Draw");
			System.out.println("Person : Paper");
		} else if (ret.equals("Paper") && personResult == 2) {
			System.out.println("User Win");
			System.out.println("Person : Scissor");
		} else if (ret.equals("Scissor") && personResult == 0) {
			System.out.println("User Win");
			System.out.println("Person : Rock");
		} else if (ret.equals("Scissor") && personResult == 1) {
			System.out.println("Computer Win");
			System.out.println("Person : Paper");
		} else if (ret.equals("Scissor") && personResult == 2) {
			System.out.println("Draw");
			System.out.println("Person : Scissor");
		} else {
			
		}
	}

}
