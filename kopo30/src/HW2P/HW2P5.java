package HW2P;

import java.util.Scanner;

public class HW2P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text;
//		text = scanner.next();와 nextLine은 다르다.
//		next()는 스페이스, 즉 공백 전까지 입력받은 문자열을 리턴한다.
//		nextLine()은 엔터를 치기 전까지 쓴 문자열을 모두 리턴한다.
		text = scanner.nextLine();
		
		if(text.contains("car") == true) {
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string.");
		}
		
		System.out.println(text);
	}

}
