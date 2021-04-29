package HW2;

public class P6 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		byte k30_b = 1; //문자형 변수 k30_b를 정의하고 1로 초기화
		short k30_s = 2; //문자형 변수 k30_s를 정의하고 2로 초기화
		char k30_c = 'A'; //문자형 변수 k30_c를 정의하고 A로 초기화
		
		int k30_finger = 10; //숫자형 변수 k30_finger를 정의하고 10으로 초기화
		long k30_big = 1000000000000L; //숫자형 변수 k30_big을 정의하고 100000000000으로 초기화(뒤의 L을 붙여야 파일에러가 발생하지 않음)
		long k30_hex = 0xFFFFFFFFFFFFFFFFL; //숫자형 변수 k30_hex를 정의하고 0xFFFFFFFFFFFFFFFF으로 초기화(뒤의 L을 붙여야 파일에러가 발생하지 않음)
		//16진수는 0x로 시작하고 0 ~ 9와 A,B,C,D,E,F로 구성된다.
		int k30_octNum = 010;//숫자형 변수 k30_octNum을 정의하고 010으로 초기화
		//8진수는 0으로 시작하고 0 ~ 7로 구성된다.
		int k30_hexNum = 0x10;//숫자형 변수 k30_hexNum을 정의하고 0x10으로 초기화
		int k30_binNum = 0b10;//숫자형 변수 k30_binNum을 정의하고 0b10으로 초기화
		//2진수는 0b로 시작하고 0과 1로 구성된다
		
		System.out.printf("b=%d\n", k30_b);//k30_b변수를 화면에 출력한다.
		System.out.printf("s=%d\n", k30_s);//k30_s변수를 화면에 출력한다.
		System.out.printf("c=%c, %d \n", k30_c, (int)k30_c);//k30_c변수와 숫자형으로 형변환한 k30_c가 화면에 출력한다.
		System.out.printf("finger=[%5d]\n", k30_finger);//k30_finger변수를 화면에 출력한다.(%5d는 5자리를 할당하고 오른쪽 정렬해서 출력한다)
		System.out.printf("finger=[%-5d]\n", k30_finger);//k30_finger변수를 화면에 출력한다.(%-5d는 5자리를 할당하고 왼쪽 정렬해서 출력한다)
		System.out.printf("finger=[%05d]\n", k30_finger);//k30_finger변수를 화면에 출력한다.(%05d는 5자리를 할당하고 오른쪽 정렬하고 나머지는 0으로 출력한다)
		System.out.printf("big=%d\n", k30_big);//k30_big변수를 화면에 출력한다.
		System.out.printf("hex=%#x\n", k30_hex);//k30_hex변수를 화면에 출력한다.(%x는 16진수 출력을 의미한다)
		System.out.printf("octNum=%o, %d\n", k30_octNum, k30_octNum);//k30_octNum변수를 %o로 출력하고 k30_octNum변수를 %d로 화면에 출력한다.(%o는 8진수 출력을 의미한다)
		System.out.printf("hexNum=%x, %d\n", k30_hexNum, k30_hexNum);//k30_hexNum변수를 %x로 출력하고 k30_hexNum변수를 %d로 화면에 출력한다.(%x는 16진수 출력을 의미한다)
		System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(k30_binNum), k30_binNum);//10진수를 2진수로 형변환한 k30_octNum변수를 %s로 출력하고 k30_octNum변수를 %d로 화면에 출력한다.(%s는 문자열 출력을 의미한다)
		//16진수 toHexString으로 8진수는 toOctalString으로 변환한다.
	}

}
