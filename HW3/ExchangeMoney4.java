package HW3;

public class ExchangeMoney4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k30_MyWon = 1000000;
		double k30_MoneyEx = 1238.21;
		double k30_commission = 0.003;
		double k30_ComPerOne = k30_MoneyEx * k30_commission;
		
		int k30_usd = (int)(k30_MyWon / (k30_MoneyEx + k30_ComPerOne));
		double k30_totalcom = k30_usd * k30_ComPerOne;
		int k30_i_totalcom;
		
		if (k30_totalcom != (double)((int)k30_totalcom)) {
			k30_i_totalcom = (int)k30_totalcom + 1;
		} else {
			k30_i_totalcom = (int)k30_totalcom;
		}
		
		System.out.printf("********************************************************************\n");
		System.out.printf("*     	              (정확환) 수수료 적용환전       	     		   *\n");
		
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k30_i_totalcom, k30_usd, k30_ComPerOne);
		
		int k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx - k30_i_totalcom);
		System.out.printf("총 한화환전금액: %d원=> 미화: %d달러, 수수료징수: %d원 잔돈: %d원\n", k30_MyWon, k30_usd, k30_i_totalcom, k30_remain);
		
		System.out.printf("********************************************************************\n");
	}

}
