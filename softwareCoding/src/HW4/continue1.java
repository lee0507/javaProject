package HW4;

public class continue1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		for (int k30_i = 0; k30_i <= 10; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� 10���� ���ų� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			if (k30_i % 3 == 0) {//���� k30_i % 3 == 0�̸�(k30_i�� 3���� ���������� �������� 0�� �ƴϸ�)
				continue;//���ǽ��� true�� �Ǿ� continue���� ����Ǹ� �ݺ����� ������ �̵��Ѵ�.
			}//break���� �޸� �ݺ��� ��ü�� ������� �ʴ´�.
			System.out.println(k30_i);//���� k30_i�� ȭ�鿡 ����Ѵ�.
		}
	}

}
