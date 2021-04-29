package HW6;

public class Elevator {//클래스 선언
	int k30_limit_up_floor = 10;// 숫자형 전역변수 limit_up_floor를 정의하고 값을 10으로 초기화한다.
	int k30_limit_down_floor = 0;// 숫자형 전역변수 limit_down_floor를 정의하고 값을 0으로 초기화한다.
	int k30_floor = 1;// 숫자형 전역변수 floor를 정의하고 값을 1으로 초기화한다.
	String k30_help;// 문자열형 전역변수 help를 정의한다.
	
	void up() {//up이라는 함수 생성
		if (k30_floor == k30_limit_up_floor) {//만약 변수 floor가 최상위층인 limit_up_floor와 같아진다면
			k30_help = "마지막층입니다";//변수 help에 마지막층입니다를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_floor++;//변수 floor를 1 증가시킨다.
			k30_help = String.format("%d층입니다", k30_floor);//변수 help에 floor를 string으로 형변환한 %d층입니다를 값으로 저장한다. 
			
		}

	}
	
	void down() {//down이라는 함수 생성
		if (k30_floor == k30_limit_down_floor) {//만약 변수 floor가 최하위층인 limit_down_floor와 같아진다면
			k30_help = "처음층입니다";//변수 help에 처음층입니다를 값으로 저장한다.
		} else {//if조건을 만족하지 않는 경우라면
			k30_floor--;//변수 floor를 1 감소시킨다.
			k30_help = String.format("%d층입니다", k30_floor);//변수 help에 floor를 string으로 형변환한 %d층입니다를 값으로 저장한다. 
		}
	}

}
