package HW3;

public class P2 { //Ŭ���� ����

	public static void main(String[] args) { //�������κ��� ���α׷�����
	int k30_sum; // k30_sum�̶�� ������ ���� ����
	k30_sum = 0; // k30_sum�� ���� 0���� �ʱ�ȭ
	
	for (int k30_i = 1; k30_i < 101; k30_i++) { //k30_sum�� k30_i�� ���� 1�� �����ϸ鼭 k30_sum�� 
		k30_sum = k30_sum + k30_i;				//k30_i�� ���� 1���� 100������ ���� ���Ѵ�.
	}
	System.out.printf("#2 : %d\n" , k30_sum); //���� k30_sum�� ȭ�鿡 ���
	
	System.out.printf("#2-2 : %d\n", k30_sum / 100); // ���� k30_sum�� ������ 100�� ���� ȭ�鿡 ���
	
	int [] k30_v = {1, 2, 3, 4, 5}; // k30_v�̶�� ������ �迭 ����
	int k30_vSum; // k30_vSum�̶�� ������ ���� ����
	
	k30_vSum = 0; // k30_vSum�� ���� 0���� �ʱ�ȭ
	
	for(int k30_i = 0; k30_i < 5; k30_i++) { //k30_vSum�� k30_i�� ���� 1�� �����ϸ鼭 k30_v���� �ε��� 0������ �����ͼ�
		k30_vSum = k30_vSum + k30_v[k30_i];  //k30_vSum�� 1���� 5���� �ϳ��� ���Ѵ�.
	}
	
	System.out.printf("#2-3 : %d\n" , k30_vSum); // ���� k30_vSum�� ȭ�鿡 ���
	}

}
