package HW3;

public class ExchangeMoney2 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_MyWon = 1000000;//������ ���� k30_MyWon�� �����ϰ� 1000000�� �����Ѵ�.
		double k30_MoneyEx = 1238.21;// �Ǽ��� ���� k30_MoneyEx�� �����ϰ� 1238.21�� �����Ѵ�.
		double k30_commission = 0.003;// �Ǽ��� ���� k30_commission�� �����ϰ� 0.003�� �����Ѵ�.
		
		int k30_usd = (int)(k30_MyWon / k30_MoneyEx);// ������ ���� k30_usd�� �����ϰ� ���������� ����ȯ�� (k30_MyWon / k30_MoneyEx)���� �����Ѵ�.
		double k30_ComPerOne = k30_MoneyEx * k30_commission;// �Ǽ��� ���� k30_ComPerOne�� �����ϰ� (k30_MoneyEx * k30_commission)���� �����Ѵ�.
		double k30_totalcom = k30_usd * k30_ComPerOne;// �Ǽ��� ���� k30_totalcom�� �����ϰ� k30_usd * k30_ComPerOne���� �����Ѵ�.
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*		������ ���		      	          *\n");
		System.out.printf("�� ������: %f�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k30_totalcom, k30_usd, k30_ComPerOne);// ���� k30_totalcom, k30_usd, k30_ComPerOne�� ����Ѵ�.
		System.out.printf("***********************************************************\n");

	}

}
