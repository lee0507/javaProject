package HW4;

public class for1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_sum = 0;//������ ���� k30_sum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		for (int k30_i = 0; k30_i < 10; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_sum = k30_sum + k30_i;// ���� k30_sum�� k30_i�� ���� ���� �����Ѵ�.
		}//k30_sum += k30_i�ε� ����ؼ� ����� �� �ִ�.
		System.out.printf("sum %d\n", k30_sum);//���� k30_sum�� ȭ�鿡 ����Ѵ�
		
		for (int k30_i = 1; k30_i < 10; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf("********************\n");// ������ ����ϴ� %�� ""�ȿ� ������� �ʱ� ������ , k30_i�� ���� �ʿ䰡 ����.
			System.out.printf("      ������ %d ��\n", k30_i);//���� k30_i�� ȭ�鿡 ����Ѵ�.
			System.out.printf("********************\n");
			for (int k30_j = 1; k30_j < 10; k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� 10���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf(" %d * %d = %d \n", k30_i, k30_j, k30_i * k30_j);//���� k30_i, k30_j, k30_i * k30_j�� ȭ�鿡 ����Ѵ�.
			}
		}
	}

}
