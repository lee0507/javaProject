package HW4;

public class continue1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		for (int k30_i = 0; k30_i <= 10; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 10보다 같거나 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			if (k30_i % 3 == 0) {//만약 k30_i % 3 == 0이면(k30_i를 3으로 나누었을때 나머지가 0이 아니면)
				continue;//조건식이 true가 되어 continue문이 수행되면 반복문의 끝으로 이동한다.
			}//break문과 달리 반복문 전체를 벗어나지는 않는다.
			System.out.println(k30_i);//변수 k30_i를 화면에 출력한다.
		}
	}

}
