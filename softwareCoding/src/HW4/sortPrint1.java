package HW4;

import java.text.DecimalFormat;

public class sortPrint1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		String k30_item = "���";// ���ڿ��� ���� k30_item�� �����ϰ� ���� ����� �ʱ�ȭ�Ѵ�.
		int k30_unit_price = 5000;//������ ���� k30_unit_price�� �����ϰ� ���� 5000���� �ʱ�ȭ�Ѵ�.
		int k30_num = 500;//������ ���� k30_num�� �����ϰ� ���� 500���� �ʱ�ȭ�Ѵ�.
		int k30_total = 0;//������ ���� k30_total�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###,###");
		//k30_df��� �̸��� �ν��Ͻ��� �����ϰ� new �������, 3�ڸ������� ,comma�� ��µǵ��� �����Ѵ�.
		System.out.printf("=======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%10.10s\n", "ǰ��", "�ܰ�", "����", "�հ�");
		//�ּ� 20�ڸ� �ִ� 20�ڸ��� ����� ���ڿ� ǰ���� ����Ѵ�, �������� �ּ� 8�ڸ� �ִ� 8�ڸ��� ����� ���ڿ� �ܰ�, ����, �հ踦 ����Ѵ�.
		System.out.printf("=======================================================\n");
		
		System.out.printf("%20.20s%9.9s%9.9s%10.9s\n", k30_item, k30_df.format(k30_unit_price), k30_df.format(k30_num), k30_df.format(k30_unit_price * k30_num));
		//�ּ� 20�ڸ� �ִ� 20�ڸ��� ����� ���ڿ� k30_item�� ����Ѵ�, �������� �ּ� 8�ڸ� �ִ� 8�ڸ��� ����� 
		//���ڿ� k30_df.format(k30_unit_price), k30_df.format(k30_num), k30_df.format(k30_unit_price * k30_num)�� ����Ѵ�.
		//df.format�� ���� ���� ������ 3�ڸ��� ���� ,comma�� �������� ������ �����Ѵ�.
		System.out.printf("=======================================================\n");
	}

}
