package HW08;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HW09P1 {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");	
		Date time = new Date();
		String time1 = format1.format(time);


		while(true) {
			int a = computer();
			System.out.println("0 : Rock, 1 : Paper, 2 : Scissor");
			int b = person();
			System.out.println("person : " + rpsResult(b));
			System.out.println("computer : " + rpsResult(a));
			System.out.println(fightResult(a, b));
			System.out.println(time1);
			
			FileWriter fw = new FileWriter(("D:\\7777\\5ck.txt"), true);
			fw.write("0 : Rock, 1 : Paper, 2 : Scissor\n");
			fw.write("person : " + rpsResult(b) + "\n");
			fw.write("computer : " + rpsResult(a) + "\n");
			fw.write(fightResult(a, b) + "\n");
			fw.write(time1 + "\n");
			fw.close();
		}


	}

	private static int computer() {
		int comNum = (int)(Math.random() * 3);
		return comNum;
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
	
	public static int person() {
		Scanner scanner = new Scanner(System.in);
		int person = scanner.nextInt();
		return person;
	}

	public static String fightResult(int computer, int person) {
		String A1 = "";
		if (computer == 0 && person == 0) {
			A1 = "draw";
		} else if(computer == 0 && person == 1) {
			A1 = "person win";
		} else if(computer == 0 && person == 2) {
			A1 = "computer win";
		} else if(computer == 1 && person == 0) {
			A1 = "computer win";
		} else if(computer == 1 && person == 1) {
			A1 = "draw";
		} else if(computer == 1 && person == 2) {
			A1 = "person win";
		} else if(computer == 2 && person == 0) {
			A1 = "person win";
		} else if(computer == 2 && person == 1) {
			A1 = "computer win";
		} else if(computer == 2 && person == 2) {
			A1 = "draw";
		}
		
		return A1;
	}
	
}

