package HW4;

public class triangle1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_iA, k30_iB;//������ ���� k30_iA�� k30_iB�� �����Ѵ�.
		
		k30_iA = 0;//k30_iA�� ���� 0���� �ʱ�ȭ�Ѵ�.
		while (true) {//while �ݺ����� ������ true�� �����Ͽ� ����ؼ� �ݺ����� ����ǵ��� �Ѵ�.
			k30_iB = 0;//k30_iB�� ���� 0���� �ʱ�ȭ�Ѵ�.
			while(true) {//while �ݺ����� ������ true�� �����Ͽ� ����ؼ� �ݺ����� ����ǵ��� �Ѵ�.
				System.out.printf("*");//"*"�� ȭ�鿡 ����Ѵ�.
				if(k30_iA == k30_iB) {//���� ���� k30_iA�� k30_iB�� ���� ���ٸ�
					break;//break���� �����Ͽ� ���̻� �ݺ����� ������� �ʵ��� �Ѵ�.
				}
				k30_iB++;//���� k30_iB�� 1 ������Ų��.
			}
			System.out.printf("\n");// ���� while���� ���������� �ٹٲ��� ȭ�鿡 ����Ѵ�.
			k30_iA++;//���� k30_iA�� 1 ������Ų��.
			if(k30_iA == 30) {//���� ���� k30_iA�� 30�̶��
				break;//break���� �����Ͽ� ���̻� �ݺ����� ������� �ʵ��� �Ѵ�.
			}
		}
	}

}
