package HW4;

import java.text.DecimalFormat;

public class sortPrint1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		String k30_item = "사과";// 문자열형 변수 k30_item을 정의하고 값을 사과로 초기화한다.
		int k30_unit_price = 5000;//숫자형 변수 k30_unit_price를 정의하고 값을 5000으로 초기화한다.
		int k30_num = 500;//숫자형 변수 k30_num을 정의하고 값을 500으로 초기화한다.
		int k30_total = 0;//숫자형 변수 k30_total를 정의하고 값을 0으로 초기화한다.
		
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###,###");
		//k30_df라는 이름의 인스턴스를 생성하고 new 명령으로, 3자리수마다 ,comma가 출력되도록 지정한다.
		System.out.printf("=======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%10.10s\n", "품목", "단가", "수량", "합계");
		//최소 20자리 최대 20자리를 만들고 문자열 품목을 출력한다, 나머지는 최소 8자리 최대 8자리를 만들고 문자열 단가, 수량, 합계를 출력한다.
		System.out.printf("=======================================================\n");
		
		System.out.printf("%20.20s%9.9s%9.9s%10.9s\n", k30_item, k30_df.format(k30_unit_price), k30_df.format(k30_num), k30_df.format(k30_unit_price * k30_num));
		//최소 20자리 최대 20자리를 만들고 문자열 k30_item을 출력한다, 나머지는 최소 8자리 최대 8자리를 만들고 
		//문자열 k30_df.format(k30_unit_price), k30_df.format(k30_num), k30_df.format(k30_unit_price * k30_num)를 출력한다.
		//df.format을 통해 위에 설정한 3자리수 마다 ,comma가 찍히도록 형식을 지정한다.
		System.out.printf("=======================================================\n");
	}

}
