package HW3P;

import java.util.Scanner;

public class HW3P14 {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = scanner.nextLine();
		indiArticle(sentence);
	}
	
	public static void indiArticle(String sentence) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("a") || words[i].equals("an")) {
				char t = words[i + 1].charAt(0);
				if (t == 'a' || t == 'e' || t == 'o'|| t == 'u' || t == 'i') {
					words[i] = "an";
				} else {
					words[i] = "a";
				}
			}
			System.out.printf("%s", words[i]);
			System.out.print(" ");
		}
	}

}
