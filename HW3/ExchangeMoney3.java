package HW3;

public class ExchangeMoney3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k30_MyWon = 1000000;//������ ���� k30_MyWon�� �����ϰ� 1000000�� �����Ѵ�.
		double k30_MoneyEx = 1238.21;// �Ǽ��� ���� k30_MoneyEx�� �����ϰ� 1238.21�� �����Ѵ�.
		double k30_commission = 0.003;// �Ǽ��� ���� k30_commission�� �����ϰ� 0.003�� �����Ѵ�.

		int k30_usd = (int)(k30_MyWon / k30_MoneyEx);// ������ ���� k30_usd�� �����ϰ� ���������� ����ȯ�� (k30_MyWon / k30_MoneyEx)���� �����Ѵ�.
		int k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx);//������ ���� k30_remain�� �����ϰ� ���������� ����ȯ�� (k30_MyWon - k30_usd * k30_MoneyEx)���� �����Ѵ�.
		double k30_ComPerOne = k30_MoneyEx * k30_commission;// �Ǽ��� ���� k30_ComPerOne�� �����ϰ� (k30_MoneyEx * k30_commission)���� �����Ѵ�.
		double k30_totalcom = k30_usd * k30_ComPerOne;// �Ǽ��� ���� k30_totalcom�� �����ϰ� k30_usd * k30_ComPerOne���� �����Ѵ�.
		
		k30_usd = (int)(k30_MyWon / (k30_MoneyEx + k30_ComPerOne));
		k30_totalcom = k30_usd * k30_ComPerOne;
		
		int k30_i_totalcom;//������ ���� k30_i_totalcom�� �����Ѵ�.
		if (k30_totalcom != (double)((int)k30_totalcom)) {//���� k30_totalcom�� 
			k30_i_totalcom = (int)k30_totalcom + 1;
		} else {
			k30_i_totalcom = (int)k30_totalcom;
		}
		System.out.printf("*****************************************************************\n");
		System.out.printf("*			������ ����ȯ��		      	        *\n");
		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k30_i_totalcom, k30_usd, k30_ComPerOne);
		System.out.printf("*****************************************************************\n");
		
		k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx - k30_i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��: %d�� �ܵ�: %d��\n", k30_MyWon, k30_usd, k30_i_totalcom, k30_remain);
		System.out.printf("*****************************************************************\n");
	}

}
