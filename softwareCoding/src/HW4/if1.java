package HW4;

public class if1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_score = 100;//숫자형 변수 k30_score을 정의하고 값을 100으로 초기화한다.
		
		if (k30_score > 60) {//만약 k30_score가 60보다 크다면
			System.out.println("합격입니다!");//합격입니다를 화면에 출력한다.
		}
		
		if (k30_score < 60)//만약 k30_score가 60보다 크다면
			System.out.println("합격입니다");//합격입니다를 화면에 출력한다.
		
		k30_score = 40;//k30_score에 값인 40을 저장한다.
		if (k30_score > 60) {//만약 k30_score가 60보다 크다면
			System.out.println("합격입니다");//합격입니다를 화면에 출력한다.
		} else {//만약 if의 조건을 만족하지 않는다면
			System.out.println("불합격입니다");//불합격입니다를 화면에 출력한다.
		}
		
		int k30_num = 1;// 숫자형 변수 k30_num을 정의하고 값을 1로 초기화한다.
		if (k30_num > 0) {//만약 k30_num이 0보다 크다면
			System.out.println("양수입니다!");//양수입니다를 화면에 출력한다.
		} else if (k30_num < 0) {//만약 k30_num이 0보다 작다면
			System.out.println("음수입니다!");//음수입니다를 화면에 출력한다.
		} else {//만약 위의 조건들을 만족하지 않는다면
			System.out.println("0입니다!");//0입니다를 화면에 출력한다.
		}
		
		k30_score = 70;// 숫자형 변수 k30_score의 값을 70으로 저장한다.
		if (k30_score >= 90) {//만약 k30_score가 90과 같거나 크다면
			System.out.println("A등급");//A등급을 화면에 출력한다.
		} else if(k30_score >= 80 && k30_score < 90) {//만약 k30_score가 80과 같거나 크고, 90보다 작으면
			System.out.println("B등급");//B등급을 화면에 출력한다.
		} else if(k30_score >= 70 && k30_score < 80) {//만약 k30_score가 70과 같거나 크고, 80보다 작으면
			System.out.println("C등급");//C등급을 화면에 출력한다.
		} else {//만약 위의 조건들을 만족하지 않는다면
			System.out.println("F등급");//F등급을 화면에 출력한다.
		}
	}

}
