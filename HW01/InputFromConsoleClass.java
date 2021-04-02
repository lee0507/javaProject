package HW01;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null;
	public InputFromConsoleClass() {
		scanner = new Scanner(System.in);
	}
	public double inputWon() {
		double won;//받은 원화
		System.out.print("받은 원화 입력 : ");
		won = scanner.nextDouble();
		return won;
	}
	public int inputType() {
		int type;
		System.out.print("종료 : 0\n달러 : 1\n유로 : 2\n엔화 : 3\n환전할 종류 선택 : ");
		type = scanner.nextInt();
		return type;
	}
}
