package HW3;

public class MyTest {

	public static void main(String[] args) {
		int k30_price = 1234;//숫자형변수 k30_price를 정의하고 1234라는 값을 저장한다.
		double k30_tax_rate = 0.1;//실수형 변수 k30_tax_rate를 정의하고 0.1이라는 값을 저장한다.
		
		int k30_netprice = k30_netprice(k30_price, k30_tax_rate);//숫자형 변수 k30_netprice를 정의하고 k30_netprice라는 함수안에 k30_price와 k30_tax_rate를 넣은 값을 변수에 저장한다.
		int k30_tax = k30_price - k30_netprice;//숫자형 변수 k30_tax를 정의하고 k30_price - k30_netprice값을 저장한다.
		
		System.out.printf("*****************************************\n");
		System.out.printf("*	소비자가, 세전가격, 세금 계산		*\n");
		System.out.printf("*소비자가격 : %d, 세전가격: %d, 세금: %d\n", k30_price, k30_netprice, k30_tax);//k30_price와 k30_netprice, k30_tax 변수를 출력한다.
		System.out.printf("*****************************************\n");

	}
	
	public static int k30_netprice(int k30_price, double k30_rate) {//k30_netprice라는 함수 선언하고 파라미터로 숫자형변수 k30_price와 실수형 변수 k30_rate를 지정한다.
		return (int)(k30_price / (1 + k30_rate));// 리턴값으로 숫자형으로 형변환한 (k30_price / (1 + k30_rate))값을 저장한다.
	}

}
