package HW4;

public class sinfunction1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		double k30_fSin;//�Ǽ��� ���� k30_fSin�� �����Ѵ�.
		
		for(int k30_i = 0; k30_i < 360; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� 360���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_fSin = Math.sin(k30_i * 3.141592 / 180);//���� k30_fSin�� ���� Math.sin(k30_i�� 3.141592���� ���ϰ� 180���� ���� ��)�� �����Ѵ�)
			System.out.printf("%d sin ==> %f\n", k30_i, k30_fSin);//%d�� ���� ������ ���� k30_i�� %f�� ���� �Ǽ��� ���� k30_fSin�� ȭ�鿡 ����Ѵ�.
		}
		
		for(int k30_i = 0; k30_i < 360; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� 360���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_fSin = Math.sin(k30_i * 3.141592 / 180);//���� k30_fSin�� ���� Math.sin(k30_i�� 3.141592���� ���ϰ� 180���� ���� ��)�� �����Ѵ�)
			
			int k30_iSpace = (int)((1.0 - k30_fSin) * 50);//������ ���� k30_iSpace�� ���� (1.0 - k30_fSin)�� 50�� ���� ���� ���������� ����ȯ�ϰ� �����Ѵ�.
			for (int k30_j = 0; k30_j < k30_iSpace; k30_j++) {//for�ݺ����� k30_j�� 0���� k30_j�� k30_iSpace���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf(" ");//ȭ�鿡 ��ĭ �ϳ��� ����Ѵ�.
			}
			System.out.printf("*[%f][%d]\n", k30_fSin, k30_iSpace);//%f�� ���� �Ǽ��� ���� k30_fSin�� %d�� ���� ������ ���� k30_iSpace�� ȭ�鿡 ����Ѵ�.
		}
	}

}
