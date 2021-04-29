package HW4;

public class space1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			for(int k30_j = 0; k30_j < k30_i; k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 k30_i보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf(" ");//빈칸 하나를 출력한다
			}
			System.out.printf("%d\n", k30_i);//%d를 통해 숫자형 변수 k30_i와 줄바꿈을 출력한다. 
		}
	}

}
