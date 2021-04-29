package HW6;

public class P12TestMain3Elevator3 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		Elevator3 k30_elev3;//Elevator 클래스를 받아서 객체를 만든다.
		
		k30_elev3 = new Elevator3();//인스턴스를 생성하여서 객체에 연결한다.
		
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_elev3.up();//아까 받아온 객체를 사용하여 Elevator3클래스의 up메소드를 실행한다.
			System.out.printf("MSG elev3[%s]\n", k30_elev3.k30_help);//아까 받아온 객체를 사용하여 Elevator3클래스의 변수 help를 화면에 출력한다.
		}
		
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_elev3.down();//아까 받아온 객체를 사용하여 Elevator3클래스의 down메소드를 실행한다.
			System.out.printf("MSG elev3[%s]\n", k30_elev3.k30_help);//아까 받아온 객체를 사용하여 Elevator3클래스의 변수 help를 화면에 출력한다.
		}
		k30_elev3.Repair();//아까 받아온 객체를 사용하여 Elevator3클래스의 Repair메소드를 실행한다.
		System.out.printf("MSG elev3[%s]\n", k30_elev3.k30_help);//아까 받아온 객체를 사용하여 Elevator3클래스의 변수 help를 화면에 출력한다.
	}

}
