package HW3;

public class MyTest {

	public static void main(String[] args) {
		int k30_price = 1234;//���������� k30_price�� �����ϰ� 1234��� ���� �����Ѵ�.
		double k30_tax_rate = 0.1;//�Ǽ��� ���� k30_tax_rate�� �����ϰ� 0.1�̶�� ���� �����Ѵ�.
		
		int k30_netprice = k30_netprice(k30_price, k30_tax_rate);//������ ���� k30_netprice�� �����ϰ� k30_netprice��� �Լ��ȿ� k30_price�� k30_tax_rate�� ���� ���� ������ �����Ѵ�.
		int k30_tax = k30_price - k30_netprice;//������ ���� k30_tax�� �����ϰ� k30_price - k30_netprice���� �����Ѵ�.
		
		System.out.printf("*****************************************\n");
		System.out.printf("*	�Һ��ڰ�, ��������, ���� ���		*\n");
		System.out.printf("*�Һ��ڰ��� : %d, ��������: %d, ����: %d\n", k30_price, k30_netprice, k30_tax);//k30_price�� k30_netprice, k30_tax ������ ����Ѵ�.
		System.out.printf("*****************************************\n");

	}
	
	public static int k30_netprice(int k30_price, double k30_rate) {//k30_netprice��� �Լ� �����ϰ� �Ķ���ͷ� ���������� k30_price�� �Ǽ��� ���� k30_rate�� �����Ѵ�.
		return (int)(k30_price / (1 + k30_rate));// ���ϰ����� ���������� ����ȯ�� (k30_price / (1 + k30_rate))���� �����Ѵ�.
	}

}
