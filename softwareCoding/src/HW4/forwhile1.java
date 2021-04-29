package HW4;

public class forwhile1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_i = 10;//숫자형 변수 k30_i를 정의하고 값을 10으로 초기화한다.
		while(k30_i >= 0) {//while 반복문의 조건을 k30_i >=0으로 설정하여 k30_i가 0과 같거나 크다면 반복문이 수행되도록 한다.
			System.out.println(k30_i--);//변수 k30_i의 값을 화면에 출력하고 k30_i에 1만큼 마이너스한다.
		}
		
		for(int k30_j = 10; k30_j >= 0; k30_j--) {//for반복문을 k30_j는 10부터 k30_j가 0보다 크거나 같을 때까지 k30_j를 1씩 감소시키면서 수행한다.
			System.out.println(k30_j);//변수 k30_j를 화면에 출력한다.
		}
	}

}
