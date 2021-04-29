package HW3;

public class ExchangeMoney4 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작

		int k30_MyWon = 1000000;// 숫자형 변수 k30_MyWon을 정의하고 1000000이라는 값을 저장한다.
		double k30_MoneyEx = 1238.21;// 실수형 변수 k30_MoneyEx를 정의하고 1238.21이라는 값을 저장한다.
		double k30_commission = 0.003;// 실수형 변수 k30_commission을 정의하고 0.003이라는 값을 저장한다.
		double k30_ComPerOne = k30_MoneyEx * k30_commission;// 실수형 변수 k30_ComPerOne을 정의하고 k30_MoneyEx * k30_commission 값을 저장한다.
		
		int k30_usd = (int)(k30_MyWon / (k30_MoneyEx + k30_ComPerOne));// 숫자형 변수 k30_usd를 정의하고 숫자형으로 변환한 (k30_MyWon / (k30_MoneyEx + k30_ComPerOne)) 값을 저장한다.
		double k30_totalcom = k30_usd * k30_ComPerOne;// 실수형 변수 k30_totalcom을 정의하고  k30_usd * k30_ComPerOne을 저장한다.
		int k30_i_totalcom;// 숫자형 변수 k30_i_totalcom을 정의한다.
		
		if (k30_totalcom != (double)((int)k30_totalcom)) {//만약 k30_totalcom이 숫자형으로 형변환한 k30_totalcom을 다시 실수형으로 형변환 한 것과 같지 않다면 
			k30_i_totalcom = (int)k30_totalcom + 1;//k30_i_totalcom에 숫자형으로 형변환한 k30_totalcom에 1을 더한 값을 저장한다.
		} else {
			k30_i_totalcom = (int)k30_totalcom;// 만약 그렇지 않다면 k30_i_totalcom은 숫자형으로 형변환한 k30_totalcom을 저장한다.
		}
		
		System.out.printf("********************************************************************\n");
		System.out.printf("*     	              (정확환) 수수료 적용환전       	     		   *\n");
		
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k30_i_totalcom, k30_usd, k30_ComPerOne); // 변수 k30_i_totalcom, k30_usd, k30_ComPerOne을 출력한다.
		
		int k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx - k30_i_totalcom);// 변수 k30_remain에 숫자형으로 형변환한 k30_MyWon - k30_usd * k30_MoneyEx - k30_i_totalcom를 저장한다.
		System.out.printf("총 한화환전금액: %d원=> 미화: %d달러, 수수료징수: %d원 잔돈: %d원\n", k30_MyWon, k30_usd, k30_i_totalcom, k30_remain);
		// 변수 k30_MyWon, k30_usd, k30_i_totalcom, k30_remain을 출력한다.
		System.out.printf("********************************************************************\n");
	}

}
