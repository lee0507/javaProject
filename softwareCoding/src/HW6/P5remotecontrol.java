package HW6;

public class P5remotecontrol {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub

		TvRemocon k30_remot;//TvRemocon 클래스를 받아서 객체를 만든다.
		k30_remot = new TvRemocon();//인스턴스를 생성하여서 객체에 연결한다.
		
		for(int k30_i = 0; k30_i < 11; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 11보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_remot.ChannelUp();//아까 받아온 객체를 사용하여 TvRemocon클래스의 ChannelUp메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		for(int k30_i = 0; k30_i < 11; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 11보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_remot.ChannelDn();//아까 받아온 객체를 사용하여 TvRemocon클래스의 ChannelDn메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		for(int k30_i = 0; k30_i < 6; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 6보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_remot.VolUp();//아까 받아온 객체를 사용하여 TvRemocon클래스의 VolUp메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		for(int k30_i = 0; k30_i < 6; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 6보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_remot.VolDn();//아까 받아온 객체를 사용하여 TvRemocon클래스의 VolDn메소드를 실행한다.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		
	}

}
