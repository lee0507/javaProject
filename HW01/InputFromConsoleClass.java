package HW01;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null;
	public InputFromConsoleClass() {
		scanner = new Scanner(System.in);
	}
	public double inputWon() {
		double won;//���� ��ȭ
		System.out.print("���� ��ȭ �Է� : ");
		won = scanner.nextDouble();
		return won;
	}
	public int inputType() {
		int type;
		System.out.print("���� : 0\n�޷� : 1\n���� : 2\n��ȭ : 3\nȯ���� ���� ���� : ");
		type = scanner.nextInt();
		return type;
	}
}
