package HW3;

public class ExchangeMoney3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k30_MyWon = 1000000;//숫자형 변수 k30_MyWon을 정의하고 1000000을 저장한다.
		double k30_MoneyEx = 1238.21;// 실수형 변수 k30_MoneyEx를 정의하고 1238.21을 저장한다.
		double k30_commission = 0.003;// 실수형 변수 k30_commission을 정의하고 0.003을 저장한다.

		int k30_usd = (int)(k30_MyWon / k30_MoneyEx);// 숫자형 변수 k30_usd를 정의하고 숫자형으로 형변환한 (k30_MyWon / k30_MoneyEx)값을 저장한다.
		int k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx);//숫자형 변수 k30_remain을 정의하고 숫자형으로 형변환한 (k30_MyWon - k30_usd * k30_MoneyEx)값을 저장한다.
		double k30_ComPerOne = k30_MoneyEx * k30_commission;// 실수형 변수 k30_ComPerOne을 정의하고 (k30_MoneyEx * k30_commission)값을 저장한다.
		double k30_totalcom = k30_usd * k30_ComPerOne;// 실수형 변수 k30_totalcom을 정의하고 k30_usd * k30_ComPerOne값을 저장한다.
		
		k30_usd = (int)(k30_MyWon / (k30_MoneyEx + k30_ComPerOne));
		k30_totalcom = k30_usd * k30_ComPerOne;
		
		int k30_i_totalcom;//숫자형 변수 k30_i_totalcom을 정의한다.
		if (k30_totalcom != (double)((int)k30_totalcom)) {//만약 k30_totalcom이 
			k30_i_totalcom = (int)k30_totalcom + 1;
		} else {
			k30_i_totalcom = (int)k30_totalcom;
		}
		System.out.printf("*****************************************************************\n");
		System.out.printf("*			수수료 적용환전		      	        *\n");
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k30_i_totalcom, k30_usd, k30_ComPerOne);
		System.out.printf("*****************************************************************\n");
		
		k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx - k30_i_totalcom);
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징수: %d원 잔돈: %d원\n", k30_MyWon, k30_usd, k30_i_totalcom, k30_remain);
		System.out.printf("*****************************************************************\n");
	}

}
