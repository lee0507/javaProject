package HW2;

public class P7 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		String k30_url = "www.codechobo.com";// 문자열 변수 k30_url을 정의하고 www.codechobo.com을 저장한다.
		
		float k30_f1 = .10f;// 실수형 변수 k30_f1을 정의하고 0.10으로 초기화
		float k30_f2 = 1e1f;// 실수형 변수 k30_f2을 정의하고 10으로 초기화(1e1은 e뒤의 숫자만큼 10을 곱해준다)
		float k30_f3 = 3.14e3f;// 실수형 변수 k30_f3을 정의하고 3140으로 초기화(3.14e3은 e뒤의 숫자만큼 10을 곱해준다)
		double k30_d = 1.23456789;// 실수형 변수 k30_d을 정의하고 1.23456789으로 초기화
		
		System.out.printf("f1=%f, %e, %g\n", k30_f1, k30_f1, k30_f1);//k30_f1을 %f, %e, %g 세가지 형태로 출력한다.
		System.out.printf("f2=%f, %e, %g\n", k30_f2, k30_f2, k30_f2);//k30_f2을 %f, %e, %g 세가지 형태로 출력한다.
		System.out.printf("f3=%f, %e, %g\n", k30_f3, k30_f3, k30_f3);//k30_f3을 %f, %e, %g 세가지 형태로 출력한다.
		//%f는 고정 소수점 실수로 출력, %e는 지수표현식으로 출력, %g는 소수점 이하 자리수가 고정 또는 부동소수점으로 출력한다.
		
		System.out.printf("d=%f\n", k30_d);//k30_d를 고정 소수점 실수로 출력한다.
		System.out.printf("d=%14.10f\n", k30_d);//k30_d를 14자리 할당하고 오른쪽으로 정렬 후 소수점 아래 10자리까지 출력한다.
		
		System.out.printf("[12345678901234567890]\n");//[12345678901234567890]를 출력한다.
		System.out.printf("[%s]\n", k30_url);//k30_url을 %s로 출력한다.(%s는 문자열 출력을 의미한다)
		System.out.printf("[%20s]\n", k30_url);//k30_url변수를 화면에 출력한다.(%20s는 20자리를 할당하고 오른쪽 정렬해서 출력한다)
		System.out.printf("[%-20s]\n", k30_url);//k30_url변수를 화면에 출력한다.(%-20s는 20자리를 할당하고 왼쪽 정렬해서 출력한다)
		System.out.printf("[%.8s]\n", k30_url);//k30_url변수를 화면에 출력한다.(%.8s는 앞에서부터 8자리만 출력한다)

	}

}
