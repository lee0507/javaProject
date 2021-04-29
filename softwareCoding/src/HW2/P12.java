package HW2;

public class P12 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		int k30_i = 91234567;// 숫자형 변수 k30_i을 정의하고 91234567값으로 초기화
		float k30_f = (float)k30_i;// 실수형 변수 k30_f를 정의하고 실수형으로 형변환한 k30_i값으로 초기화
		int k30_i2 = (int)k30_f;// 숫자형 변수 k30_i2를 정의하고 숫자형으로 형변환한 k30_f로 초기화
		
		double k30_d = (double)k30_i;// 실수형 변수 k30_d를 정의하고 실수형으로 형변환한 k30_i값으로 초기화
		int k30_i3 = (int)k30_d;//숫자형 변수 k30_i3를 정의하고 숫자형으로 형변환한 k30_d값으로 초기화
		
		float k30_f2 = 1.666f;//실수형 변수 k30_f2를 정의하고 1.666값으로 초기화
		int k30_i4 = (int)k30_f2;//숫자형 변수 k30_i4를 정의하고 숫자형으로 형변환한 k30_f2값으로 초기화
		
		System.out.printf("i=%d\n", k30_i);//k30_i변수를 화면에 출력한다.
		System.out.printf("f=%f i2=%d\n", k30_f, k30_i2);//k30_f변수와 k30_i2를 화면에 출력한다.
		System.out.printf("d=%f i3=%d\n", k30_d, k30_i3);//k30_d변수와 k30_i3를 화면에 출력한다.
		System.out.printf("(int)%f=%d\n", k30_f2, k30_i4);//k30_f2변수와 k30_i4를 화면에 출력한다.

	}

}
