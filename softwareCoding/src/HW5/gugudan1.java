package HW5;

public class gugudan1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		for (int k30_i = 1; k30_i < 10; k30_i = k30_i + 3) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 3�� ������Ű�鼭 �����Ѵ�.
			System.out.printf("***************\t***************\t***************\n");
			System.out.printf("  ������ %d �� \t  ������ %d �� \t  ������ %d �� \t\n", k30_i, k30_i + 1, k30_i + 2);//���� k30_i, k30_i + 1, k30_i + 2�� ȭ�鿡 ����Ѵ�.
			System.out.printf("***************\t***************\t***************\n");
			for (int k30_j = 1; k30_j < 10; k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� 10���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf(" %d * %d = %-7d", k30_i, k30_j, k30_i * k30_j);//���� k30_i, k30_j, k30_i * k30_j�� ȭ�鿡 ����Ѵ�.
				System.out.printf(" %d * %d = %-7d", k30_i + 1, k30_j, (k30_i + 1) * k30_j);//���� k30_i, k30_j, (k30_i + 1) * k30_j�� ȭ�鿡 ����Ѵ�.
				System.out.printf(" %d * %d = %-7d", k30_i + 2, k30_j, (k30_i + 2) * k30_j);//���� k30_i, k30_j, (k30_i + 2) * k30_j�� ȭ�鿡 ����Ѵ�.
				System.out.println();//�ٹٲ��� ȭ�鿡 ����Ѵ�.
				
			}
		}
	}

}
