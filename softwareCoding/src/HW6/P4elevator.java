package HW6;

public class P4elevator {//클래스 선언
	
	static int k30_inVal;//숫자형 전역변수 inVal을 정의한다.
	
	public static void up() {//up 라는 함수 생성
		k30_inVal++;//변수 inVal를 1 증가시킨다.
		System.out.printf("난 그냥 메소드[%d]\n", k30_inVal);//변수 inVal을 화면에 출력한다.
	}
	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		
		k30_inVal = 0;//클래스 내부의 변수 inVal의 값을 0으로 저장한다.
		Elevator k30_elev;//Elevator 클래스를 받아서 객체를 만든다.
		k30_elev = new Elevator();//인스턴스를 생성하여서 객체에 연결한다.
		
		up();// 클래스 내부의 메소드를 up을 실행한다.
		
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_elev.up();//아까 받아온 객체를 사용하여 Elevator클래스의 up메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//아까 받아온 객체를 사용하여 Elevator클래스의 변수 help를 화면에 출력한다.
		}
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_elev.down();//아까 받아온 객체를 사용하여 Elevator클래스의 down메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//아까 받아온 객체를 사용하여 Elevator클래스의 변수 help를 화면에 출력한다.
		}
		
	}
	
}
