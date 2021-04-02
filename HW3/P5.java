package HW3;

public class P5 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		int k30_MyVal = 14 / 5;// k30_MyVal이라는 숫자형 변수를 정의하고 14 / 5라는 값을 저장
		System.out.printf("#5-1 : %d\n" , k30_MyVal);// 변수 k30_MyVal을 화면에 출력
		
		double k30_MyValF;// k30_MyValF라는 실수형 변수를 정의
		
		k30_MyValF = 14 / 5;// k30_MyValF에 14 / 5라는 값을 저장
		System.out.printf("#5-2 : %f\n" , k30_MyValF);// 변수 k30_MyValF을 화면에 출력
		
		k30_MyValF = 14.0 / 5;// k30_MyValF에 14.0 / 5라는 값을 저장
		System.out.printf("#5-3 : %f\n" , k30_MyValF);// 변수 k30_MyValF을 화면에 출력
		
		k30_MyValF = (14.0) / 5 + 0.5;// k30_MyValF에 14.0 / 5 + 0.5라는 값을 저장
		System.out.printf("#5-4 : %f\n" , k30_MyValF);// 변수 k30_MyValF을 화면에 출력
		
		k30_MyVal = (int)((14.0) / 5 + 0.5);// k30_MyValF에 14.0 / 5 + 0.5라는 값을 숫자형으로 변환하고 저장
		System.out.printf("#5-5 : %d\n" , k30_MyVal);// 변수 k30_MyVal을 화면에 출력

	}

}
