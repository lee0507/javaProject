package HW4;

public class calendar2 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		for (int k30_i = 1; k30_i < 13; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 13���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" %d�� =>", k30_i);//���� k30_i�� ȭ�鿡 ����Ѵ�.
			for (int k30_j = 1; k30_j < 32; k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� 32���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf("%d,", k30_j);//���� k30_j�� ȭ�鿡 ����Ѵ�.
				
				if(k30_i == 4 || k30_i == 6 || k30_i == 9 || k30_i == 11) {//���� k30_i�� 4�̰ų� 6�̰ų� 9�̰ų� 11�̸�
					if(k30_j == 30) break;// k30_j�� 30���� �����.
				}
				
				if(k30_i == 2) {//���� k30_i�� 2�̸�
					if(k30_j == 28) break;// k30_j�� 28���� �����.
				}
			}
			System.out.printf("\n");//������ ����� ���������� �ٹٲ��� ����Ѵ�.
		}
	}

}
