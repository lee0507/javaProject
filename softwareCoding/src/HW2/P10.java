package HW2;

public class P10 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		int k30_i = 10;//숫자형 변수 k30_i를 정의하고 10으로 초기화
		byte k30_b = (byte)k30_i;// 자료형 변수 k30_b를 정의하고 자료형으로 형변환한 k30_i로 초기화
		System.out.printf("[int -> byte] i=%d -> b=%d\n", k30_i, k30_b);//k30_i와 k30_i를 byte로 형변환한 k30_b를 출력한다.
		
		k30_i = 300;//숫자형 변수 k30_i를 정의하고 값을 300으로 저장한다.
		k30_b = (byte)k30_i;//(byte)로 형변환하면 256을 0으로 놓고 300은 256보다 44만큼 크기때문에 44가 저장된다.
		System.out.printf("[int -> byte] i=%d -> b=%d\n", k30_i, k30_b);//k30_i와 k30_i를 byte로 형변환한 k30_b를 출력한다.
		
		k30_b = 10;//자료형 변수 k30_b를 정의하고 값을 10으로 저장한다.
		k30_i = (int)k30_b;// 숫자형 변수 k30_i에 숫자형으로 형변환한 k30_b를 저장한다.
		System.out.printf("[byte -> int] b=%d -> i=%d\n", k30_b, k30_i);//k30_b와 k30_b를 숫자형으로 형변환한 k30_i를 출력한다.
		
		k30_b = -2;//자료형 변수 k30_b를 정의하고 값을 -2로 저장한다.
		k30_i = (int)k30_b;// 숫자형 변수 k30_i에 숫자형으로 형변환한 k30_b를 저장한다.
		System.out.printf("[byte -> int] b=%d -> i=%d\n", k30_b, k30_i);//k30_b와 k30_b를 숫자형으로 형변환한 k30_i를 출력한다.

		System.out.println("i=" + Integer.toBinaryString(k30_i));//2진수로 형변환한 k30_i를 출력한다.
		//2 ^ 32-2 = 4294967294이고, 이진수에서는 11111111111111111111111111111110이므로 반환되는 문자열이다.


	}

}
