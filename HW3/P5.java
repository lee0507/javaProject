package HW3;

public class P5 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		int k30_MyVal = 14 / 5;// k30_MyVal�̶�� ������ ������ �����ϰ� 14 / 5��� ���� ����
		System.out.printf("#5-1 : %d\n" , k30_MyVal);// ���� k30_MyVal�� ȭ�鿡 ���
		
		double k30_MyValF;// k30_MyValF��� �Ǽ��� ������ ����
		
		k30_MyValF = 14 / 5;// k30_MyValF�� 14 / 5��� ���� ����
		System.out.printf("#5-2 : %f\n" , k30_MyValF);// ���� k30_MyValF�� ȭ�鿡 ���
		
		k30_MyValF = 14.0 / 5;// k30_MyValF�� 14.0 / 5��� ���� ����
		System.out.printf("#5-3 : %f\n" , k30_MyValF);// ���� k30_MyValF�� ȭ�鿡 ���
		
		k30_MyValF = (14.0) / 5 + 0.5;// k30_MyValF�� 14.0 / 5 + 0.5��� ���� ����
		System.out.printf("#5-4 : %f\n" , k30_MyValF);// ���� k30_MyValF�� ȭ�鿡 ���
		
		k30_MyVal = (int)((14.0) / 5 + 0.5);// k30_MyValF�� 14.0 / 5 + 0.5��� ���� ���������� ��ȯ�ϰ� ����
		System.out.printf("#5-5 : %d\n" , k30_MyVal);// ���� k30_MyVal�� ȭ�鿡 ���

	}

}
