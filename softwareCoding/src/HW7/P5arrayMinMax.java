package HW7;

public class P5arrayMinMax {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int[] k30_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33};
		//������ �迭 k30_iArray�� �����ϰ� ���� �����Ѵ�.
		for(int k30_i = 0; k30_i < k30_iArray.length; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iArray�� ���̺��� ������ ���� k30_i�� 1�� ������Ű�� �����Ѵ�.
			System.out.printf("iArray[%d] = %d\n", k30_i, k30_iArray[k30_i]);//���� k30_i�� k30_iArray�� �ε��� k30_i��°�� ȭ�鿡 ����Ѵ�.
		}
		
		int k30_iMax = k30_iArray[0];//������ �迭 k30_iMax�� �����ϰ� k30_iArray�� 0���ε��� ���� �����Ѵ�.
		int k30_iMin = k30_iArray[0];//������ �迭 k30_iMin�� �����ϰ� k30_iArray�� 0���ε��� ���� �����Ѵ�.
		int k30_iMaxPt = 0;//������ ���� k30_iMaxPt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_iMinPt = 0;//������ ���� k30_iMinPt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		
		for (int k30_i = 0; k30_i < k30_iArray.length; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iArray�� ���̺��� ������ ���� k30_i�� 1�� ������Ű�� �����Ѵ�.
			if(k30_iMax < k30_iArray[k30_i]) {//���� k30_iMax�� k30_iArray�� k30_i��° �ε������� �۴ٸ�
				k30_iMax = k30_iArray[k30_i];//k30_Max�� k30_iArray�� k30_i��° �ε��� ������ �����Ѵ�.
				k30_iMaxPt = k30_i;//���� k30_iMaxPt�� ���� k30_i�� �����Ѵ�.
			}
			if(k30_iMin > k30_iArray[k30_i]) {//���� k30_iMax�� k30_iArray�� k30_i��° �ε������� ũ�ٸ�
				k30_iMin = k30_iArray[k30_i];//k30_Min�� k30_iArray�� k30_i��° �ε��� ������ �����Ѵ�.
				k30_iMinPt = k30_i;//���� k30_iMinPt�� ���� k30_i�� �����Ѵ�.
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k30_iMaxPt, k30_iMax);//���� k30_iMaxPt�� k30_iMax�� ȭ�鿡 ����Ѵ�.
		System.out.printf("MIN : iArray[%d]=%d\n", k30_iMinPt, k30_iMin);//����k30_iMinPt�� k30_iMin�� ȭ�鿡 ����Ѵ�.
	}

}
