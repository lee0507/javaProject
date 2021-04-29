package HW4;

public class findNumber1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_iVal;//숫자형 변수 k30_iVal을 정의한다.
		for (int k30_i = 0; k30_i < 300; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 300보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_iVal = 5 * k30_i;//변수 k30_iVal에 5 * k30_i 값을 저장한다.
			if (k30_iVal >= 0 && k30_iVal < 10) System.out.printf("일 %d\n", k30_iVal);
			//만약 k30_iVal이 0보다 크거나 같고 10보다 작으면 일의자리수를 표현한 일과 k30_iVal을 출력한다.
			else if (k30_iVal >= 10 && k30_iVal < 100) System.out.printf("십 %d\n", k30_iVal);
			//만약 k30_iVal이 10보다 크거나 같고 100보다 작으면 십의자리수를 표현한 십과 k30_iVal을 출력한다.
			else if (k30_iVal >= 100 && k30_iVal < 1000) System.out.printf("백 %d\n", k30_iVal);
			//만약 k30_iVal이 100보다 크거나 같고 1000보다 작으면 백의자리수를 표현한 백과 k30_iVal을 출력한다.
			else System.out.printf("천 %d\n", k30_iVal);
			//만약 k30_iVal이 위의 조건들을 다 만족하지 못하면 천의자리수를 표현한 천과 k30_iVal을 출력한다.
		}
	}

}
