package HW5;

public class calendar1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		int k30_iWeekday = 5;//������ ���� k30_iWeekday�� �����ϰ� ���� 5�� �ʱ�ȭ�Ѵ�.
		int [] k30_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//������ �迭 k30_iEnd�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.

		
		for (int k30_iMon = 0; k30_iMon < 12; k30_iMon++) {//for�ݺ����� k30_iMon�� 0���� k30_iMon�� 12���� ���� ������ k30_iMon�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf("\n\n         %d��\n", k30_iMon + 1);//���� k30_iMon + 1�� �ٹٲ��� ȭ�鿡 ����Ѵ�. 
			System.out.printf("=====================\n");//=======�� �ٹٲ��� ȭ�鿡 ����Ѵ�. 
			System.out.printf(" �� �� ȭ �� �� �� ��\n");//�� �� ȭ �� �� �� ��� �ٹٲ��� ȭ�鿡 ����Ѵ�. 
			
			int k30_count = 7 - k30_iWeekday;//������ ���� k30_count�� �����ϰ� ���� 7 - k30_iWeekday�� �ʱ�ȭ�Ѵ�.
			if (k30_iWeekday == 0) {//���࿡ k30_iWeekday�� == 0 �̸� k30_count�� 0���� �ʱ�ȭ�Ѵ�.
				k30_count = 0;//�ʱ�ȭ�ϴ� ������ k30_iWeekday�� 0�̸� k30_count�� 7�� �Ǳ� ������ k30_i % 7 == 0�� �Ǿ �ٹٲ��� �Ͼ�� �ʱ⶧���� �ʱ�ȭ�Ѵ�.
			}
			
			for (int k30_i = 0; k30_i < k30_iWeekday; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iWeekday���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf("   ");//ù ���� ������ k30_iWeekday�� k30_icount�� ����ϰ� �ڷ� ���� ���ش�.
			}
			
			for(int k30_i = 1; k30_i <= k30_iEnd[k30_iMon]; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_iEnd�� k30_iMon�� ���ų� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf("%3d", k30_i);//���� k30_i�� ȭ�鿡 ����Ѵ�.
				
				if(k30_i % 7 == k30_count) {//���࿡ k30_i % 7 == k30_count�� �ٹٲ��� �Ѵ�.
					System.out.println();//������ �������� ������� 2��� �������� 2�ϰ�쿡 �ٹٲ��� �Ѵ�.
				}
				k30_iWeekday++;//k30_iWeekday�� 1�� �߰��Ѵ�.
				if(k30_iWeekday == 7) {//���࿡ k30_iWeekday�� 7�̸� 0���� ���� �ʱ�ȭ�Ѵ�.
					k30_iWeekday = 0;//���������� ������ ������ ����ϱ� ���ؼ� ���� �ʱ�ȭ�ؾ��Ѵ�.
				}
				
			}
		}
	}
}

