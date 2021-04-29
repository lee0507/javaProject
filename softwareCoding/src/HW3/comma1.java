package HW3;

import java.text.DecimalFormat;

public class comma1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작

		int k30_MyWon = 1000000;//숫자형 변수 k30_MyWon을 정의하고 1000000을 저장한다.
		double k30_MoneyEx = 1238.21;// 실수형 변수 k30_MoneyEx를 정의하고 1238.21을 저장한다.
		double k30_commission = 0.003;// 실수형 변수 k30_commission을 정의하고 0.003을 저장한다.
		double k30_ComPerOne = k30_MoneyEx * k30_commission;// 실수형 변수 k30_ComPerOne을 정의하고 k30_MoneyEx * k30_commission 값을 저장한다.
		
		int k30_usd = (int)(k30_MyWon / (k30_MoneyEx + k30_ComPerOne));// 숫자형 변수 k30_usd를 정의하고 숫자형으로 형변환한 (k30_MyWon / k30_MoneyEx)값을 저장한다.
		double k30_totalcom = k30_usd * k30_ComPerOne;// 실수형 변수 k30_totalcom을 정의하고 k30_usd * k30_ComPerOne 값을 저장한다.
		int k30_i_totalcom;// 숫자형 변수 k30_i_totalcom을 정의한다.
		
		if (k30_totalcom != (double)((int)k30_totalcom)) {//만약 k30_totalcom이 숫자형으로 형변환한 k30_totalcom을 다시 실수형으로 형변환 한 것과 같지 않다면 
			k30_i_totalcom = (int)k30_totalcom + 1;//k30_i_totalcom에 숫자형으로 형변환한 k30_totalcom에 1을 더한 값을 저장한다.
		} else {
			k30_i_totalcom = (int)k30_totalcom;// 만약 그렇지 않다면 k30_i_totalcom은 숫자형으로 형변환한 k30_totalcom을 저장한다.
		}
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");//숫자 3자리마다 ,를 찍을 수 있도록 DecimalFormat 클래스를 사용한다.
		
		System.out.printf("*****************************************************************\n");
		System.out.printf("*			콤마찍기,날짜 적용				*\n");
		
		System.out.printf("총 수수료: %s원=> 미화: %s달러, 달러당 수수료: %f원\n",
				df.format(k30_i_totalcom), df.format(k30_usd), k30_ComPerOne);//format을 위에 지정한 3자리마다 ,를 찍도록 변경하고 k30_i_totalcom과 k30_usd를 출력하고 k30_ComPerOne은 그냥 출력한다.
		
		int k30_remain = (int)(k30_MyWon - k30_usd * k30_MoneyEx - k30_i_totalcom); // 숫자형 변수 k30_remain에 숫자형으로 형변환한 k30_MyWon - k30_usd * k30_MoneyEx - k30_i_totalcom를 저장한다.
		
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료징수:%s원 잔돈: %s원\n",
				df.format(k30_MyWon),df.format(k30_usd),df.format(k30_i_totalcom),df.format(k30_remain));
	}//format을 위에 지정한 3자리마다 ,를 찍도록 변경하고 k30_i_totalcom과 k30_usd, k30_i_totalcom 그리고 k30_remain을 출력한다.

}
