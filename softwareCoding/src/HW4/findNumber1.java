package HW4;

public class findNumber1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_iVal;//������ ���� k30_iVal�� �����Ѵ�.
		for (int k30_i = 0; k30_i < 300; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 300���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_iVal = 5 * k30_i;//���� k30_iVal�� 5 * k30_i ���� �����Ѵ�.
			if (k30_iVal >= 0 && k30_iVal < 10) System.out.printf("�� %d\n", k30_iVal);
			//���� k30_iVal�� 0���� ũ�ų� ���� 10���� ������ �����ڸ����� ǥ���� �ϰ� k30_iVal�� ����Ѵ�.
			else if (k30_iVal >= 10 && k30_iVal < 100) System.out.printf("�� %d\n", k30_iVal);
			//���� k30_iVal�� 10���� ũ�ų� ���� 100���� ������ �����ڸ����� ǥ���� �ʰ� k30_iVal�� ����Ѵ�.
			else if (k30_iVal >= 100 && k30_iVal < 1000) System.out.printf("�� %d\n", k30_iVal);
			//���� k30_iVal�� 100���� ũ�ų� ���� 1000���� ������ �����ڸ����� ǥ���� ��� k30_iVal�� ����Ѵ�.
			else System.out.printf("õ %d\n", k30_iVal);
			//���� k30_iVal�� ���� ���ǵ��� �� �������� ���ϸ� õ���ڸ����� ǥ���� õ�� k30_iVal�� ����Ѵ�.
		}
	}

}
