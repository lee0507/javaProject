package HW3;

public class Snacks {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����

		String [] k30_item = {"������", "���Ͻ�", "�Ե�����", "����", "��극"};// String �迭 k30_item�� �����ϰ� ������, ���Ͻ�, �Ե�����, ����, ��극�� ������ ���� �迭�� �߰��Ѵ�.
		int[] k30_price = {1000, 2000, 3000, 2500, 1450};// int �迭 k30_price�� �����ϰ� 1000, 2000, 3000, 2500, 1450�� ������ ���� �迭�� �߰��Ѵ�.
		int[] k30_amount = {10, 2, 1, 3, 5};// int �迭 k30_amount�� �����ϰ� 10, 2, 1, 3, 5�� ������ ���� �迭�� �߰��Ѵ�.
		double k30_tax_rate = 0.1;// �Ǽ��� ���� k30_tax_rate�� �����ϰ� 0.1�� ���� �����Ѵ�.
		int k30_total_sum = 0;// ������ ���� k30_total_sum�� �����ϰ� 0���� ���� �ʱ�ȭ�Ѵ�.
		
		System.out.printf("************************************************************\n");
		System.out.printf("			�ʰ� ���� ���ڵ�			\n");
		System.out.printf("�� ��		   �� ��	       �� ��		     �� �� 	\n");
		for (int k30_i = 0; k30_i < k30_item.length; k30_i++) {//�ݺ��� for�� ���� ���� k30_i�� 0���� k30_item.length�� String�迭�� ���� 5��ŭ �ݺ��ȴ�.
			int k30_sum = k30_price[k30_i] * k30_amount[k30_i];// �ѹ� �ݺ� �ɶ����� ���� k30_sum�� k30_price�� �ε��� �� 0���� 4����, k30_amount�� �ε��� �� 0���� 4������ ���Ѵ�.
			k30_total_sum = k30_total_sum + k30_sum;//������ �ѹ� �� ������ ���� ���� k30_sum�� k30_total_sum�� ���Ͽ� �־� ������ �� ������ ���Ѵ�.
			System.out.printf("%-5s		%7d		%2d		%9d\n", k30_item[k30_i],k30_price[k30_i], k30_amount[k30_i], k30_sum);
		}// ���� k30_item�� k30_price, k30_amount, k30_sum�� �ѹ� �� ������ �� �׸���� ���ڸ�, �ܰ�, ����, �հ踦 ����Ѵ�.
		System.out.printf("************************************************************\n");
		System.out.printf("			���ұݾ� :     %20d\n", k30_total_sum);// �� ���� �ݾ��� ���� k30_total_sum�� ����Ѵ�.
		
		int k30_total_net_price = (int)(k30_total_sum / (1 + k30_tax_rate));// ������ ���� k30_total_net_price�� �����ϰ� �����ݾ��� ����ϱ� ���� k30_total_sum�� 1 + k30_tax_rate�� ������ �� �� ���������� ����ȯ �Ͽ���.
		System.out.printf("			�����ݾ� :     %20d\n", k30_total_net_price);// �����ݾ��� k30_total_net_price�� ����Ѵ�.
		int k30_tax = k30_total_sum - k30_total_net_price;// ������ ���� k30_tax�� �����ϰ� ������ ����ϱ� ���� ���ұݾ��� k30_total_sum���� �����ݾ��� k30_total_net_price�� ����.
		System.out.printf("			��   �� :     %20d\n", k30_tax);// ������ k30_tax�� ����Ѵ�.
	}

}
