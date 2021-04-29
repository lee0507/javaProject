package HW6;

public class Elevator3 extends Elevator2 {//클래스를 선언하고 Elevator2를 상속받는다.
	void Repair() {//Repair라는 함수 생성
		k30_help = String.format("수리중입니다");//변수 help에 floor를 string으로 형변환한 수리중입니다를 값으로 저장한다. 
	}
	
	void up() {//up이라는 함수 생성
		if (k30_floor == k30_limit_up_floor) {//만약 변수 floor가 최상위층인 limit_up_floor와 같아진다면
			k30_help = "마지막층입니다";//변수 help에 마지막층입니다를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_floor = k30_floor + 2;//변수 floor를 2 증가시킨다.
			k30_help = String.format("%d층입니다", k30_floor);//변수 help에 floor를 string으로 형변환한 %d층입니다를 값으로 저장한다. 
		}
		this.down();//this는 현재 클래스의 down을 의미하고
	}
	
	void down() {//down이라는 함수 생성
		super.down();//super는 자기 부모에 있는 down을 의미한다.
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k30_help);//변수 help에 floor를 string으로 형변환한 %d층입니다를 값으로 저장한다. 
	}
}
