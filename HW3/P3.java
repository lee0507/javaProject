package HW3;

public class P3 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		int k30_ii = 1000 / 3; // k30_ii��� ������ ������ �����ϰ� 1000 / 3�̶�� ���� ����
		System.out.printf("#3-1 : %d\n" , k30_ii);//���� k30_ii�� ȭ�鿡 ���
		
		k30_ii = 1000 % 3; // k30_ii��� ������ ������ 1000 % 3�̶�� ���� ����
		System.out.printf("#3-2 : %d\n" , k30_ii);//���� k30_ii�� ȭ�鿡 ���
		
		for(int k30_i = 0; k30_i < 20; k30_i++) {//k30_i�� 0���� 19���� 1�� ���ؼ� ȭ�鿡 ���
			System.out.printf("#3-3 : %d  ", k30_i);//k30_i�� ȭ�鿡 ���
			
			if ((k30_i + 1) % 5 == 0) {//��, k30_i + 1�϶����� �ٹٲ��� ��� (5������ ��� �ٹٲ�)
				System.out.printf("\n");//�ٹٲ��� ȭ�鿡 ���
			}
		}

	}

}
