package HW5;

public class gugudan2 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_cnt = 1;//������ ���� k30_cnt�� �����ϰ� ���� 1�� �ʱ�ȭ�Ѵ�.
		for (int k30_i = 1; k30_i < 10; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			if (k30_cnt > 3) {//3���� �������� �����ϱ� ���ؼ� k30_cnt�� 3���� Ŀ���� break���� �����Ѵ�.
				break;
			}
			System.out.printf("*************** *************** ***************\n");
			System.out.printf("  ������ %d �� \t  ������ %d �� \t  ������ %d �� \t\n", k30_i, k30_i + 3, k30_i + 6);//���� k30_i, k30_i + 3, k30_i + 6�� ȭ�鿡 ����Ѵ�.
			System.out.printf("***************\t***************\t***************\n");
			for (int k30_j = 1; k30_j < 10; k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� 10���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf(" %d * %d = %2d      ", k30_i, k30_j, k30_i * k30_j);//���� k30_i, k30_j, k30_i * k30_j�� ȭ�鿡 ����Ѵ�.
				System.out.printf(" %d * %d = %2d      ", k30_i + 3, k30_j, (k30_i + 3) * k30_j);//���� k30_i + 3, k30_j, (k30_i + 3) * k30_j�� ȭ�鿡 ����Ѵ�.
				System.out.printf(" %d * %d = %2d      ", k30_i + 6, k30_j, (k30_i + 6) * k30_j);//���� k30_i + 6, k30_j, (k30_i + 6) * k30_j�� ȭ�鿡 ����Ѵ�.
				System.out.println();
			}
			k30_cnt++;//������ �ݺ����� ���������� k30_cnt�� �ϳ��� ������Ų��.
		}
	}

}
