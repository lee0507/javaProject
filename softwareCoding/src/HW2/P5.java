package HW2;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		
		String k30_input = scanner.nextLine();
		int k30_num = Integer.parseInt(k30_input);
		
		System.out.println("입력내용 :" + k30_input);
		System.out.printf("num=%d%n", k30_num);
	}

}
