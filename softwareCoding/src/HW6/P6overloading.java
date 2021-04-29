package HW6;

public class P6overloading {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		Calc6 k30_cc = new Calc6();//Calc6 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k30_cc.sum(1, 2));
		//아까 받아온 객체를 사용하여 Calc6클래스의 up메소드 파라미터를 1, 2로 주고 실행한 다음 화면에 출력한다.
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k30_cc.sum(1, 2, 3));
		//아까 받아온 객체를 사용하여 Calc6클래스의 up메소드 파라미터를 1, 2, 3로 주고 실행한 다음 화면에 출력한다.
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k30_cc.sum(1, 2, 3, 4));
		//아까 받아온 객체를 사용하여 Calc6클래스의 up메소드 파라미터를 1, 2, 3, 4로 주고 실행한 다음 화면에 출력한다.
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k30_cc.sum(1.3, 2.4));
		//아까 받아온 객체를 사용하여 Calc6클래스의 up메소드 파라미터를 1.3, 2.4로 주고 실행한 다음 화면에 출력한다.
	}

}
