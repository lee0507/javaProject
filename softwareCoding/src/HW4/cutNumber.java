package HW4;

public class cutNumber {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		String [] k30_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};//문자열형 배열 k30_units을 정의하고 값을 순서대로 입력한다.
		for (int k30_i = 0; k30_i < 101; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 101보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			if (k30_i >= 0 && k30_i < 10) {//만약 k30_i이 0보다 같거나 크고, k30_i가 10보다 작으면
				System.out.printf("일의자리 : %s\n", k30_units[k30_i]);//변수 k30_units[k30_i]를 화면에 출력한다.(k30_units의 인덱스 값이 변하면서 출력된다.)
			} else if (k30_i >= 10 && k30_i < 100) {// 만약 k30_i이 10보다 같거나 크고, k30_i가 100보다 작으면
				int k30_i10, k30_i0;//숫자형 변수 k30_i10과 k30_i0을 정의한다.
				k30_i10 = k30_i / 10;//숫자형 변수 k30_i10에 k30_i / 10의 값을 저장한다.(/은 나눈 값의 몫을 의미한다.)
				k30_i0 = k30_i % 10;//숫자형 변수 k30_i10에 k30_i % 10의 값을 저장한다.(%은 나눈 값의 나머지를 의미한다.)
				if (k30_i0 == 0) {//만약 k30_i0가 0이라면
					System.out.printf("십의자리 : %s십\n", k30_units[k30_i10]);//변수 k30_units[k30_i10]를 화면에 출력한다.(k30_units의 인덱스 값이 변하면서 출력된다.)
				} else {//만약 k30_i0이 아니라면 변수 k30_units[k30_i10]과 k30_units[k30_i0]를 화면에 출력한다.(k30_units의 인덱스 값이 변하면서 출력된다.)
					System.out.printf("십의자리 : %s십%s\n", k30_units[k30_i10], k30_units[k30_i0]);
				}
			} else {//만약 k30_i가 if의 조건(k30_i가 0보다 크거나 같고, 10보다 작으면)과 else if의 조건(k30_i가 10보다 크거나 같고 100보다 작으면)을 만족하지 않으면
				System.out.printf("==> %d\n", k30_i);//숫자형 변수 k30_i을 화면에 출력한다.
			}

		}
	}

}
