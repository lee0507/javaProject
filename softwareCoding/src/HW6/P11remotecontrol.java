package HW6;

public class P11remotecontrol {//클래스 선언

	
	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		
		TvRemocon2 tvVolUp = new TvRemocon2(10);//tvVolUP 클래스에 파라미터를 10으로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("MSG tvVolUp[%s]\n\n", tvVolUp.k30_help2);//아까 받아온 객체를 사용하여 TvRemocon2클래스의 변수 help2를 화면에 출력한다.
		
		TvRemocon2 tvVolDn = new TvRemocon2(-10);//tvVolDn 클래스에 파라미터를 -10으로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("MSG tvVolDn[%s]\n\n", tvVolDn.k30_help2);//아까 받아온 객체를 사용하여 TvRemocon2클래스의 변수 help2를 화면에 출력한다.
		
		TvRemocon2 tvChannelUp = new TvRemocon2(5);//tvChannelUP 클래스에 파라미터를 5으로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("MSG tvChannelUp[%s]\n\n", tvChannelUp.k30_help);//아까 받아온 객체를 사용하여 TvRemocon2클래스의 변수 help를 화면에 출력한다.
		
		TvRemocon2 tvChannelDn = new TvRemocon2(-5);//tvChannelDn 클래스에 파라미터를 -5으로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("MSG tvChannelDn[%s]\n", tvChannelDn.k30_help);//아까 받아온 객체를 사용하여 TvRemocon2클래스의 변수 help를 화면에 출력한다.
		
		TvRemoconX tvremotX = new TvRemoconX(); //tvremotX 클래스 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		tvremotX.Repair();//tvremotX의 함수 Repair를 실행한다.
		System.out.printf("MSG fixX[%s]\n", tvremotX.k30_help);//아까 받아온 객체를 사용하여 TvRemoconX클래스의 변수 help를 화면에 출력한다.
		
		
		
	}

}
