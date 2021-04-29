package HW2;

public class P1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		int k30_year = 0;//숫자형 변수 k30_year를 정의하고 값을 0으로 초기화
		int k30_age = 14;//숫자형 변수 k30_age를 정의하고 값을 14로 초기화
		
		System.out.println(k30_year);//k30_year변수를 화면에 출력한다.
		System.out.println(k30_age);//k30_age변수를 화면에 출력한다.
		
		k30_year = k30_age + 2000;//변수 k30_age의 값에 2000을 더해서 변수 k30_year에 저장한다.
		k30_age = k30_age + 1;//변수 k30_age의 값을 1 증가시킨다.
		
		System.out.println(k30_year);//다시 k30_year변수를 화면에 출력
		System.out.println(k30_age);//다시 k30_age변수를 화면에 출력

	}

}
