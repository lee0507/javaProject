package HW3;

public class MyTest {

	public static void main(String[] args) {
		int price = 1234;//���������� price�� �����ϰ� 1234��� ���� �����Ѵ�.
		double tax_rate = 0.1;//�Ǽ��� ���� tax_rate�� �����ϰ� 0.1�̶�� ���� �����Ѵ�.
		
		int netprice = netprice(price, tax_rate);//������ ���� netprice�� �����ϰ� netprice��� �Լ��ȿ� price�� tax_rate�� ���� ���� ������ �����Ѵ�.
		int tax = price - netprice;//������ ���� tax�� �����ϰ� price - netprice���� �����Ѵ�.
		
		System.out.printf("*****************************************\n");
		System.out.printf("*	�Һ��ڰ�, ��������, ���� ���		*\n");
		System.out.printf("*�Һ��ڰ��� : %d, ��������: %d, ����: %d\n", price, netprice, tax);//price�� netprice, tax ������ ����Ѵ�.
		System.out.printf("*****************************************\n");

	}
	
	public static int netprice(int price, double rate) {//netprice��� �Լ� �����ϰ� �Ķ���ͷ� ���������� price�� �Ǽ��� ���� rate�� �����Ѵ�.
		return (int)(price/ (1+rate));// ���ϰ����� ���������� ����ȯ�� (price / (1 + rate))���� �����Ѵ�.
	}

}
