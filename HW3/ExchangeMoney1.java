package HW3;

public class ExchangeMoney1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k30_MyWon = 1000000;//������ ���� k30_MyWon�� �����ϰ� 1000000�� �����Ѵ�.
		double k30_MoneyEx = 1238.21;// �Ǽ��� ���� k30_MoneyEx�� �����ϰ� 1238.21�� �����Ѵ�.
		double k30_commission = 0.003;// �Ǽ��� ���� k30_commission�� �����ϰ� 0.003�� �����Ѵ�.
		
		int k30_usd = (int)(k30_MyWon / k30_MoneyEx);// ������ ���� k30_usd�� �����ϰ� ���������� ����ȯ�� (k30_MyWon / k30_MoneyEx)���� �����Ѵ�.
		int k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx);//������ ���� k30_remain�� �����ϰ� ���������� ����ȯ�� (k30_MyWon - k30_usd * k30_MoneyEx)���� �����Ѵ�.
		
		System.out.printf("************************************************\n");
		System.out.printf("*		��������� ���		       *\n");
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", k30_MyWon, k30_usd, k30_remain);//���� k30_MyWon, k30_usd, k30_remain�� ����Ѵ�.
		System.out.printf("************************************************\n");
	}

}
