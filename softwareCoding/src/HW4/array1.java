package HW4;

public class array1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int[] score1 = {1, 2, 3, 4, 5};// int�� �迭�� �����ϰ� 1, 2, 3, 4, 5�� ���� ������� �����Ѵ�.
		String[] name1 = {"lee", "kim", "park", "ryu", "choi"};//String�� �迭�� �����ϰ� ���� ������� �����Ѵ�.
		
		int score2[] = {6, 7, 8, 9, 10};// ������ �ٸ��� �̷� �������� �迭�� ������ ���� �ִ�.
		String name2[] = {"pogba", "rooney", "bruno", "fred", "rashford"};// ������ �ٸ��� �̷� �������� �迭�� ������ ���� �ִ�.
		
		int [] score3 = new int[5]; //ũ�Ⱑ 5�� int�� �迭�� �����Ѵ�.
		score3[0] = 100;// �ε��� 0�� ���� 100�� �����Ѵ�.
		score3[1] = 90;// �ε��� 1�� ���� 90�� �����Ѵ�.
		score3[2] = 80;// �ε��� 2�� ���� 80�� �����Ѵ�.
		score3[3] = 70;// �ε��� 3�� ���� 70�� �����Ѵ�.
		score3[4] = 60;// �ε��� 4�� ���� 60�� �����Ѵ�.
		for (int i = 0; i < score1.length; i++) {
			System.out.print(score1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < name1.length; i++) {
			System.out.print(name1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < name2.length; i++) {
			System.out.print(name2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score3.length; i++) {
			System.out.print(score3[i] + " ");
		}
	}

}
