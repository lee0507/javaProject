package HW4;

public class break1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_sum = 0;// ������ ���� k30_sum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_i = 0;// ������ ���� k30_i�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		
		while (true) {//while �ݺ����� ������ true�� �����Ͽ� ����ؼ� ���ư����� �Ѵ�.
			if (k30_sum > 100) {//���� k30_sum ������ ���� 100�� �Ѿ�� �Ǹ�
				break;//break���� ����ǰ�, �� �κ��� ������� �ʰ� while���� ������ ����� �ȴ�.
			}
			k30_i++;//���� k30_i�� ���� 1�� ������Ų��.
			k30_sum += k30_i;// ���� k30_sum�� ���� k30_i�� ���� �����ش�.(k30_sum = k30_sum + k30_i�� �� ���� �ִ�.)
		}
		System.out.println("k30_i = " + k30_i);//���� k30_i�� ���� ȭ�鿡 ����Ѵ�.
		System.out.println("k30_sum = " + k30_sum);//���� k30_sum�� ���� ȭ�鿡 ����Ѵ�.
	}

}
