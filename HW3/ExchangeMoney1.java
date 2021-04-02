package HW3;

public class ExchangeMoney1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k30_MyWon = 1000000;//숫자형 변수 k30_MyWon을 정의하고 1000000을 저장한다.
		double k30_MoneyEx = 1238.21;// 실수형 변수 k30_MoneyEx를 정의하고 1238.21을 저장한다.
		double k30_commission = 0.003;// 실수형 변수 k30_commission을 정의하고 0.003을 저장한다.
		
		int k30_usd = (int)(k30_MyWon / k30_MoneyEx);// 숫자형 변수 k30_usd를 정의하고 숫자형으로 형변환한 (k30_MyWon / k30_MoneyEx)값을 저장한다.
		int k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx);//숫자형 변수 k30_remain을 정의하고 숫자형으로 형변환한 (k30_MyWon - k30_usd * k30_MoneyEx)값을 저장한다.
		
		System.out.printf("************************************************\n");
		System.out.printf("*		수수료없이 계산		       *\n");
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", k30_MyWon, k30_usd, k30_remain);//변수 k30_MyWon, k30_usd, k30_remain을 출력한다.
		System.out.printf("************************************************\n");
	}

}
