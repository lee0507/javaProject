package HW3;

public class Taxcalc1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����

		int k30_val = 271;// k30_Val�̶�� ������ ������ �����ϰ� 271�̶�� ���� ����
		int k30_rate = 5;// k30_rate��� ������ ������ �����ϰ� 5��� ���� ����
		
		int k30_tax = taxcal(k30_val, k30_rate);//�Ʒ� ���� taxcal�̶�� �Լ��� ����  k30_tax��� ������ ������ k30_val�� k30_rate�� ����Ͽ� ���� �����Ѵ�.
		
		System.out.printf("**************************************\n");
		System.out.printf("*      	      �ܼ� ���� ���      	     *\n");
		System.out.printf("���� ���ݰ��: %f\n" , k30_val * k30_rate / 100.0);// (���� k30_val * k30_rate / 100.0)�� ȭ�鿡 ���
		
		System.out.printf("��������: %d ����:%d �����԰���: %d\n", k30_val, k30_tax, k30_val + k30_tax);// (���� k30_val�� k30_tax�� k30_val + k30_tax�� ȭ�鿡 ���
		
		System.out.printf("**************************************\n");
	}
	
	public static int taxcal(int k30_val, int k30_rate) {
		int k30_ret;// k30_ret�̶�� ������ ���� ����
		
		if((double)k30_val * (double)k30_rate/100.0 == k30_val * k30_rate / 100) {//���� �Ǽ������� ����ȯ�� k30_val�� �Ǽ������� ����ȯ�� k30_rate ���� ���� 100���� ���� ����
			k30_ret = k30_val * k30_rate / 100;						//k30_val�� k30_rate�� ���ϰ� 100���� ���� ���� ���ٸ� k30_ret�� k30_val�� k30_rate�� 100���� ���������� �����Ѵ�.
		} else {
			k30_ret = k30_val * k30_rate / 100 + 1;//�׷��� �ʴٸ� k30_ret�� k30_val * k30_rate /100���ϰ� ���ϱ� 1�� �� ������ �����Ѵ�.
		}
		
		return k30_ret;//k30_ret�� ���� �����Ѵ�.
	}

}


