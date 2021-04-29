package HW6;

public class P8elevator2 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		Elevator k30_elev;//Elevator 클래스를 받아서 객체를 만든다.
		k30_elev = new Elevator();//인스턴스를 생성하여서 객체에 연결한다.
		
		for (int i = 0; i < 10; i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_elev.up();//아까 받아온 객체를 사용하여 Elevator클래스의 up메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//아까 받아온 객체를 사용하여 Elevator클래스의 변수 help를 화면에 출력한다.
		}
		
		for (int i = 0; i < 10; i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_elev.down();//아까 받아온 객체를 사용하여 Elevator클래스의 down메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//아까 받아온 객체를 사용하여 Elevator클래스의 변수 help를 화면에 출력한다.
		}
		System.out.println();//줄바꿈을 화면에 출력한다.
		
		Elevator2 elevUP = new Elevator2(5);//elevUP 클래스에 파라미터를 5로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("MSG elevUP[%s]\n", elevUP.k30_help);
		//아까 받아온 객체를 사용하여 Elevator2클래스의 변수 help를 화면에 출력한다.
		
		Elevator2 elevDN = new Elevator2(-5);//elevDN 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("MSG elevDN[%s]\n", elevDN.k30_help);
		//아까 받아온 객체를 사용하여 Elevator2클래스의 변수 help를 화면에 출력한다.
	}

}
