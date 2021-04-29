package HW3;

public class Taxcalc1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작

		int k30_val = 271;// k30_Val이라는 숫자형 변수를 정의하고 271이라는 값을 저장
		int k30_rate = 5;// k30_rate라는 숫자형 변수를 정의하고 5라는 값을 저장
		
		int k30_tax = taxcal(k30_val, k30_rate);//아래 만든 taxcal이라는 함수를 통해  k30_tax라는 숫자형 변수에 k30_val과 k30_rate를 계산하여 값을 저장한다.
		
		System.out.printf("**************************************\n");
		System.out.printf("*      	      단순 세금 계산      	     *\n");
		System.out.printf("실제 세금계산: %f\n" , k30_val * k30_rate / 100.0);// (변수 k30_val * k30_rate / 100.0)을 화면에 출력
		
		System.out.printf("세전가격: %d 세금:%d 세포함가격: %d\n", k30_val, k30_tax, k30_val + k30_tax);// (변수 k30_val과 k30_tax와 k30_val + k30_tax를 화면에 출력
		
		System.out.printf("**************************************\n");
	}
	
	public static int taxcal(int k30_val, int k30_rate) {
		int k30_ret;// k30_ret이라는 숫자형 변수 정의
		
		if((double)k30_val * (double)k30_rate/100.0 == k30_val * k30_rate / 100) {//만약 실수형으로 형변환한 k30_val과 실수형으로 형변환한 k30_rate 곱한 값을 100으로 나눈 값이
			k30_ret = k30_val * k30_rate / 100;						//k30_val과 k30_rate를 곱하고 100으로 나눈 값과 같다면 k30_ret은 k30_val과 k30_rate를 100으로 나눈값으로 저장한다.
		} else {
			k30_ret = k30_val * k30_rate / 100 + 1;//그렇지 않다면 k30_ret은 k30_val * k30_rate /100을하고 더하기 1을 한 값으로 저장한다.
		}
		
		return k30_ret;//k30_ret의 값을 리턴한다.
	}

}


