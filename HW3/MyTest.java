package HW3;

public class MyTest {

	public static void main(String[] args) {
		int price = 1234;//숫자형변수 price를 정의하고 1234라는 값을 저장한다.
		double tax_rate = 0.1;//실수형 변수 tax_rate를 정의하고 0.1이라는 값을 저장한다.
		
		int netprice = netprice(price, tax_rate);//숫자형 변수 netprice를 정의하고 netprice라는 함수안에 price와 tax_rate를 넣은 값을 변수에 저장한다.
		int tax = price - netprice;//숫자형 변수 tax를 정의하고 price - netprice값을 저장한다.
		
		System.out.printf("*****************************************\n");
		System.out.printf("*	소비자가, 세전가격, 세금 계산		*\n");
		System.out.printf("*소비자가격 : %d, 세전가격: %d, 세금: %d\n", price, netprice, tax);//price와 netprice, tax 변수를 출력한다.
		System.out.printf("*****************************************\n");

	}
	
	public static int netprice(int price, double rate) {//netprice라는 함수 선언하고 파라미터로 숫자형변수 price와 실수형 변수 rate를 지정한다.
		return (int)(price/ (1+rate));// 리턴값으로 숫자형으로 형변환한 (price / (1 + rate))값을 저장한다.
	}

}
